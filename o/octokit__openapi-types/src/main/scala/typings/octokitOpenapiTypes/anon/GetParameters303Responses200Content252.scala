package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters303Responses200Content252 extends StObject {
  
  /**
    * Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).""
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Parameters303Responses200Content252
  
  /**
    * Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * If the organization belongs to an enterprise that has `selected` actions and reusable workflows set at the enterprise level, then you cannot override any of the enterprise's allowed actions and reusable workflows settings.
    *
    * To use the `patterns_allowed` setting for private repositories, the organization must belong to an enterprise. If the organization does not belong to an enterprise, then the `patterns_allowed` setting only applies to public repositories in the organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: Parameters303RequestBodyContent252
}
object GetParameters303Responses200Content252 {
  
  inline def apply(get: Parameters303Responses200Content252, put: Parameters303RequestBodyContent252): GetParameters303Responses200Content252 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters303Responses200Content252]
  }
  
  extension [Self <: GetParameters303Responses200Content252](x: Self) {
    
    inline def setGet(value: Parameters303Responses200Content252): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters303RequestBodyContent252): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
