package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.WorksheetProtectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetProtection.toJSON()`. */
@js.native
trait WorksheetProtectionData extends StObject {
  
  /**
    *
    * Specifies the protection options for the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[WorksheetProtectionOptions] = js.native
  
  /**
    *
    * Specifies if the worksheet is protected.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[Boolean] = js.native
}
object WorksheetProtectionData {
  
  @scala.inline
  def apply(): WorksheetProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionData]
  }
  
  @scala.inline
  implicit class WorksheetProtectionDataMutableBuilder[Self <: WorksheetProtectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: WorksheetProtectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
