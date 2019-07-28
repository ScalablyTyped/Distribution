package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagParams extends js.Object {
  var owner: String
  var repo: String
  var tag_sha: String
}

object GitGetTagParams {
  @scala.inline
  def apply(owner: String, repo: String, tag_sha: String): GitGetTagParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag_sha = tag_sha)
  
    __obj.asInstanceOf[GitGetTagParams]
  }
}

