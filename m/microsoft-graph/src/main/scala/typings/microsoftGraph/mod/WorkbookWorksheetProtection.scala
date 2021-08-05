package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookWorksheetProtection
  extends StObject
     with Entity {
  
  // Sheet protection options. Read-only.
  var options: js.UndefOr[NullableOption[WorkbookWorksheetProtectionOptions]] = js.undefined
  
  // Indicates if the worksheet is protected. Read-only.
  var `protected`: js.UndefOr[Boolean] = js.undefined
}
object WorkbookWorksheetProtection {
  
  inline def apply(): WorkbookWorksheetProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtection]
  }
  
  extension [Self <: WorkbookWorksheetProtection](x: Self) {
    
    inline def setOptions(value: NullableOption[WorkbookWorksheetProtectionOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
