package typings.phaser.spine

import typings.std.HTMLImageElement
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AssetManager")
@js.native
class AssetManager protected () extends Disposable {
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, _]) = this()
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, _], pathPrefix: String) = this()
  var assets: js.Any = js.native
  var errors: js.Any = js.native
  var loaded: js.Any = js.native
  var pathPrefix: js.Any = js.native
  var textureLoader: js.Any = js.native
  var toLoad: js.Any = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def get(path: String): js.Any = js.native
  def getErrors(): Map[String] = js.native
  def getLoaded(): Double = js.native
  def getToLoad(): Double = js.native
  def hasErrors(): Boolean = js.native
  def isLoadingComplete(): Boolean = js.native
  def loadBinary(path: String): Unit = js.native
  def loadBinary(path: String, success: js.Function2[/* path */ String, /* binary */ Uint8Array, Unit]): Unit = js.native
  def loadBinary(
    path: String,
    success: js.Function2[/* path */ String, /* binary */ Uint8Array, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadText(path: String): Unit = js.native
  def loadText(path: String, success: js.Function2[/* path */ String, /* text */ String, Unit]): Unit = js.native
  def loadText(
    path: String,
    success: js.Function2[/* path */ String, /* text */ String, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadTexture(path: String): Unit = js.native
  def loadTexture(path: String, success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit]): Unit = js.native
  def loadTexture(
    path: String,
    success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadTextureAtlas(path: String): Unit = js.native
  def loadTextureAtlas(path: String, success: js.Function2[/* path */ String, /* atlas */ TextureAtlas, Unit]): Unit = js.native
  def loadTextureAtlas(
    path: String,
    success: js.Function2[/* path */ String, /* atlas */ TextureAtlas, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadTextureData(path: String, data: String): Unit = js.native
  def loadTextureData(
    path: String,
    data: String,
    success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit]
  ): Unit = js.native
  def loadTextureData(
    path: String,
    data: String,
    success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def remove(path: String): Unit = js.native
  def removeAll(): Unit = js.native
}

/* static members */
@JSGlobal("spine.AssetManager")
@js.native
object AssetManager extends js.Object {
  var downloadBinary: js.Any = js.native
  var downloadText: js.Any = js.native
}

