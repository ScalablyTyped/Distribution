package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateRefParams extends js.Object {
  var owner: java.lang.String
  /**
    * The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at least two slashes, it will be rejected.
    */
  var ref: java.lang.String
  var repo: java.lang.String
  /**
    * The SHA1 value for this reference.
    */
  var sha: java.lang.String
}

object GitCreateRefParams {
  @scala.inline
  def apply(owner: java.lang.String, ref: java.lang.String, repo: java.lang.String, sha: java.lang.String): GitCreateRefParams = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[GitCreateRefParams]
  }
}

