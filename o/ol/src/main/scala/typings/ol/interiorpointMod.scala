package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/flat/interiorpoint", JSImport.Namespace)
@js.native
object interiorpointMod extends js.Object {
  
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    flatCenters: js.Array[Double],
    flatCentersOffset: Double
  ): js.Array[Double] = js.native
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    flatCenters: js.Array[Double],
    flatCentersOffset: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def getInteriorPointsOfMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    flatCenters: js.Array[Double]
  ): js.Array[Double] = js.native
}
