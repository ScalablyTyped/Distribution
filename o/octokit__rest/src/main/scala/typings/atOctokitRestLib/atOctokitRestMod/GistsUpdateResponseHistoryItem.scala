package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseHistoryItem extends js.Object {
  var change_status: GistsUpdateResponseHistoryItemChangeStatus
  var committed_at: java.lang.String
  var url: java.lang.String
  var user: GistsUpdateResponseHistoryItemUser
  var version: java.lang.String
}

object GistsUpdateResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsUpdateResponseHistoryItemChangeStatus,
    committed_at: java.lang.String,
    url: java.lang.String,
    user: GistsUpdateResponseHistoryItemUser,
    version: java.lang.String
  ): GistsUpdateResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsUpdateResponseHistoryItem]
  }
}

