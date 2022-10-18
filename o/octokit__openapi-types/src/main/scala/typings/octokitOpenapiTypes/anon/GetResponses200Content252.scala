package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content252 extends StObject {
  
  /**
    * Gets the selected actions and reusable workflows that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var get: Responses200Content252
  
  /**
    * Sets the actions and reusable workflows that are allowed in an enterprise. To use this endpoint, the enterprise permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    */
  var put: RequestBodyContent252
}
object GetResponses200Content252 {
  
  inline def apply(get: Responses200Content252, put: RequestBodyContent252): GetResponses200Content252 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content252]
  }
  
  extension [Self <: GetResponses200Content252](x: Self) {
    
    inline def setGet(value: Responses200Content252): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent252): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
