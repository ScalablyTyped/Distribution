package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content312 extends StObject {
  
  /**
    * Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Responses200Content312
  
  /**
    * Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * If the organization belongs to an enterprise that has set restrictive permissions at the enterprise level, such as `allowed_actions` to `selected` actions and reusable workflows, then you cannot override them for the organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: RequestBodyContentApplicationjson313
}
object GetResponses200Content312 {
  
  inline def apply(get: Responses200Content312, put: RequestBodyContentApplicationjson313): GetResponses200Content312 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content312]
  }
  
  extension [Self <: GetResponses200Content312](x: Self) {
    
    inline def setGet(value: Responses200Content312): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjson313): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
