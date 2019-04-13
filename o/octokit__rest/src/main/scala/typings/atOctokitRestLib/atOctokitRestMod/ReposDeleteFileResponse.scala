package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponse extends js.Object {
  var commit: ReposDeleteFileResponseCommit
  var content: scala.Null
}

object ReposDeleteFileResponse {
  @scala.inline
  def apply(commit: ReposDeleteFileResponseCommit, content: scala.Null): ReposDeleteFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit, content = content)
  
    __obj.asInstanceOf[ReposDeleteFileResponse]
  }
}

