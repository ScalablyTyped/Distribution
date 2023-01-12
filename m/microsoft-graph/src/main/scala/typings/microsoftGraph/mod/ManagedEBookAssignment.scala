package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedEBookAssignment
  extends StObject
     with Entity {
  
  // The install intent for eBook. Possible values are: available, required, uninstall, availableWithoutEnrollment.
  var installIntent: js.UndefOr[InstallIntent] = js.undefined
  
  // The assignment target for eBook.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object ManagedEBookAssignment {
  
  inline def apply(): ManagedEBookAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedEBookAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedEBookAssignment] (val x: Self) extends AnyVal {
    
    inline def setInstallIntent(value: InstallIntent): Self = StObject.set(x, "installIntent", value.asInstanceOf[js.Any])
    
    inline def setInstallIntentUndefined: Self = StObject.set(x, "installIntent", js.undefined)
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
