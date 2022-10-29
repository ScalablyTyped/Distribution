package typings.pixiCore

import typings.pixiConstants.mod.ALPHA_MODES
import typings.pixiCore.libTexturesResourcesBaseImageResourceMod.BaseImageResource
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesImageBitmapResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/ImageBitmapResource", "ImageBitmapResource")
  @js.native
  open class ImageBitmapResource protected () extends BaseImageResource {
    def this(source: String) = this()
    /**
      * @param source - ImageBitmap or URL to use
      * @param options
      * @param {boolean} [options.autoLoad=true] - Start loading process automatically when constructed.
      * @param {boolean} [options.crossOrigin=true] - Load image using cross origin.
      * @param {PIXI.ALPHA_MODES} [options.alphaMode=null] - Alpha mode used when creating the ImageBitmap.
      */
    def this(source: ImageBitmap) = this()
    def this(source: String, options: IImageBitmapResourceOptions) = this()
    def this(source: ImageBitmap, options: IImageBitmapResourceOptions) = this()
    
    /**
      * Promise when loading.
      * @default null
      */
    /* private */ var _load: Any = js.native
    
    /**
      * Controls texture alphaMode field
      * Copies from options
      * Default is `null`, copies option from baseTexture
      * @readonly
      */
    var alphaMode: ALPHA_MODES | Null = js.native
    
    /**
      * Load image using cross origin.
      * @default false
      */
    var crossOrigin: Boolean = js.native
    
    /** URL of the image source. */
    var url: String | Null = js.native
  }
  /* static members */
  object ImageBitmapResource {
    
    @JSImport("@pixi/core/lib/textures/resources/ImageBitmapResource", "ImageBitmapResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Cached empty placeholder canvas.
      * @see EMPTY
      */
    @JSImport("@pixi/core/lib/textures/resources/ImageBitmapResource", "ImageBitmapResource._EMPTY")
    @js.native
    def _EMPTY: Any = js.native
    inline def _EMPTY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EMPTY")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if current environment support ImageBitmap, and source is string or ImageBitmap
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait IImageBitmapResourceOptions extends StObject {
    
    /** Alpha mode used when creating the ImageBitmap. */
    var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
    
    /** Start loading process automatically when constructed. */
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    /** Load image using cross origin. */
    var crossOrigin: js.UndefOr[Boolean] = js.undefined
  }
  object IImageBitmapResourceOptions {
    
    inline def apply(): IImageBitmapResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageBitmapResourceOptions]
    }
    
    extension [Self <: IImageBitmapResourceOptions](x: Self) {
      
      inline def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
      
      inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    }
  }
}
