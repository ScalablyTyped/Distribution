package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GistsUpdateResponseHistoryItem]
  }
}

