package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListTagsResponseItemCommit extends js.Object {
  var sha: String
  var url: String
}

object ReposListTagsResponseItemCommit {
  @scala.inline
  def apply(sha: String, url: String): ReposListTagsResponseItemCommit = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposListTagsResponseItemCommit]
  }
}

