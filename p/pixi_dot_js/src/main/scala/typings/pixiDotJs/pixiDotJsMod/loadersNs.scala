package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.Instantiable3
import typings.pixiDotJs.PIXINs.loadersNs.LoaderOptions
import typings.pixiDotJs.TypeofResource
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
    extends typings.pixiDotJs.PIXINs.loadersNs.Loader {
    def this(baseUrl: String) = this()
    def this(baseUrl: String, concurrency: Double) = this()
  }
  
  @js.native
  class Resource protected ()
    extends typings.pixiDotJs.PIXINs.loadersNs.Resource {
    def this(name: String, url: String) = this()
    def this(name: String, url: js.Array[String]) = this()
    def this(name: String, url: String, options: LoaderOptions) = this()
    def this(name: String, url: js.Array[String], options: LoaderOptions) = this()
  }
  
  val shared: typings.pixiDotJs.PIXINs.loadersNs.Loader = js.native
  def encodeBinary(input: String): String = js.native
  /* static members */
  @js.native
  object Loader extends js.Object {
    var Resource: TypeofResource with (Instantiable3[
        /* name */ String, 
        /* url */ String | js.Array[String], 
        js.UndefOr[/* options */ LoaderOptions], 
        typings.pixiDotJs.PIXINs.loadersNs.Resource
      ]) = js.native
    var async: TypeofResource with (Instantiable3[
        /* name */ String, 
        /* url */ String | js.Array[String], 
        js.UndefOr[/* options */ LoaderOptions], 
        typings.pixiDotJs.PIXINs.loadersNs.Resource
      ]) = js.native
    @JSName("base64")
    var base64_Original: js.Function1[/* input */ String, String] = js.native
    @JSName("encodeBinary")
    var encodeBinary_Original: js.Function1[/* input */ String, String] = js.native
    // pixi overrides here
    def addPixiMiddleware(fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def base64(input: String): String = js.native
    def encodeBinary(input: String): String = js.native
    def pre(fn: js.Function1[/* repeated */ js.Any, _]): typings.pixiDotJs.PIXINs.loadersNs.Loader = js.native
    def use(fn: js.Function1[/* repeated */ js.Any, _]): typings.pixiDotJs.PIXINs.loadersNs.Loader = js.native
  }
  
  @JSName("Resource")
  @js.native
  object ResourceNs extends js.Object {
    val EMPTY_GIF: String = js.native
    def setExtensionLoadType(extname: String, loadType: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE): Unit = js.native
    def setExtensionXhrType(extname: String, xhrType: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE): Unit = js.native
    @js.native
    object LOAD_TYPE extends js.Object {
      /* 2 */ val AUDIO: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.AUDIO with Double = js.native
      /* 1 */ val IMAGE: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.IMAGE with Double = js.native
      /* 3 */ val VIDEO: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.VIDEO with Double = js.native
      /* 0 */ val XHR: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE.XHR with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE with Double] = js.native
    }
    
    @js.native
    object STATUS_FLAGS extends js.Object {
      /* 2 */ val COMPLETE: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.COMPLETE with Double = js.native
      /* 1 */ val DATA_URL: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.DATA_URL with Double = js.native
      /* 3 */ val LOADING: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.LOADING with Double = js.native
      /* 0 */ val NONE: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS.NONE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS with Double] = js.native
    }
    
    @js.native
    object TYPE extends js.Object {
      /* 4 */ val AUDIO: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.AUDIO with Double = js.native
      /* 3 */ val IMAGE: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.IMAGE with Double = js.native
      /* 1 */ val JSON: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.JSON with Double = js.native
      /* 6 */ val TEXT: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.TEXT with Double = js.native
      /* 0 */ val UNKNOWN: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.UNKNOWN with Double = js.native
      /* 5 */ val VIDEO: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.VIDEO with Double = js.native
      /* 2 */ val XML: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE.XML with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.TYPE with Double] = js.native
    }
    
    @js.native
    object XHR_RESPONSE_TYPE extends js.Object {
      /* 2 */ val BLOB: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.BLOB with Double = js.native
      /* 1 */ val BUFFER: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.BUFFER with Double = js.native
      /* 0 */ val DEFAULT: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.DEFAULT with Double = js.native
      /* 3 */ val DOCUMENT: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.DOCUMENT with Double = js.native
      /* 4 */ val JSON: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.JSON with Double = js.native
      /* 5 */ val TEXT: typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE.TEXT with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE with Double] = js.native
    }
    
  }
  
}

