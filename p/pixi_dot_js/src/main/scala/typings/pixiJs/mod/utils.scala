package typings.pixiJs.mod

import typings.pixiJs.PIXI.utils.DecomposedDataUri
import typings.pixiJs.anon.Device
import typings.pixiJs.anon.Phone
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.Uint16Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generalized convenience utilities for PIXI.
  * @example
  * // Extend PIXI's internal Event Emitter.
  * class MyEmitter extends PIXI.utils.EventEmitter {
  *   constructor() {
  *      super();
  *      console.log("Emitter created!");
  *   }
  * }
  *
  * // Get info on current device
  * console.log(PIXI.utils.isMobile);
  *
  * // Convert hex color to string
  * console.log(PIXI.utils.hex2string(0xff00ff)); // returns: "#ff00ff"
  * @namespace PIXI.utils
  */
object utils {
  
  @JSImport("pixi.js", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @todo Describe property usage
    *
    * @static
    * @name BaseTextureCache
    * @memberof PIXI.utils
    * @type {Object}
    */
  @JSImport("pixi.js", "utils.BaseTextureCache")
  @js.native
  def BaseTextureCache: js.Any = js.native
  @scala.inline
  def BaseTextureCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseTextureCache")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a Canvas element of the given size to be used as a target for rendering to.
    *
    * @class
    * @memberof PIXI.utils
    */
  @JSImport("pixi.js", "utils.CanvasRenderTarget")
  @js.native
  class CanvasRenderTarget protected ()
    extends StObject
       with typings.pixiJs.PIXI.utils.CanvasRenderTarget {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, resolution: Double) = this()
    
    /**
      * The Canvas object that belongs to this CanvasRenderTarget.
      *
      * @member {HTMLCanvasElement} PIXI.utils.CanvasRenderTarget#canvas
      */
    /* CompleteClass */
    var canvas: HTMLCanvasElement = js.native
    
    /**
      * A CanvasRenderingContext2D object representing a two-dimensional rendering context.
      *
      * @member {CanvasRenderingContext2D} PIXI.utils.CanvasRenderTarget#context
      */
    /* CompleteClass */
    var context: CanvasRenderingContext2D = js.native
    
    /**
      * Destroys this canvas.
      *
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The height of the canvas buffer in pixels.
      *
      * @member {number}
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Resizes the canvas to the specified width and height.
      *
      * @param {number} width - the new width of the canvas
      * @param {number} height - the new height of the canvas
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * The width of the canvas buffer in pixels.
      *
      * @member {number}
      */
    /* CompleteClass */
    var width: Double = js.native
  }
  
  /**
    * A high performance event emitter
    *
    * @see {@link https://github.com/primus/eventemitter3}
    *
    * @memberof PIXI.utils
    * @class EventEmitter
    * @type {EventEmitter}
    */
  @JSImport("pixi.js", "utils.EventEmitter")
  @js.native
  class EventEmitter ()
    extends StObject
       with typings.pixiJs.PIXI.utils.EventEmitter
  
  /**
    * @todo Describe property usage
    *
    * @static
    * @name ProgramCache
    * @memberof PIXI.utils
    * @type {Object}
    */
  @JSImport("pixi.js", "utils.ProgramCache")
  @js.native
  def ProgramCache: js.Any = js.native
  @scala.inline
  def ProgramCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgramCache")(x.asInstanceOf[js.Any])
  
  /**
    * @todo Describe property usage
    *
    * @static
    * @name TextureCache
    * @memberof PIXI.utils
    * @type {Object}
    */
  @JSImport("pixi.js", "utils.TextureCache")
  @js.native
  def TextureCache: js.Any = js.native
  @scala.inline
  def TextureCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextureCache")(x.asInstanceOf[js.Any])
  
  /**
    * Removes all textures from cache, but does not destroy them
    *
    * @memberof PIXI.utils
    * @function clearTextureCache
    */
  @scala.inline
  def clearTextureCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTextureCache")().asInstanceOf[Unit]
  
