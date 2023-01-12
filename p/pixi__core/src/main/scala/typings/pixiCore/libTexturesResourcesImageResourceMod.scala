package typings.pixiCore

import typings.pixiConstants.mod.ALPHA_MODES
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod._IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesBaseImageResourceMod.BaseImageResource
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesImageResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/ImageResource", "ImageResource")
  @js.native
  open class ImageResource protected () extends BaseImageResource {
    def this(source: String) = this()
    /**
      * @param source - image source or URL
      * @param options
      * @param {boolean} [options.autoLoad=true] - start loading process
      * @param {boolean} [options.createBitmap=PIXI.settings.CREATE_IMAGE_BITMAP] - whether its required to create
      *        a bitmap before upload
      * @param {boolean} [options.crossorigin=true] - Load image using cross origin
      * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.UNPACK] - Premultiply image alpha in bitmap
      */
    def this(source: HTMLImageElement) = this()
    def this(source: String, options: IImageResourceOptions) = this()
    def this(source: HTMLImageElement, options: IImageResourceOptions) = this()
    
    /**
      * Promise when loading.
      * @default null
      */
    /* private */ var _load: Any = js.native
    
    /** When process is completed */
    /* private */ var _process: Any = js.native
    
    /**
      * Controls texture alphaMode field
      * Copies from options
      * Default is `null`, copies option from baseTexture
      * @readonly
      */
    var alphaMode: ALPHA_MODES = js.native
    
    /**
      * The ImageBitmap element created for a {@code HTMLImageElement}.
      * @default null
      */
    var bitmap: ImageBitmap = js.native
    
    /**
      * If capable, convert the image using createImageBitmap API.
      * @default PIXI.settings.CREATE_IMAGE_BITMAP
      */
    var createBitmap: Boolean = js.native
    
    def load(createBitmap: Boolean): js.Promise[ImageResource] = js.native
    
    /**
      * If the image should be disposed after upload
      * @default false
      */
    var preserveBitmap: Boolean = js.native
    
    /**
      * Called when we need to convert image into BitmapImage.
      * Can be called multiple times, real promise is cached inside.
      * @returns - Cached promise to fill that bitmap
      */
    def process(): js.Promise[ImageResource] = js.native
    
    /** URL of the image source */
    var url: String = js.native
  }
  /* static members */
  object ImageResource {
    
    @JSImport("@pixi/core/lib/textures/resources/ImageResource", "ImageResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if current environment support HTMLImageElement, and source is string or HTMLImageElement
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait IImageResourceOptions
    extends StObject
       with _IAutoDetectOptions {
    
    /** Premultiply image alpha in bitmap. */
    var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
    
    /** Start loading process automatically when constructed. */
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    /** Whether its required to create a bitmap before upload. */
    var createBitmap: js.UndefOr[Boolean] = js.undefined
    
    /** Load image using cross origin. */
    var crossorigin: js.UndefOr[Boolean | String] = js.undefined
  }
  object IImageResourceOptions {
    
    inline def apply(): IImageResourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageResourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageResourceOptions] (val x: Self) extends AnyVal {
      
      inline def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
      
      inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setCreateBitmap(value: Boolean): Self = StObject.set(x, "createBitmap", value.asInstanceOf[js.Any])
      
      inline def setCreateBitmapUndefined: Self = StObject.set(x, "createBitmap", js.undefined)
      
      inline def setCrossorigin(value: Boolean | String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    }
  }
}
