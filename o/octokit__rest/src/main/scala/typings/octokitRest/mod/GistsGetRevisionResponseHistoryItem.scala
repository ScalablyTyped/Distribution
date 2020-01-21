package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsGetRevisionResponseHistoryItem]
  }
}

