package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content651 extends StObject {
  
  /** List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://docs.github.com/apps/building-oauth-apps/). */
  var get: Responses200Content651
}
object GetResponses200Content651 {
  
  inline def apply(get: Responses200Content651): GetResponses200Content651 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content651]
  }
  
  extension [Self <: GetResponses200Content651](x: Self) {
    
    inline def setGet(value: Responses200Content651): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
