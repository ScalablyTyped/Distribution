package typings.playcanvas.pc

import typings.playcanvas.AnonAddressU
import typings.playcanvas.AnonFace
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Texture
  * @classdesc A texture is a container for texel data that can be utilized in a fragment shader.
  * Typically, the texel data represents an image that is mapped over geometry.
  * @description Creates a new texture.
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this texture.
  * @param {object} [options] - Object for passing optional arguments.
  * @param {number} [options.width] - The width of the texture in pixels. Defaults to 4.
  * @param {number} [options.height] - The height of the texture in pixels. Defaults to 4.
  * @param {number} [options.depth] - The number of depth slices in a 3D texture (WebGL2 only). Defaults to 1 (single 2D image).
  * @param {number} [options.format] - The pixel format of the texture. Can be:
  * * {@link pc.PIXELFORMAT_A8}
  * * {@link pc.PIXELFORMAT_L8}
  * * {@link pc.PIXELFORMAT_L8_A8}
  * * {@link pc.PIXELFORMAT_R5_G6_B5}
  * * {@link pc.PIXELFORMAT_R5_G5_B5_A1}
  * * {@link pc.PIXELFORMAT_R4_G4_B4_A4}
  * * {@link pc.PIXELFORMAT_R8_G8_B8}
  * * {@link pc.PIXELFORMAT_R8_G8_B8_A8}
  * * {@link pc.PIXELFORMAT_DXT1}
  * * {@link pc.PIXELFORMAT_DXT3}
  * * {@link pc.PIXELFORMAT_DXT5}
  * * {@link pc.PIXELFORMAT_RGB16F}
  * * {@link pc.PIXELFORMAT_RGBA16F}
  * * {@link pc.PIXELFORMAT_RGB32F}
  * * {@link pc.PIXELFORMAT_RGBA32F}
  * * {@link pc.PIXELFORMAT_ETC1}
  * * {@link pc.PIXELFORMAT_PVRTC_2BPP_RGB_1}
  * * {@link pc.PIXELFORMAT_PVRTC_2BPP_RGBA_1}
  * * {@link pc.PIXELFORMAT_PVRTC_4BPP_RGB_1}
  * * {@link pc.PIXELFORMAT_PVRTC_4BPP_RGBA_1}
  * * {@link pc.PIXELFORMAT_111110F}
  * * {@link pc.PIXELFORMAT_ASTC_4x4}>/li>
  * * {@link pc.PIXELFORMAT_ATC_RGB}
  * * {@link pc.PIXELFORMAT_ATC_RGBA}
  * Defaults to pc.PIXELFORMAT_R8_G8_B8_A8.
  * @param {number} [options.minFilter] - The minification filter type to use. Defaults to {@link pc.FILTER_LINEAR_MIPMAP_LINEAR}
  * @param {number} [options.magFilter] - The magnification filter type to use. Defaults to {@link pc.FILTER_LINEAR}
  * @param {number} [options.anisotropy] - The level of anisotropic filtering to use. Defaults to 1
  * @param {number} [options.addressU] - The repeat mode to use in the U direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param {number} [options.addressV] - The repeat mode to use in the V direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param {number} [options.addressW] - The repeat mode to use in the W direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param {boolean} [options.mipmaps] - When enabled try to generate or use mipmaps for this texture. Default is true
  * @param {boolean} [options.cubemap] - Specifies whether the texture is to be a cubemap. Defaults to false.
  * @param {boolean} [options.volume] - Specifies whether the texture is to be a 3D volume (WebGL2 only). Defaults to false.
  * @param {boolean} [options.rgbm] - Specifies whether the texture contains RGBM-encoded HDR data. Defaults to false.
  * @param {boolean} [options.swizzleGGGR] - Specifies whether the texture contains swizzled GGGR data for use with tangent space normal
  * maps. The R component is stored in alpha and G is stored in RGB. This packing can result in higher quality when the texture data
  * is compressed. Defaults to false.
  * @param {boolean} [options.fixCubemapSeams] - Specifies whether this cubemap texture requires special
  * seam fixing shader code to look right. Defaults to false.
  * @param {boolean} [options.flipY] - Specifies whether the texture should be flipped in the Y-direction. Only affects textures
  * with a source that is an image, canvas or video element. Does not affect cubemaps, compressed textures or textures set from raw
  * pixel data. Defaults to true.
  * @param {boolean} [options.premultiplyAlpha] - If true, the alpha channel of the texture (if present) is multiplied into the color
  * channels. Defaults to false.
  * @param {boolean} [options.compareOnRead] - When enabled, and if texture format is pc.PIXELFORMAT_DEPTH or pc.PIXELFORMAT_DEPTHSTENCIL,
  * hardware PCF is enabled for this texture, and you can get filtered results of comparison using texture() in your shader (WebGL2 only).
  * Defaults to false.
  * @param {number} [options.compareFunc] - Comparison function when compareOnRead is enabled (WebGL2 only). Defaults to pc.FUNC_LESS.
  * Possible values:
  * * {@link pc.FUNC_LESS}
  * * {@link pc.FUNC_LESSEQUAL}
  * * {@link pc.FUNC_GREATER}
  * * {@link pc.FUNC_GREATEREQUAL}
  * * {@link pc.FUNC_EQUAL}
  * * {@link pc.FUNC_NOTEQUAL}
  * @example
  * // Create a 8x8x24-bit texture
  * var texture = new pc.Texture(graphicsDevice, {
  *     width: 8,
  *     height: 8,
  *     format: pc.PIXELFORMAT_R8_G8_B8
  * });
  *
  * // Fill the texture with a gradient
  * var pixels = texture.lock();
  * var count = 0;
  * for (var i = 0; i < 8; i++) {
  *     for (var j = 0; j < 8; j++) {
  *         pixels[count++] = i * 32;
  *         pixels[count++] = j * 32;
  *         pixels[count++] = 255;
  *     }
  * }
  * texture.unlock();
  * @property {string} name The name of the texture. Defaults to null.
  */
