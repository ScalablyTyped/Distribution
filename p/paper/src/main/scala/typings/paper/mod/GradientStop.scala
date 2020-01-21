package typings.paper.mod

import typings.paper.paper.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "GradientStop")
@js.native
/** 
  * Creates a GradientStop object.
  * 
  * @param color - the color of the stop
  * @param offset - the position of the stop on the gradient
  * ramp as a value between `0` and `1`; `null` or `undefined` for automatic
  * assignment.
  */
class GradientStop ()
  extends typings.paper.paper.GradientStop {
  def this(color: Color) = this()
  def this(color: Color, offset: Double) = this()
}

