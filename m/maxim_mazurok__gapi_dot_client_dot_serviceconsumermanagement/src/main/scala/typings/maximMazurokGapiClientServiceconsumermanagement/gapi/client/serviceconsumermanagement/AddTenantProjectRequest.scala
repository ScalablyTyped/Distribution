package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTenantProjectRequest extends StObject {
  
  /** Configuration of the new tenant project to be added to tenancy unit resources. */
  var projectConfig: js.UndefOr[TenantProjectConfig] = js.undefined
  
  /** Required. Tag of the added project. Must be less than 128 characters. Required. */
  var tag: js.UndefOr[String] = js.undefined
}
object AddTenantProjectRequest {
  
  @scala.inline
  def apply(): AddTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTenantProjectRequest]
  }
  
  @scala.inline
  implicit class AddTenantProjectRequestMutableBuilder[Self <: AddTenantProjectRequest] (val x: Self) extends AnyVal {
    
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
