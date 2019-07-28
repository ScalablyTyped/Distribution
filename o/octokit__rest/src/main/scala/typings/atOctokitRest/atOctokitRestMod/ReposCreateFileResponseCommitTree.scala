package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommitTree]
  }
}

