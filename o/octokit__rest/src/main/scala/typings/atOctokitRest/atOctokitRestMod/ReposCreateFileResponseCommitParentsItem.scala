package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommitParentsItem extends js.Object {
  var html_url: String
  var sha: String
  var url: String
}

object ReposCreateFileResponseCommitParentsItem {
  @scala.inline
  def apply(html_url: String, sha: String, url: String): ReposCreateFileResponseCommitParentsItem = {
    val __obj = js.Dynamic.literal(html_url = html_url, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommitParentsItem]
  }
}

