package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitResponseParentsItem extends js.Object {
  var sha: String
  var url: String
}

object GitGetCommitResponseParentsItem {
  @scala.inline
  def apply(sha: String, url: String): GitGetCommitResponseParentsItem = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitGetCommitResponseParentsItem]
  }
}

