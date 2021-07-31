package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeleteTenantProjectRequest extends StObject {
  
  /** Required. Tag of the resource within the tenancy unit. */
  var tag: js.UndefOr[String] = js.undefined
}
object UndeleteTenantProjectRequest {
  
  @scala.inline
  def apply(): UndeleteTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteTenantProjectRequest]
  }
  
  @scala.inline
  implicit class UndeleteTenantProjectRequestMutableBuilder[Self <: UndeleteTenantProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
