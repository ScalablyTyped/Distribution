package typings
package pixiDotJsLib.PIXINs.utilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils")
@js.native
object utilsNsMembers extends js.Object {
  val BaseTextureCache: js.Any = js.native
  val TextureCache: js.Any = js.native
  val premultiplyBlendMode: js.Array[js.Array[scala.Double]] = js.native
  def canUseNewCanvasBlendModes(): scala.Boolean = js.native
  def clearTextureCache(): scala.Unit = js.native
  def correctBlendMode(blendMode: scala.Double, premultiplied: scala.Boolean): scala.Double = js.native
  def decomposeDataUri(dataUri: java.lang.String): pixiDotJsLib.PIXINs.DecomposedDataUri | scala.Unit = js.native
  def destroyTextureCache(): scala.Unit = js.native
  def getResolutionOfUrl(url: java.lang.String): scala.Double = js.native
  def getResolutionOfUrl(url: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  def getSvgSize(svgString: java.lang.String): js.Any = js.native
  def getUrlFileExtension(url: java.lang.String): java.lang.String | scala.Unit = js.native
  def hex2rgb(hex: scala.Double): js.Array[scala.Double] = js.native
  def hex2rgb(hex: scala.Double, out: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def hex2string(hex: scala.Double): java.lang.String = js.native
  def isWebGLSupported(): scala.Boolean = js.native
  def premultiplyRgba(rgb: js.Array[scala.Double], alpha: scala.Double): stdLib.Float32Array = js.native
  def premultiplyRgba(rgb: js.Array[scala.Double], alpha: scala.Double, out: stdLib.Float32Array): stdLib.Float32Array = js.native
  def premultiplyRgba(
    rgb: js.Array[scala.Double],
    alpha: scala.Double,
    out: stdLib.Float32Array,
    premultiply: scala.Boolean
  ): stdLib.Float32Array = js.native
  def premultiplyRgba(rgb: stdLib.Float32Array, alpha: scala.Double): stdLib.Float32Array = js.native
  def premultiplyRgba(rgb: stdLib.Float32Array, alpha: scala.Double, out: stdLib.Float32Array): stdLib.Float32Array = js.native
  def premultiplyRgba(
    rgb: stdLib.Float32Array,
    alpha: scala.Double,
    out: stdLib.Float32Array,
    premultiply: scala.Boolean
  ): stdLib.Float32Array = js.native
  def premultiplyTint(tint: scala.Double, alpha: scala.Double): scala.Double = js.native
  def premultiplyTintToRgba(tint: scala.Double, alpha: scala.Double): stdLib.Float32Array = js.native
  def premultiplyTintToRgba(tint: scala.Double, alpha: scala.Double, out: stdLib.Float32Array): stdLib.Float32Array = js.native
  def premultiplyTintToRgba(tint: scala.Double, alpha: scala.Double, out: stdLib.Float32Array, premultiply: scala.Boolean): stdLib.Float32Array = js.native
  def removeItems[T](arr: js.Array[T], startIdx: scala.Double, removeCount: scala.Double): scala.Unit = js.native
  def rgb2hex(rgb: js.Array[scala.Double]): scala.Double = js.native
  def sayHello(`type`: java.lang.String): scala.Unit = js.native
  def sign(n: scala.Double): scala.Double = js.native
  def skipHello(): scala.Unit = js.native
  def uid(): scala.Double = js.native
}

