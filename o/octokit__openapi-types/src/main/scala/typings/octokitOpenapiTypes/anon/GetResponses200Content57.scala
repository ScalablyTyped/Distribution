package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content57 extends StObject {
  
  /**
    * Get allowed actions and reusable workflows for an organization
    * @description Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).""
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Responses200Content57
  
  /**
    * Set allowed actions and reusable workflows for an organization
    * @description Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: Parameters47RequestBody
}
object GetResponses200Content57 {
  
  inline def apply(get: Responses200Content57, put: Parameters47RequestBody): GetResponses200Content57 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content57]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content57] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content57): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters47RequestBody): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
