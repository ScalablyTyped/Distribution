package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses384 extends StObject {
  
  /**
    * List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.
    */
  var get: Responses384
}
object GetResponses384 {
  
  inline def apply(get: Responses384): GetResponses384 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses384]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses384] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses384): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
