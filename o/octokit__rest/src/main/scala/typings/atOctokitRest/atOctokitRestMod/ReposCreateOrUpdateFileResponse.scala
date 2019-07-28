package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(commit = commit, content = content)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponse]
  }
}

