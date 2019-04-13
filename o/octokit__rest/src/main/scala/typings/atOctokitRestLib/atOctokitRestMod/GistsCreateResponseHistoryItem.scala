package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateResponseHistoryItem extends js.Object {
  var change_status: GistsCreateResponseHistoryItemChangeStatus
  var committed_at: java.lang.String
  var url: java.lang.String
  var user: GistsCreateResponseHistoryItemUser
  var version: java.lang.String
}

object GistsCreateResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsCreateResponseHistoryItemChangeStatus,
    committed_at: java.lang.String,
    url: java.lang.String,
    user: GistsCreateResponseHistoryItemUser,
    version: java.lang.String
  ): GistsCreateResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsCreateResponseHistoryItem]
  }
}

