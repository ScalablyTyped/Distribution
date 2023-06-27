package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters256 extends StObject {
  
  /**
    * List check suites for a Git reference
    * @description **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.
    *
    * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.
    */
  var get: Parameters256
}
object GetParameters256 {
  
  inline def apply(get: Parameters256): GetParameters256 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters256]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters256] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters256): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
