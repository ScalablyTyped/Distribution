package typings
package paperLib.paperMod

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
  extends paperLib.paperNs.Gradient {
  def this(`object`: js.Any) = this()
  def this(stops: js.Array[
      (js.Array[java.lang.String | scala.Double]) | paperLib.paperNs.GradientStop | java.lang.String
    ]) = this()
  def this(stops: js.Array[
      (js.Array[java.lang.String | scala.Double]) | paperLib.paperNs.GradientStop | java.lang.String
    ], radial: scala.Boolean) = this()
}

