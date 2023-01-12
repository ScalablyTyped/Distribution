package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTenantProjectRequest extends StObject {
  
  /** Required. Tag of the resource within the tenancy unit. */
  var tag: js.UndefOr[String] = js.undefined
}
object RemoveTenantProjectRequest {
  
  inline def apply(): RemoveTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTenantProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTenantProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
