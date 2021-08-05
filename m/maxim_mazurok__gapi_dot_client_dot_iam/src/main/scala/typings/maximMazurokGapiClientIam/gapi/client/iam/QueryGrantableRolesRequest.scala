package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryGrantableRolesRequest extends StObject {
  
  /**
    * Required. The full resource name to query from the list of grantable roles. The name follows the Google Cloud Platform resource format. For example, a Cloud Platform project with id
    * `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
  
  /** Optional limit on the number of roles to include in the response. The default is 300, and the maximum is 1,000. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** Optional pagination token returned in an earlier QueryGrantableRolesResponse. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
}
object QueryGrantableRolesRequest {
  
  inline def apply(): QueryGrantableRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryGrantableRolesRequest]
  }
  
  extension [Self <: QueryGrantableRolesRequest](x: Self) {
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
