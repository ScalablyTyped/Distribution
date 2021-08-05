package typings.pixiJs.mod

import typings.pixiJs.PIXI.IPointData
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A texture stores the information that represents an image or part of an image.
  *
  * It cannot be added to the display list directly; instead use it as the texture for a Sprite.
  * If no frame is provided for a texture, then the whole image is used.
  *
  * You can directly create a texture from an image and then reuse it multiple times like this :
  *
  * ```js
  * let texture = PIXI.Texture.from('assets/image.png');
  * let sprite1 = new PIXI.Sprite(texture);
  * let sprite2 = new PIXI.Sprite(texture);
  * ```
  *
  * If you didnt pass the texture frame to constructor, it enables `noFrame` mode:
  * it subscribes on baseTexture events, it automatically resizes at the same time as baseTexture.
  *
  * Textures made from SVGs, loaded or not, cannot be used before the file finishes processing.
  * You can check for this by checking the sprite's _textureID property.
  * ```js
  * var texture = PIXI.Texture.from('assets/image.svg');
  * var sprite1 = new PIXI.Sprite(texture);
  * //sprite1._textureID should not be undefined if the texture has finished processing the SVG file
  * ```
  * You can use a ticker or rAF to ensure your sprites load the finished textures after processing. See issue #3068.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSImport("pixi.js", "Texture")
@js.native
class Texture protected ()
  extends StObject
     with typings.pixiJs.PIXI.Texture {
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture) = this()
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, frame: typings.pixiJs.PIXI.Rectangle) = this()
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, frame: Unit, orig: typings.pixiJs.PIXI.Rectangle) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle
  ) = this()
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, frame: Unit, orig: Unit, trim: Unit, rotate: Double) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: Unit,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: Unit,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: Unit,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: Unit,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: Unit,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: Unit,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: Unit,
    rotate: Unit,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: IPointData
  ) = this()
  def this(
    baseTexture: typings.pixiJs.PIXI.BaseTexture,
    frame: typings.pixiJs.PIXI.Rectangle,
    orig: typings.pixiJs.PIXI.Rectangle,
    trim: typings.pixiJs.PIXI.Rectangle,
    rotate: Unit,
    anchor: IPointData
  ) = this()
}
object Texture {
  
  @JSImport("pixi.js", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An empty texture, used often to not have to create multiple empty textures.
    * Can not be destroyed.
    *
    * @static
    * @constant
    * @member {PIXI.Texture}
    */
  /* static member */
  @JSImport("pixi.js", "Texture.EMPTY")
  @js.native
  def EMPTY: typings.pixiJs.PIXI.Texture = js.native
  inline def EMPTY_=(x: typings.pixiJs.PIXI.Texture): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  /**
    * A white texture of 16x16 size, used for graphics and other things
    * Can not be destroyed.
    *
    * @static
    * @constant
    * @member {PIXI.Texture}
    */
  /* static member */
  @JSImport("pixi.js", "Texture.WHITE")
  @js.native
  def WHITE: typings.pixiJs.PIXI.Texture = js.native
  inline def WHITE_=(x: typings.pixiJs.PIXI.Texture): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a Texture to the global TextureCache. This cache is shared across the whole PIXI object.
    *
    * @static
    * @param {PIXI.Texture} texture - The Texture to add to the cache.
    * @param {string} id - The id that the Texture will be stored against.
    */
  /* static member */
  inline def addToCache(texture: typings.pixiJs.PIXI.Texture, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToCache")(texture.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Helper function that creates a new Texture based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|PIXI.BaseTexture} source
    *        Source to create texture from
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {boolean} [strict] - Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @return {PIXI.Texture} The newly created texture
    */
  /* static member */
  inline def from(source: String): typings.pixiJs.PIXI.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: String, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: String, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: String, options: Unit, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: typings.pixiJs.PIXI.BaseTexture): typings.pixiJs.PIXI.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: typings.pixiJs.PIXI.BaseTexture, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: typings.pixiJs.PIXI.BaseTexture, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: typings.pixiJs.PIXI.BaseTexture, options: Unit, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLCanvasElement): typings.pixiJs.PIXI.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLCanvasElement, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLCanvasElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLCanvasElement, options: Unit, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLImageElement): typings.pixiJs.PIXI.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLImageElement, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLImageElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLImageElement, options: Unit, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLVideoElement): typings.pixiJs.PIXI.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLVideoElement, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLVideoElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def from(source: HTMLVideoElement, options: Unit, strict: Boolean): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  
  /**
    * Create a new Texture with a BufferResource from a Float32Array.
    * RGBA values are floats from 0 to 1.
    * @static
    * @param {Float32Array|Uint8Array} buffer - The optional array to use, if no data
    *        is provided, a new Float32Array is created.
    * @param {number} width - Width of the resource
    * @param {number} height - Height of the resource
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.Texture} The resulting new BaseTexture
    */
  /* static member */
  inline def fromBuffer(buffer: Float32Array, width: Double, height: Double): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def fromBuffer(buffer: Float32Array, width: Double, height: Double, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def fromBuffer(buffer: Uint8Array, width: Double, height: Double): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def fromBuffer(buffer: Uint8Array, width: Double, height: Double, options: js.Any): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  
  inline def fromLoader(source: HTMLCanvasElement, imageUrl: String): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def fromLoader(source: HTMLCanvasElement, imageUrl: String, name: String): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  /**
    * Create a texture from a source and add to the cache.
    *
    * @static
    * @param {HTMLImageElement|HTMLCanvasElement} source - The input source.
    * @param {String} imageUrl - File name of texture, for cache and resolving resolution.
    * @param {String} [name] - Human readable name for the texture cache. If no name is
    *        specified, only `imageUrl` will be used as the cache ID.
    * @return {PIXI.Texture} Output texture
    */
  /* static member */
  inline def fromLoader(source: HTMLImageElement, imageUrl: String): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  inline def fromLoader(source: HTMLImageElement, imageUrl: String, name: String): typings.pixiJs.PIXI.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLoader")(source.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Texture]
  
  /**
    * Useful for loading textures via URLs. Use instead of `Texture.from` because
    * it does a better job of handling failed URLs more effectively. This also ignores
    * `PIXI.settings.STRICT_TEXTURE_CACHE`. Works for Videos, SVGs, Images.
    * @param {string} url The remote URL to load.
    * @param {object} [options] Optional options to include
    * @return {Promise<PIXI.Texture>} A Promise that resolves to a Texture.
    */
  /* static member */
  inline def fromURL(url: String): js.Promise[typings.pixiJs.PIXI.Texture] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pixiJs.PIXI.Texture]]
  inline def fromURL(url: String, options: js.Any): js.Promise[typings.pixiJs.PIXI.Texture] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pixiJs.PIXI.Texture]]
  
  /**
    * Remove a Texture from the global TextureCache.
    *
    * @static
    * @param {string|PIXI.Texture} texture - id of a Texture to be removed, or a Texture instance itself
    * @return {PIXI.Texture|null} The Texture that was removed
    */
  /* static member */
  inline def removeFromCache(texture: String): typings.pixiJs.PIXI.Texture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(texture.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture | Null]
  inline def removeFromCache(texture: typings.pixiJs.PIXI.Texture): typings.pixiJs.PIXI.Texture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(texture.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Texture | Null]
}
