package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatSimplifyMod {
  
  @JSImport("ol/geom/flat/simplify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def douglasPeucker(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("douglasPeucker")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def douglasPeuckerArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEnds: js.Array[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("douglasPeuckerArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any], simplifiedEnds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def douglasPeuckerMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEndss: js.Array[js.Array[Double]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("douglasPeuckerMultiArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any], simplifiedEndss.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantize(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    tolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantizeArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    tolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEnds: js.Array[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any], simplifiedEnds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantizeMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    tolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEndss: js.Array[js.Array[Double]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeMultiArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any], simplifiedEndss.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def radialDistance(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("radialDistance")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any], simplifiedOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def simplifyLineString(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    highQuality: Boolean
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyLineString")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], highQuality.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def simplifyLineString(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    highQuality: Boolean,
    simplifiedFlatCoordinates: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyLineString")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any], highQuality.asInstanceOf[js.Any], simplifiedFlatCoordinates.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def snap(value: Double, tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snap")(value.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
}
