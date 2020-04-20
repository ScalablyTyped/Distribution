package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateRefParams extends js.Object {
  var owner: String
  /**
    * The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at least two slashes, it will be rejected.
    */
  var ref: String
  var repo: String
  /**
    * The SHA1 value for this reference.
    */
  var sha: String
}

object GitCreateRefParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, sha: String): GitCreateRefParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateRefParams]
  }
}

