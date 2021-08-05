package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference to **{@link https://github.com/englercj/resource-loader
  * resource-loader}**'s Resource class.
  * @see http://englercj.github.io/resource-loader/Resource.html
  * @class LoaderResource
  * @memberof PIXI
  */
@JSGlobal("PIXI.LoaderResource")
@js.native
class LoaderResource ()
  extends StObject
     with typings.pixiJs.PIXI.LoaderResource
object LoaderResource {
  
  @JSGlobal("PIXI.LoaderResource")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("PIXI.LoaderResource.EMPTY_GIF")
  @js.native
  def EMPTY_GIF: String = js.native
  inline def EMPTY_GIF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_GIF")(x.asInstanceOf[js.Any])
  
  @JSGlobal("PIXI.LoaderResource.LOAD_TYPE")
  @js.native
  object LOAD_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE & Double] = js.native
    
    /* 3 */ val AUDIO: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.AUDIO & Double = js.native
    
    /* 2 */ val IMAGE: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.IMAGE & Double = js.native
    
    /* 4 */ val VIDEO: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.VIDEO & Double = js.native
    
    /* 1 */ val XHR: typings.pixiJs.PIXI.LoaderResource.LOAD_TYPE.XHR & Double = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.STATUS_FLAGS")
  @js.native
  object STATUS_FLAGS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS & Double] = js.native
    
    /* 1 << 1 */ val COMPLETE: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.COMPLETE & Double = js.native
    
    /* 1 << 0 */ val DATA_URL: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.DATA_URL & Double = js.native
    
    /* 1 << 2 */ val LOADING: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.LOADING & Double = js.native
    
    /* 0 */ val NONE: typings.pixiJs.PIXI.LoaderResource.STATUS_FLAGS.NONE & Double = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.TYPE & Double] = js.native
    
    /* 4 */ val AUDIO: typings.pixiJs.PIXI.LoaderResource.TYPE.AUDIO & Double = js.native
    
    /* 3 */ val IMAGE: typings.pixiJs.PIXI.LoaderResource.TYPE.IMAGE & Double = js.native
    
    /* 1 */ val JSON: typings.pixiJs.PIXI.LoaderResource.TYPE.JSON & Double = js.native
    
    /* 6 */ val TEXT: typings.pixiJs.PIXI.LoaderResource.TYPE.TEXT & Double = js.native
    
    /* 0 */ val UNKNOWN: typings.pixiJs.PIXI.LoaderResource.TYPE.UNKNOWN & Double = js.native
    
    /* 5 */ val VIDEO: typings.pixiJs.PIXI.LoaderResource.TYPE.VIDEO & Double = js.native
    
    /* 2 */ val XML: typings.pixiJs.PIXI.LoaderResource.TYPE.XML & Double = js.native
  }
  
  @JSGlobal("PIXI.LoaderResource.XHR_RESPONSE_TYPE")
  @js.native
  object XHR_RESPONSE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE & String] = js.native
    
    /* "blob" */ val BLOB: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.BLOB & String = js.native
    
    /* "arraybuffer" */ val BUFFER: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.BUFFER & String = js.native
    
    /* "text" */ val DEFAULT: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.DEFAULT & String = js.native
    
    /* "document" */ val DOCUMENT: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.DOCUMENT & String = js.native
    
    /* "json" */ val JSON: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.JSON & String = js.native
    
    /* "text" */ val TEXT: typings.pixiJs.PIXI.LoaderResource.XHR_RESPONSE_TYPE.TEXT & String = js.native
  }
  
  inline def setExtensionLoadType(extname: String, loadType: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionLoadType")(extname.asInstanceOf[js.Any], loadType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setExtensionXhrType(extname: String, xhrType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionXhrType")(extname.asInstanceOf[js.Any], xhrType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
