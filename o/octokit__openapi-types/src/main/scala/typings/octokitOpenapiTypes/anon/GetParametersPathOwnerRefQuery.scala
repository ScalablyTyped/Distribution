package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerRefQuery extends StObject {
  
  /**
    * List check runs for a Git reference
    * @description **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
    *
    * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.
    */
  var get: ParametersPathOwnerRefQuery
}
object GetParametersPathOwnerRefQuery {
  
  inline def apply(get: ParametersPathOwnerRefQuery): GetParametersPathOwnerRefQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerRefQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerRefQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerRefQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
