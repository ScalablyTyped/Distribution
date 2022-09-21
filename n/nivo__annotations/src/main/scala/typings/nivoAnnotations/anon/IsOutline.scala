package typings.nivoAnnotations.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOutline extends StObject {
  
  var isOutline: js.UndefOr[Boolean] = js.undefined
  
  var points: js.Array[js.Tuple2[Double, Double]]
}
object IsOutline {
  
  inline def apply(points: js.Array[js.Tuple2[Double, Double]]): IsOutline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOutline]
  }
  
  extension [Self <: IsOutline](x: Self) {
    
    inline def setIsOutline(value: Boolean): Self = StObject.set(x, "isOutline", value.asInstanceOf[js.Any])
    
    inline def setIsOutlineUndefined: Self = StObject.set(x, "isOutline", js.undefined)
    
    inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
