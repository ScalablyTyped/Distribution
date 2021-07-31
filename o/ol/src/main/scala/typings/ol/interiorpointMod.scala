package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interiorpointMod {
  
  @JSImport("ol/geom/flat/interiorpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    flatCenters: js.Array[Double],
    flatCentersOffset: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteriorPointOfArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], flatCenters.asInstanceOf[js.Any], flatCentersOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def getInteriorPointOfArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    flatCenters: js.Array[Double],
    flatCentersOffset: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteriorPointOfArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], flatCenters.asInstanceOf[js.Any], flatCentersOffset.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getInteriorPointsOfMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    flatCenters: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteriorPointsOfMultiArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], flatCenters.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
