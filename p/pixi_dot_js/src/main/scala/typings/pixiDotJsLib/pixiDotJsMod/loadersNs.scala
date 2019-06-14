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
  /* static members */
  @js.native
  object Loader extends js.Object {
    var Resource: pixiDotJsLib.TypeofResource with (org.scalablytyped.runtime.Instantiable3[
        /* name */ java.lang.String, 
        /* url */ java.lang.String | js.Array[java.lang.String], 
        js.UndefOr[/* options */ pixiDotJsLib.PIXINs.loadersNs.LoaderOptions], 
        pixiDotJsLib.PIXINs.loadersNs.Resource
      ]) = js.native
    var async: pixiDotJsLib.TypeofResource with (org.scalablytyped.runtime.Instantiable3[
        /* name */ java.lang.String, 
        /* url */ java.lang.String | js.Array[java.lang.String], 
        js.UndefOr[/* options */ pixiDotJsLib.PIXINs.loadersNs.LoaderOptions], 
        pixiDotJsLib.PIXINs.loadersNs.Resource
      ]) = js.native
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
  
  @JSName("Resource")
  @js.native
  object ResourceNs extends js.Object {
    val EMPTY_GIF: java.lang.String = js.native
    def setExtensionLoadType(extname: java.lang.String, loadType: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE): scala.Unit = js.native
    def setExtensionXhrType(extname: java.lang.String, xhrType: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE): scala.Unit = js.native
    @js.native
    object LOAD_TYPE extends js.Object {
      /* 2 */ val AUDIO: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.AUDIO with scala.Double = js.native
      /* 1 */ val IMAGE: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.IMAGE with scala.Double = js.native
      /* 3 */ val VIDEO: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.VIDEO with scala.Double = js.native
      /* 0 */ val XHR: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.XHR with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE with scala.Double] = js.native
    }
    
    @js.native
    object STATUS_FLAGS extends js.Object {
      /* 2 */ val COMPLETE: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.COMPLETE with scala.Double = js.native
      /* 1 */ val DATA_URL: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.DATA_URL with scala.Double = js.native
      /* 3 */ val LOADING: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.LOADING with scala.Double = js.native
      /* 0 */ val NONE: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.NONE with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS with scala.Double] = js.native
    }
    
    @js.native
    object TYPE extends js.Object {
      /* 4 */ val AUDIO: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.AUDIO with scala.Double = js.native
      /* 3 */ val IMAGE: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.IMAGE with scala.Double = js.native
      /* 1 */ val JSON: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.JSON with scala.Double = js.native
      /* 6 */ val TEXT: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.TEXT with scala.Double = js.native
      /* 0 */ val UNKNOWN: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.UNKNOWN with scala.Double = js.native
      /* 5 */ val VIDEO: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.VIDEO with scala.Double = js.native
      /* 2 */ val XML: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE.XML with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE with scala.Double] = js.native
    }
    
    @js.native
    object XHR_RESPONSE_TYPE extends js.Object {
      /* 2 */ val BLOB: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.BLOB with scala.Double = js.native
      /* 1 */ val BUFFER: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.BUFFER with scala.Double = js.native
      /* 0 */ val DEFAULT: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.DEFAULT with scala.Double = js.native
      /* 3 */ val DOCUMENT: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.DOCUMENT with scala.Double = js.native
      /* 4 */ val JSON: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.JSON with scala.Double = js.native
      /* 5 */ val TEXT: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.TEXT with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE with scala.Double] = js.native
    }
    
  }
  
}

