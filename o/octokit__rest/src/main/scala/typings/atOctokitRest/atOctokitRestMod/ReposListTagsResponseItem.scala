package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(commit = commit, name = name, tarball_url = tarball_url, zipball_url = zipball_url)
  
    __obj.asInstanceOf[ReposListTagsResponseItem]
  }
}

