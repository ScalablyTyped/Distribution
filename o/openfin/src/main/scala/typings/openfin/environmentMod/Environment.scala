package typings.openfin.environmentMod

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  def createChildWindow(options: js.Any): js.Promise[_]
  def getCurrentEntityIdentity(): Identity
  def getCurrentEntityType(): EntityType
  def getNextMessageId(): js.Any
  def getRandomId(): String
  def getWebWindow(identity: Identity): Window
  def isWindowExists(uuid: String, name: String): Boolean
  def raiseEvent(eventName: String, eventArgs: js.Any): Unit
  def retrievePort(config: NewConnectConfig): js.Promise[Double]
  def writeToken(path: String, token: String): js.Promise[String]
}

object Environment {
  @scala.inline
  def apply(
    createChildWindow: js.Any => js.Promise[_],
    getCurrentEntityIdentity: () => Identity,
    getCurrentEntityType: () => EntityType,
    getNextMessageId: () => js.Any,
    getRandomId: () => String,
    getWebWindow: Identity => Window,
    isWindowExists: (String, String) => Boolean,
    raiseEvent: (String, js.Any) => Unit,
    retrievePort: NewConnectConfig => js.Promise[Double],
    writeToken: (String, String) => js.Promise[String]
  ): Environment = {
    val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), raiseEvent = js.Any.fromFunction2(raiseEvent), retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
    __obj.asInstanceOf[Environment]
  }
}

