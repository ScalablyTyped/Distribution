package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters165Responses200Content65 extends StObject {
  
  /**
    * Get allowed actions and reusable workflows for a repository
    * @description Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var get: Parameters165Responses200Content65
  
  /**
    * Set allowed actions and reusable workflows for a repository
    * @description Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var put: Parameters165RequestBody
}
object GetParameters165Responses200Content65 {
  
  inline def apply(get: Parameters165Responses200Content65, put: Parameters165RequestBody): GetParameters165Responses200Content65 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters165Responses200Content65]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters165Responses200Content65] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters165Responses200Content65): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters165RequestBody): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
