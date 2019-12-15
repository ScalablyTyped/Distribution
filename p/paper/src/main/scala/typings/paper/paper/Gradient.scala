package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Gradient object.
  */
@JSGlobal("paper.Gradient")
@js.native
class Gradient () extends js.Object {
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

