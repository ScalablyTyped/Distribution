package typings.playcanvas.mod

import typings.playcanvas.anon.Face
import typings.playcanvas.playcanvasStrings.linear
import typings.playcanvas.playcanvasStrings.rgbe
import typings.playcanvas.playcanvasStrings.rgbm
import typings.playcanvas.playcanvasStrings.rgbp
import typings.playcanvas.playcanvasStrings.srgb
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A texture is a container for texel data that can be utilized in a fragment shader. Typically,
  * the texel data represents an image that is mapped over geometry.
  */
@js.native
trait Texture extends StObject {
  
  var _addressU: Double = js.native
  
  var _addressV: Double = js.native
  
  var _addressW: Double = js.native
  
  var _anisotropy: Double = js.native
  
  var _compareFunc: Any = js.native
  
  var _compareOnRead: Boolean = js.native
  
  var _compressed: Boolean = js.native
  
  var _cubemap: Boolean = js.native
  
  var _depth: Double = js.native
  
  var _flipY: Boolean = js.native
  
  var _format: Double = js.native
  
  var _gpuSize: Double = js.native
  
  var _height: Double = js.native
  
  var _invalid: Boolean = js.native
  
  var _isRenderTarget: Boolean = js.native
  
  var _levels: js.Array[js.Array[Any] | js.typedarray.Uint8Array] = js.native
  
  var _levelsUpdated: js.Array[js.Array[Boolean] | Boolean] = js.native
  
  var _lockedLevel: Double = js.native
  
  var _magFilter: Double = js.native
  
  var _minFilter: Double = js.native
  
  var _mipmaps: Any = js.native
  
  var _mipmapsUploaded: Boolean = js.native
  
  var _needsMipmapsUpload: Any = js.native
  
  var _needsUpload: Boolean = js.native
  
  var _parameterFlags: Double = js.native
  
  var _premultiplyAlpha: Boolean = js.native
  
  var _volume: Boolean = js.native
  
  var _width: Double = js.native
  
  def addressU: Double = js.native
  /**
    * The addressing mode to be applied to the texture horizontally. Can be:
    *
    * - {@link ADDRESS_REPEAT}
    * - {@link ADDRESS_CLAMP_TO_EDGE}
    * - {@link ADDRESS_MIRRORED_REPEAT}
    *
    * @type {number}
    */
  def addressU_=(arg: Double): Unit = js.native
  
  def addressV: Double = js.native
  /**
    * The addressing mode to be applied to the texture vertically. Can be:
    *
    * - {@link ADDRESS_REPEAT}
    * - {@link ADDRESS_CLAMP_TO_EDGE}
    * - {@link ADDRESS_MIRRORED_REPEAT}
    *
    * @type {number}
    */
  def addressV_=(arg: Double): Unit = js.native
  
  def addressW: Double = js.native
  /**
    * The addressing mode to be applied to the 3D texture depth (WebGL2 only). Can be:
    *
    * - {@link ADDRESS_REPEAT}
    * - {@link ADDRESS_CLAMP_TO_EDGE}
    * - {@link ADDRESS_MIRRORED_REPEAT}
    *
    * @type {number}
    */
  def addressW_=(arg: Double): Unit = js.native
  
  /**
    * Updates vram size tracking for the texture, size can be positive to add or negative to subtract
    *
    * @ignore
    */
  def adjustVramSizeTracking(vram: Any, size: Any): Unit = js.native
  
  def anisotropy: Double = js.native
  /**
    * Integer value specifying the level of anisotropic to apply to the texture ranging from 1 (no
    * anisotropic filtering) to the {@link GraphicsDevice} property maxAnisotropy.
    *
    * @type {number}
    */
  def anisotropy_=(arg: Double): Unit = js.native
  
