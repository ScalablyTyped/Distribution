package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AssetManager")
@js.native
class AssetManager protected () extends Disposable {
  def this(textureLoader: js.Function1[/* image */ stdLib.HTMLImageElement, _]) = this()
  def this(textureLoader: js.Function1[/* image */ stdLib.HTMLImageElement, _], pathPrefix: java.lang.String) = this()
  var assets: js.Any = js.native
  var errors: js.Any = js.native
  var loaded: js.Any = js.native
  var pathPrefix: js.Any = js.native
  var textureLoader: js.Any = js.native
  var toLoad: js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def get(path: java.lang.String): js.Any = js.native
  def getErrors(): Map[java.lang.String] = js.native
  def getLoaded(): scala.Double = js.native
  def getToLoad(): scala.Double = js.native
  def hasErrors(): scala.Boolean = js.native
  def isLoadingComplete(): scala.Boolean = js.native
  def loadText(path: java.lang.String): scala.Unit = js.native
  def loadText(
    path: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def loadText(
    path: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* text */ java.lang.String, scala.Unit],
    error: js.Function2[/* path */ java.lang.String, /* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def loadTexture(path: java.lang.String): scala.Unit = js.native
  def loadTexture(
    path: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* image */ stdLib.HTMLImageElement, scala.Unit]
  ): scala.Unit = js.native
  def loadTexture(
    path: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* image */ stdLib.HTMLImageElement, scala.Unit],
    error: js.Function2[/* path */ java.lang.String, /* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def loadTextureAtlas(path: java.lang.String): scala.Unit = js.native
  def loadTextureAtlas(
    path: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* atlas */ TextureAtlas, scala.Unit]
  ): scala.Unit = js.native
  def loadTextureAtlas(
    path: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* atlas */ TextureAtlas, scala.Unit],
    error: js.Function2[/* path */ java.lang.String, /* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def loadTextureData(path: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def loadTextureData(
    path: java.lang.String,
    data: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* image */ stdLib.HTMLImageElement, scala.Unit]
  ): scala.Unit = js.native
  def loadTextureData(
    path: java.lang.String,
    data: java.lang.String,
    success: js.Function2[/* path */ java.lang.String, /* image */ stdLib.HTMLImageElement, scala.Unit],
    error: js.Function2[/* path */ java.lang.String, /* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def remove(path: java.lang.String): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
}

@JSGlobal("spine.AssetManager")
@js.native
object AssetManager extends js.Object {
  /* private */ def downloadBinary(url: js.Any, success: js.Any, error: js.Any): js.Any = js.native
  /* private */ def downloadText(url: js.Any, success: js.Any, error: js.Any): js.Any = js.native
}