@JSGlobal("pc.Texture")
@js.native
class Texture protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice) = this()
  def this(graphicsDevice: GraphicsDevice, options: AnonAddressU) = this()
  /**
    * @name pc.Texture#addressU
    * @type {number}
    * @description The addressing mode to be applied to the texture horizontally. Can be:
    * * {@link pc.ADDRESS_REPEAT}
    * * {@link pc.ADDRESS_CLAMP_TO_EDGE}
    * * {@link pc.ADDRESS_MIRRORED_REPEAT}
    */
  var addressU: Double = js.native
  /**
    * @name pc.Texture#addressV
    * @type {number}
    * @description The addressing mode to be applied to the texture vertically. Can be:
    * * {@link pc.ADDRESS_REPEAT}
    * * {@link pc.ADDRESS_CLAMP_TO_EDGE}
    * * {@link pc.ADDRESS_MIRRORED_REPEAT}
    */
  var addressV: Double = js.native
  /**
    * @name pc.Texture#addressW
    * @type {number}
    * @description The addressing mode to be applied to the 3D texture depth (WebGL2 only). Can be:
    * * {@link pc.ADDRESS_REPEAT}
    * * {@link pc.ADDRESS_CLAMP_TO_EDGE}
    * * {@link pc.ADDRESS_MIRRORED_REPEAT}
    */
  var addressW: Double = js.native
  /**
    * @name pc.Texture#anisotropy
    * @type {number}
    * @description Integer value specifying the level of anisotropic to apply to the texture
    * ranging from 1 (no anisotropic filtering) to the {@link pc.GraphicsDevice} property maxAnisotropy.
    */
  var anisotropy: Double = js.native
  /**
    * @name pc.Texture#compareFunc
    * @type {number}
    * @description Comparison function when compareOnRead is enabled (WebGL2 only).
    * Possible values:
    * * {@link pc.FUNC_LESS}
    * * {@link pc.FUNC_LESSEQUAL}
    * * {@link pc.FUNC_GREATER}
    * * {@link pc.FUNC_GREATEREQUAL}
    * * {@link pc.FUNC_EQUAL}
    * * {@link pc.FUNC_NOTEQUAL}
    */
  var compareFunc: Double = js.native
  /**
    * @name pc.Texture#compareOnRead
    * @type {boolean}
    * @description When enabled, and if texture format is pc.PIXELFORMAT_DEPTH or pc.PIXELFORMAT_DEPTHSTENCIL,
    * hardware PCF is enabled for this texture, and you can get filtered results of comparison using texture() in your shader (WebGL2 only).
    */
  var compareOnRead: Boolean = js.native
  /**
    * @readonly
    * @name pc.Texture#cubemap
    * @type {boolean}
    * @description Returns true if this texture is a cube map and false otherwise.
    */
  val cubemap: Boolean = js.native
  /**
    * @readonly
    * @name pc.Texture#depth
    * @type {number}
    * @description The number of depth slices in a 3D texture (WebGL2 only).
    */
  val depth: Double = js.native
  /**
    * @name pc.Texture#flipY
    * @type {boolean}
    * @description Specifies whether the texture should be flipped in the Y-direction. Only affects textures
    * with a source that is an image, canvas or video element. Does not affect cubemaps, compressed textures
    * or textures set from raw pixel data. Defaults to true.
    */
  var flipY: Boolean = js.native
  /**
    * @readonly
    * @name pc.Texture#format
    * @type {number}
    * @description The pixel format of the texture. Can be:
    * * {@link pc.PIXELFORMAT_A8}
    * * {@link pc.PIXELFORMAT_L8}
    * * {@link pc.PIXELFORMAT_L8_A8}
    * * {@link pc.PIXELFORMAT_R5_G6_B5}
    * * {@link pc.PIXELFORMAT_R5_G5_B5_A1}
    * * {@link pc.PIXELFORMAT_R4_G4_B4_A4}
    * * {@link pc.PIXELFORMAT_R8_G8_B8}
    * * {@link pc.PIXELFORMAT_R8_G8_B8_A8}
    * * {@link pc.PIXELFORMAT_DXT1}
    * * {@link pc.PIXELFORMAT_DXT3}
    * * {@link pc.PIXELFORMAT_DXT5}
    * * {@link pc.PIXELFORMAT_RGB16F}
    * * {@link pc.PIXELFORMAT_RGBA16F}
    * * {@link pc.PIXELFORMAT_RGB32F}
    * * {@link pc.PIXELFORMAT_RGBA32F}
    * * {@link pc.PIXELFORMAT_ETC1}
    * * {@link pc.PIXELFORMAT_PVRTC_2BPP_RGB_1}
    * * {@link pc.PIXELFORMAT_PVRTC_2BPP_RGBA_1}
    * * {@link pc.PIXELFORMAT_PVRTC_4BPP_RGB_1}
    * * {@link pc.PIXELFORMAT_PVRTC_4BPP_RGBA_1}
    * * {@link pc.PIXELFORMAT_111110F}
    * * {@link pc.PIXELFORMAT_ASTC_4x4}>/li>
    * * {@link pc.PIXELFORMAT_ATC_RGB}
    * * {@link pc.PIXELFORMAT_ATC_RGBA}
    */
  val format: Double = js.native
  /**
    * @readonly
    * @name pc.Texture#height
    * @type {number}
    * @description The height of the texture in pixels.
    */
  val height: Double = js.native
  /**
    * @name pc.Texture#magFilter
    * @type {number}
    * @description The magnification filter to be applied to the texture. Can be:
    * * {@link pc.FILTER_NEAREST}
    * * {@link pc.FILTER_LINEAR}
    */
  var magFilter: Double = js.native
  /**
    * @name pc.Texture#minFilter
    * @type {number}
    * @description The minification filter to be applied to the texture. Can be:
    * * {@link pc.FILTER_NEAREST}
    * * {@link pc.FILTER_LINEAR}
    * * {@link pc.FILTER_NEAREST_MIPMAP_NEAREST}
    * * {@link pc.FILTER_NEAREST_MIPMAP_LINEAR}
    * * {@link pc.FILTER_LINEAR_MIPMAP_NEAREST}
    * * {@link pc.FILTER_LINEAR_MIPMAP_LINEAR}
    */
  var minFilter: Double = js.native
  /**
    * @name pc.Texture#mipmaps
    * @type {boolean}
    * @description Defines if texture should generate/upload mipmaps if possible.
    */
  var mipmaps: Boolean = js.native
  /**
    * The name of the texture. Defaults to null.
    */
  var name: String = js.native
  /**
    * @readonly
    * @name pc.Texture#pot
    * @type {boolean}
    * @description Returns true if all dimensions of the texture are power of two, and false otherwise.
    */
  val pot: Boolean = js.native
  /**
    * @readonly
    * @name pc.Texture#volume
    * @type {boolean}
    * @description Returns true if this texture is a 3D volume and false otherwise.
    */
  val volume: Boolean = js.native
  /**
    * @readonly
    * @name pc.Texture#width
    * @type {number}
    * @description The width of the texture in pixels.
    */
  val width: Double = js.native
  /**
    * @function
    * @name pc.Texture#destroy
    * @description Forcibly free up the underlying WebGL resource owned by the texture.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.Texture#getSource
    * @description Get the pixel data of the texture. If this is a cubemap then an array of 6 images will be returned otherwise
    * a single image.
    * @param {number} [mipLevel] - A non-negative integer specifying the image level of detail. Defaults to 0, which represents the base image source.
    * A level value of N, that is greater than 0, represents the image source for the Nth mipmap reduction level.
    * @returns {HTMLImageElement} The source image of this texture. Can be null if source not assigned for specific image level.
    */
  def getSource(): HTMLImageElement = js.native
  def getSource(mipLevel: Double): HTMLImageElement = js.native
  /**
    * @function
    * @name pc.Texture#lock
    * @description Locks a miplevel of the texture, returning a typed array to be filled with pixel data.
    * @param {object} [options] - Optional options object. Valid properties are as follows:
    * @param {number} [options.level] - The mip level to lock with 0 being the top level. Defaults to 0.
    * @param {number} [options.face] - If the texture is a cubemap, this is the index of the face to lock.
    * @returns {Uint8Array|Uint16Array|Float32Array} A typed array containing the pixel data of the locked mip level.
    */
  def lock(): Uint8Array | Uint16Array | Float32Array = js.native
  def lock(options: AnonFace): Uint8Array | Uint16Array | Float32Array = js.native
  def setSource(source: js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement]): Unit = js.native
  def setSource(source: js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement], mipLevel: Double): Unit = js.native
  /**
    * @function
    * @name pc.Texture#setSource
    * @description Set the pixel data of the texture from a canvas, image, video DOM element. If the
    * texture is a cubemap, the supplied source must be an array of 6 canvases, images or videos.
    * @param {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement|HTMLCanvasElement[]|HTMLImageElement[]|HTMLVideoElement[]} source - A canvas, image or video element,
    * or an array of 6 canvas, image or video elements.
    * @param {number} [mipLevel] - A non-negative integer specifying the image level of detail. Defaults to 0, which represents the base image source.
    * A level value of N, that is greater than 0, represents the image source for the Nth mipmap reduction level.
    */
  def setSource(source: HTMLCanvasElement): Unit = js.native
  def setSource(source: HTMLCanvasElement, mipLevel: Double): Unit = js.native
  def setSource(source: HTMLImageElement): Unit = js.native
  def setSource(source: HTMLImageElement, mipLevel: Double): Unit = js.native
  def setSource(source: HTMLVideoElement): Unit = js.native
  def setSource(source: HTMLVideoElement, mipLevel: Double): Unit = js.native
  /**
    * @function
    * @name pc.Texture#unlock
    * @description Unlocks the currently locked mip level and uploads it to VRAM.
    */
  def unlock(): Unit = js.native
  /**
    * @function
    * @name pc.Texture#upload
    * @description Forces a reupload of the textures pixel data to graphics memory. Ordinarily, this function
    * is called by internally by {@link pc.Texture#setSource} and {@link pc.Texture#unlock}. However, it still needs to
    * be called explicitly in the case where an HTMLVideoElement is set as the source of the texture.  Normally,
    * this is done once every frame before video textured geometry is rendered.
    */
  def upload(): Unit = js.native
}

