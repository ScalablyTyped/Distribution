package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommitParentsItem extends js.Object {
  var html_url: String
  var sha: String
  var url: String
}

object ReposDeleteFileResponseCommitParentsItem {
  @scala.inline
  def apply(html_url: String, sha: String, url: String): ReposDeleteFileResponseCommitParentsItem = {
    val __obj = js.Dynamic.literal(html_url = html_url, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommitParentsItem]
  }
}

