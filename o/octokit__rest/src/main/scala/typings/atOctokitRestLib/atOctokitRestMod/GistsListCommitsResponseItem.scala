package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListCommitsResponseItem extends js.Object {
  var change_status: GistsListCommitsResponseItemChangeStatus
  var committed_at: java.lang.String
  var url: java.lang.String
  var user: GistsListCommitsResponseItemUser
  var version: java.lang.String
}

object GistsListCommitsResponseItem {
  @scala.inline
  def apply(
    change_status: GistsListCommitsResponseItemChangeStatus,
    committed_at: java.lang.String,
    url: java.lang.String,
    user: GistsListCommitsResponseItemUser,
    version: java.lang.String
  ): GistsListCommitsResponseItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsListCommitsResponseItem]
  }
}

