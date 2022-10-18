package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses657 extends StObject {
  
  /**
    * List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.
    */
  var get: Responses657
}
object GetResponses657 {
  
  inline def apply(get: Responses657): GetResponses657 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses657]
  }
  
  extension [Self <: GetResponses657](x: Self) {
    
    inline def setGet(value: Responses657): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
