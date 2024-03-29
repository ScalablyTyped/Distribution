package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses400401 extends StObject {
  
  /**
    * List devcontainer configurations in a repository for the authenticated user
    * @description Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files
    * specify launchpoint configurations for codespaces created within the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  var get: Responses400401
}
object GetResponses400401 {
  
  inline def apply(get: Responses400401): GetResponses400401 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses400401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses400401] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses400401): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
