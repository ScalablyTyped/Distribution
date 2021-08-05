package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditableService extends StObject {
  
  /** Public name of the service. For example, the service name for Cloud IAM is 'iam.googleapis.com'. */
  var name: js.UndefOr[String] = js.undefined
}
object AuditableService {
  
  inline def apply(): AuditableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditableService]
  }
  
  extension [Self <: AuditableService](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