  def autoMipmap: Any = js.native
  /**
    * Toggles automatic mipmap generation. Can't be used on non power of two textures.
    *
    * @type {boolean}
    * @ignore
    * @deprecated
    */
  def autoMipmap_=(arg: Any): Unit = js.native
  
  def compareFunc: Any = js.native
  /**
    * Comparison function when compareOnRead is enabled (WebGL2 only). Possible values:
    *
    * - {@link FUNC_LESS}
    * - {@link FUNC_LESSEQUAL}
    * - {@link FUNC_GREATER}
    * - {@link FUNC_GREATEREQUAL}
    * - {@link FUNC_EQUAL}
    * - {@link FUNC_NOTEQUAL}
    *
    * @type {number}
    */
  def compareFunc_=(arg: Any): Unit = js.native
  
  def compareOnRead: Boolean = js.native
  /**
    * When enabled, and if texture format is {@link PIXELFORMAT_DEPTH} or
    * {@link PIXELFORMAT_DEPTHSTENCIL}, hardware PCF is enabled for this texture, and you can get
    * filtered results of comparison using texture() in your shader (WebGL2 only).
    *
    * @type {boolean}
    */
  def compareOnRead_=(arg: Boolean): Unit = js.native
  
  /**
    * Returns true if this texture is a cube map and false otherwise.
    *
    * @type {boolean}
    */
  def cubemap: Boolean = js.native
  
  /**
    * The number of depth slices in a 3D texture (WebGL2 only).
    *
    * @type {number}
    */
  def depth: Double = js.native
  
  /**
    * Frees resources associated with this texture.
    */
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  def dirtyAll(): Unit = js.native
  
  def encoding: srgb | linear | rgbm | rgbe | rgbp = js.native
  
  var fixCubemapSeams: Boolean = js.native
  
  def flipY: Boolean = js.native
  /**
    * Specifies whether the texture should be flipped in the Y-direction. Only affects textures
    * with a source that is an image, canvas or video element. Does not affect cubemaps,
    * compressed textures or textures set from raw pixel data. Defaults to true.
    *
    * @type {boolean}
    */
  def flipY_=(arg: Boolean): Unit = js.native
  
  /**
    * The pixel format of the texture. Can be:
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
    * @type {number}
    */
  def format: Double = js.native
  
  /**
    * Generate an in-memory DDS representation of this texture. Only works on RGBA8 textures.
    * Currently, only used by the Editor to write prefiltered cubemaps to DDS format.
    *
    * @returns {ArrayBuffer} Buffer containing the DDS data.
    * @ignore
    */
  def getDds(): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Get the pixel data of the texture. If this is a cubemap then an array of 6 images will be
    * returned otherwise a single image.
    *
    * @param {number} [mipLevel] - A non-negative integer specifying the image level of detail.
    * Defaults to 0, which represents the base image source. A level value of N, that is greater
    * than 0, represents the image source for the Nth mipmap reduction level.
    * @returns {HTMLImageElement} The source image of this texture. Can be null if source not
    * assigned for specific image level.
    */
  def getSource(): HTMLImageElement = js.native
  def getSource(mipLevel: Double): HTMLImageElement = js.native
  
  def gpuSize: Double = js.native
  
  /**
    * The height of the texture in pixels.
    *
    * @type {number}
    */
  def height: Double = js.native
  
  var id: Double = js.native
  
  var impl: Any = js.native
  
  /**
    * Locks a miplevel of the texture, returning a typed array to be filled with pixel data.
    *
    * @param {object} [options] - Optional options object. Valid properties are as follows:
    * @param {number} [options.level] - The mip level to lock with 0 being the top level. Defaults
    * to 0.
    * @param {number} [options.face] - If the texture is a cubemap, this is the index of the face
    * to lock.
    * @param {number} [options.mode] - The lock mode. Can be:
    * - {@link TEXTURELOCK_READ}
    * - {@link TEXTURELOCK_WRITE}
    * Defaults to {@link TEXTURELOCK_WRITE}.
    * @returns {Uint8Array|Uint16Array|Float32Array} A typed array containing the pixel data of
    * the locked mip level.
    */
  def lock(): js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Float32Array = js.native
  def lock(options: Face): js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Float32Array = js.native
  
