package typings.ol

import typings.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/flat/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  
  def rotate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    angle: Double,
    anchor: js.Array[Double]
  ): js.Array[Double] = js.native
  def rotate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    angle: Double,
    anchor: js.Array[Double],
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def scale(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    sx: Double,
    sy: Double,
    anchor: js.Array[Double]
  ): js.Array[Double] = js.native
  def scale(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    sx: Double,
    sy: Double,
    anchor: js.Array[Double],
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def transform2D(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    transform: Transform
  ): js.Array[Double] = js.native
  def transform2D(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    transform: Transform,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def translate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    deltaX: Double,
    deltaY: Double
  ): js.Array[Double] = js.native
  def translate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    deltaX: Double,
    deltaY: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
}
