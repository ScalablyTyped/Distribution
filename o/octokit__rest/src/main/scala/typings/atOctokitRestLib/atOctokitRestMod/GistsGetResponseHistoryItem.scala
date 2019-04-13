package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponseHistoryItem extends js.Object {
  var change_status: GistsGetResponseHistoryItemChangeStatus
  var committed_at: java.lang.String
  var url: java.lang.String
  var user: GistsGetResponseHistoryItemUser
  var version: java.lang.String
}

object GistsGetResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsGetResponseHistoryItemChangeStatus,
    committed_at: java.lang.String,
    url: java.lang.String,
    user: GistsGetResponseHistoryItemUser,
    version: java.lang.String
  ): GistsGetResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status, committed_at = committed_at, url = url, user = user, version = version)
  
    __obj.asInstanceOf[GistsGetResponseHistoryItem]
  }
}

