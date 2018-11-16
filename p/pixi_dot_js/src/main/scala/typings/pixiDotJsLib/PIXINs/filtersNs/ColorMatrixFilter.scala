package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.ColorMatrixFilter")
@js.native
class ColorMatrixFilter ()
  extends pixiDotJsLib.PIXINs.Filter[ColorMatrixFilterUniforms] {
  var alpha: scala.Double = js.native
  var matrix: js.Array[scala.Double] = js.native
  /* protected */ def _colorMatrix(matrix: js.Array[scala.Double]): scala.Unit = js.native
  /* protected */ def _loadMatrix(matrix: js.Array[scala.Double]): scala.Unit = js.native
  /* protected */ def _loadMatrix(matrix: js.Array[scala.Double], multiply: scala.Boolean): scala.Unit = js.native
  /* protected */ def _multiply(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Unit = js.native
  def blackAndWhite(): scala.Unit = js.native
  def blackAndWhite(multiply: scala.Boolean): scala.Unit = js.native
  def brightness(b: scala.Double): scala.Unit = js.native
  def brightness(b: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def browni(): scala.Unit = js.native
  def browni(multiply: scala.Boolean): scala.Unit = js.native
  def colorTone(
    desaturation: scala.Double,
    toned: scala.Double,
    lightColor: java.lang.String,
    darkColor: java.lang.String
  ): scala.Unit = js.native
  def colorTone(
    desaturation: scala.Double,
    toned: scala.Double,
    lightColor: java.lang.String,
    darkColor: java.lang.String,
    multiply: scala.Boolean
  ): scala.Unit = js.native
  def contrast(amount: scala.Double): scala.Unit = js.native
  def contrast(amount: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def desaturate(): scala.Unit = js.native
  def desaturate(multiply: scala.Boolean): scala.Unit = js.native
  def greyscale(scale: scala.Double): scala.Unit = js.native
  def greyscale(scale: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def hue(rotation: scala.Double): scala.Unit = js.native
  def hue(rotation: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def kodachrome(): scala.Unit = js.native
  def kodachrome(multiply: scala.Boolean): scala.Unit = js.native
  def lsd(): scala.Unit = js.native
  def lsd(multiply: scala.Boolean): scala.Unit = js.native
  def negative(): scala.Unit = js.native
  def negative(multiply: scala.Boolean): scala.Unit = js.native
  def night(intensity: scala.Double): scala.Unit = js.native
  def night(intensity: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def polaroid(): scala.Unit = js.native
  def polaroid(multiply: scala.Boolean): scala.Unit = js.native
  def predator(amount: scala.Double): scala.Unit = js.native
  def predator(amount: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def saturate(amount: scala.Double): scala.Unit = js.native
  def saturate(amount: scala.Double, multiply: scala.Boolean): scala.Unit = js.native
  def sepia(): scala.Unit = js.native
  def sepia(multiply: scala.Boolean): scala.Unit = js.native
  def technicolor(): scala.Unit = js.native
  def technicolor(multiply: scala.Boolean): scala.Unit = js.native
  def toBGR(): scala.Unit = js.native
  def toBGR(multiply: scala.Boolean): scala.Unit = js.native
  def vintage(): scala.Unit = js.native
  def vintage(multiply: scala.Boolean): scala.Unit = js.native
}

