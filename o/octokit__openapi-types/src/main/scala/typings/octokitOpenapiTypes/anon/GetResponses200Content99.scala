package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content99 extends StObject {
  
  /**
    * List repository teams
    * @description Lists the teams that have access to the specified repository and that are also visible to the authenticated user.
    *
    * For a public repository, a team is listed only if that team added the public repository explicitly.
    *
    * Personal access tokens require the following scopes:
    * * `public_repo` to call this endpoint on a public repository
    * * `repo` to call this endpoint on a private repository (this scope also includes public repositories)
    *
    * This endpoint is not compatible with fine-grained personal access tokens.
    */
  var get: Responses200Content99
}
object GetResponses200Content99 {
  
  inline def apply(get: Responses200Content99): GetResponses200Content99 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content99] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content99): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
