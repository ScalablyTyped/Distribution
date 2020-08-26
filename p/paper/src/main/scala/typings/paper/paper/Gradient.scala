package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Gradient object.
  */
@js.native
trait Gradient extends js.Object {
  /** 
    * Specifies whether the gradient is radial or linear.
    */
  var radial: Boolean = js.native
  /** 
    * The gradient stops on the gradient ramp.
    */
  var stops: js.Array[GradientStop] = js.native
  /** 
    * Checks whether the gradient is equal to the supplied gradient.
    * 
    * @return true if they are equal
    */
  def equals(gradient: Gradient): Boolean = js.native
}

object Gradient {
  @scala.inline
  def apply(equals: Gradient => Boolean, radial: Boolean, stops: js.Array[GradientStop]): Gradient = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), radial = radial.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
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
    def setEquals(value: Gradient => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setRadial(value: Boolean): Self = this.set("radial", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopsVarargs(value: GradientStop*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[GradientStop]): Self = this.set("stops", value.asInstanceOf[js.Any])
  }
  
}

