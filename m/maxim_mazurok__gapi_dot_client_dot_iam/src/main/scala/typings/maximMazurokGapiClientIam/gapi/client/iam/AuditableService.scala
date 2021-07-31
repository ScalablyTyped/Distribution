package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditableService extends StObject {
  
  /** Public name of the service. For example, the service name for Cloud IAM is 'iam.googleapis.com'. */
  var name: js.UndefOr[String] = js.undefined
}
object AuditableService {
  
  @scala.inline
  def apply(): AuditableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditableService]
  }
  
  @scala.inline
  implicit class AuditableServiceMutableBuilder[Self <: AuditableService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
