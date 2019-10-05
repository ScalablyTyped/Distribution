package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Gradient")
@js.native
/**
  * Creates a Gradient object.
  * @param stops [optional] - Array of GradientStops
  * @param radial [optional] - Whether the gradient is radial or linear
  */
class Gradient () extends Base {
  def this(`object`: js.Any) = this()
  def this(stops: js.Array[(js.Array[String | Double]) | GradientStop | String]) = this()
  def this(stops: js.Array[(js.Array[String | Double]) | GradientStop | String], radial: Boolean) = this()
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
    * @param gradient - the gradient to check against
    */
  def equals(gradient: Gradient): Boolean = js.native
}

