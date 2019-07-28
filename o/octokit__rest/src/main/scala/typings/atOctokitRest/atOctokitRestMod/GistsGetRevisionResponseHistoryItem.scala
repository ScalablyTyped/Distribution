package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseHistoryItem extends js.Object {
  var change_status: GistsGetRevisionResponseHistoryItemChangeStatus
  var committed_at: String
  var url: String
  var user: GistsGetRevisionResponseHistoryItemUser
  var version: String
}

object GistsGetRevisionResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsGetRevisionResponseHistoryItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsGetRevisionResponseHistoryItemUser,
    version: String
  ): GistsGetRevisionResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsGetRevisionResponseHistoryItem]
  }
}

