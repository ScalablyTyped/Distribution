package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAttemptnumberOwner extends StObject {
  
  /**
    * Gets a specific workflow run attempt. Anyone with read access to the repository
    * can use this endpoint. If the repository is private you must use an access token
    * with the `repo` scope. GitHub Apps must have the `actions:read` permission to
    * use this endpoint.
    */
  var get: ParametersPathAttemptnumberOwner
}
object GetParametersPathAttemptnumberOwner {
  
  inline def apply(get: ParametersPathAttemptnumberOwner): GetParametersPathAttemptnumberOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAttemptnumberOwner]
  }
  
  extension [Self <: GetParametersPathAttemptnumberOwner](x: Self) {
    
    inline def setGet(value: ParametersPathAttemptnumberOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
