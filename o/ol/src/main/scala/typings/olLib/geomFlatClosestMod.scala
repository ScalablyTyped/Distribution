package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/closest", JSImport.Namespace)
@js.native
object geomFlatClosestMod extends js.Object {
  def arrayMaxSquaredDelta(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    max: scala.Double
  ): scala.Double = js.native
  def assignClosestArrayPoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    maxDelta: scala.Double,
    isRing: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    closestPoint: js.Array[scala.Double],
    minSquaredDistance: scala.Double
  ): scala.Double = js.native
  def assignClosestArrayPoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    maxDelta: scala.Double,
    isRing: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    closestPoint: js.Array[scala.Double],
    minSquaredDistance: scala.Double,
    opt_tmpPoint: js.Array[scala.Double]
  ): scala.Double = js.native
  def assignClosestMultiArrayPoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    maxDelta: scala.Double,
    isRing: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    closestPoint: js.Array[scala.Double],
    minSquaredDistance: scala.Double
  ): scala.Double = js.native
  def assignClosestMultiArrayPoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    maxDelta: scala.Double,
    isRing: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    closestPoint: js.Array[scala.Double],
    minSquaredDistance: scala.Double,
    opt_tmpPoint: js.Array[scala.Double]
  ): scala.Double = js.native
  def assignClosestPoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    maxDelta: scala.Double,
    isRing: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    closestPoint: js.Array[scala.Double],
    minSquaredDistance: scala.Double
  ): scala.Double = js.native
  def assignClosestPoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    maxDelta: scala.Double,
    isRing: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    closestPoint: js.Array[scala.Double],
    minSquaredDistance: scala.Double,
    opt_tmpPoint: js.Array[scala.Double]
  ): scala.Double = js.native
  def maxSquaredDelta(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    max: scala.Double
  ): scala.Double = js.native
  def multiArrayMaxSquaredDelta(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    max: scala.Double
  ): scala.Double = js.native
}

