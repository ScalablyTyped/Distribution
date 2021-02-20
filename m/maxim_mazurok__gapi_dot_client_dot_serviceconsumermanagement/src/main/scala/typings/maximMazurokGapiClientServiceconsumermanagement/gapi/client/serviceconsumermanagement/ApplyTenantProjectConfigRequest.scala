package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyTenantProjectConfigRequest extends StObject {
  
  /** Configuration that should be applied to the existing tenant project. */
  var projectConfig: js.UndefOr[TenantProjectConfig] = js.native
  
  /** Required. Tag of the project. Must be less than 128 characters. Required. */
  var tag: js.UndefOr[String] = js.native
}
object ApplyTenantProjectConfigRequest {
  
  @scala.inline
  def apply(): ApplyTenantProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyTenantProjectConfigRequest]
  }
  
  @scala.inline
  implicit class ApplyTenantProjectConfigRequestMutableBuilder[Self <: ApplyTenantProjectConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectConfig(value: TenantProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
