package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content0 extends StObject {
  
  /**
    * Get the authenticated app
    * @description Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations for the authenticated app](https://docs.github.com/rest/reference/apps#list-installations-for-the-authenticated-app)" endpoint.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses200Content0
}
object GetResponses200Content0 {
  
  inline def apply(get: Responses200Content0): GetResponses200Content0 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content0] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content0): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
