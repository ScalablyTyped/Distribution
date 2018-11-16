package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "loaders")
@js.native
object loadersNs extends js.Object {
  // As of ResourceLoader v2 we no longer require EventEmitter
  // However, for depreciation reasons, it remains.
  @js.native
  class Loader ()
    extends pixiDotJsLib.PIXINs.loadersNs.Loader {
    def this(baseUrl: java.lang.String) = this()
    def this(baseUrl: java.lang.String, concurrency: scala.Double) = this()
  }
  
  @js.native
  class Resource protected ()
    extends pixiDotJsLib.PIXINs.loadersNs.Resource {
    def this(name: java.lang.String, url: java.lang.String) = this()
    def this(name: java.lang.String, url: js.Array[java.lang.String]) = this()
    def this(name: java.lang.String, url: java.lang.String, options: pixiDotJsLib.PIXINs.loadersNs.LoaderOptions) = this()
    def this(name: java.lang.String, url: js.Array[java.lang.String], options: pixiDotJsLib.PIXINs.loadersNs.LoaderOptions) = this()
  }
  
  val shared: pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
  // As of ResourceLoader v2 we no longer require EventEmitter
  // However, for depreciation reasons, it remains.
  @js.native
  object Loader extends js.Object {
    // below this line is the original non-pixi loader
    var Resource: js.Any = js.native
    var async: js.Any = js.native
    var base64: js.Any = js.native
    // pixi overrides here
    //tslint:disable-next-line:ban-types forbidden-types
    def addPixiMiddleware(fn: js.Function): scala.Unit = js.native
  }
  
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
  
}

