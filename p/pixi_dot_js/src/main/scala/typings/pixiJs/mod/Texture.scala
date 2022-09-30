package typings.pixiJs.mod

import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.IBaseTextureOptions
import typings.pixiCore.mod.TextureSource
import typings.pixiMath.mod.IPointData
import typings.pixiMath.mod.ISize
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Texture")
@js.native
open class Texture[R /* <: typings.pixiCore.mod.Resource */] protected ()
  extends typings.pixiCore.mod.Texture[R] {
  /**
    * @param baseTexture - The base texture source to create the texture from
    * @param frame - The rectangle frame of the texture to show
    * @param orig - The area of original texture
    * @param trim - Trimmed rectangle of original texture
    * @param rotate - indicates how the texture was rotated by texture packer. See {@link PIXI.groupD8}
    * @param anchor - Default anchor point used for sprite placement / rotation
    */
  def this(baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: Unit,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: Unit,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiCore.mod.BaseTexture[R, IAutoDetectOptions],
    frame: typings.pixiMath.mod.Rectangle,
    orig: typings.pixiMath.mod.Rectangle,
    trim: typings.pixiMath.mod.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("pixi.js", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "Texture._EMPTY")
  @js.native
  def _EMPTY: Any = js.native
  inline def _EMPTY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EMPTY")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "Texture._WHITE")
  @js.native
  def _WHITE: Any = js.native
  inline def _WHITE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WHITE")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a Texture to the global TextureCache. This cache is shared across the whole PIXI object.
    * @param texture - The Texture to add to the cache.
    * @param id - The id that the Texture will be stored against.
    */
  inline def addToCache(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToCache")(texture.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: js.Array[TextureSource]): typings.pixiCore.mod.Texture[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: js.Array[TextureSource], options: Unit, strict: Boolean): typings.pixiCore.mod.Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: js.Array[TextureSource], options: IBaseTextureOptions[RO]): typings.pixiCore.mod.Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: js.Array[TextureSource], options: IBaseTextureOptions[RO], strict: Boolean): typings.pixiCore.mod.Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  /**
    * Helper function that creates a new Texture based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    * @param {string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|PIXI.BaseTexture} source -
    *        Source or array of sources to create texture from
    * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {string} [options.pixiIdPrefix=pixiid] - If a source has no id, this is the prefix of the generated id
    * @param {boolean} [strict] - Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @returns {PIXI.Texture} The newly created texture
    */
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: TextureSource): typings.pixiCore.mod.Texture[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: TextureSource, options: Unit, strict: Boolean): typings.pixiCore.mod.Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: TextureSource, options: IBaseTextureOptions[RO]): typings.pixiCore.mod.Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  inline def from[R /* <: typings.pixiCore.mod.Resource */, RO](source: TextureSource, options: IBaseTextureOptions[RO], strict: Boolean): typings.pixiCore.mod.Texture[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[R]]
  
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
  inline def fromBuffer(buffer: js.typedarray.Float32Array, width: Double, height: Double): typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource]]
  inline def fromBuffer(
    buffer: js.typedarray.Float32Array,
    width: Double,
    height: Double,
    options: IBaseTextureOptions[ISize]
  ): typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource]]
  inline def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double): typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource]]
  inline def fromBuffer(
    buffer: js.typedarray.Uint8Array,
    width: Double,
    height: Double,
    options: IBaseTextureOptions[ISize]
  ): typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.BufferResource]]
  
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: String, imageUrl: String): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: String, imageUrl: String, name: String): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: String, imageUrl: String, name: String, options: IBaseTextureOptions[Any]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: String, imageUrl: String, name: Unit, options: IBaseTextureOptions[Any]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLCanvasElement, imageUrl: String): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLCanvasElement, imageUrl: String, name: String): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLCanvasElement, imageUrl: String, name: String, options: IBaseTextureOptions[Any]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLCanvasElement, imageUrl: String, name: Unit, options: IBaseTextureOptions[Any]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  /**
    * Create a texture from a source and add to the cache.
    * @param {HTMLImageElement|HTMLCanvasElement|string} source - The input source.
    * @param imageUrl - File name of texture, for cache and resolving resolution.
    * @param name - Human readable name for the texture cache. If no name is
    *        specified, only `imageUrl` will be used as the cache ID.
    * @param options
    * @returns - Output texture
    */
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLImageElement, imageUrl: String): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLImageElement, imageUrl: String, name: String): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLImageElement, imageUrl: String, name: String, options: IBaseTextureOptions[Any]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromLoader[R /* <: typings.pixiCore.mod.Resource */](source: HTMLImageElement, imageUrl: String, name: Unit, options: IBaseTextureOptions[Any]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  
  /**
    * Useful for loading textures via URLs. Use instead of `Texture.from` because
    * it does a better job of handling failed URLs more effectively. This also ignores
    * `PIXI.settings.STRICT_TEXTURE_CACHE`. Works for Videos, SVGs, Images.
    * @param url - The remote URL or array of URLs to load.
    * @param options - Optional options to include
    * @returns - A Promise that resolves to a Texture.
    */
  inline def fromURL[R /* <: typings.pixiCore.mod.Resource */, RO](url: String): js.Promise[typings.pixiCore.mod.Texture[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromURL[R /* <: typings.pixiCore.mod.Resource */, RO](url: String, options: IBaseTextureOptions[RO]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromURL[R /* <: typings.pixiCore.mod.Resource */, RO](url: js.Array[String]): js.Promise[typings.pixiCore.mod.Texture[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  inline def fromURL[R /* <: typings.pixiCore.mod.Resource */, RO](url: js.Array[String], options: IBaseTextureOptions[RO]): js.Promise[typings.pixiCore.mod.Texture[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiCore.mod.Texture[R]]]
  
  /**
    * Remove a Texture from the global TextureCache.
    * @param texture - id of a Texture to be removed, or a Texture instance itself
    * @returns - The Texture that was removed
    */
  inline def removeFromCache(texture: String): typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(texture.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] | Null]
  inline def removeFromCache(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]): typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(texture.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource] | Null]
}
