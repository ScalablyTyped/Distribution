package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachTenantProjectRequest extends StObject {
  
  /** When attaching an external project, this is in the format of `projects/{project_number}`. */
  var externalResource: js.UndefOr[String] = js.undefined
  
  /**
    * When attaching a reserved project already in tenancy units, this is the tag of a tenant resource under the tenancy unit for the managed service's service producer project. The
    * reserved tenant resource must be in an active state.
    */
  var reservedResource: js.UndefOr[String] = js.undefined
  
  /** Required. Tag of the tenant resource after attachment. Must be less than 128 characters. Required. */
  var tag: js.UndefOr[String] = js.undefined
}
object AttachTenantProjectRequest {
  
  inline def apply(): AttachTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachTenantProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachTenantProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setExternalResource(value: String): Self = StObject.set(x, "externalResource", value.asInstanceOf[js.Any])
    
    inline def setExternalResourceUndefined: Self = StObject.set(x, "externalResource", js.undefined)
    
    inline def setReservedResource(value: String): Self = StObject.set(x, "reservedResource", value.asInstanceOf[js.Any])
    
    inline def setReservedResourceUndefined: Self = StObject.set(x, "reservedResource", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
