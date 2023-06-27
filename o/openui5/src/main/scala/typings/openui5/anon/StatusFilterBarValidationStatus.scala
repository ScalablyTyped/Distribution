package typings.openui5.anon

import typings.openui5.sapUiMdcEnumsFilterBarValidationStatusMod.FilterBarValidationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusFilterBarValidationStatus extends StObject {
  
  /**
    * Status of the validation as returned via {@link sap.ui.mdc.filterbar.FilterBarBase#checkValidationState checkValidationState}
    */
  var status: FilterBarValidationStatus
}
object StatusFilterBarValidationStatus {
  
  inline def apply(status: FilterBarValidationStatus): StatusFilterBarValidationStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusFilterBarValidationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusFilterBarValidationStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: FilterBarValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
