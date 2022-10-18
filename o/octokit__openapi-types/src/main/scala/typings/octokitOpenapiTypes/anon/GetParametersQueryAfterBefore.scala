package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAfterBefore extends StObject {
  
  /**
    * Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: ParametersQueryAfterBefore
}
object GetParametersQueryAfterBefore {
  
  inline def apply(get: ParametersQueryAfterBefore): GetParametersQueryAfterBefore = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAfterBefore]
  }
  
  extension [Self <: GetParametersQueryAfterBefore](x: Self) {
    
    inline def setGet(value: ParametersQueryAfterBefore): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
