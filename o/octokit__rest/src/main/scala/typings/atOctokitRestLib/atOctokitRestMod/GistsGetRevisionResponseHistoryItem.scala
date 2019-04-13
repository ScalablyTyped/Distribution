package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseHistoryItem extends js.Object {
  var change_status: GistsGetRevisionResponseHistoryItemChangeStatus
  var committed_at: java.lang.String
  var url: java.lang.String
  var user: GistsGetRevisionResponseHistoryItemUser
  var version: java.lang.String
}

object GistsGetRevisionResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsGetRevisionResponseHistoryItemChangeStatus,
    committed_at: java.lang.String,
    url: java.lang.String,
    user: GistsGetRevisionResponseHistoryItemUser,
    version: java.lang.String
  ): GistsGetRevisionResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsGetRevisionResponseHistoryItem]
  }
}

