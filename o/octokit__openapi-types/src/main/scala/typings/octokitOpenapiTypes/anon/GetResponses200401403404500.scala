package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200401403404500 extends StObject {
  
  /**
    * List the repositories that have been granted the ability to use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  var get: Responses200401403404500
  
  /**
    * Select the repositories that will use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  var put: Responses368
}
object GetResponses200401403404500 {
  
  inline def apply(get: Responses200401403404500, put: Responses368): GetResponses200401403404500 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200401403404500]
  }
  
  extension [Self <: GetResponses200401403404500](x: Self) {
    
    inline def setGet(value: Responses200401403404500): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses368): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