  /**
    * changes blendMode according to texture format
    *
    * @memberof PIXI.utils
    * @function correctBlendMode
    * @param {number} blendMode - supposed blend mode
    * @param {boolean} premultiplied - whether source is premultiplied
    * @returns {number} true blend mode for this texture
    */
  @scala.inline
  def correctBlendMode(blendMode: Double, premultiplied: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctBlendMode")(blendMode.asInstanceOf[js.Any], premultiplied.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Generic Mask Stack data structure
    *
    * @memberof PIXI.utils
    * @function createIndicesForQuads
    * @param {number} size - Number of quads
    * @param {Uint16Array|Uint32Array} [outBuffer] - Buffer for output, length has to be `6 * size`
    * @return {Uint16Array|Uint32Array} - Resulting index buffer
    */
  @scala.inline
  def createIndicesForQuads(size: Double): Uint16Array | Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any]).asInstanceOf[Uint16Array | Uint32Array]
  @scala.inline
  def createIndicesForQuads(size: Double, outBuffer: Uint16Array): Uint16Array | Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any], outBuffer.asInstanceOf[js.Any])).asInstanceOf[Uint16Array | Uint32Array]
  @scala.inline
  def createIndicesForQuads(size: Double, outBuffer: Uint32Array): Uint16Array | Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any], outBuffer.asInstanceOf[js.Any])).asInstanceOf[Uint16Array | Uint32Array]
  
  /**
    * Split a data URI into components. Returns undefined if
    * parameter `dataUri` is not a valid data URI.
    *
    * @memberof PIXI.utils
    * @function decomposeDataUri
    * @param {string} dataUri - the data URI to check
    * @return {PIXI.utils.DecomposedDataUri|undefined} The decomposed data uri or undefined
    */
  @scala.inline
  def decomposeDataUri(dataUri: String): js.UndefOr[DecomposedDataUri] = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeDataUri")(dataUri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DecomposedDataUri]]
  
  /**
    * Helper for warning developers about deprecated features & settings.
    * A stack track for warnings is given; useful for tracking-down where
    * deprecated methods/properties/classes are being used within the code.
    *
    * @memberof PIXI.utils
    * @function deprecation
    * @param {string} version - The version where the feature became deprecated
    * @param {string} message - Message should include what is deprecated, where, and the new solution
    * @param {number} [ignoreDepth=3] - The number of steps to ignore at the top of the error stack
    *        this is mostly to ignore internal deprecation calls.
    */
  @scala.inline
  def deprecation(version: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecation")(version.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deprecation(version: String, message: String, ignoreDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecation")(version.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ignoreDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Destroys all texture in the cache
    *
    * @memberof PIXI.utils
    * @function destroyTextureCache
    */
  @scala.inline
  def destroyTextureCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyTextureCache")().asInstanceOf[Unit]
  
  /**
    * A polygon triangulation library
    *
    * @see {@link https://github.com/mapbox/earcut}
    *
    * @memberof PIXI.utils
    * @function earcut
    * @param {number[]} vertices - A flat array of vertex coordinates
    * @param {number[]} [holes] - An array of hole indices
    * @param {number} [dimensions=2] - The number of coordinates per vertex in the input array
    * @return {number[]} Triangulated polygon
    */
  @scala.inline
  def earcut(vertices: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("earcut")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def earcut(vertices: js.Array[Double], holes: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("earcut")(vertices.asInstanceOf[js.Any], holes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def earcut(vertices: js.Array[Double], holes: js.Array[Double], dimensions: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("earcut")(vertices.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def earcut(vertices: js.Array[Double], holes: Unit, dimensions: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("earcut")(vertices.asInstanceOf[js.Any], holes.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * get the resolution / device pixel ratio of an asset by looking for the prefix
    * used by spritesheets and image urls
    *
    * @memberof PIXI.utils
    * @function getResolutionOfUrl
    * @param {string} url - the image path
    * @param {number} [defaultValue=1] - the defaultValue if no filename prefix is set.
    * @return {number} resolution / device pixel ratio of an asset
    */
  @scala.inline
  def getResolutionOfUrl(url: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionOfUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getResolutionOfUrl(url: String, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionOfUrl")(url.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Converts a hexadecimal color number to an [R, G, B] array of normalized floats (numbers from 0.0 to 1.0).
    *
    * @example
    * PIXI.utils.hex2rgb(0xffffff); // returns [1, 1, 1]
    * @memberof PIXI.utils
    * @function hex2rgb
    * @param {number} hex - The hexadecimal number to convert
    * @param  {number[]} [out=[]] - If supplied, this array will be used rather than returning a new one
    * @return {number[]} An array representing the [R, G, B] of the color where all values are floats.
    */
  @scala.inline
  def hex2rgb(hex: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def hex2rgb(hex: Double, out: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Converts a hexadecimal color number to a string.
    *
    * @example
    * PIXI.utils.hex2string(0xffffff); // returns "#ffffff"
    * @memberof PIXI.utils
    * @function hex2string
    * @param {number} hex - Number in hex (e.g., `0xffffff`)
    * @return {string} The string color (e.g., `"#ffffff"`).
    */
  @scala.inline
  def hex2string(hex: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2string")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * A simple JS library that detects mobile devices.
    *
    * @see {@link https://github.com/kaimallea/isMobile}
    *
    * @memberof PIXI.utils
    * @name isMobile
    * @type {Object}
    * @property {boolean} any - `true` if current platform is tablet or phone device
    * @property {boolean} tablet - `true` if current platform large-screen tablet device
    * @property {boolean} phone - `true` if current platform small-screen phone device
    * @property {object} apple
    * @property {boolean} apple.device - `true` if any Apple device
    * @property {boolean} apple.tablet - `true` if any Apple iPad
    * @property {boolean} apple.phone - `true` if any Apple iPhone
    * @property {boolean} apple.ipod - `true` if any iPod
    * @property {object} android
    * @property {boolean} android.device - `true` if any Android device
    * @property {boolean} android.tablet - `true` if any Android tablet
    * @property {boolean} android.phone - `true` if any Android phone
    * @property {object} amazon
    * @property {boolean} amazon.device - `true` if any Silk device
    * @property {boolean} amazon.tablet - `true` if any Silk tablet
    * @property {boolean} amazon.phone - `true` if any Silk phone
    * @property {object} windows
    * @property {boolean} windows.device - `true` if any Windows device
    * @property {boolean} windows.tablet - `true` if any Windows tablet
    * @property {boolean} windows.phone - `true` if any Windows phone
    */
  object isMobile {
    
    @JSImport("pixi.js", "utils.isMobile")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pixi.js", "utils.isMobile.amazon")
    @js.native
    def amazon: Phone = js.native
    @scala.inline
    def amazon_=(x: Phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amazon")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "utils.isMobile.android")
    @js.native
    def android: Phone = js.native
    @scala.inline
    def android_=(x: Phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "utils.isMobile.any")
    @js.native
    def any: Boolean = js.native
    @scala.inline
    def any_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "utils.isMobile.apple")
    @js.native
    def apple: Device = js.native
    @scala.inline
    def apple_=(x: Device): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apple")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "utils.isMobile.phone")
    @js.native
    def phone: Boolean = js.native
    @scala.inline
    def phone_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phone")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "utils.isMobile.tablet")
    @js.native
    def tablet: Boolean = js.native
    @scala.inline
    def tablet_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tablet")(x.asInstanceOf[js.Any])
    
    @JSImport("pixi.js", "utils.isMobile.windows")
    @js.native
    def windows: Phone = js.native
    @scala.inline
    def windows_=(x: Phone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windows")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Checks if a number is a power of two.
    *
    * @function isPow2
    * @memberof PIXI.utils
    * @param {number} v - input value
    * @return {boolean} `true` if value is power of two
    */
  @scala.inline
  def isPow2(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPow2")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Helper for checking for WebGL support.
    *
    * @memberof PIXI.utils
    * @function isWebGLSupported
    * @return {boolean} Is WebGL supported.
    */
  @scala.inline
  def isWebGLSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLSupported")().asInstanceOf[Boolean]
  
  /**
    * Computes ceil of log base 2
    *
    * @function log2
    * @memberof PIXI.utils
    * @param {number} v - input value
    * @return {number} logarithm base 2
    */
  @scala.inline
  def log2(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Rounds to next power of two.
    *
    * @function nextPow2
    * @memberof PIXI.utils
    * @param {number} v - input value
    * @return {number}
    */
  @scala.inline
  def nextPow2(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPow2")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * maps premultiply flag and blendMode to adjusted blendMode
    * @memberof PIXI.utils
    * @const premultiplyBlendMode
    * @type {Array<number[]>}
    */
  @JSImport("pixi.js", "utils.premultiplyBlendMode")
  @js.native
  def premultiplyBlendMode: js.Array[js.Array[Double]] = js.native
  @scala.inline
  def premultiplyBlendMode_=(x: js.Array[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("premultiplyBlendMode")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Unit, premultiply: Boolean): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Float32Array): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  /**
    * combines rgb and alpha to out array
    *
    * @memberof PIXI.utils
    * @function premultiplyRgba
    * @param {Float32Array|number[]} rgb - input rgb
    * @param {number} alpha - alpha param
    * @param {Float32Array} [out] - output
    * @param {boolean} [premultiply=true] - do premultiply it
    * @returns {Float32Array} vec4 rgba
    */
  @scala.inline
  def premultiplyRgba(rgb: Float32Array, alpha: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Unit, premultiply: Boolean): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Float32Array): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyRgba")(rgb.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  /**
    * premultiplies tint
    *
    * @memberof PIXI.utils
    * @function premultiplyTint
    * @param {number} tint - integer RGB
    * @param {number} alpha - floating point alpha (0.0-1.0)
    * @returns {number} tint multiplied by alpha
    */
  @scala.inline
  def premultiplyTint(tint: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTint")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * converts integer tint and float alpha to vec4 form, premultiplies by default
    *
    * @memberof PIXI.utils
    * @function premultiplyTintToRgba
    * @param {number} tint - input tint
    * @param {number} alpha - alpha param
    * @param {Float32Array} [out] output
    * @param {boolean} [premultiply=true] - do premultiply it
    * @returns {Float32Array} vec4 rgba
    */
  @scala.inline
  def premultiplyTintToRgba(tint: Double, alpha: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Unit, premultiply: Boolean): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Float32Array): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTintToRgba")(tint.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], out.asInstanceOf[js.Any], premultiply.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  /**
    * Remove items from a javascript array without generating garbage
    *
    * @function removeItems
    * @memberof PIXI.utils
    * @param {Array<any>} arr - Array to remove elements from
    * @param {number} startIdx - starting index
    * @param {number} removeCount - how many to remove
    */
  @scala.inline
  def removeItems(arr: js.Array[js.Any], startIdx: Double, removeCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItems")(arr.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Converts a color as an [R, G, B] array of normalized floats to a hexadecimal number.
    *
    * @example
    * PIXI.utils.rgb2hex([1, 1, 1]); // returns 0xffffff
    * @memberof PIXI.utils
    * @function rgb2hex
    * @param {number[]} rgb - Array of numbers where all values are normalized floats from 0.0 to 1.0.
    * @return {number} Number in hexadecimal.
    */
  @scala.inline
  def rgb2hex(rgb: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Logs out the version and renderer information for this running instance of PIXI.
    * If you don't want to see this message you can run `PIXI.utils.skipHello()` before
    * creating your renderer. Keep in mind that doing that will forever make you a jerk face.
    *
    * @static
    * @function sayHello
    * @memberof PIXI.utils
    * @param {string} type - The string renderer type to log.
    */
  @scala.inline
  def sayHello(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sayHello")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns sign of number
    *
    * @memberof PIXI.utils
    * @function sign
    * @param {number} n - the number to check the sign of
    * @returns {number} 0 if `n` is 0, -1 if `n` is negative, 1 if `n` is positive
    */
  @scala.inline
  def sign(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Skips the hello message of renderers that are created after this is run.
    *
    * @function skipHello
    * @memberof PIXI.utils
    */
  @scala.inline
  def skipHello(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipHello")().asInstanceOf[Unit]
  
  /**
    * Converts a hexadecimal string to a hexadecimal color number.
    *
    * @example
    * PIXI.utils.string2hex("#ffffff"); // returns 0xffffff
    * @memberof PIXI.utils
    * @function string2hex
    * @param {string} string - The string color (e.g., `"#ffffff"`)
    * @return {number} Number in hexadecimal.
    */
  @scala.inline
  def string2hex(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("string2hex")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Trim transparent borders from a canvas
    *
    * @memberof PIXI.utils
    * @function trimCanvas
    * @param {HTMLCanvasElement} canvas - the canvas to trim
    * @returns {object} Trim data
    */
  @scala.inline
  def trimCanvas(canvas: HTMLCanvasElement): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trimCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Gets the next unique identifier
    *
    * @memberof PIXI.utils
    * @function uid
    * @return {number} The next unique identifier to use.
    */
  @scala.inline
  def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  
  /**
    * Node.js compatible URL utilities.
    *
    * @see https://www.npmjs.com/package/url
    *
    * @memberof PIXI.utils
    * @name url
    * @type {object}
    */
  @JSImport("pixi.js", "utils.url")
  @js.native
  def url: js.Any = js.native
  @scala.inline
  def url_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
}
