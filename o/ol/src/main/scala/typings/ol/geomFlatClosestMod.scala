package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/closest", JSImport.Namespace)
@js.native
object geomFlatClosestMod extends js.Object {
  def arrayMaxSquaredDelta(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    max: Double
  ): Double = js.native
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
  ): Double = js.native
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
  ): Double = js.native
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
  ): Double = js.native
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
  ): Double = js.native
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
  ): Double = js.native
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
  ): Double = js.native
  def maxSquaredDelta(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, max: Double): Double = js.native
  def multiArrayMaxSquaredDelta(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    max: Double
  ): Double = js.native
}

