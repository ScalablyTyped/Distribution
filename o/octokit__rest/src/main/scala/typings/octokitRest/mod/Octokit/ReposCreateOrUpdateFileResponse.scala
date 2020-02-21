package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponse extends js.Object {
  var commit: ReposCreateOrUpdateFileResponseCommit
  var content: ReposCreateOrUpdateFileResponseContent
}

object ReposCreateOrUpdateFileResponse {
  @scala.inline
  def apply(commit: ReposCreateOrUpdateFileResponseCommit, content: ReposCreateOrUpdateFileResponseContent): ReposCreateOrUpdateFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponse]
  }
}

