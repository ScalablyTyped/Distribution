package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateResponseHistoryItem extends js.Object {
  var change_status: GistsCreateResponseHistoryItemChangeStatus
  var committed_at: String
  var url: String
  var user: GistsCreateResponseHistoryItemUser
  var version: String
}

object GistsCreateResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsCreateResponseHistoryItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsCreateResponseHistoryItemUser,
    version: String
  ): GistsCreateResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsCreateResponseHistoryItem]
  }
}

