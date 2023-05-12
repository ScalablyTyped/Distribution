package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonInstallations304 extends StObject {
  
  /**
    * List app installations accessible to the user access token
    * @description Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You can find the permissions for the installation under the `permissions` key.
    */
  var get: Responses200ContentApplicationjsonInstallations304
}
object GetResponses200ContentApplicationjsonInstallations304 {
  
  inline def apply(get: Responses200ContentApplicationjsonInstallations304): GetResponses200ContentApplicationjsonInstallations304 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonInstallations304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonInstallations304] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonInstallations304): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
