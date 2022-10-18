package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath234Query250 extends StObject {
  
  /**
    * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access for an installation.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The access the user has to each repository is included in the hash under the `permissions` key.
    */
  var get: ParametersPath234Query250
}
object GetParametersPath234Query250 {
  
  inline def apply(get: ParametersPath234Query250): GetParametersPath234Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath234Query250]
  }
  
  extension [Self <: GetParametersPath234Query250](x: Self) {
    
    inline def setGet(value: ParametersPath234Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
