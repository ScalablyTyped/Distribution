package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.WorksheetProtectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetProtection.toJSON()`. */
trait WorksheetProtectionData extends StObject {
  
  /**
    *
    * Specifies the protection options for the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[WorksheetProtectionOptions] = js.undefined
  
  /**
    *
    * Specifies if the worksheet is protected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object WorksheetProtectionData {
  
  inline def apply(): WorksheetProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionData]
  }
  
  extension [Self <: WorksheetProtectionData](x: Self) {
    
    inline def setOptions(value: WorksheetProtectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
