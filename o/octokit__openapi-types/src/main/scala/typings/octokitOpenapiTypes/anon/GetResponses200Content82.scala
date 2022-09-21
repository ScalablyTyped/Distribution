package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content82 extends StObject {
  
  /**
    * **Note**: This operation is in beta and subject to change.
    *
    * Lists the fine-grained permissions available for an organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organizaiton and must use an access token with `admin:org repo` scope.
    * GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.
    */
  var get: Responses200Content82
}
object GetResponses200Content82 {
  
  inline def apply(get: Responses200Content82): GetResponses200Content82 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content82]
  }
  
  extension [Self <: GetResponses200Content82](x: Self) {
    
    inline def setGet(value: Responses200Content82): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
