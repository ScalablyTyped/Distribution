package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosLobAppProvisioningConfigurationAssignment
  extends StObject
     with Entity {
  
  // The target group assignment defined by the admin.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object IosLobAppProvisioningConfigurationAssignment {
  
  inline def apply(): IosLobAppProvisioningConfigurationAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosLobAppProvisioningConfigurationAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosLobAppProvisioningConfigurationAssignment] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
