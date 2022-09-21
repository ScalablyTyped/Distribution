package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbookProtection.toJSON()`. */
trait WorkbookProtectionData extends StObject {
  
  /**
    * Specifies if the workbook is protected.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object WorkbookProtectionData {
  
  inline def apply(): WorkbookProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProtectionData]
  }
  
  extension [Self <: WorkbookProtectionData](x: Self) {
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
