package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.WorksheetProtectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the worksheet that raised the protection status changed event, which fires when the protection status is updated in a worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
trait WorksheetProtectionChangedEventArgs extends StObject {
  
  /**
    * Specifies if any of the `AllowEditRange` objects have changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var allowEditRangesChanged: Boolean
  
  /**
    * Gets the current protection status of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var isProtected: Boolean
  
  /**
    * Specifies if the `WorksheetProtectionOptions` have changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var protectionOptionsChanged: Boolean
  
  /**
    * Specifies if the worksheet password has changed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var sheetPasswordChanged: Boolean
  
  /**
    * The source of the event. It can be local or remote (through co-authoring).
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var `type`: WorksheetProtectionChanged
  
  /**
    * Gets the ID of the worksheet in which the protection status is changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var worksheetId: String
}
object WorksheetProtectionChangedEventArgs {
  
  inline def apply(
    allowEditRangesChanged: Boolean,
    isProtected: Boolean,
    protectionOptionsChanged: Boolean,
    sheetPasswordChanged: Boolean,
    source: EventSource | Local | Remote,
    worksheetId: String
  ): WorksheetProtectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(allowEditRangesChanged = allowEditRangesChanged.asInstanceOf[js.Any], isProtected = isProtected.asInstanceOf[js.Any], protectionOptionsChanged = protectionOptionsChanged.asInstanceOf[js.Any], sheetPasswordChanged = sheetPasswordChanged.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorksheetProtectionChanged")
    __obj.asInstanceOf[WorksheetProtectionChangedEventArgs]
  }
  
  extension [Self <: WorksheetProtectionChangedEventArgs](x: Self) {
    
    inline def setAllowEditRangesChanged(value: Boolean): Self = StObject.set(x, "allowEditRangesChanged", value.asInstanceOf[js.Any])
    
    inline def setIsProtected(value: Boolean): Self = StObject.set(x, "isProtected", value.asInstanceOf[js.Any])
    
    inline def setProtectionOptionsChanged(value: Boolean): Self = StObject.set(x, "protectionOptionsChanged", value.asInstanceOf[js.Any])
    
    inline def setSheetPasswordChanged(value: Boolean): Self = StObject.set(x, "sheetPasswordChanged", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorksheetProtectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
