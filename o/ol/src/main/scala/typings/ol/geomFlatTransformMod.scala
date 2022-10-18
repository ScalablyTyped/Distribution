package typings.ol

import typings.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatTransformMod {
  
  @JSImport("ol/geom/flat/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rotate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    angle: Double,
    anchor: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def rotate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    angle: Double,
    anchor: js.Array[Double],
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def scale(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    sx: Double,
    sy: Double,
    anchor: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def scale(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    sx: Double,
    sy: Double,
    anchor: js.Array[Double],
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def transform2D(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    transform: Transform
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform2D")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def transform2D(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    transform: Transform,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform2D")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def translate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    deltaX: Double,
    deltaY: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def translate(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    deltaX: Double,
    deltaY: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
