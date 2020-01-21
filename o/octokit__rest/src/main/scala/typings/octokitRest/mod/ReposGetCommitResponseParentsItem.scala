package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseParentsItem extends js.Object {
  var sha: String
  var url: String
}

object ReposGetCommitResponseParentsItem {
  @scala.inline
  def apply(sha: String, url: String): ReposGetCommitResponseParentsItem = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitResponseParentsItem]
  }
}

