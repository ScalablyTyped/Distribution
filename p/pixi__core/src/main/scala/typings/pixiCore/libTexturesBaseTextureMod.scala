package typings.pixiCore

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiConstants.mod.ALPHA_MODES
import typings.pixiConstants.mod.FORMATS
import typings.pixiConstants.mod.MIPMAP_MODES
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiConstants.mod.TARGETS
import typings.pixiConstants.mod.TYPES
import typings.pixiConstants.mod.WRAP_MODES
import typings.pixiCore.libTexturesGltextureMod.GLTexture
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesBufferResourceMod.BufferResource
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiUtils.mod.EventEmitter
import typings.std.ErrorEvent
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesBaseTextureMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.BaseTexture * / any */ @JSImport("@pixi/core/lib/textures/BaseTexture", "BaseTexture")
  @js.native
  /**
    * @param {PIXI.Resource|HTMLImageElement|HTMLVideoElement|ImageBitmap|ICanvas|string} [resource=null] -
    *        The current resource to use, for things that aren't Resource objects, will be converted
    *        into a Resource.
    * @param options - Collection of options
    * @param {PIXI.MIPMAP_MODES} [options.mipmap=PIXI.settings.MIPMAP_TEXTURES] - If mipmapping is enabled for texture
    * @param {number} [options.anisotropicLevel=PIXI.settings.ANISOTROPIC_LEVEL] - Anisotropic filtering level of texture
    * @param {PIXI.WRAP_MODES} [options.wrapMode=PIXI.settings.WRAP_MODE] - Wrap mode for textures
    * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.settings.SCALE_MODE] - Default scale mode, linear, nearest
    * @param {PIXI.FORMATS} [options.format=PIXI.FORMATS.RGBA] - GL format type
    * @param {PIXI.TYPES} [options.type=PIXI.TYPES.UNSIGNED_BYTE] - GL data type
    * @param {PIXI.TARGETS} [options.target=PIXI.TARGETS.TEXTURE_2D] - GL texture target
    * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.UNPACK] - Pre multiply the image alpha
    * @param {number} [options.width=0] - Width of the texture
    * @param {number} [options.height=0] - Height of the texture
    * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - Resolution of the base texture
    * @param {object} [options.resourceOptions] - Optional resource options,
    *        see {@link PIXI.autoDetectResource autoDetectResource}
    */
  open class BaseTexture[R /* <: Resource */, RO] ()
    extends EventEmitter[String | js.Symbol, Any] {
    def this(resource: Any | R) = this()
    def this(resource: String) = this()
    def this(resource: ImageSource) = this()
    def this(resource: Any | R, options: IBaseTextureOptions[RO]) = this()
    def this(resource: String, options: IBaseTextureOptions[RO]) = this()
    def this(resource: Unit, options: IBaseTextureOptions[RO]) = this()
    def this(resource: ImageSource, options: IBaseTextureOptions[RO]) = this()
    
    /**
      * Number of the texture batch, used by multi-texture renderers
      * @member {number}
      */
    var _batchEnabled: Double = js.native
    
    /**
      * Location inside texture batch, used by multi-texture renderers
      * @member {number}
      */
    var _batchLocation: Double = js.native
    
    /**
      * The map of render context textures where this is bound
      * @private
      */
    var _glTextures: NumberDictionary[GLTexture] = js.native
    
    /* private */ var _mipmap: Any = js.native
    
    /**
      * Refresh check for isPowerOfTwo texture based on size
      * @private
      */
    /* protected */ def _refreshPOT(): Unit = js.native
    
    /* private */ var _scaleMode: Any = js.native
    
    /* private */ var _wrapMode: Any = js.native
    
    /**
      * How to treat premultiplied alpha, see {@link PIXI.ALPHA_MODES}.
      * @member {PIXI.ALPHA_MODES}
      * @default PIXI.ALPHA_MODES.UNPACK
      */
    var alphaMode: js.UndefOr[ALPHA_MODES] = js.native
    
    /**
      * Anisotropic filtering level of texture
      * @member {number}
      * @default PIXI.settings.ANISOTROPIC_LEVEL
      */
    var anisotropicLevel: js.UndefOr[Double] = js.native
    
    /**
      * Currently default cache ID.
      * @member {string}
      */
    var cacheId: String = js.native
    
    /** Utility function for BaseTexture|Texture cast. */
    def castToBaseTexture(): BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    /**
      * Destroys this base texture.
      * The method stops if resource doesn't want this texture to be destroyed.
      * Removes texture from all caches.
      */
    def destroy(): Unit = js.native
    
    /**
      * Flag if BaseTexture has been destroyed.
      * @member {boolean}
      * @readonly
      */
    var destroyed: Boolean = js.native
    
    /**
      * Used by TextureSystem to only update texture to the GPU when needed.
      * Please call `update()` to increment it.
      * @readonly
      */
    var dirtyId: Double = js.native
    
    /**
      * Used by TextureSystem to only update texture style when needed.
      * @protected
      */
    var dirtyStyleId: Double = js.native
    
    /**
      * Frees the texture from WebGL memory without destroying this texture object.
      * This means you can still use the texture later which will upload it to GPU
      * memory again.
      * @fires PIXI.BaseTexture#dispose
      */
    def dispose(): Unit = js.native
    
    /**
      * The pixel format of the texture
      * @default PIXI.FORMATS.RGBA
      */
    var format: js.UndefOr[FORMATS] = js.native
    
    /**
      * The height of the base texture set when the image has loaded
      * @readonly
      */
    var height: Double = js.native
    
    /**
      * Whether or not the texture is a power of two, try to use power of two textures as much
      * as you can
      * @readonly
      * @default false
      */
    var isPowerOfTwo: Boolean = js.native
    
    /**
      * Mipmap mode of the texture, affects downscaled images
      * @default PIXI.settings.MIPMAP_TEXTURES
      */
    def mipmap: MIPMAP_MODES = js.native
    def mipmap_=(value: MIPMAP_MODES): Unit = js.native
    
    /**
      * Handle errors with resources.
      * @private
      * @param event - Error event emitted.
      */
    def onError(event: ErrorEvent): Unit = js.native
    
    /**
      * Whether its a part of another texture, handled by ArrayResource or CubeResource
      * @member {PIXI.BaseTexture}
      */
    var parentTextureArray: BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    /**
      * Pixel height of the source of this texture
      * @readonly
      */
    def realHeight: Double = js.native
    
    /**
      * Pixel width of the source of this texture
      * @readonly
      */
    def realWidth: Double = js.native
    
    /**
      * The resolution / device pixel ratio of the texture
      * @readonly
      * @default PIXI.settings.RESOLUTION
      */
    var resolution: Double = js.native
    
    /**
      * The resource used by this BaseTexture, there can only
      * be one resource per BaseTexture, but textures can share
      * resources.
      * @member {PIXI.Resource}
      * @readonly
      */
    var resource: R = js.native
    
    /**
      * The scale mode to apply when scaling this texture
      * @default PIXI.settings.SCALE_MODE
      */
    def scaleMode: SCALE_MODES = js.native
    def scaleMode_=(value: SCALE_MODES): Unit = js.native
    
    /**
      * Sets real size of baseTexture, preserves current resolution.
      * @param realWidth - Full rendered width
      * @param realHeight - Full rendered height
      * @param resolution - Optionally set resolution
      * @returns - this
      */
    def setRealSize(realWidth: Double, realHeight: Double): this.type = js.native
    def setRealSize(realWidth: Double, realHeight: Double, resolution: Double): this.type = js.native
    
    /**
      * Changes resolution
      * @param resolution - res
      * @returns - this
      */
    def setResolution(resolution: Double): this.type = js.native
    
    /**
      * Sets the resource if it wasn't set. Throws error if resource already present
      * @param resource - that is managing this BaseTexture
      * @returns - this
      */
    def setResource(resource: R): this.type = js.native
    
    /**
      * Changes w/h/resolution. Texture becomes valid if width and height are greater than zero.
      * @param desiredWidth - Desired visual width
      * @param desiredHeight - Desired visual height
      * @param resolution - Optionally set resolution
      * @returns - this
      */
    def setSize(desiredWidth: Double, desiredHeight: Double): this.type = js.native
    def setSize(desiredWidth: Double, desiredHeight: Double, resolution: Double): this.type = js.native
    
    /**
      * Changes style options of BaseTexture
      * @param scaleMode - Pixi scalemode
      * @param mipmap - enable mipmaps
      * @returns - this
      */
    def setStyle(): this.type = js.native
    def setStyle(scaleMode: Unit, mipmap: MIPMAP_MODES): this.type = js.native
    def setStyle(scaleMode: SCALE_MODES): this.type = js.native
    def setStyle(scaleMode: SCALE_MODES, mipmap: MIPMAP_MODES): this.type = js.native
    
    /**
      * The target type
      * @default PIXI.TARGETS.TEXTURE_2D
      */
    var target: js.UndefOr[TARGETS] = js.native
    
    /**
      * The collection of alternative cache ids, since some BaseTextures
      * can have more than one ID, short name and longer full URL
      * @member {Array<string>}
      * @readonly
      */
    var textureCacheIds: js.Array[String] = js.native
    
    /**
      * Used by automatic texture Garbage Collection, stores last GC tick when it was bound
      * @protected
      */
    var touched: Double = js.native
    
    /**
      * The type of resource data
      * @default PIXI.TYPES.UNSIGNED_BYTE
      */
    var `type`: js.UndefOr[TYPES] = js.native
    
    /**
      * Global unique identifier for this BaseTexture
      * @protected
      */
    val uid: Double = js.native
    
    /** Invalidates the object. Texture becomes valid if width and height are greater than zero. */
    def update(): Unit = js.native
    
    /**
      * Generally speaking means when resource is loaded.
      * @readonly
      * @member {boolean}
      */
    var valid: Boolean = js.native
    
    /**
      * The width of the base texture set when the image has loaded
      * @readonly
      */
    var width: Double = js.native
    
    /**
      * How the texture wraps
      * @default PIXI.settings.WRAP_MODE
      */
    def wrapMode: WRAP_MODES = js.native
    def wrapMode_=(value: WRAP_MODES): Unit = js.native
  }
  /* static members */
  object BaseTexture {
    
    @JSImport("@pixi/core/lib/textures/BaseTexture", "BaseTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /** Global number of the texture batch, used by multi-texture renderers. */
    @JSImport("@pixi/core/lib/textures/BaseTexture", "BaseTexture._globalBatch")
    @js.native
    def _globalBatch: Double = js.native
    inline def _globalBatch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_globalBatch")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a BaseTexture to the global BaseTextureCache. This cache is shared across the whole PIXI object.
      * @param {PIXI.BaseTexture} baseTexture - The BaseTexture to add to the cache.
      * @param {string} id - The id that the BaseTexture will be stored against.
      */
    inline def addToCache(baseTexture: BaseTexture[Resource, IAutoDetectOptions], id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToCache")(baseTexture.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def from[R /* <: Resource */, RO](source: String): BaseTexture[R, IAutoDetectOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: String, options: Unit, strict: Boolean): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: String, options: IBaseTextureOptions[RO]): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: String, options: IBaseTextureOptions[RO], strict: Boolean): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: js.Array[String]): BaseTexture[R, IAutoDetectOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: js.Array[String], options: Unit, strict: Boolean): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: js.Array[String], options: IBaseTextureOptions[RO]): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: js.Array[String], options: IBaseTextureOptions[RO], strict: Boolean): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    /**
      * Helper function that creates a base texture based on the source you provide.
      * The source can be - image url, image element, canvas element. If the
      * source is an image url or an image element and not in the base texture
      * cache, it will be created and loaded.
      * @static
      * @param {HTMLImageElement|HTMLVideoElement|ImageBitmap|PIXI.ICanvas|string|string[]} source - The
      *        source to create base texture from.
      * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
      * @param {string} [options.pixiIdPrefix=pixiid] - If a source has no id, this is the prefix of the generated id
      * @param {boolean} [strict] - Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
      * @returns {PIXI.BaseTexture} The new base texture.
      */
    inline def from[R /* <: Resource */, RO](source: ImageSource): BaseTexture[R, IAutoDetectOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: ImageSource, options: Unit, strict: Boolean): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: ImageSource, options: IBaseTextureOptions[RO]): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    inline def from[R /* <: Resource */, RO](source: ImageSource, options: IBaseTextureOptions[RO], strict: Boolean): BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[R, IAutoDetectOptions]]
    
    /**
      * Create a new BaseTexture with a BufferResource from a Float32Array.
      * RGBA values are floats from 0 to 1.
      * @param {Float32Array|Uint8Array} buffer - The optional array to use, if no data
      *        is provided, a new Float32Array is created.
      * @param width - Width of the resource
      * @param height - Height of the resource
      * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
      *        Default properties are different from the constructor's defaults.
      * @param {PIXI.FORMATS} [options.format=PIXI.FORMATS.RGBA] - GL format type
      * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.NPM] - Image alpha, not premultiplied by default
      * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.SCALE_MODES.NEAREST] - Scale mode, pixelating by default
      * @returns - The resulting new BaseTexture
      */
    inline def fromBuffer(buffer: js.typedarray.Float32Array, width: Double, height: Double): BaseTexture[BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[BufferResource, IAutoDetectOptions]]
    inline def fromBuffer(
      buffer: js.typedarray.Float32Array,
      width: Double,
      height: Double,
      options: IBaseTextureOptions[Any]
    ): BaseTexture[BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[BufferResource, IAutoDetectOptions]]
    inline def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double): BaseTexture[BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[BufferResource, IAutoDetectOptions]]
    inline def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double, options: IBaseTextureOptions[Any]): BaseTexture[BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BaseTexture[BufferResource, IAutoDetectOptions]]
    
    /**
      * Remove a BaseTexture from the global BaseTextureCache.
      * @param {string|PIXI.BaseTexture} baseTexture - id of a BaseTexture to be removed, or a BaseTexture instance itself.
      * @returns {PIXI.BaseTexture|null} The BaseTexture that was removed.
      */
    inline def removeFromCache(baseTexture: String): (BaseTexture[Resource, IAutoDetectOptions]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(baseTexture.asInstanceOf[js.Any]).asInstanceOf[(BaseTexture[Resource, IAutoDetectOptions]) | Null]
    inline def removeFromCache(baseTexture: BaseTexture[Resource, IAutoDetectOptions]): (BaseTexture[Resource, IAutoDetectOptions]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(baseTexture.asInstanceOf[js.Any]).asInstanceOf[(BaseTexture[Resource, IAutoDetectOptions]) | Null]
  }
  
  trait IBaseTextureOptions[RO] extends StObject {
    
    var alphaMode: js.UndefOr[ALPHA_MODES] = js.undefined
    
    var anisotropicLevel: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[FORMATS] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var mipmap: js.UndefOr[MIPMAP_MODES] = js.undefined
    
    var multisample: js.UndefOr[MSAA_QUALITY] = js.undefined
    
    var pixiIdPrefix: js.UndefOr[String] = js.undefined
    
    var resolution: js.UndefOr[Double] = js.undefined
    
    var resourceOptions: js.UndefOr[RO] = js.undefined
    
    var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
    
    var target: js.UndefOr[TARGETS] = js.undefined
    
    var `type`: js.UndefOr[TYPES] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var wrapMode: js.UndefOr[WRAP_MODES] = js.undefined
  }
  object IBaseTextureOptions {
    
    inline def apply[RO](): IBaseTextureOptions[RO] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseTextureOptions[RO]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseTextureOptions[?], RO] (val x: Self & IBaseTextureOptions[RO]) extends AnyVal {
      
      inline def setAlphaMode(value: ALPHA_MODES): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
      
      inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
      
      inline def setAnisotropicLevel(value: Double): Self = StObject.set(x, "anisotropicLevel", value.asInstanceOf[js.Any])
      
      inline def setAnisotropicLevelUndefined: Self = StObject.set(x, "anisotropicLevel", js.undefined)
      
      inline def setFormat(value: FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMipmap(value: MIPMAP_MODES): Self = StObject.set(x, "mipmap", value.asInstanceOf[js.Any])
      
      inline def setMipmapUndefined: Self = StObject.set(x, "mipmap", js.undefined)
      
      inline def setMultisample(value: MSAA_QUALITY): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
      
      inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
      
      inline def setPixiIdPrefix(value: String): Self = StObject.set(x, "pixiIdPrefix", value.asInstanceOf[js.Any])
      
      inline def setPixiIdPrefixUndefined: Self = StObject.set(x, "pixiIdPrefix", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setResourceOptions(value: RO): Self = StObject.set(x, "resourceOptions", value.asInstanceOf[js.Any])
      
      inline def setResourceOptionsUndefined: Self = StObject.set(x, "resourceOptions", js.undefined)
      
      inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
      
      inline def setTarget(value: TARGETS): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapMode(value: WRAP_MODES): Self = StObject.set(x, "wrapMode", value.asInstanceOf[js.Any])
      
      inline def setWrapModeUndefined: Self = StObject.set(x, "wrapMode", js.undefined)
    }
  }
  
  type ImageSource = HTMLImageElement | HTMLVideoElement | ImageBitmap | ICanvas
}
