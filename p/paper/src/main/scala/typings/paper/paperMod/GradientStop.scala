package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The GradientStop object.
  */
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
  def this(color: typings.paper.paper.Color) = this()
  def this(color: typings.paper.paper.Color, offset: Double) = this()
}

