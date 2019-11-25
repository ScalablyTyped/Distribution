package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponse extends js.Object {
  var commit: ReposDeleteFileResponseCommit
  var content: Null
}

object ReposDeleteFileResponse {
  @scala.inline
  def apply(commit: ReposDeleteFileResponseCommit, content: Null): ReposDeleteFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteFileResponse]
  }
}

