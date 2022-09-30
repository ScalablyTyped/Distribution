package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayOperator[Type] extends StObject {
  
  @JSName("$each")
  var $each: js.UndefOr[js.Array[Flatten[Type]]] = js.undefined
  
  @JSName("$position")
  var $position: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("$sort")
  var $sort: js.UndefOr[Sort] = js.undefined
}
object ArrayOperator {
  
  inline def apply[Type](): ArrayOperator[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOperator[Type]]
  }
  
  extension [Self <: ArrayOperator[?], Type](x: Self & ArrayOperator[Type]) {
    
    inline def set$each(value: js.Array[Flatten[Type]]): Self = StObject.set(x, "$each", value.asInstanceOf[js.Any])
    
    inline def set$eachUndefined: Self = StObject.set(x, "$each", js.undefined)
    
    inline def set$eachVarargs(value: Flatten[Type]*): Self = StObject.set(x, "$each", js.Array(value*))
    
    inline def set$position(value: scala.Double): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    inline def set$positionUndefined: Self = StObject.set(x, "$position", js.undefined)
    
    inline def set$slice(value: scala.Double): Self = StObject.set(x, "$slice", value.asInstanceOf[js.Any])
    
    inline def set$sliceUndefined: Self = StObject.set(x, "$slice", js.undefined)
    
    inline def set$sort(value: Sort): Self = StObject.set(x, "$sort", value.asInstanceOf[js.Any])
    
    inline def set$sortUndefined: Self = StObject.set(x, "$sort", js.undefined)
    
    inline def set$sortVarargs(value: (String | (js.Tuple2[String, SortDirection]))*): Self = StObject.set(x, "$sort", js.Array(value*))
  }
}
