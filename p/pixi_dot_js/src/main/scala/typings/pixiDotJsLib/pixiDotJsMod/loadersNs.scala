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
  // below this line is the original non-pixi loader
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
  def encodeBinary(input: java.lang.String): java.lang.String = js.native
  @js.native
  object LOAD_TYPE extends js.Object {
    val AUDIO: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE.AUDIO with java.lang.String = js.native
    val IMAGE: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE.IMAGE with java.lang.String = js.native
    val VIDEO: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE.VIDEO with java.lang.String = js.native
    val XHR: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE.XHR with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE with java.lang.String] = js.native
  }
  
  /* static members */
  @js.native
  object Loader extends js.Object {
    var Resource: pixiDotJsLib.TypeofClassResource = js.native
    var async: pixiDotJsLib.TypeofClassResource = js.native
    @JSName("base64")
    var base64_Original: js.Function1[/* input */ java.lang.String, java.lang.String] = js.native
    @JSName("encodeBinary")
    var encodeBinary_Original: js.Function1[/* input */ java.lang.String, java.lang.String] = js.native
    // pixi overrides here
    def addPixiMiddleware(fn: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
    def base64(input: java.lang.String): java.lang.String = js.native
    def encodeBinary(input: java.lang.String): java.lang.String = js.native
    def pre(fn: js.Function1[/* repeated */ js.Any, _]): pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
    def use(fn: js.Function1[/* repeated */ js.Any, _]): pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
  }
  
  /* static members */
  @js.native
  object Resource extends js.Object {
    var EMPTY_GIF: java.lang.String = js.native
    def setExtensionLoadType(extname: java.lang.String, loadType: pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE): scala.Unit = js.native
    def setExtensionXhrType(extname: java.lang.String, xhrType: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE): scala.Unit = js.native
  }
  
  @js.native
  object STATUS_FLAGS extends js.Object {
    val COMPLETE: pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS.COMPLETE with java.lang.String = js.native
    val DATA_URL: pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS.DATA_URL with java.lang.String = js.native
    val LOADING: pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS.LOADING with java.lang.String = js.native
    val NONE: pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS.NONE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS with java.lang.String] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    val AUDIO: pixiDotJsLib.PIXINs.loadersNs.TYPE.AUDIO with java.lang.String = js.native
    val IMAGE: pixiDotJsLib.PIXINs.loadersNs.TYPE.IMAGE with java.lang.String = js.native
    val JSON: pixiDotJsLib.PIXINs.loadersNs.TYPE.JSON with java.lang.String = js.native
    val TEXT: pixiDotJsLib.PIXINs.loadersNs.TYPE.TEXT with java.lang.String = js.native
    val UNKNOWN: pixiDotJsLib.PIXINs.loadersNs.TYPE.UNKNOWN with java.lang.String = js.native
    val VIDEO: pixiDotJsLib.PIXINs.loadersNs.TYPE.VIDEO with java.lang.String = js.native
    val XML: pixiDotJsLib.PIXINs.loadersNs.TYPE.XML with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.TYPE with java.lang.String] = js.native
  }
  
  @js.native
  object XHR_RESPONSE_TYPE extends js.Object {
    val BLOB: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE.BLOB with java.lang.String = js.native
    val BUFFER: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE.BUFFER with java.lang.String = js.native
    val DEFAULT: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE.DEFAULT with java.lang.String = js.native
    val DOCUMENT: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE.DOCUMENT with java.lang.String = js.native
    val JSON: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE.JSON with java.lang.String = js.native
    val TEXT: pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE.TEXT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE with java.lang.String] = js.native
  }
  
}

