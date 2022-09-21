package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanCondition extends StObject {
  
  /** The type of condition. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The values of the condition. The number of supported values depends on the condition type. Some support zero values, others one or two values, and ConditionType.ONE_OF_LIST supports
    * an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[ConditionValue]] = js.undefined
}
object BooleanCondition {
  
  inline def apply(): BooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanCondition]
  }
  
  extension [Self <: BooleanCondition](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValues(value: js.Array[ConditionValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: ConditionValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
