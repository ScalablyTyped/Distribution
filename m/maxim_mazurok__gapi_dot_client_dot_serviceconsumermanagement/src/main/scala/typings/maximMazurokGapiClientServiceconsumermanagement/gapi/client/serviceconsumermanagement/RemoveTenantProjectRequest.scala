package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTenantProjectRequest extends StObject {
  
  /** Required. Tag of the resource within the tenancy unit. */
  var tag: js.UndefOr[String] = js.native
}
object RemoveTenantProjectRequest {
  
  @scala.inline
  def apply(): RemoveTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTenantProjectRequest]
  }
  
  @scala.inline
  implicit class RemoveTenantProjectRequestMutableBuilder[Self <: RemoveTenantProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
