package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAuditableServicesResponse extends StObject {
  
  /** The auditable services for a resource. */
  var services: js.UndefOr[js.Array[AuditableService]] = js.undefined
}
object QueryAuditableServicesResponse {
  
  inline def apply(): QueryAuditableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAuditableServicesResponse]
  }
  
  extension [Self <: QueryAuditableServicesResponse](x: Self) {
    
    inline def setServices(value: js.Array[AuditableService]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: AuditableService*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
