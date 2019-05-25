package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/transform", JSImport.Namespace)
@js.native
object geomFlatTransformMod extends js.Object {
  def rotate(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    angle: scala.Double,
    anchor: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def rotate(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    angle: scala.Double,
    anchor: js.Array[scala.Double],
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def scale(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    sx: scala.Double,
    sy: scala.Double,
    anchor: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def scale(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    sx: scala.Double,
    sy: scala.Double,
    anchor: js.Array[scala.Double],
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def transform2D(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    transform: olLib.transformMod.Transform
  ): js.Array[scala.Double] = js.native
  def transform2D(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    transform: olLib.transformMod.Transform,
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def translate(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    deltaX: scala.Double,
    deltaY: scala.Double
  ): js.Array[scala.Double] = js.native
  def translate(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    deltaX: scala.Double,
    deltaY: scala.Double,
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
}

