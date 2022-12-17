package typings.playcanvas.global.pc

import typings.playcanvas.anon.AddressU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A texture is a container for texel data that can be utilized in a fragment shader. Typically,
  * the texel data represents an image that is mapped over geometry.
  */
@JSGlobal("pc.Texture")
@js.native
open class Texture protected ()
  extends typings.playcanvas.mod.Texture {
  /**
    * Create a new Texture instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this texture.
    * @param {object} [options] - Object for passing optional arguments.
    * @param {string} [options.name] - The name of the texture.
    * @param {number} [options.width] - The width of the texture in pixels. Defaults to 4.
    * @param {number} [options.height] - The height of the texture in pixels. Defaults to 4.
    * @param {number} [options.depth] - The number of depth slices in a 3D texture (WebGL2 only).
    * Defaults to 1 (single 2D image).
    * @param {number} [options.format] - The pixel format of the texture. Can be:
    *
    * - {@link PIXELFORMAT_A8}
    * - {@link PIXELFORMAT_L8}
    * - {@link PIXELFORMAT_L8_A8}
    * - {@link PIXELFORMAT_R5_G6_B5}
    * - {@link PIXELFORMAT_R5_G5_B5_A1}
    * - {@link PIXELFORMAT_R4_G4_B4_A4}
    * - {@link PIXELFORMAT_R8_G8_B8}
    * - {@link PIXELFORMAT_R8_G8_B8_A8}
    * - {@link PIXELFORMAT_DXT1}
    * - {@link PIXELFORMAT_DXT3}
    * - {@link PIXELFORMAT_DXT5}
    * - {@link PIXELFORMAT_RGB16F}
    * - {@link PIXELFORMAT_RGBA16F}
    * - {@link PIXELFORMAT_RGB32F}
    * - {@link PIXELFORMAT_RGBA32F}
    * - {@link PIXELFORMAT_ETC1}
    * - {@link PIXELFORMAT_PVRTC_2BPP_RGB_1}
    * - {@link PIXELFORMAT_PVRTC_2BPP_RGBA_1}
    * - {@link PIXELFORMAT_PVRTC_4BPP_RGB_1}
    * - {@link PIXELFORMAT_PVRTC_4BPP_RGBA_1}
    * - {@link PIXELFORMAT_111110F}
    * - {@link PIXELFORMAT_ASTC_4x4}>/li>
    * - {@link PIXELFORMAT_ATC_RGB}
    * - {@link PIXELFORMAT_ATC_RGBA}
    *
    * Defaults to {@link PIXELFORMAT_R8_G8_B8_A8}.
    * @param {string} [options.projection] - The projection type of the texture, used when the
    * texture represents an environment. Can be:
    *
    * - {@link TEXTUREPROJECTION_NONE}
    * - {@link TEXTUREPROJECTION_CUBE}
    * - {@link TEXTUREPROJECTION_EQUIRECT}
    * - {@link TEXTUREPROJECTION_OCTAHEDRAL}
    *
    * Defaults to {@link TEXTUREPROJECTION_CUBE} if options.cubemap is specified, otherwise
    * {@link TEXTUREPROJECTION_NONE}.
    * @param {number} [options.minFilter] - The minification filter type to use. Defaults to
    * {@link FILTER_LINEAR_MIPMAP_LINEAR}.
    * @param {number} [options.magFilter] - The magnification filter type to use. Defaults to
    * {@link FILTER_LINEAR}.
    * @param {number} [options.anisotropy] - The level of anisotropic filtering to use. Defaults
    * to 1.
    * @param {number} [options.addressU] - The repeat mode to use in the U direction. Defaults to
    * {@link ADDRESS_REPEAT}.
    * @param {number} [options.addressV] - The repeat mode to use in the V direction. Defaults to
    * {@link ADDRESS_REPEAT}.
    * @param {number} [options.addressW] - The repeat mode to use in the W direction. Defaults to
    * {@link ADDRESS_REPEAT}.
    * @param {boolean} [options.mipmaps] - When enabled try to generate or use mipmaps for this
    * texture. Default is true.
    * @param {boolean} [options.cubemap] - Specifies whether the texture is to be a cubemap.
    * Defaults to false.
    * @param {boolean} [options.volume] - Specifies whether the texture is to be a 3D volume
    * (WebGL2 only). Defaults to false.
    * @param {string} [options.type] - Specifies the image type, see {@link TEXTURETYPE_DEFAULT}.
    * @param {boolean} [options.fixCubemapSeams] - Specifies whether this cubemap texture requires
    * special seam fixing shader code to look right. Defaults to false.
    * @param {boolean} [options.flipY] - Specifies whether the texture should be flipped in the
    * Y-direction. Only affects textures with a source that is an image, canvas or video element.
    * Does not affect cubemaps, compressed textures or textures set from raw pixel data. Defaults
    * to false.
    * @param {boolean} [options.premultiplyAlpha] - If true, the alpha channel of the texture (if
    * present) is multiplied into the color channels. Defaults to false.
    * @param {boolean} [options.compareOnRead] - When enabled, and if texture format is
    * {@link PIXELFORMAT_DEPTH} or {@link PIXELFORMAT_DEPTHSTENCIL}, hardware PCF is enabled for
    * this texture, and you can get filtered results of comparison using texture() in your shader
    * (WebGL2 only). Defaults to false.
    * @param {number} [options.compareFunc] - Comparison function when compareOnRead is enabled
    * (WebGL2 only). Can be:
    *
    * - {@link FUNC_LESS}
    * - {@link FUNC_LESSEQUAL}
    * - {@link FUNC_GREATER}
    * - {@link FUNC_GREATEREQUAL}
    * - {@link FUNC_EQUAL}
    * - {@link FUNC_NOTEQUAL}
    *
    * Defaults to {@link FUNC_LESS}.
    * @param {Uint8Array[]} [options.levels] - Array of Uint8Array.
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
    */
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice) = this()
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice, options: AddressU) = this()
}
object Texture {
  
  @JSGlobal("pc.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculate the GPU memory required for a texture.
    *
    * @param {number} width - Texture's width.
    * @param {number} height - Texture's height.
    * @param {number} depth - Texture's depth.
    * @param {number} format - Texture's pixel format PIXELFORMAT_***.
    * @param {boolean} mipmaps - True if the texture includes mipmaps, false otherwise.
    * @param {boolean} cubemap - True is the texture is a cubemap, false otherwise.
    * @returns {number} The number of bytes of GPU memory required for the texture.
    * @ignore
    */
  /* static member */
  inline def calcGpuSize(width: Double, height: Double, depth: Double, format: Double, mipmaps: Boolean, cubemap: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcGpuSize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], format.asInstanceOf[js.Any], mipmaps.asInstanceOf[js.Any], cubemap.asInstanceOf[js.Any])).asInstanceOf[Double]
}
