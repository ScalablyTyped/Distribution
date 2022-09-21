package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathChecksuiteid extends StObject {
  
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  var get: ParametersPathChecksuiteid
}
object GetParametersPathChecksuiteid {
  
  inline def apply(get: ParametersPathChecksuiteid): GetParametersPathChecksuiteid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathChecksuiteid]
  }
  
  extension [Self <: GetParametersPathChecksuiteid](x: Self) {
    
    inline def setGet(value: ParametersPathChecksuiteid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
