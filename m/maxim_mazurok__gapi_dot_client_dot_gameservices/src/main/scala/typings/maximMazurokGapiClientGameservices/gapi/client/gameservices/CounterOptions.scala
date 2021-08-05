package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterOptions extends StObject {
  
  /** Custom fields. */
  var customFields: js.UndefOr[js.Array[CustomField]] = js.undefined
  
  /** The field value to attribute. */
  var field: js.UndefOr[String] = js.undefined
  
  /** The metric to update. */
  var metric: js.UndefOr[String] = js.undefined
}
object CounterOptions {
  
  inline def apply(): CounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterOptions]
  }
  
  extension [Self <: CounterOptions](x: Self) {
    
    inline def setCustomFields(value: js.Array[CustomField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomFieldsVarargs(value: CustomField*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
