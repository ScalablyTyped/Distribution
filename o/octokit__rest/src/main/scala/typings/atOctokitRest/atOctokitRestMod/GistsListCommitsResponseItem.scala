package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsListCommitsResponseItem extends js.Object {
  var change_status: GistsListCommitsResponseItemChangeStatus
  var committed_at: String
  var url: String
  var user: GistsListCommitsResponseItemUser
  var version: String
}

object GistsListCommitsResponseItem {
  @scala.inline
  def apply(
    change_status: GistsListCommitsResponseItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsListCommitsResponseItemUser,
    version: String
  ): GistsListCommitsResponseItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsListCommitsResponseItem]
  }
}

