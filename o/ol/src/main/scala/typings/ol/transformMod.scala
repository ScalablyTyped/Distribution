package typings.ol

import typings.ol.olMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("ol/geom/flat/transform", "rotate")
  @js.native
  def rotate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    angle: Double,
    anchor: js.Array[Double]
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/transform", "rotate")
  @js.native
  def rotate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    angle: Double,
    anchor: js.Array[Double],
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/transform", "scale")
  @js.native
  def scale(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    sx: Double,
    sy: Double,
    anchor: js.Array[Double]
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/transform", "scale")
  @js.native
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
  
  @JSImport("ol/geom/flat/transform", "transform2D")
  @js.native
  def transform2D(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    transform: Transform
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/transform", "transform2D")
  @js.native
  def transform2D(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    transform: Transform,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/transform", "translate")
  @js.native
  def translate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    deltaX: Double,
    deltaY: Double
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/transform", "translate")
  @js.native
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
