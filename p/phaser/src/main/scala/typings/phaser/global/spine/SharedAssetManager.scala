package typings.phaser.global.spine

import typings.phaser.spine.Map
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SharedAssetManager")
@js.native
class SharedAssetManager ()
  extends typings.phaser.spine.SharedAssetManager {
  def this(pathPrefix: String) = this()
  /* CompleteClass */
  override var clientAssets: js.Any = js.native
  /* CompleteClass */
  override var errors: js.Any = js.native
  /* CompleteClass */
  override var pathPrefix: js.Any = js.native
  /* CompleteClass */
  override var queueAsset: js.Any = js.native
  /* CompleteClass */
  override var queuedAssets: js.Any = js.native
  /* CompleteClass */
  override var rawAssets: js.Any = js.native
  /* CompleteClass */
  override var updateClientAssets: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def get(clientId: String, path: String): js.Any = js.native
  /* CompleteClass */
  override def getErrors(): Map[String] = js.native
  /* CompleteClass */
  override def hasErrors(): Boolean = js.native
  /* CompleteClass */
  override def isLoadingComplete(clientId: String): Boolean = js.native
  /* CompleteClass */
  override def loadJson(clientId: String, path: String): Unit = js.native
  /* CompleteClass */
  override def loadText(clientId: String, path: String): Unit = js.native
  /* CompleteClass */
  override def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, _], path: String): Unit = js.native
}

