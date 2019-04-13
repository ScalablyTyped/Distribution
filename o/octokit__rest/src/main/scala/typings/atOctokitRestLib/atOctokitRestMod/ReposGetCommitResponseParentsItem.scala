package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseParentsItem extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposGetCommitResponseParentsItem {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): ReposGetCommitResponseParentsItem = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposGetCommitResponseParentsItem]
  }
}

