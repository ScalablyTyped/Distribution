package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** Represents raw byte values. */
  var bytesValue: js.UndefOr[String] = js.undefined
  
  /** Represents a date in ms since the epoch. */
  var dateValue: js.UndefOr[String] = js.undefined
  
  /** Represents a repeated `Value`. */
  var listValue: js.UndefOr[ListValue] = js.undefined
  
  /** Represents a null value. */
  var nullValue: js.UndefOr[String] = js.undefined
  
  /** Represents a double value. */
  var numberValue: js.UndefOr[Double] = js.undefined
  
  /** Represents a structured proto value. */
  var protoValue: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Value & TopLevel[js.Any]
  ] = js.undefined
  
  /** Represents a string value. */
  var stringValue: js.UndefOr[String] = js.undefined
  
  /** Represents a structured value. */
  var structValue: js.UndefOr[Struct] = js.undefined
}
object Value {
  
  inline def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setBytesValue(value: String): Self = StObject.set(x, "bytesValue", value.asInstanceOf[js.Any])
    
    inline def setBytesValueUndefined: Self = StObject.set(x, "bytesValue", js.undefined)
    
    inline def setDateValue(value: String): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    inline def setListValue(value: ListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    inline def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    inline def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setProtoValue(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Value & TopLevel[js.Any]
    ): Self = StObject.set(x, "protoValue", value.asInstanceOf[js.Any])
    
    inline def setProtoValueUndefined: Self = StObject.set(x, "protoValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setStructValue(value: Struct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    inline def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
