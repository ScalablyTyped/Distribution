package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Downloadurl
import typings.octokitTypes.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileContentsResponseData extends js.Object {
  var commit: Tree
  var content: Downloadurl
}

object ReposCreateOrUpdateFileContentsResponseData {
  @scala.inline
  def apply(commit: Tree, content: Downloadurl): ReposCreateOrUpdateFileContentsResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsResponseData]
  }
}

