package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Downloadurl
import typings.octokitTypes.anon.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponse201Data extends js.Object {
  var commit: Tree
  var content: Downloadurl
}

object ReposCreateOrUpdateFileResponse201Data {
  @scala.inline
  def apply(commit: Tree, content: Downloadurl): ReposCreateOrUpdateFileResponse201Data = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponse201Data]
  }
}

