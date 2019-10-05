package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Gradient")
@js.native
/**
  * Creates a Gradient object.
  * @param stops [optional] - Array of GradientStops
  * @param radial [optional] - Whether the gradient is radial or linear
  */
class Gradient ()
  extends typings.paper.paper.Gradient {
  def this(`object`: js.Any) = this()
  def this(stops: js.Array[(js.Array[String | Double]) | typings.paper.paper.GradientStop | String]) = this()
  def this(
    stops: js.Array[(js.Array[String | Double]) | typings.paper.paper.GradientStop | String],
    radial: Boolean
  ) = this()
}

