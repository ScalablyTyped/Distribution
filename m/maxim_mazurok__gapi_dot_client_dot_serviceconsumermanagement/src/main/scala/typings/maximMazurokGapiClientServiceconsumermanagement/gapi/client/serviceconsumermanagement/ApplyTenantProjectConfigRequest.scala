package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyTenantProjectConfigRequest extends StObject {
  
  /** Configuration that should be applied to the existing tenant project. */
  var projectConfig: js.UndefOr[TenantProjectConfig] = js.undefined
  
  /** Required. Tag of the project. Must be less than 128 characters. Required. */
  var tag: js.UndefOr[String] = js.undefined
}
object ApplyTenantProjectConfigRequest {
  
  inline def apply(): ApplyTenantProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyTenantProjectConfigRequest]
  }
  
  extension [Self <: ApplyTenantProjectConfigRequest](x: Self) {
    
    inline def setProjectConfig(value: TenantProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