  /**
    * Called when the rendering context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit = js.native
  
  def magFilter: Double = js.native
  /**
    * The magnification filter to be applied to the texture. Can be:
    *
    * - {@link FILTER_NEAREST}
    * - {@link FILTER_LINEAR}
    *
    * @type {number}
    */
  def magFilter_=(arg: Double): Unit = js.native
  
  def minFilter: Double = js.native
  /**
    * The minification filter to be applied to the texture. Can be:
    *
    * - {@link FILTER_NEAREST}
    * - {@link FILTER_LINEAR}
    * - {@link FILTER_NEAREST_MIPMAP_NEAREST}
    * - {@link FILTER_NEAREST_MIPMAP_LINEAR}
    * - {@link FILTER_LINEAR_MIPMAP_NEAREST}
    * - {@link FILTER_LINEAR_MIPMAP_LINEAR}
    *
    * @type {number}
    */
  def minFilter_=(arg: Double): Unit = js.native
  
  def mipmaps: Any = js.native
  /**
    * Defines if texture should generate/upload mipmaps if possible.
    *
    * @type {boolean}
    */
  def mipmaps_=(arg: Any): Unit = js.native
  
  /**
    * The name of the texture. Defaults to null.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * Returns true if all dimensions of the texture are power of two, and false otherwise.
    *
    * @type {boolean}
    */
  def pot: Boolean = js.native
  
  def premultiplyAlpha: Boolean = js.native
  def premultiplyAlpha_=(arg: Boolean): Unit = js.native
  
  var profilerHint: Any = js.native
  
  var projection: String = js.native
  
  def setSource(source: js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement]): Unit = js.native
  def setSource(source: js.Array[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement], mipLevel: Double): Unit = js.native
  /**
    * Set the pixel data of the texture from a canvas, image, video DOM element. If the texture is
    * a cubemap, the supplied source must be an array of 6 canvases, images or videos.
    *
    * @param {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement|HTMLCanvasElement[]|HTMLImageElement[]|HTMLVideoElement[]} source - A
    * canvas, image or video element, or an array of 6 canvas, image or video elements.
    * @param {number} [mipLevel] - A non-negative integer specifying the image level of detail.
    * Defaults to 0, which represents the base image source. A level value of N, that is greater
    * than 0, represents the image source for the Nth mipmap reduction level.
    */
  def setSource(source: HTMLCanvasElement): Unit = js.native
  def setSource(source: HTMLCanvasElement, mipLevel: Double): Unit = js.native
  def setSource(source: HTMLImageElement): Unit = js.native
  def setSource(source: HTMLImageElement, mipLevel: Double): Unit = js.native
  def setSource(source: HTMLVideoElement): Unit = js.native
  def setSource(source: HTMLVideoElement, mipLevel: Double): Unit = js.native
  
  var `type`: String = js.native
  
  /**
    * Unlocks the currently locked mip level and uploads it to VRAM.
    */
  def unlock(): Unit = js.native
  
  /**
    * Forces a reupload of the textures pixel data to graphics memory. Ordinarily, this function
    * is called by internally by {@link Texture#setSource} and {@link Texture#unlock}. However, it
    * still needs to be called explicitly in the case where an HTMLVideoElement is set as the
    * source of the texture.  Normally, this is done once every frame before video textured
    * geometry is rendered.
    */
  def upload(): Unit = js.native
  
  /**
    * Returns true if this texture is a 3D volume and false otherwise.
    *
    * @type {boolean}
    */
  def volume: Boolean = js.native
  
  /**
    * The width of the texture in pixels.
    *
    * @type {number}
    */
  def width: Double = js.native
}
