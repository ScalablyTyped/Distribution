package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestMod {
  
  @JSImport("ol/geom/flat/closest", "arrayMaxSquaredDelta")
  @js.native
  def arrayMaxSquaredDelta(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    max: Double
  ): Double = js.native
  
  @JSImport("ol/geom/flat/closest", "assignClosestArrayPoint")
  @js.native
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
  @JSImport("ol/geom/flat/closest", "assignClosestArrayPoint")
  @js.native
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
  
  @JSImport("ol/geom/flat/closest", "assignClosestMultiArrayPoint")
  @js.native
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
  @JSImport("ol/geom/flat/closest", "assignClosestMultiArrayPoint")
  @js.native
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
  
  @JSImport("ol/geom/flat/closest", "assignClosestPoint")
  @js.native
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
  @JSImport("ol/geom/flat/closest", "assignClosestPoint")
  @js.native
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
  
  @JSImport("ol/geom/flat/closest", "maxSquaredDelta")
  @js.native
  def maxSquaredDelta(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, max: Double): Double = js.native
  
  @JSImport("ol/geom/flat/closest", "multiArrayMaxSquaredDelta")
  @js.native
  def multiArrayMaxSquaredDelta(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    max: Double
  ): Double = js.native
}
