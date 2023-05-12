package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathUsernameQueryPage extends StObject {
  
  /**
    * List codespaces for a user in organization
    * @description Lists the codespaces that a member of an organization has for repositories in that organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathUsernameQueryPage
}
object GetParametersPathUsernameQueryPage {
  
  inline def apply(get: ParametersPathUsernameQueryPage): GetParametersPathUsernameQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathUsernameQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathUsernameQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathUsernameQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
