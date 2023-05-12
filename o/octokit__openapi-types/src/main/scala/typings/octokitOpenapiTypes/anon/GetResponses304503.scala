package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses304503 extends StObject {
  
  /**
    * Get a secret scanning alert
    * @description Gets a single secret scanning alert detected in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: Responses304503
  
  /**
    * Update a secret scanning alert
    * @description Updates the status of a secret scanning alert in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` write permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonResolutioncomment
}
object GetResponses304503 {
  
  inline def apply(get: Responses304503, patch: RequestBodyContentApplicationjsonResolutioncomment): GetResponses304503 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses304503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses304503] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses304503): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonResolutioncomment): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
