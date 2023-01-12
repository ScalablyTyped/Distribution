package typings.pixiCompressedTextures

import typings.pixiCompressedTextures.libConstMod.INTERNAL_FORMATS
import typings.pixiCompressedTextures.libResourcesBlobResourceMod.BlobResource
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.GLTexture
import typings.pixiCore.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResourcesCompressedTextureResourceMod {
  
  @JSImport("@pixi/compressed-textures/lib/resources/CompressedTextureResource", "CompressedTextureResource")
  @js.native
  open class CompressedTextureResource protected () extends BlobResource {
    /**
      * @param source - the buffer/URL holding the compressed texture data
      * @param options
      * @param {PIXI.INTERNAL_FORMATS} options.format - the compression format
      * @param {number} options.width - the image width in pixels.
      * @param {number} options.height - the image height in pixels.
      * @param {number} [options.level=1] - the mipmap levels stored in the compressed texture, including level 0.
      * @param {number} [options.levelBuffers] - the buffers for each mipmap level. `CompressedTextureResource` can allows you
      *      to pass `null` for `source`, for cases where each level is stored in non-contiguous memory.
      */
    def this(source: String, options: ICompressedTextureResourceOptions) = this()
    def this(source: js.typedarray.Uint32Array, options: ICompressedTextureResourceOptions) = this()
    def this(source: js.typedarray.Uint8Array, options: ICompressedTextureResourceOptions) = this()
    
    /* private */ var _extension: Any = js.native
    
    /* private */ var _levelBuffers: Any = js.native
    
    /** The compression format */
    var format: INTERNAL_FORMATS = js.native
    
    /**
      * The number of mipmap levels stored in the resource buffer.
      * @default 1
      */
    var levels: Double = js.native
    
    /** @protected */
    /* protected */ def onBlobLoaded(): Unit = js.native
    
    /**
      * @override
      * @param renderer - A reference to the current renderer
      * @param _texture - the texture
      * @param _glTexture - texture instance for this webgl context
      */
    def upload(renderer: Renderer, _texture: BaseTexture[Resource, IAutoDetectOptions], _glTexture: GLTexture): Boolean = js.native
  }
  /* static members */
  object CompressedTextureResource {
    
    @JSImport("@pixi/compressed-textures/lib/resources/CompressedTextureResource", "CompressedTextureResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Pre-creates buffer views for each mipmap level
      * @private
      * @param buffer -
      * @param format - compression formats
      * @param levels - mipmap levels
      * @param blockWidth -
      * @param blockHeight -
      * @param imageWidth - width of the image in pixels
      * @param imageHeight - height of the image in pixels
      */
    @JSImport("@pixi/compressed-textures/lib/resources/CompressedTextureResource", "CompressedTextureResource._createLevelBuffers")
    @js.native
    def _createLevelBuffers: Any = js.native
    inline def _createLevelBuffers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_createLevelBuffers")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the key (to ContextSystem#extensions) for the WebGL extension supporting the compression format
      * @private
      * @param format - the compression format to get the extension for.
      */
    @JSImport("@pixi/compressed-textures/lib/resources/CompressedTextureResource", "CompressedTextureResource._formatToExtension")
    @js.native
    def _formatToExtension: Any = js.native
    inline def _formatToExtension_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_formatToExtension")(x.asInstanceOf[js.Any])
  }
  
  trait CompressedLevelBuffer extends StObject {
    
    var levelBuffer: js.typedarray.Uint8Array
    
    var levelHeight: Double
    
    var levelID: Double
    
    var levelWidth: Double
  }
  object CompressedLevelBuffer {
    
    inline def apply(levelBuffer: js.typedarray.Uint8Array, levelHeight: Double, levelID: Double, levelWidth: Double): CompressedLevelBuffer = {
      val __obj = js.Dynamic.literal(levelBuffer = levelBuffer.asInstanceOf[js.Any], levelHeight = levelHeight.asInstanceOf[js.Any], levelID = levelID.asInstanceOf[js.Any], levelWidth = levelWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressedLevelBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressedLevelBuffer] (val x: Self) extends AnyVal {
      
      inline def setLevelBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "levelBuffer", value.asInstanceOf[js.Any])
      
      inline def setLevelHeight(value: Double): Self = StObject.set(x, "levelHeight", value.asInstanceOf[js.Any])
      
      inline def setLevelID(value: Double): Self = StObject.set(x, "levelID", value.asInstanceOf[js.Any])
      
      inline def setLevelWidth(value: Double): Self = StObject.set(x, "levelWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICompressedTextureResourceOptions extends StObject {
    
    var format: INTERNAL_FORMATS
    
    var height: Double
    
    var levelBuffers: js.UndefOr[js.Array[CompressedLevelBuffer]] = js.undefined
    
    var levels: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object ICompressedTextureResourceOptions {
    
    inline def apply(format: INTERNAL_FORMATS, height: Double, width: Double): ICompressedTextureResourceOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICompressedTextureResourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICompressedTextureResourceOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: INTERNAL_FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLevelBuffers(value: js.Array[CompressedLevelBuffer]): Self = StObject.set(x, "levelBuffers", value.asInstanceOf[js.Any])
      
      inline def setLevelBuffersUndefined: Self = StObject.set(x, "levelBuffers", js.undefined)
      
      inline def setLevelBuffersVarargs(value: CompressedLevelBuffer*): Self = StObject.set(x, "levelBuffers", js.Array(value*))
      
      inline def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
