package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatFlipMod {
  
  @JSImport("ol/geom/flat/flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipXY(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def flipXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def flipXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    opt_dest: js.Array[Double],
    opt_destOffset: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any], opt_destOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def flipXY(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    opt_dest: Unit,
    opt_destOffset: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipXY")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any], opt_destOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
