package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.native
  
  /** Represents raw byte values. */
  var bytesValue: js.UndefOr[String] = js.native
  
  /** Represents a date in ms since the epoch. */
  var dateValue: js.UndefOr[String] = js.native
  
  /** Represents a repeated `Value`. */
  var listValue: js.UndefOr[ListValue] = js.native
  
  /** Represents a null value. */
  var nullValue: js.UndefOr[String] = js.native
  
  /** Represents a double value. */
  var numberValue: js.UndefOr[Double] = js.native
  
  /** Represents a structured proto value. */
  var protoValue: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Value with TopLevel[js.Any]
  ] = js.native
  
  /** Represents a string value. */
  var stringValue: js.UndefOr[String] = js.native
  
  /** Represents a structured value. */
  var structValue: js.UndefOr[Struct] = js.native
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    
    @scala.inline
    def setBytesValue(value: String): Self = this.set("bytesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesValue: Self = this.set("bytesValue", js.undefined)
    
    @scala.inline
    def setDateValue(value: String): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    
    @scala.inline
    def setListValue(value: ListValue): Self = this.set("listValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListValue: Self = this.set("listValue", js.undefined)
    
    @scala.inline
    def setNullValue(value: String): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberValue: Self = this.set("numberValue", js.undefined)
    
    @scala.inline
    def setProtoValue(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Value with TopLevel[js.Any]
    ): Self = this.set("protoValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtoValue: Self = this.set("protoValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    
    @scala.inline
    def setStructValue(value: Struct): Self = this.set("structValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructValue: Self = this.set("structValue", js.undefined)
  }
}
