package typings.pixiDotJs.PIXINs.utilsNs

import typings.pixiDotJs.PIXINs.DecomposedDataUri
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils")
@js.native
object ^ extends js.Object {
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
  /**
    * Remove a range of items from an array
    *
    * @param arr The target array
    * @param startIdx The index to begin removing from (inclusive)
    * @param removeCount How many items to remove
    */
  def removeItems[T](arr: js.Array[T], startIdx: Double, removeCount: Double): Unit = js.native
  def rgb2hex(rgb: js.Array[Double]): Double = js.native
  def sayHello(`type`: String): Unit = js.native
  def sign(n: Double): Double = js.native
  def skipHello(): Unit = js.native
  def uid(): Double = js.native
}

