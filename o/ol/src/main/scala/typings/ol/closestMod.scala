package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestMod {
  
  @JSImport("ol/geom/flat/closest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayMaxSquaredDelta(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    max: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMaxSquaredDelta")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def assignClosestArrayPoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    maxDelta: Double,
    isRing: Boolean,
    x: Double,
    y: Double,
    closestPoint: js.Array[Double],
    minSquaredDistance: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assignClosestArrayPoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any], isRing.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], closestPoint.asInstanceOf[js.Any], minSquaredDistance.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def assignClosestArrayPoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    maxDelta: Double,
    isRing: Boolean,
    x: Double,
    y: Double,
    closestPoint: js.Array[Double],
    minSquaredDistance: Double,
    opt_tmpPoint: js.Array[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assignClosestArrayPoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any], isRing.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], closestPoint.asInstanceOf[js.Any], minSquaredDistance.asInstanceOf[js.Any], opt_tmpPoint.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def assignClosestMultiArrayPoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    maxDelta: Double,
    isRing: Boolean,
    x: Double,
    y: Double,
    closestPoint: js.Array[Double],
    minSquaredDistance: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assignClosestMultiArrayPoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any], isRing.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], closestPoint.asInstanceOf[js.Any], minSquaredDistance.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def assignClosestMultiArrayPoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    maxDelta: Double,
    isRing: Boolean,
    x: Double,
    y: Double,
    closestPoint: js.Array[Double],
    minSquaredDistance: Double,
    opt_tmpPoint: js.Array[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assignClosestMultiArrayPoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any], isRing.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], closestPoint.asInstanceOf[js.Any], minSquaredDistance.asInstanceOf[js.Any], opt_tmpPoint.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def assignClosestPoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    maxDelta: Double,
    isRing: Boolean,
    x: Double,
    y: Double,
    closestPoint: js.Array[Double],
    minSquaredDistance: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assignClosestPoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any], isRing.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], closestPoint.asInstanceOf[js.Any], minSquaredDistance.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def assignClosestPoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    maxDelta: Double,
    isRing: Boolean,
    x: Double,
    y: Double,
    closestPoint: js.Array[Double],
    minSquaredDistance: Double,
    opt_tmpPoint: js.Array[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assignClosestPoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any], isRing.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], closestPoint.asInstanceOf[js.Any], minSquaredDistance.asInstanceOf[js.Any], opt_tmpPoint.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def maxSquaredDelta(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSquaredDelta")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def multiArrayMaxSquaredDelta(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    max: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("multiArrayMaxSquaredDelta")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
