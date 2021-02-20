package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Empty
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.Integer
import typings.officeJs.officeJsStrings.RichValue
import typings.officeJs.officeJsStrings.String
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provide information about the detail of WorksheetChangedEvent/TableChangedEvent
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChangedEventDetail extends StObject {
  
  /**
    *
    * Represents the value after changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueAfter: js.Any = js.native
  
  /**
    *
    * Represents the value before changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueBefore: js.Any = js.native
  
  /**
    *
    * Represents the type of value after changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue = js.native
  
  /**
    *
    * Represents the type of value before changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue = js.native
}
object ChangedEventDetail {
  
  @scala.inline
  def apply(
    valueAfter: js.Any,
    valueBefore: js.Any,
    valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue,
    valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  ): ChangedEventDetail = {
    val __obj = js.Dynamic.literal(valueAfter = valueAfter.asInstanceOf[js.Any], valueBefore = valueBefore.asInstanceOf[js.Any], valueTypeAfter = valueTypeAfter.asInstanceOf[js.Any], valueTypeBefore = valueTypeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedEventDetail]
  }
  
  @scala.inline
  implicit class ChangedEventDetailMutableBuilder[Self <: ChangedEventDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueAfter(value: js.Any): Self = StObject.set(x, "valueAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBefore(value: js.Any): Self = StObject.set(x, "valueBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeAfter(value: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue): Self = StObject.set(x, "valueTypeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeBefore(value: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue): Self = StObject.set(x, "valueTypeBefore", value.asInstanceOf[js.Any])
  }
}
