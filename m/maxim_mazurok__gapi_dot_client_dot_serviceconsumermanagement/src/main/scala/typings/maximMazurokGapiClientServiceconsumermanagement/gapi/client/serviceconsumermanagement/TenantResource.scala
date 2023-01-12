package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantResource extends StObject {
  
  /** Output only. @OutputOnly Identifier of the tenant resource. For cloud projects, it is in the form 'projects/{number}'. For example 'projects/123456'. */
  var resource: js.UndefOr[String] = js.undefined
  
  /** Status of tenant resource. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Unique per single tenancy unit. */
  var tag: js.UndefOr[String] = js.undefined
}
object TenantResource {
  
  inline def apply(): TenantResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TenantResource] (val x: Self) extends AnyVal {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
