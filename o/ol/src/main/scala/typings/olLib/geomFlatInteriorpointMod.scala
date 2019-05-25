package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/interiorpoint", JSImport.Namespace)
@js.native
object geomFlatInteriorpointMod extends js.Object {
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    flatCenters: js.Array[scala.Double],
    flatCentersOffset: scala.Double
  ): js.Array[scala.Double] = js.native
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    flatCenters: js.Array[scala.Double],
    flatCentersOffset: scala.Double,
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def getInteriorPointsOfMultiArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    flatCenters: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
}

