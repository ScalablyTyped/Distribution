package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Gradient")
@js.native
class Gradient ()
  extends paperLib.paperNs.Gradient {
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
  def this(stops: js.Array[
      java.lang.String | paperLib.paperNs.GradientStop | (js.Array[java.lang.String | scala.Double])
    ]) = this()
  /**
           * Creates a Gradient object.
           * @param stops [optional] - Array of GradientStops
           * @param radial [optional] - Whether the gradient is radial or linear
           */
  def this(stops: js.Array[
      java.lang.String | paperLib.paperNs.GradientStop | (js.Array[java.lang.String | scala.Double])
    ], radial: scala.Boolean) = this()
}

