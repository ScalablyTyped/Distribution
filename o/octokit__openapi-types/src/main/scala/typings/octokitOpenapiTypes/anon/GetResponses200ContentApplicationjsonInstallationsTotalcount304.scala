package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonInstallationsTotalcount304 extends StObject {
  
  /**
    * Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You can find the permissions for the installation under the `permissions` key.
    */
  var get: Responses200ContentApplicationjsonInstallationsTotalcount304
}
object GetResponses200ContentApplicationjsonInstallationsTotalcount304 {
  
  inline def apply(get: Responses200ContentApplicationjsonInstallationsTotalcount304): GetResponses200ContentApplicationjsonInstallationsTotalcount304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonInstallationsTotalcount304]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonInstallationsTotalcount304](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonInstallationsTotalcount304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
