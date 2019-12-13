package typings.playcanvas.playcanvasMod

import typings.playcanvas.Anon_AddressU
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Texture
  * @classdesc A texture is a container for texel data that can be utilized in a fragment shader.
  * Typically, the texel data represents an image that is mapped over geometry.
  * @description Creates a new texture.
  * @param {pc.GraphicsDevice} graphicsDevice The graphics device used to manage this texture.
  * @param {Object} [options] Object for passing optional arguments.
  * @param {Number} [options.width] The width of the texture in pixels. Defaults to 4.
  * @param {Number} [options.height] The height of the texture in pixels. Defaults to 4.
  * @param {Number} [options.depth] The number of depth slices in a 3D texture (WebGL2 only). Defaults to 1 (single 2D image).
  * @param {Number} [options.format] The pixel format of the texture. Can be:
  * <ul>
  *     <li>{@link pc.PIXELFORMAT_A8}</li>
  *     <li>{@link pc.PIXELFORMAT_L8}</li>
  *     <li>{@link pc.PIXELFORMAT_L8_A8}</li>
  *     <li>{@link pc.PIXELFORMAT_R5_G6_B5}</li>
  *     <li>{@link pc.PIXELFORMAT_R5_G5_B5_A1}</li>
  *     <li>{@link pc.PIXELFORMAT_R4_G4_B4_A4}</li>
  *     <li>{@link pc.PIXELFORMAT_R8_G8_B8}</li>
  *     <li>{@link pc.PIXELFORMAT_R8_G8_B8_A8}</li>
  *     <li>{@link pc.PIXELFORMAT_DXT1}</li>
  *     <li>{@link pc.PIXELFORMAT_DXT3}</li>
  *     <li>{@link pc.PIXELFORMAT_DXT5}</li>
  *     <li>{@link pc.PIXELFORMAT_RGB16F}</li>
  *     <li>{@link pc.PIXELFORMAT_RGBA16F}</li>
  *     <li>{@link pc.PIXELFORMAT_RGB32F}</li>
  *     <li>{@link pc.PIXELFORMAT_RGBA32F}</li>
  *     <li>{@link pc.PIXELFORMAT_ETC1}</li>
  *     <li>{@link pc.PIXELFORMAT_PVRTC_2BPP_RGB_1}</li>
  *     <li>{@link pc.PIXELFORMAT_PVRTC_2BPP_RGBA_1}</li>
  *     <li>{@link pc.PIXELFORMAT_PVRTC_4BPP_RGB_1}</li>
  *     <li>{@link pc.PIXELFORMAT_PVRTC_4BPP_RGBA_1}</li>
  *     <li>{@link pc.PIXELFORMAT_111110F}</li>
  *     <li>{@link pc.PIXELFORMAT_ASTC_4x4}>/li>
  *     <li>{@link pc.PIXELFORMAT_ATC_RGB}</li>
  *     <li>{@link pc.PIXELFORMAT_ATC_RGBA}</li>
  * </ul>
  * Defaults to pc.PIXELFORMAT_R8_G8_B8_A8.
  * @param {Number} [options.minFilter] The minification filter type to use. Defaults to {@link pc.FILTER_LINEAR_MIPMAP_LINEAR}
  * @param {Number} [options.magFilter] The magnification filter type to use. Defaults to {@link pc.FILTER_LINEAR}
  * @param {Number} [options.anisotropy] The level of anisotropic filtering to use. Defaults to 1
  * @param {Number} [options.addressU] The repeat mode to use in the U direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param {Number} [options.addressV] The repeat mode to use in the V direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param {Number} [options.addressW] The repeat mode to use in the W direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param {Boolean} [options.mipmaps] When enabled try to generate or use mipmaps for this texture. Default is true
  * @param {Boolean} [options.cubemap] Specifies whether the texture is to be a cubemap. Defaults to false.
  * @param {Boolean} [options.volume] Specifies whether the texture is to be a 3D volume (WebGL2 only). Defaults to false.
  * @param {Boolean} [options.rgbm] Specifies whether the texture contains RGBM-encoded HDR data. Defaults to false.
  * @param {Boolean} [options.fixCubemapSeams] Specifies whether this cubemap texture requires special
  * seam fixing shader code to look right. Defaults to false.
  * @param {Boolean} [options.flipY] Specifies whether the texture should be flipped in the Y-direction. Only affects textures
  * with a source that is an image, canvas or video element. Does not affect cubemaps, compressed textures or textures set from raw
  * pixel data. Defaults to true.
  * @param {Boolean} [options.premultiplyAlpha] If true, the alpha channel of the texture (if present) is multiplied into the color
  * channels. Defaults to false.
  * @param {Boolean} [options.compareOnRead] When enabled, and if texture format is pc.PIXELFORMAT_DEPTH or pc.PIXELFORMAT_DEPTHSTENCIL,
  * hardware PCF is enabled for this texture, and you can get filtered results of comparison using texture() in your shader (WebGL2 only).
  * Defaults to false.
  * @param {Number} [options.compareFunc] Comparison function when compareOnRead is enabled (WebGL2 only). Defaults to pc.FUNC_LESS.
  * Possible values:
  * <ul>
  *     <li>pc.FUNC_LESS</li>
  *     <li>pc.FUNC_LESSEQUAL</li>
  *     <li>pc.FUNC_GREATER</li>
  *     <li>pc.FUNC_GREATEREQUAL</li>
  *     <li>pc.FUNC_EQUAL</li>
  *     <li>pc.FUNC_NOTEQUAL</li>
  * </ul>
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
  * @property {String} name The name of the texture. Defaults to null.
  */
@JSImport("playcanvas", "Texture")
@js.native
class Texture protected ()
  extends typings.playcanvas.pc.Texture {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice) = this()
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice, options: Anon_AddressU) = this()
}

