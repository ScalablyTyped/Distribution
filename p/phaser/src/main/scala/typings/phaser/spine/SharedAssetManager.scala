package typings.phaser.spine

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SharedAssetManager")
@js.native
class SharedAssetManager () extends Disposable {
  def this(pathPrefix: String) = this()
  var clientAssets: js.Any = js.native
  var errors: js.Any = js.native
  var pathPrefix: js.Any = js.native
  var queueAsset: js.Any = js.native
  var queuedAssets: js.Any = js.native
  var rawAssets: js.Any = js.native
  var updateClientAssets: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def get(clientId: String, path: String): js.Any = js.native
  def getErrors(): Map[String] = js.native
  def hasErrors(): Boolean = js.native
  def isLoadingComplete(clientId: String): Boolean = js.native
  def loadJson(clientId: String, path: String): Unit = js.native
  def loadText(clientId: String, path: String): Unit = js.native
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, _], path: String): Unit = js.native
}

