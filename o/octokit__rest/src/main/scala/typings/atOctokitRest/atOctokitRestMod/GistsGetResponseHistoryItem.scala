package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponseHistoryItem extends js.Object {
  var change_status: GistsGetResponseHistoryItemChangeStatus
  var committed_at: String
  var url: String
  var user: GistsGetResponseHistoryItemUser
  var version: String
}

object GistsGetResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsGetResponseHistoryItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsGetResponseHistoryItemUser,
    version: String
  ): GistsGetResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsGetResponseHistoryItem]
  }
}

