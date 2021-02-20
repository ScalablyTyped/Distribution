package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplifyMod {
  
  @JSImport("ol/geom/flat/simplify", "douglasPeucker")
  @js.native
  def douglasPeucker(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "douglasPeuckerArray")
  @js.native
  def douglasPeuckerArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEnds: js.Array[Double]
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "douglasPeuckerMultiArray")
  @js.native
  def douglasPeuckerMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEndss: js.Array[js.Array[Double]]
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "quantize")
  @js.native
  def quantize(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    tolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "quantizeArray")
  @js.native
  def quantizeArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    tolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEnds: js.Array[Double]
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "quantizeMultiArray")
  @js.native
  def quantizeMultiArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    tolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double,
    simplifiedEndss: js.Array[js.Array[Double]]
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "radialDistance")
  @js.native
  def radialDistance(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    simplifiedFlatCoordinates: js.Array[Double],
    simplifiedOffset: Double
  ): Double = js.native
  
  @JSImport("ol/geom/flat/simplify", "simplifyLineString")
  @js.native
  def simplifyLineString(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    highQuality: Boolean
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/simplify", "simplifyLineString")
  @js.native
  def simplifyLineString(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    squaredTolerance: Double,
    highQuality: Boolean,
    opt_simplifiedFlatCoordinates: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/simplify", "snap")
  @js.native
  def snap(value: Double, tolerance: Double): Double = js.native
}
