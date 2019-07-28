package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.Anon_Prefixed
import typings.pixiDotJs.PIXINs.DecomposedDataUri
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "utils")
@js.native
object utilsNs extends js.Object {
  // https://github.com/primus/eventemitter3
  @js.native
  /**
    * Minimal EventEmitter interface that is molded against the Node.js
    * EventEmitter interface.
    *
    * @constructor
    * @api public
    */
  class EventEmitter ()
    extends typings.pixiDotJs.PIXINs.utilsNs.EventEmitter
  
  val BaseTextureCache: js.Any = js.native
  val TextureCache: js.Any = js.native
  val premultiplyBlendMode: js.Array[js.Array[Double]] = js.native
  def canUseNewCanvasBlendModes(): Boolean = js.native
  def clearTextureCache(): Unit = js.native
  def correctBlendMode(blendMode: Double, premultiplied: Boolean): Double = js.native
  def decomposeDataUri(dataUri: String): DecomposedDataUri | Unit = js.native
  def destroyTextureCache(): Unit = js.native
  def getResolutionOfUrl(url: String): Double = js.native
  def getResolutionOfUrl(url: String, defaultValue: Double): Double = js.native
  def getSvgSize(svgString: String): js.Any = js.native
  def getUrlFileExtension(url: String): String | Unit = js.native
  def hex2rgb(hex: Double): js.Array[Double] = js.native
  def hex2rgb(hex: Double, out: js.Array[Double]): js.Array[Double] = js.native
  def hex2string(hex: Double): String = js.native
  def isWebGLSupported(): Boolean = js.native
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double): Float32Array = js.native
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Float32Array): Float32Array = js.native
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
  def premultiplyRgba(rgb: Float32Array, alpha: Double): Float32Array = js.native
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Float32Array): Float32Array = js.native
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
  def premultiplyTint(tint: Double, alpha: Double): Double = js.native
  def premultiplyTintToRgba(tint: Double, alpha: Double): Float32Array = js.native
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Float32Array): Float32Array = js.native
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
  def removeItems[T](arr: js.Array[T], startIdx: Double, removeCount: Double): Unit = js.native
  def rgb2hex(rgb: js.Array[Double]): Double = js.native
  def sayHello(`type`: String): Unit = js.native
  def sign(n: Double): Double = js.native
  def skipHello(): Unit = js.native
  def uid(): Double = js.native
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    var EventEmitter: Anon_Prefixed = js.native
    var prefixed: String | Boolean = js.native
  }
  
  // https://github.com/kaimallea/isMobile
  @JSName("isMobile")
  @js.native
  object isMobileNs extends js.Object {
    val any: Boolean = js.native
    val phone: Boolean = js.native
    val seven_inch: Boolean = js.native
    val tablet: Boolean = js.native
    @js.native
    object amazon extends js.Object {
      var device: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
    @js.native
    object android extends js.Object {
      var device: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
    @js.native
    object apple extends js.Object {
      var device: Boolean = js.native
      var ipod: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
    @js.native
    object other extends js.Object {
      var blackberry: Boolean = js.native
      var blackberry10: Boolean = js.native
      var chrome: Boolean = js.native
      var device: Boolean = js.native
      var firefox: Boolean = js.native
      var opera: Boolean = js.native
    }
    
    @js.native
    object windows extends js.Object {
      var device: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
  }
  
}

