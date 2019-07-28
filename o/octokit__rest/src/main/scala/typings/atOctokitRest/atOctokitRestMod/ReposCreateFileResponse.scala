package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(commit = commit, content = content)
  
    __obj.asInstanceOf[ReposCreateFileResponse]
  }
}

