package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAuditableServicesRequest extends StObject {
  
  /**
    * Required. The full resource name to query from the list of auditable services. The name follows the Google Cloud Platform resource format. For example, a Cloud Platform project with
    * id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
}
object QueryAuditableServicesRequest {
  
  @scala.inline
  def apply(): QueryAuditableServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAuditableServicesRequest]
  }
  
  @scala.inline
  implicit class QueryAuditableServicesRequestMutableBuilder[Self <: QueryAuditableServicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
