package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAfter extends StObject {
  
  /**
    * List Dependabot alerts for an organization
    * @description Lists Dependabot alerts for an organization.
    *
    * To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    *
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: ParametersQueryAfter
}
object GetParametersQueryAfter {
  
  inline def apply(get: ParametersQueryAfter): GetParametersQueryAfter = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAfter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryAfter] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryAfter): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
