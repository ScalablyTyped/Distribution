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
  
  @scala.inline
  def apply(): CounterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterOptions]
  }
  
  @scala.inline
  implicit class CounterOptionsMutableBuilder[Self <: CounterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: js.Array[CustomField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: CustomField*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
