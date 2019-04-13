package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListTagsResponseItem extends js.Object {
  var commit: ReposListTagsResponseItemCommit
  var name: java.lang.String
  var tarball_url: java.lang.String
  var zipball_url: java.lang.String
}

object ReposListTagsResponseItem {
  @scala.inline
  def apply(
    commit: ReposListTagsResponseItemCommit,
    name: java.lang.String,
    tarball_url: java.lang.String,
    zipball_url: java.lang.String
  ): ReposListTagsResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit, name = name, tarball_url = tarball_url, zipball_url = zipball_url)
  
    __obj.asInstanceOf[ReposListTagsResponseItem]
  }
}

