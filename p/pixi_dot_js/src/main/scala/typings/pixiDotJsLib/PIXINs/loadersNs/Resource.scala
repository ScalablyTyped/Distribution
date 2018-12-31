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
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundComplete: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundOnError: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundOnProgress: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundXdrOnTimeout: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundXhrOnAbort: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundXhrOnError: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _boundXhrOnLoad: js.Function = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _dequeue: js.Function = js.native
  var _flags: scala.Double = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var _onLoadBinding: js.Function = js.native
  var children: js.Array[Resource] = js.native
  var crossOrigin: scala.Boolean | java.lang.String = js.native
  var data: js.Any = js.native
  var error: stdLib.Error = js.native
  var extension: java.lang.String = js.native
  var isComplete: scala.Boolean = js.native
  var isDataUrl: scala.Boolean = js.native
  var isLoading: scala.Boolean = js.native
  var loadType: scala.Double = js.native
  var metadata: js.Any = js.native
  var name: java.lang.String = js.native
  var onAfterMiddleware: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onComplete: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onProgress: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var onStart: pixiDotJsLib.PIXINs.MiniSignal = js.native
  var progressChunk: scala.Double = js.native
  var spineAtlas: js.Any = js.native
  var spineData: js.Any = js.native
  var spritesheet: js.UndefOr[pixiDotJsLib.PIXINs.Spritesheet] = js.native
  var texture: pixiDotJsLib.PIXINs.Texture = js.native
  var textures: js.UndefOr[TextureDictionary] = js.native
  var `type`: scala.Double = js.native
  var url: java.lang.String = js.native
  var xhr: stdLib.XMLHttpRequest | scala.Null = js.native
  var xhrType: java.lang.String = js.native
  /* protected */ def _createSource(`type`: java.lang.String, url: java.lang.String): stdLib.HTMLSourceElement = js.native
  /* protected */ def _createSource(`type`: java.lang.String, url: java.lang.String, mime: java.lang.String): stdLib.HTMLSourceElement = js.native
  /* protected */ def _determineCrossOrigin(url: java.lang.String, loc: js.Any): java.lang.String = js.native
  /* protected */ def _determineLoadType(): scala.Double = js.native
  /* protected */ def _determineXhrType(): scala.Double = js.native
  /* protected */ def _getExtension(): java.lang.String = js.native
  /* protected */ def _getMimeXhrType(`type`: scala.Double): java.lang.String = js.native
  /* protected */ def _hasFlag(flag: scala.Double): scala.Boolean = js.native
  /* protected */ def _loadElement(`type`: java.lang.String): scala.Unit = js.native
  /* protected */ def _loadSourceElement(`type`: java.lang.String): scala.Unit = js.native
  /* protected */ def _loadXdr(): scala.Unit = js.native
  /* protected */ def _loadXhr(): scala.Unit = js.native
  /* protected */ def _onError(): scala.Unit = js.native
  /* protected */ def _onError(event: js.Any): scala.Unit = js.native
  /* protected */ def _onProgress(): scala.Unit = js.native
  /* protected */ def _onProgress(event: js.Any): scala.Unit = js.native
  /* protected */ def _setFlag(flag: scala.Double, value: scala.Boolean): scala.Unit = js.native
  /* protected */ def _xdrOnTimeout(): scala.Unit = js.native
  /* protected */ def _xhrOnAbort(): scala.Unit = js.native
  /* protected */ def _xhrOnError(): scala.Unit = js.native
  /* protected */ def _xhrOnLoad(): scala.Unit = js.native
  def abort(): scala.Unit = js.native
  def abort(message: java.lang.String): scala.Unit = js.native
  def complete(): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def load(): scala.Unit = js.native
  def load(cb: js.Function): scala.Unit = js.native
}

@JSGlobal("PIXI.loaders.Resource")
@js.native
object Resource extends js.Object {
  var EMPTY_GIF: java.lang.String = js.native
  var LOAD_TYPE: pixiDotJsLib.Anon_IMAGE = js.native
  var STATUS_FLAGS: pixiDotJsLib.Anon_LOADING = js.native
  var TYPE: pixiDotJsLib.Anon_XML = js.native
  var XHR_RESPONSE_TYPE: pixiDotJsLib.Anon_JSON = js.native
  def setExtensionLoadType(extname: java.lang.String, loadType: scala.Double): scala.Unit = js.native
  def setExtensionXhrType(extname: java.lang.String, xhrType: java.lang.String): scala.Unit = js.native
}

