package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponse extends js.Object {
  var commit: ReposCreateFileResponseCommit
  var content: ReposCreateFileResponseContent
}

object ReposCreateFileResponse {
  @scala.inline
  def apply(commit: ReposCreateFileResponseCommit, content: ReposCreateFileResponseContent): ReposCreateFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateFileResponse]
  }
}

