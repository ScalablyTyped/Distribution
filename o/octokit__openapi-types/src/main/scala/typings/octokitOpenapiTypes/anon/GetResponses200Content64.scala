package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content64 extends StObject {
  
  /**
    * Get GitHub Actions permissions for an organization
    * @description Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Responses200Content64
  
  /**
    * Set GitHub Actions permissions for an organization
    * @description Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: RequestBodyContentApplicationjsonAllowedactions
}
object GetResponses200Content64 {
  
  inline def apply(get: Responses200Content64, put: RequestBodyContentApplicationjsonAllowedactions): GetResponses200Content64 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content64]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content64] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content64): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonAllowedactions): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
