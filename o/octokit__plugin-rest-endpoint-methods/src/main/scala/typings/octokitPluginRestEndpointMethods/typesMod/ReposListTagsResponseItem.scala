package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListTagsResponseItem extends js.Object {
  var commit: ReposListTagsResponseItemCommit
  var name: String
  var tarball_url: String
  var zipball_url: String
}

object ReposListTagsResponseItem {
  @scala.inline
  def apply(commit: ReposListTagsResponseItemCommit, name: String, tarball_url: String, zipball_url: String): ReposListTagsResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListTagsResponseItem]
  }
}

