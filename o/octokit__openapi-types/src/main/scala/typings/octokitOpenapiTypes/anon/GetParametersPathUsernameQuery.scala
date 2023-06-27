package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathUsernameQuery extends StObject {
  
  /**
    * List codespaces for a user in organization
    * @description Lists the codespaces that a member of an organization has for repositories in that organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathUsernameQuery
}
object GetParametersPathUsernameQuery {
  
  inline def apply(get: ParametersPathUsernameQuery): GetParametersPathUsernameQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathUsernameQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
