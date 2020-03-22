package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to **{@link https://github.com/englercj/resource-loader
  * resource-loader}**'s Resource class.
  * @see http://englercj.github.io/resource-loader/Resource.html
  * @class LoaderResource
  * @memberof PIXI
  */
@JSImport("pixi.js", "LoaderResource")
@js.native
class LoaderResource ()
  extends typings.pixiJs.PIXI.LoaderResource

@JSImport("pixi.js", "LoaderResource")
@js.native
object LoaderResource extends js.Object {
  var EMPTY_GIF: String = js.native
  def setExtensionLoadType(extname: String, loadType: Double): Unit = js.native
  def setExtensionXhrType(extname: String, xhrType: String): Unit = js.native
  @js.native
  object LOAD_TYPE extends js.Object {
    /* 3 */ val AUDIO: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.AUDIO with Double = js.native
    /* 2 */ val IMAGE: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.IMAGE with Double = js.native
    /* 4 */ val VIDEO: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.VIDEO with Double = js.native
    /* 1 */ val XHR: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.XHR with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE with Double] = js.native
  }
  
  @js.native
  object STATUS_FLAGS extends js.Object {
    /* 1 << 1 */ val COMPLETE: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.COMPLETE with Double = js.native
    /* 1 << 0 */ val DATA_URL: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.DATA_URL with Double = js.native
    /* 1 << 2 */ val LOADING: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.LOADING with Double = js.native
    /* 0 */ val NONE: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS with Double] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 4 */ val AUDIO: typings.pixiJs.PIXI.LoaderResource.TYPE.AUDIO with Double = js.native
    /* 3 */ val IMAGE: typings.pixiJs.PIXI.LoaderResource.TYPE.IMAGE with Double = js.native
    /* 1 */ val JSON: typings.pixiJs.PIXI.LoaderResource.TYPE.JSON with Double = js.native
    /* 6 */ val TEXT: typings.pixiJs.PIXI.LoaderResource.TYPE.TEXT with Double = js.native
    /* 0 */ val UNKNOWN: typings.pixiJs.PIXI.LoaderResource.TYPE.UNKNOWN with Double = js.native
    /* 5 */ val VIDEO: typings.pixiJs.PIXI.LoaderResource.TYPE.VIDEO with Double = js.native
    /* 2 */ val XML: typings.pixiJs.PIXI.LoaderResource.TYPE.XML with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.TYPE with Double] = js.native
  }
  
  @js.native
  object XHR_RESPONSE_TYPE extends js.Object {
    /* "blob" */ val BLOB: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.BLOB with String = js.native
    /* "arraybuffer" */ val BUFFER: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.BUFFER with String = js.native
    /* "text" */ val DEFAULT: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.DEFAULT with String = js.native
    /* "document" */ val DOCUMENT: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.DOCUMENT with String = js.native
    /* "json" */ val JSON: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.JSON with String = js.native
    /* "text" */ val TEXT: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.TEXT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE with String] = js.native
  }
  
}

