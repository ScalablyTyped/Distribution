package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponse extends js.Object {
  var commit: ReposUpdateFileResponseCommit
  var content: ReposUpdateFileResponseContent
}

object ReposUpdateFileResponse {
  @scala.inline
  def apply(commit: ReposUpdateFileResponseCommit, content: ReposUpdateFileResponseContent): ReposUpdateFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit, content = content)
  
    __obj.asInstanceOf[ReposUpdateFileResponse]
  }
}

