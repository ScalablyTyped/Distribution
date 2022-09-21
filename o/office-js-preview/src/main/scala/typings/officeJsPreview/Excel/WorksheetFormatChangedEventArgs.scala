package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.WorksheetFormatChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet format change event.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait WorksheetFormatChangedEventArgs extends StObject {
  
  /**
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var address: String
  
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getRange(ctx: RequestContext): Range
  
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: WorksheetFormatChanged
  
  /**
    * Gets the ID of the worksheet in which the data changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}
object WorksheetFormatChangedEventArgs {
  
  inline def apply(
    address: String,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    worksheetId: String
  ): WorksheetFormatChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetFormatChanged")
    __obj.asInstanceOf[WorksheetFormatChangedEventArgs]
  }
  
  extension [Self <: WorksheetFormatChangedEventArgs](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setGetRange(value: RequestContext => Range): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
    
    inline def setGetRangeOrNullObject(value: RequestContext => Range): Self = StObject.set(x, "getRangeOrNullObject", js.Any.fromFunction1(value))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetFormatChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
