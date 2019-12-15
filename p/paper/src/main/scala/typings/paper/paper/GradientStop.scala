package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The GradientStop object.
  */
@JSGlobal("paper.GradientStop")
@js.native
/** 
  * Creates a GradientStop object.
  * 
  * @param color - the color of the stop
  * @param offset - the position of the stop on the gradient
  * ramp as a value between `0` and `1`; `null` or `undefined` for automatic
  * assignment.
  */
class GradientStop () extends js.Object {
  def this(color: Color) = this()
  def this(color: Color, offset: Double) = this()
  /** 
    * The color of the gradient stop.
    */
  var color: Color = js.native
  /** 
    * The ramp-point of the gradient stop as a value between `0` and `1`.
    */
  var offset: Double = js.native
}

