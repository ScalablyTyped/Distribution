package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Gradient")
@js.native
class Gradient () extends js.Object {
  /**
           * Creates a Gradient object.
           * @param object [optional] - an object literal containing the properties to be set on the group.
           */
  def this(`object`: js.Any) = this()
  /**
           * Creates a Gradient object.
           * @param stops [optional] - Array of GradientStops
           * @param radial [optional] - Whether the gradient is radial or linear
           */
  def this(stops: js.Array[java.lang.String | GradientStop | (js.Array[java.lang.String | scala.Double])]) = this()
  /**
           * Creates a Gradient object.
           * @param stops [optional] - Array of GradientStops
           * @param radial [optional] - Whether the gradient is radial or linear
           */
  def this(stops: js.Array[java.lang.String | GradientStop | (js.Array[java.lang.String | scala.Double])], radial: scala.Boolean) = this()
  /**
           * Specifies whether the gradient is radial or linear.
           */
  var radial: scala.Boolean = js.native
  /**
           * The gradient stops on the gradient ramp.
           */
  var stops: js.Array[GradientStop] = js.native
  /**
           * Checks whether the gradient is equal to the supplied gradient.
           * @param gradient - the gradient to check against
           */
  def equals(gradient: Gradient): scala.Boolean = js.native
}

