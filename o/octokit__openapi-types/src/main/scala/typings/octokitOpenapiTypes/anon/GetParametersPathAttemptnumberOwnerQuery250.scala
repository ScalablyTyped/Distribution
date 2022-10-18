package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAttemptnumberOwnerQuery250 extends StObject {
  
  /** Lists jobs for a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters). */
  var get: ParametersPathAttemptnumberOwnerQuery250
}
object GetParametersPathAttemptnumberOwnerQuery250 {
  
  inline def apply(get: ParametersPathAttemptnumberOwnerQuery250): GetParametersPathAttemptnumberOwnerQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAttemptnumberOwnerQuery250]
  }
  
  extension [Self <: GetParametersPathAttemptnumberOwnerQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathAttemptnumberOwnerQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
