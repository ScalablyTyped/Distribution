package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureManagementSettingsRequest extends StObject {
  
  /** Fields of the `ManagementSettings` to update. */
  var managementSettings: js.UndefOr[ManagementSettings] = js.undefined
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the transfer lock is being updated, the `update_mask` would be
    * `"transfer_lock_state"`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ConfigureManagementSettingsRequest {
  
  inline def apply(): ConfigureManagementSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureManagementSettingsRequest]
  }
  
  extension [Self <: ConfigureManagementSettingsRequest](x: Self) {
    
    inline def setManagementSettings(value: ManagementSettings): Self = StObject.set(x, "managementSettings", value.asInstanceOf[js.Any])
    
    inline def setManagementSettingsUndefined: Self = StObject.set(x, "managementSettings", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
