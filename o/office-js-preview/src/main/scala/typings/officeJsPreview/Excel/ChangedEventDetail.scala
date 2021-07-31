package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.Empty
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.Integer
import typings.officeJsPreview.officeJsPreviewStrings.RichValue
import typings.officeJsPreview.officeJsPreviewStrings.String
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provide information about the detail of WorksheetChangedEvent/TableChangedEvent
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChangedEventDetail extends StObject {
  
  /**
    *
    * Represents the value after changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueAfter: js.Any
  
  /**
    *
    * Represents the value before changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueBefore: js.Any
  
  /**
    *
    * Represents the type of value after changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  
  /**
    *
    * Represents the type of value before changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
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
