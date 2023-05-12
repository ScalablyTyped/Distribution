package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryResolution extends StObject {
  
  /**
    * List secret scanning alerts for an organization
    * @description Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: ParametersQueryResolution
}
object GetParametersQueryResolution {
  
  inline def apply(get: ParametersQueryResolution): GetParametersQueryResolution = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryResolution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryResolution] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryResolution): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
