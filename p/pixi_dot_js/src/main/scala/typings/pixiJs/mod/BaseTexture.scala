package typings.pixiJs.mod

import typings.pixiJs.AnonAlphaMode
import typings.pixiJs.PIXI.resources.Resource
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Texture stores the information that represents an image.
  * All textures have a base texture, which contains information about the source.
  * Therefore you can have many textures all using a single BaseTexture
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  * @param {PIXI.resources.Resource|string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement} [resource=null]
  *        The current resource to use, for things that aren't Resource objects, will be converted
  *        into a Resource.
  * @param {Object} [options] - Collection of options
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
  * @param {number} [options.resolution] - Resolution of the base texture
  * @param {object} [options.resourceOptions] - Optional resource options,
  *        see {@link PIXI.resources.autoDetectResource autoDetectResource}
  */
@JSImport("pixi.js", "BaseTexture")
@js.native
class BaseTexture ()
  extends typings.pixiJs.PIXI.BaseTexture {
  def this(resource: String) = this()
  def this(resource: Resource) = this()
  def this(resource: HTMLCanvasElement) = this()
  def this(resource: HTMLImageElement) = this()
  def this(resource: HTMLVideoElement) = this()
  def this(resource: String, options: AnonAlphaMode) = this()
  def this(resource: Resource, options: AnonAlphaMode) = this()
  def this(resource: HTMLCanvasElement, options: AnonAlphaMode) = this()
  def this(resource: HTMLImageElement, options: AnonAlphaMode) = this()
  def this(resource: HTMLVideoElement, options: AnonAlphaMode) = this()
}

/* static members */
@JSImport("pixi.js", "BaseTexture")
@js.native
object BaseTexture extends js.Object {
  /**
    * Global number of the texture batch, used by multi-texture renderers
    *
    * @static
    * @member {number}
    */
  var _globalBatch: Double = js.native
  /**
    * Adds a BaseTexture to the global BaseTextureCache. This cache is shared across the whole PIXI object.
    *
    * @static
    * @param {PIXI.BaseTexture} baseTexture - The BaseTexture to add to the cache.
    * @param {string} id - The id that the BaseTexture will be stored against.
    */
  def addToCache(baseTexture: typings.pixiJs.PIXI.BaseTexture, id: String): Unit = js.native
  /**
    * Helper function that creates a base texture based on the source you provide.
    * The source can be - image url, image element, canvas element. If the
    * source is an image url or an image element and not in the base texture
    * cache, it will be created and loaded.
    *
    * @static
    * @param {string|HTMLImageElement|HTMLCanvasElement|SVGElement|HTMLVideoElement} source - The
    *        source to create base texture from.
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {boolean} [strict] Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @returns {PIXI.BaseTexture} The new base texture.
    */
  def from(source: String): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: String, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: String, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLCanvasElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLCanvasElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLCanvasElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLImageElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLImageElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLImageElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLVideoElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLVideoElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: HTMLVideoElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: SVGElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: SVGElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(source: SVGElement, options: js.Any, strict: Boolean): typings.pixiJs.PIXI.BaseTexture = js.native
  /**
    * Create a new BaseTexture with a BufferResource from a Float32Array.
    * RGBA values are floats from 0 to 1.
    * @static
    * @param {Float32Array|Uint8Array} buffer The optional array to use, if no data
    *        is provided, a new Float32Array is created.
    * @param {number} width - Width of the resource
    * @param {number} height - Height of the resource
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.BaseTexture} The resulting new BaseTexture
    */
  def fromBuffer(buffer: Float32Array, width: Double, height: Double): typings.pixiJs.PIXI.BaseTexture = js.native
  def fromBuffer(buffer: Float32Array, width: Double, height: Double, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def fromBuffer(buffer: Uint8Array, width: Double, height: Double): typings.pixiJs.PIXI.BaseTexture = js.native
  def fromBuffer(buffer: Uint8Array, width: Double, height: Double, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  /**
    * Remove a BaseTexture from the global BaseTextureCache.
    *
    * @static
    * @param {string|PIXI.BaseTexture} baseTexture - id of a BaseTexture to be removed, or a BaseTexture instance itself.
    * @return {PIXI.BaseTexture|null} The BaseTexture that was removed.
    */
  def removeFromCache(baseTexture: String): typings.pixiJs.PIXI.BaseTexture | Null = js.native
  def removeFromCache(baseTexture: typings.pixiJs.PIXI.BaseTexture): typings.pixiJs.PIXI.BaseTexture | Null = js.native
}

