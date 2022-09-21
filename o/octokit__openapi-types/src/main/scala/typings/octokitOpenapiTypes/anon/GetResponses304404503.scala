package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses304404503 extends StObject {
  
  /**
    * Gets a single secret scanning alert detected in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: Responses304404503
  
  /**
    * Updates the status of a secret scanning alert in an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` write permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonResolutionState
}
object GetResponses304404503 {
  
  inline def apply(get: Responses304404503, patch: RequestBodyContentApplicationjsonResolutionState): GetResponses304404503 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses304404503]
  }
  
  extension [Self <: GetResponses304404503](x: Self) {
    
    inline def setGet(value: Responses304404503): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonResolutionState): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
