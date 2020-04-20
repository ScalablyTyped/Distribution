package typings.openfin.environmentMod

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  def createChildWindow(options: js.Any): js.Promise[_]
  def getCurrentEntityIdentity(): Identity
  def getCurrentEntityType(): EntityType
  def getNextMessageId(): js.Any
  def getRandomId(): String
  def getWebWindow(identity: Identity): Window_
  def isWindowExists(uuid: String, name: String): Boolean
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
    getWebWindow: Identity => Window_,
    isWindowExists: (String, String) => Boolean,
    retrievePort: NewConnectConfig => js.Promise[Double],
    writeToken: (String, String) => js.Promise[String]
  ): Environment = {
    val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
    __obj.asInstanceOf[Environment]
  }
}

