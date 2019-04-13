package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommitParentsItem extends js.Object {
  var html_url: java.lang.String
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposCreateFileResponseCommitParentsItem {
  @scala.inline
  def apply(html_url: java.lang.String, sha: java.lang.String, url: java.lang.String): ReposCreateFileResponseCommitParentsItem = {
    val __obj = js.Dynamic.literal(html_url = html_url, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommitParentsItem]
  }
}

