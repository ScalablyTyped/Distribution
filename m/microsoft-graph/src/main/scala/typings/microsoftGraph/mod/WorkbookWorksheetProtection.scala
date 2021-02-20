package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookWorksheetProtection extends Entity {
  
  // Sheet protection options. Read-only.
  var options: js.UndefOr[NullableOption[WorkbookWorksheetProtectionOptions]] = js.native
  
  // Indicates if the worksheet is protected. Read-only.
  var `protected`: js.UndefOr[Boolean] = js.native
}
object WorkbookWorksheetProtection {
  
  @scala.inline
  def apply(): WorkbookWorksheetProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtection]
  }
  
  @scala.inline
  implicit class WorkbookWorksheetProtectionMutableBuilder[Self <: WorkbookWorksheetProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: NullableOption[WorkbookWorksheetProtectionOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
