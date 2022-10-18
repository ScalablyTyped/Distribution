package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerRefRepoQuery250 extends StObject {
  
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  var get: ParametersPathOwnerRefRepoQuery250
}
object GetParametersPathOwnerRefRepoQuery250 {
  
  inline def apply(get: ParametersPathOwnerRefRepoQuery250): GetParametersPathOwnerRefRepoQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerRefRepoQuery250]
  }
  
  extension [Self <: GetParametersPathOwnerRefRepoQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerRefRepoQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
