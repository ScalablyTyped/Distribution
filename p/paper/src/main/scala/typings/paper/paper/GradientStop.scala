package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The GradientStop object.
  */
@js.native
trait GradientStop extends js.Object {
  /** 
    * The color of the gradient stop.
    */
  var color: Color = js.native
  /** 
    * The ramp-point of the gradient stop as a value between `0` and `1`.
    */
  var offset: Double = js.native
}

object GradientStop {
  @scala.inline
  def apply(color: Color, offset: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  @scala.inline
  implicit class GradientStopOps[Self <: GradientStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

