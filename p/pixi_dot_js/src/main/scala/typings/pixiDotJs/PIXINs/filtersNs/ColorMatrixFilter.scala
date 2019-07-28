package typings.pixiDotJs.PIXINs.filtersNs

import typings.pixiDotJs.PIXINs.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.ColorMatrixFilter")
@js.native
class ColorMatrixFilter () extends Filter[ColorMatrixFilterUniforms] {
  var alpha: Double = js.native
  var matrix: js.Array[Double] = js.native
  /* protected */ def _colorMatrix(matrix: js.Array[Double]): Unit = js.native
  /* protected */ def _loadMatrix(matrix: js.Array[Double]): Unit = js.native
  /* protected */ def _loadMatrix(matrix: js.Array[Double], multiply: Boolean): Unit = js.native
  /* protected */ def _multiply(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): Unit = js.native
  def blackAndWhite(): Unit = js.native
  def blackAndWhite(multiply: Boolean): Unit = js.native
  def brightness(b: Double): Unit = js.native
  def brightness(b: Double, multiply: Boolean): Unit = js.native
  def browni(): Unit = js.native
  def browni(multiply: Boolean): Unit = js.native
  def colorTone(desaturation: Double, toned: Double, lightColor: String, darkColor: String): Unit = js.native
  def colorTone(desaturation: Double, toned: Double, lightColor: String, darkColor: String, multiply: Boolean): Unit = js.native
  def contrast(amount: Double): Unit = js.native
  def contrast(amount: Double, multiply: Boolean): Unit = js.native
  def desaturate(): Unit = js.native
  def desaturate(multiply: Boolean): Unit = js.native
  def greyscale(scale: Double): Unit = js.native
  def greyscale(scale: Double, multiply: Boolean): Unit = js.native
  def hue(rotation: Double): Unit = js.native
  def hue(rotation: Double, multiply: Boolean): Unit = js.native
  def kodachrome(): Unit = js.native
  def kodachrome(multiply: Boolean): Unit = js.native
  def lsd(): Unit = js.native
  def lsd(multiply: Boolean): Unit = js.native
  def negative(): Unit = js.native
  def negative(multiply: Boolean): Unit = js.native
  def night(intensity: Double): Unit = js.native
  def night(intensity: Double, multiply: Boolean): Unit = js.native
  def polaroid(): Unit = js.native
  def polaroid(multiply: Boolean): Unit = js.native
  def predator(amount: Double): Unit = js.native
  def predator(amount: Double, multiply: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def saturate(amount: Double): Unit = js.native
  def saturate(amount: Double, multiply: Boolean): Unit = js.native
  def sepia(): Unit = js.native
  def sepia(multiply: Boolean): Unit = js.native
  def technicolor(): Unit = js.native
  def technicolor(multiply: Boolean): Unit = js.native
  def toBGR(): Unit = js.native
  def toBGR(multiply: Boolean): Unit = js.native
  def vintage(): Unit = js.native
  def vintage(multiply: Boolean): Unit = js.native
}

