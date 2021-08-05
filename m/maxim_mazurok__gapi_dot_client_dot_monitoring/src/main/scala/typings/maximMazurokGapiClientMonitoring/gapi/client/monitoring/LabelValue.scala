package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelValue extends StObject {
  
  /** A bool label value. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** An int64 label value. */
  var int64Value: js.UndefOr[String] = js.undefined
  
  /** A string label value. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object LabelValue {
  
  inline def apply(): LabelValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelValue]
  }
  
  extension [Self <: LabelValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
