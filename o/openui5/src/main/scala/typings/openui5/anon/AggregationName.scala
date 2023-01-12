package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationName extends StObject {
  
  /**
    * The aggregation name of the changed aggregation.
    */
  var aggregationName: js.UndefOr[String] = js.undefined
  
  /**
    * Which method changed the aggregation.
    */
  var methodName: js.UndefOr[String] = js.undefined
  
  /**
    * What parameters were used to change the aggregation.
    */
  var methodParams: js.UndefOr[js.Object] = js.undefined
}
object AggregationName {
  
  inline def apply(): AggregationName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationName] (val x: Self) extends AnyVal {
    
    inline def setAggregationName(value: String): Self = StObject.set(x, "aggregationName", value.asInstanceOf[js.Any])
    
    inline def setAggregationNameUndefined: Self = StObject.set(x, "aggregationName", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setMethodParams(value: js.Object): Self = StObject.set(x, "methodParams", value.asInstanceOf[js.Any])
    
    inline def setMethodParamsUndefined: Self = StObject.set(x, "methodParams", js.undefined)
  }
}
