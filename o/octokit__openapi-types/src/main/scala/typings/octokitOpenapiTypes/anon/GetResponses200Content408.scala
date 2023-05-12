package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content408 extends StObject {
  
  /**
    * List teams for the authenticated user
    * @description List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://docs.github.com/apps/building-oauth-apps/). When using a fine-grained personal access token, the resource owner of the token [must be a single organization](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token#fine-grained-personal-access-tokens), and have at least read-only member organization permissions. The response payload only contains the teams from a single organization when using a fine-grained personal access token.
    */
  var get: Responses200Content408
}
object GetResponses200Content408 {
  
  inline def apply(get: Responses200Content408): GetResponses200Content408 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content408]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content408] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content408): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
