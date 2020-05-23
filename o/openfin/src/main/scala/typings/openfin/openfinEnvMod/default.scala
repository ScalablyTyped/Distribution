package typings.openfin.openfinEnvMod

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/environment/openfin-env", JSImport.Default)
@js.native
class default () extends OpenFinEnvironment {
  /* CompleteClass */
  override var raiseEventAsync: js.Any = js.native
  /* CompleteClass */
  override var resolveUrl: js.Any = js.native
  /* CompleteClass */
  override def createChildWindow(options: js.Any): js.Promise[_] = js.native
  /* CompleteClass */
  override def getCurrentEntityIdentity(): Identity = js.native
  /* CompleteClass */
  override def getCurrentEntityType(): EntityType = js.native
  /* CompleteClass */
  override def getNextMessageId(): js.Any = js.native
  /* CompleteClass */
  override def getRandomId(): String = js.native
  /* CompleteClass */
  override def getWebWindow(identity: Identity): Window = js.native
  /* CompleteClass */
  override def isWindowExists(uuid: String, name: String): Boolean = js.native
  /* CompleteClass */
  override def raiseEvent(eventName: String, eventArgs: js.Any): Unit = js.native
  /* CompleteClass */
  override def retrievePort(config: NewConnectConfig): js.Promise[Double] = js.native
  /* CompleteClass */
  override def writeToken(path: String, token: String): js.Promise[String] = js.native
}

