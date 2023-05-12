package typings.pixiCompressedTextures

import typings.pixiCore.mod.BufferResource
import typings.pixiCore.mod.ViewableBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResourcesBlobResourceMod {
  
  /* note: abstract class */ @JSImport("@pixi/compressed-textures/lib/resources/BlobResource", "BlobResource")
  @js.native
  /**
    * @param source - the buffer/URL of the texture file
    * @param {PIXI.IBlobOptions} options
    * @param {boolean}[options.autoLoad] - whether to fetch the data immediately;
    *  you can fetch it later via {@link PIXI.BlobResource#load}
    * @param {boolean}[options.width] - the width in pixels.
    * @param {boolean}[options.height] - the height in pixels.
    */
  open class BlobResource () extends BufferResource {
    def this(source: String) = this()
    def this(source: js.typedarray.Float32Array) = this()
    def this(source: js.typedarray.Uint32Array) = this()
    def this(source: js.typedarray.Uint8Array) = this()
    def this(source: String, options: IBlobOptions) = this()
    def this(source: js.typedarray.Float32Array, options: IBlobOptions) = this()
    def this(source: js.typedarray.Uint32Array, options: IBlobOptions) = this()
    def this(source: js.typedarray.Uint8Array, options: IBlobOptions) = this()
    def this(source: Null, options: IBlobOptions) = this()
    
    /**
      * Promise when loading.
      * @default null
      */
    /* private */ var _load: Any = js.native
    
    /* protected */ var buffer: ViewableBuffer | Null = js.native
    
    /* protected */ var loaded: Boolean = js.native
    
    /* protected */ def onBlobLoaded(_data: js.typedarray.ArrayBuffer): Unit = js.native
    
    /* protected */ var origin: String | Null = js.native
  }
  
  trait IBlobOptions extends StObject {
    
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var width: Double
  }
  object IBlobOptions {
    
    inline def apply(height: Double, width: Double): IBlobOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBlobOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBlobOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
