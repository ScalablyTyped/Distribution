package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorkbookAutoSaveSettingChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the workbook's onAutoSaveSettingChanged event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait WorkbookAutoSaveSettingChangedEventArgs extends StObject {
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: WorkbookAutoSaveSettingChanged
}
object WorkbookAutoSaveSettingChangedEventArgs {
  
  inline def apply(): WorkbookAutoSaveSettingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WorkbookAutoSaveSettingChanged")
    __obj.asInstanceOf[WorkbookAutoSaveSettingChangedEventArgs]
  }
  
  extension [Self <: WorkbookAutoSaveSettingChangedEventArgs](x: Self) {
    
    inline def setType(value: WorkbookAutoSaveSettingChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
