package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var tag_sha: java.lang.String
}

object GitGetTagParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, tag_sha: java.lang.String): GitGetTagParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag_sha = tag_sha)
  
    __obj.asInstanceOf[GitGetTagParams]
  }
}

