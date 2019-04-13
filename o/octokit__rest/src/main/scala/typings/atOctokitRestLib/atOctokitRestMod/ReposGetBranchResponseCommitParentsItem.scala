package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitParentsItem extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposGetBranchResponseCommitParentsItem {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): ReposGetBranchResponseCommitParentsItem = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitParentsItem]
  }
}

