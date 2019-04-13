package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
}

object ReposGetCommitParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, sha: java.lang.String): ReposGetCommitParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ReposGetCommitParams]
  }
}

