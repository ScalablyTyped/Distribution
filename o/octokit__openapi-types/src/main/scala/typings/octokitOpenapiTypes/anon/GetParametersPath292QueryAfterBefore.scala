package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292QueryAfterBefore extends StObject {
  
  /**
    * Lists secret scanning alerts for an eligible repository, from newest to oldest.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: ParametersPath292QueryAfterBefore
}
object GetParametersPath292QueryAfterBefore {
  
  inline def apply(get: ParametersPath292QueryAfterBefore): GetParametersPath292QueryAfterBefore = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292QueryAfterBefore]
  }
  
  extension [Self <: GetParametersPath292QueryAfterBefore](x: Self) {
    
    inline def setGet(value: ParametersPath292QueryAfterBefore): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
