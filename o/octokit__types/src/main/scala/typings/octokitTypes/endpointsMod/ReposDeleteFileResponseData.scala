package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseData extends js.Object {
  var commit: Tree
  var content: String
}

object ReposDeleteFileResponseData {
  @scala.inline
  def apply(commit: Tree, content: String): ReposDeleteFileResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileResponseData]
  }
}

