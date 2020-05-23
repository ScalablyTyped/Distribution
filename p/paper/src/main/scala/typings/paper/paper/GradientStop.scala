package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The GradientStop object.
  */
trait GradientStop extends js.Object {
  /** 
    * The color of the gradient stop.
    */
  var color: Color
  /** 
    * The ramp-point of the gradient stop as a value between `0` and `1`.
    */
  var offset: Double
}

object GradientStop {
  @scala.inline
  def apply(color: Color, offset: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
}

