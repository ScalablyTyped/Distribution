package typings.p2.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvexOptions
  extends StObject
     with SharedShapeOptions {
  
  var axes: js.UndefOr[js.Array[(js.Tuple2[Double, Double]) | ArrayLike[Double]]] = js.undefined
  
  var vertices: js.UndefOr[js.Array[(js.Tuple2[Double, Double]) | ArrayLike[Double]]] = js.undefined
}
object ConvexOptions {
  
  inline def apply(): ConvexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvexOptions]
  }
  
  extension [Self <: ConvexOptions](x: Self) {
    
    inline def setAxes(value: js.Array[(js.Tuple2[Double, Double]) | ArrayLike[Double]]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setAxesVarargs(value: ((js.Tuple2[Double, Double]) | ArrayLike[Double])*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setVertices(value: js.Array[(js.Tuple2[Double, Double]) | ArrayLike[Double]]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: ((js.Tuple2[Double, Double]) | ArrayLike[Double])*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
