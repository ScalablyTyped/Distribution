package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.loaders.Resource")
@js.native
class Resource protected () extends js.Object {
  def this(name: java.lang.String, url: java.lang.String) = this()
  def this(name: java.lang.String, url: js.Array[java.lang.String]) = this()
  def this(name: java.lang.String, url: java.lang.String, options: LoaderOptions) = this()
  def this(name: java.lang.String, url: js.Array[java.lang.String], options: LoaderOptions) = this()
  val children: js.Array[Resource] = js.native
  var crossOrigin: java.lang.String = js.native
  var data: js.Any = js.native
  val error: stdLib.Error = js.native
  val extension: java.lang.String = js.native
  val isComplete: scala.Boolean = js.native
  val isDataUrl: scala.Boolean = js.native
  val isLoading: scala.Boolean = js.native
  var loadType: LOAD_TYPE = js.native
  var metadata: IMetadata = js.native
  val name: java.lang.String = js.native
  var onAfterMiddleware: pixiDotJsLib.PIXINs.MiniSignal[OnCompleteSignal] = js.native
  var onComplete: pixiDotJsLib.PIXINs.MiniSignal[OnCompleteSignal] = js.native
  var onProgress: pixiDotJsLib.PIXINs.MiniSignal[OnProgressSignal] = js.native
  var onStart: pixiDotJsLib.PIXINs.MiniSignal[OnStartSignal] = js.native
  val progressChunk: scala.Double = js.native
  var sound: js.Any = js.native
  var spineAtlas: js.Any = js.native
  var spineData: js.Any = js.native
  var spritesheet: js.UndefOr[pixiDotJsLib.PIXINs.Spritesheet] = js.native
  var texture: pixiDotJsLib.PIXINs.Texture = js.native
  var textures: js.UndefOr[TextureDictionary] = js.native
  var timeout: scala.Double = js.native
  val `type`: TYPE = js.native
  val url: java.lang.String = js.native
  val xhr: stdLib.XMLHttpRequest = js.native
  var xhrType: java.lang.String = js.native
  def abort(message: java.lang.String): scala.Unit = js.native
  def complete(): scala.Unit = js.native
  def load(): scala.Unit = js.native
  def load(cb: OnCompleteSignal): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.loaders.Resource")
@js.native
object Resource extends js.Object {
  var EMPTY_GIF: java.lang.String = js.native
  def setExtensionLoadType(extname: java.lang.String, loadType: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE): scala.Unit = js.native
  def setExtensionXhrType(extname: java.lang.String, xhrType: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE): scala.Unit = js.native
}

