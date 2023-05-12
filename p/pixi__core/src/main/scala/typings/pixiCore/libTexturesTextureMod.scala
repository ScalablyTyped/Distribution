package typings.pixiCore

import typings.pixiCore.libTexturesBaseTextureMod.BaseTexture
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesBaseTextureMod.ImageSource
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesBufferResourceMod.BufferResource
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.libTexturesTextureMatrixMod.TextureMatrix
import typings.pixiCore.libTexturesTextureUvsMod.TextureUvs
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.mod.ISize
import typings.pixiMath.mod.Point
import typings.pixiMath.mod.Rectangle
import typings.pixiUtils.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesTextureMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Texture * / any */ @JSImport("@pixi/core/lib/textures/Texture", "Texture")
  @js.native
  open class Texture[R /* <: Resource */] protected ()
    extends EventEmitter[String | js.Symbol, Any] {
    /**
      * @param baseTexture - The base texture source to create the texture from
      * @param frame - The rectangle frame of the texture to show
      * @param orig - The area of original texture
      * @param trim - Trimmed rectangle of original texture
      * @param rotate - indicates how the texture was rotated by texture packer. See {@link PIXI.groupD8}
      * @param anchor - Default anchor point used for sprite placement / rotation
      * @param borders - Default borders used for 9-slice scaling. See {@link PIXI.NineSlicePlane}
      */
    def this(
      baseTexture: BaseTexture[R, IAutoDetectOptions],
      frame: js.UndefOr[Rectangle],
      orig: js.UndefOr[Rectangle],
      trim: js.UndefOr[Rectangle],
      rotate: js.UndefOr[Double],
      anchor: js.UndefOr[IPointData],
      borders: js.UndefOr[ITextureBorders]
    ) = this()
    
    /**
      * This is the area of the BaseTexture image to actually copy to the Canvas / WebGL when rendering,
      * irrespective of the actual frame size or placement (which can be influenced by trimmed texture atlases)
      */
    var _frame: Rectangle = js.native
    
    /* protected */ var _rotate: Double = js.native
    
    /**
      * Update ID is observed by sprites and TextureMatrix instances.
      * Call updateUvs() to increment it.
      * @protected
      */
    var _updateID: Double = js.native
    
    /**
      * The WebGL UV data cache. Can be used as quad UV.
      * @protected
      */
    var _uvs: TextureUvs = js.native
    
    /** The base texture that this texture uses. */
    var baseTexture: BaseTexture[R, IAutoDetectOptions] = js.native
    
    /** Utility function for BaseTexture|Texture cast. */
    def castToBaseTexture(): BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    /**
      * Anchor point that is used as default if sprite is created with this texture.
      * Changing the `defaultAnchor` at a later point of time will not update Sprite's anchor point.
      * @default {0,0}
      */
    var defaultAnchor: Point = js.native
    
    /**
      * Default width of the non-scalable border that is used if 9-slice plane is created with this texture.
      * @since 7.2.0
      * @see PIXI.NineSlicePlane
      */
    var defaultBorders: js.UndefOr[ITextureBorders] = js.native
    
    /**
      * Destroys this texture
      * @param [destroyBase=false] - Whether to destroy the base texture as well
      */
    def destroy(): Unit = js.native
    def destroy(destroyBase: Boolean): Unit = js.native
    
    /**
      * The frame specifies the region of the base texture that this texture uses.
      * Please call `updateUvs()` after you change coordinates of `frame` manually.
      */
    def frame: Rectangle = js.native
    def frame_=(frame: Rectangle): Unit = js.native
    
    /** The height of the Texture in pixels. */
    def height: Double = js.native
    
    /**
      * Does this Texture have any frame data assigned to it?
      *
      * This mode is enabled automatically if no frame was passed inside constructor.
      *
      * In this mode texture is subscribed to baseTexture events, and fires `update` on any change.
      *
      * Beware, after loading or resize of baseTexture event can fired two times!
      * If you want more control, subscribe on baseTexture itself.
      *
      * Any assignment of `frame` switches off `noFrame` mode.
      * @example
      * texture.on('update', () => {});
      */
    var noFrame: Boolean = js.native
    
    /**
      * Called when the base texture is updated
      * @protected
      * @param baseTexture - The base texture.
      */
    def onBaseTextureUpdated(baseTexture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
    
    /** This is the area of original texture, before it was put in atlas. */
    var orig: Rectangle = js.native
    
    /**
      * Returns resolution of baseTexture
      * @readonly
      */
    def resolution: Double = js.native
    
    /**
      * Indicates whether the texture is rotated inside the atlas
      * set to 2 to compensate for texture packer rotation
      * set to 6 to compensate for spine packer rotation
      * can be used to rotate or mirror sprites
      * See {@link PIXI.groupD8} for explanation
      */
    def rotate: Double = js.native
    def rotate_=(rotate: Double): Unit = js.native
    
    /**
      * The ids under which this Texture has been added to the texture cache. This is
      * automatically set as long as Texture.addToCache is used, but may not be set if a
      * Texture is added directly to the TextureCache array.
      */
    var textureCacheIds: js.Array[String] = js.native
    
    /**
      * This is the trimmed area of original texture, before it was put in atlas
      * Please call `updateUvs()` after you change coordinates of `trim` manually.
      */
    var trim: Rectangle = js.native
    
    /**
      * Updates this texture on the gpu.
      *
      * Calls the TextureResource update.
      *
      * If you adjusted `frame` manually, please call `updateUvs()` instead.
      */
    def update(): Unit = js.native
    
    /**
      * Updates the internal WebGL UV cache. Use it after you change `frame` or `trim` of the texture.
      * Call it after changing the frame
      */
    def updateUvs(): Unit = js.native
    
    /** Default TextureMatrix instance for this texture. By default, that object is not created because its heavy. */
    var uvMatrix: TextureMatrix = js.native
    
    /** This will let the renderer know if the texture is valid. If it's not then it cannot be rendered. */
    var valid: Boolean = js.native
    
    /** The width of the Texture in pixels. */
    def width: Double = js.native
  }
  /* static members */
  object Texture {
    
    @JSImport("@pixi/core/lib/textures/Texture", "Texture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/core/lib/textures/Texture", "Texture._EMPTY")
    @js.native
    def _EMPTY: Any = js.native
    inline def _EMPTY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/core/lib/textures/Texture", "Texture._WHITE")
    @js.native
    def _WHITE: Any = js.native
    inline def _WHITE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WHITE")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a Texture to the global TextureCache. This cache is shared across the whole PIXI object.
      * @param texture - The Texture to add to the cache.
      * @param id - The id that the Texture will be stored against.
      */
    inline def addToCache(texture: Texture[Resource], id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToCache")(texture.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def from[R /* <: Resource */, RO](source: js.Array[TextureSource]): Texture[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Texture[R]]
    inline def from[R /* <: Resource */, RO](source: js.Array[TextureSource], options: Unit, strict: Boolean): Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Texture[R]]
    inline def from[R /* <: Resource */, RO](source: js.Array[TextureSource], options: IBaseTextureOptions[RO]): Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Texture[R]]
    inline def from[R /* <: Resource */, RO](source: js.Array[TextureSource], options: IBaseTextureOptions[RO], strict: Boolean): Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Texture[R]]
    /**
      * Helper function that creates a new Texture based on the source you provide.
      * The source can be - frame id, image url, video url, canvas element, video element, base texture
      * @param {string|PIXI.BaseTexture|HTMLImageElement|HTMLVideoElement|ImageBitmap|PIXI.ICanvas} source -
      *        Source or array of sources to create texture from
      * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
      * @param {string} [options.pixiIdPrefix=pixiid] - If a source has no id, this is the prefix of the generated id
      * @param {boolean} [strict] - Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
      * @returns {PIXI.Texture} The newly created texture
      */
    inline def from[R /* <: Resource */, RO](source: TextureSource): Texture[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Texture[R]]
    inline def from[R /* <: Resource */, RO](source: TextureSource, options: Unit, strict: Boolean): Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Texture[R]]
    inline def from[R /* <: Resource */, RO](source: TextureSource, options: IBaseTextureOptions[RO]): Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Texture[R]]
    inline def from[R /* <: Resource */, RO](source: TextureSource, options: IBaseTextureOptions[RO], strict: Boolean): Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Texture[R]]
    
    /**
      * Create a new Texture with a BufferResource from a Float32Array.
      * RGBA values are floats from 0 to 1.
      * @param {Float32Array|Uint8Array} buffer - The optional array to use, if no data
      *        is provided, a new Float32Array is created.
      * @param width - Width of the resource
      * @param height - Height of the resource
      * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
      * @returns - The resulting new BaseTexture
      */
    inline def fromBuffer(buffer: js.typedarray.Float32Array, width: Double, height: Double): Texture[BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Texture[BufferResource]]
    inline def fromBuffer(
      buffer: js.typedarray.Float32Array,
      width: Double,
      height: Double,
      options: IBaseTextureOptions[ISize]
    ): Texture[BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Texture[BufferResource]]
    inline def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double): Texture[BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Texture[BufferResource]]
    inline def fromBuffer(
      buffer: js.typedarray.Uint8Array,
      width: Double,
      height: Double,
      options: IBaseTextureOptions[ISize]
    ): Texture[BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Texture[BufferResource]]
    
    inline def fromLoader[R /* <: Resource */](source: String, imageUrl: String): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromLoader[R /* <: Resource */](source: String, imageUrl: String, name: String): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromLoader[R /* <: Resource */](source: String, imageUrl: String, name: String, options: IBaseTextureOptions[Any]): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromLoader[R /* <: Resource */](source: String, imageUrl: String, name: Unit, options: IBaseTextureOptions[Any]): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    /**
      * Create a texture from a source and add to the cache.
      * @param {HTMLImageElement|HTMLVideoElement|ImageBitmap|PIXI.ICanvas|string} source - The input source.
      * @param imageUrl - File name of texture, for cache and resolving resolution.
      * @param name - Human readable name for the texture cache. If no name is
      *        specified, only `imageUrl` will be used as the cache ID.
      * @param options
      * @returns - Output texture
      */
    inline def fromLoader[R /* <: Resource */](source: ImageSource, imageUrl: String): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromLoader[R /* <: Resource */](source: ImageSource, imageUrl: String, name: String): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromLoader[R /* <: Resource */](source: ImageSource, imageUrl: String, name: String, options: IBaseTextureOptions[Any]): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromLoader[R /* <: Resource */](source: ImageSource, imageUrl: String, name: Unit, options: IBaseTextureOptions[Any]): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    
    /**
      * Useful for loading textures via URLs. Use instead of `Texture.from` because
      * it does a better job of handling failed URLs more effectively. This also ignores
      * `PIXI.settings.STRICT_TEXTURE_CACHE`. Works for Videos, SVGs, Images.
      * @param url - The remote URL or array of URLs to load.
      * @param options - Optional options to include
      * @returns - A Promise that resolves to a Texture.
      */
    inline def fromURL[R /* <: Resource */, RO](url: String): js.Promise[Texture[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromURL[R /* <: Resource */, RO](url: String, options: IBaseTextureOptions[RO]): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromURL[R /* <: Resource */, RO](url: js.Array[String]): js.Promise[Texture[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Texture[R]]]
    inline def fromURL[R /* <: Resource */, RO](url: js.Array[String], options: IBaseTextureOptions[RO]): js.Promise[Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Texture[R]]]
    
    /**
      * Remove a Texture from the global TextureCache.
      * @param texture - id of a Texture to be removed, or a Texture instance itself
      * @returns - The Texture that was removed
      */
    inline def removeFromCache(texture: String): Texture[Resource] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(texture.asInstanceOf[js.Any]).asInstanceOf[Texture[Resource] | Null]
    inline def removeFromCache(texture: Texture[Resource]): Texture[Resource] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(texture.asInstanceOf[js.Any]).asInstanceOf[Texture[Resource] | Null]
  }
  
  trait ITextureBorders extends StObject {
    
    /** bottom border in pixels */
    var bottom: Double
    
    /** left border in pixels */
    var left: Double
    
    /** right border in pixels */
    var right: Double
    
    /** top border in pixels */
    var top: Double
  }
  object ITextureBorders {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): ITextureBorders = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextureBorders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITextureBorders] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type TextureSource = String | (BaseTexture[Resource, IAutoDetectOptions]) | ImageSource
}
