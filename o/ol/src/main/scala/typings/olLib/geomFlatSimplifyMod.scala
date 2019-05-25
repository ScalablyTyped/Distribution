package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/simplify", JSImport.Namespace)
@js.native
object geomFlatSimplifyMod extends js.Object {
  def douglasPeucker(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    squaredTolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double
  ): scala.Double = js.native
  def douglasPeuckerArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    squaredTolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double,
    simplifiedEnds: js.Array[scala.Double]
  ): scala.Double = js.native
  def douglasPeuckerMultiArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    squaredTolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double,
    simplifiedEndss: js.Array[js.Array[scala.Double]]
  ): scala.Double = js.native
  def quantize(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    tolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double
  ): scala.Double = js.native
  def quantizeArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    tolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double,
    simplifiedEnds: js.Array[scala.Double]
  ): scala.Double = js.native
  def quantizeMultiArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    tolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double,
    simplifiedEndss: js.Array[js.Array[scala.Double]]
  ): scala.Double = js.native
  def radialDistance(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    squaredTolerance: scala.Double,
    simplifiedFlatCoordinates: js.Array[scala.Double],
    simplifiedOffset: scala.Double
  ): scala.Double = js.native
  def simplifyLineString(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    squaredTolerance: scala.Double,
    highQuality: scala.Boolean
  ): js.Array[scala.Double] = js.native
  def simplifyLineString(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    squaredTolerance: scala.Double,
    highQuality: scala.Boolean,
    opt_simplifiedFlatCoordinates: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def snap(value: scala.Double, tolerance: scala.Double): scala.Double = js.native
}

