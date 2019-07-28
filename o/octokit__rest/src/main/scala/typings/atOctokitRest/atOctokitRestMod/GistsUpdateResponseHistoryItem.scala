package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseHistoryItem extends js.Object {
  var change_status: GistsUpdateResponseHistoryItemChangeStatus
  var committed_at: String
  var url: String
  var user: GistsUpdateResponseHistoryItemUser
  var version: String
}

object GistsUpdateResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsUpdateResponseHistoryItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsUpdateResponseHistoryItemUser,
    version: String
  ): GistsUpdateResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsUpdateResponseHistoryItem]
  }
}

