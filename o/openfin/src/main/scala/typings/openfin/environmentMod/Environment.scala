package typings.openfin.environmentMod

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  def createChildWindow(options: js.Any): js.Promise[_] = js.native
  def getCurrentEntityIdentity(): Identity = js.native
  def getCurrentEntityType(): EntityType = js.native
  def getNextMessageId(): js.Any = js.native
  def getRandomId(): String = js.native
  def getWebWindow(identity: Identity): Window = js.native
  def isWindowExists(uuid: String, name: String): Boolean = js.native
  def raiseEvent(eventName: String, eventArgs: js.Any): Unit = js.native
  def retrievePort(config: NewConnectConfig): js.Promise[Double] = js.native
  def writeToken(path: String, token: String): js.Promise[String] = js.native
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
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateChildWindow(value: js.Any => js.Promise[_]): Self = this.set("createChildWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentEntityIdentity(value: () => Identity): Self = this.set("getCurrentEntityIdentity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentEntityType(value: () => EntityType): Self = this.set("getCurrentEntityType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNextMessageId(value: () => js.Any): Self = this.set("getNextMessageId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRandomId(value: () => String): Self = this.set("getRandomId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWebWindow(value: Identity => Window): Self = this.set("getWebWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setIsWindowExists(value: (String, String) => Boolean): Self = this.set("isWindowExists", js.Any.fromFunction2(value))
    @scala.inline
    def setRaiseEvent(value: (String, js.Any) => Unit): Self = this.set("raiseEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setRetrievePort(value: NewConnectConfig => js.Promise[Double]): Self = this.set("retrievePort", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteToken(value: (String, String) => js.Promise[String]): Self = this.set("writeToken", js.Any.fromFunction2(value))
  }
  
}

