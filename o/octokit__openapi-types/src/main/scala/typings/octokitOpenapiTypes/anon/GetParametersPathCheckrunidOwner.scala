package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCheckrunidOwner extends StObject {
  
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  var get: ParametersPathCheckrunidOwner
  
  /**
    * **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.
    */
  var patch: Responses200Content446
}
object GetParametersPathCheckrunidOwner {
  
  inline def apply(get: ParametersPathCheckrunidOwner, patch: Responses200Content446): GetParametersPathCheckrunidOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCheckrunidOwner]
  }
  
  extension [Self <: GetParametersPathCheckrunidOwner](x: Self) {
    
    inline def setGet(value: ParametersPathCheckrunidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content446): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
