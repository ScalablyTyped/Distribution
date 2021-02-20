package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interiorpointMod {
  
  @JSImport("ol/geom/flat/interiorpoint", "getInteriorPointOfArray")
  @js.native
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    flatCenters: js.Array[Double],
    flatCentersOffset: Double
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/interiorpoint", "getInteriorPointOfArray")
  @js.native
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    flatCenters: js.Array[Double],
    flatCentersOffset: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/interiorpoint", "getInteriorPointsOfMultiArray")
  @js.native
  def getInteriorPointsOfMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    flatCenters: js.Array[Double]
  ): js.Array[Double] = js.native
}
