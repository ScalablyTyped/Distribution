package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters141Responses200Content57 extends StObject {
  
  /**
    * Get allowed actions and reusable workflows for a repository
    * @description Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var get: Parameters141Responses200Content57
  
  /**
    * Set allowed actions and reusable workflows for a repository
    * @description Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  var put: Parameters141RequestBody
}
object GetParameters141Responses200Content57 {
  
  inline def apply(get: Parameters141Responses200Content57, put: Parameters141RequestBody): GetParameters141Responses200Content57 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters141Responses200Content57]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters141Responses200Content57] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters141Responses200Content57): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters141RequestBody): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
