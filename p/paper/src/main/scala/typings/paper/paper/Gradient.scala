package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Gradient object.
  */
trait Gradient extends js.Object {
  /** 
    * Specifies whether the gradient is radial or linear.
    */
  var radial: Boolean
  /** 
    * The gradient stops on the gradient ramp.
    */
  var stops: js.Array[GradientStop]
  /** 
    * Checks whether the gradient is equal to the supplied gradient.
    * 
    * @return true if they are equal
    */
  def equals(gradient: Gradient): Boolean
}

object Gradient {
  @scala.inline
  def apply(equals: Gradient => Boolean, radial: Boolean, stops: js.Array[GradientStop]): Gradient = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), radial = radial.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}

