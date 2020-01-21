package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposCreateFileResponseCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposCreateFileResponseCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateFileResponseCommitTree]
  }
}

