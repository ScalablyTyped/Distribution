package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbookProtection.toJSON()`. */
trait WorkbookProtectionData extends StObject {
  
  /**
    *
    * Specifies if the workbook is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object WorkbookProtectionData {
  
  @scala.inline
  def apply(): WorkbookProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProtectionData]
  }
  
  @scala.inline
  implicit class WorkbookProtectionDataMutableBuilder[Self <: WorkbookProtectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
