package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  /**
    * Uninstalls a GitHub App on a user, organization, or business account. If you prefer to temporarily suspend an app's access to your account's resources, then we recommend the "[Suspend an app installation](https://docs.github.com/rest/reference/apps/#suspend-an-app-installation)" endpoint.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var delete: Responses236
  
  /**
    * Enables an authenticated GitHub App to find an installation's information using the installation id.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPath234
}
object Delete {
  
  inline def apply(delete: Responses236, get: ParametersPath234): Delete = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setDelete(value: Responses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath234): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
