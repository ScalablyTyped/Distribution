package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AABBOptions extends StObject {
  
  var lowerBound: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var upperBound: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object AABBOptions {
  
  inline def apply(): AABBOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AABBOptions]
  }
  
  extension [Self <: AABBOptions](x: Self) {
    
    inline def setLowerBound(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setUpperBound(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
