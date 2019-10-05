package typings.ol

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/colorlike", JSImport.Namespace)
@js.native
object colorlikeMod extends js.Object {
  def asColorLike(color: Color): ColorLike = js.native
  def asColorLike(color: ColorLike): ColorLike = js.native
  type ColorLike = String | CanvasPattern | CanvasGradient
}

