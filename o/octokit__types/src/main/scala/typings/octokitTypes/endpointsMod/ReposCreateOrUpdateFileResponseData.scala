package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Downloadurl
import typings.octokitTypes.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseData extends js.Object {
  var commit: Tree
  var content: Downloadurl
}

object ReposCreateOrUpdateFileResponseData {
  @scala.inline
  def apply(commit: Tree, content: Downloadurl): ReposCreateOrUpdateFileResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseData]
  }
}

