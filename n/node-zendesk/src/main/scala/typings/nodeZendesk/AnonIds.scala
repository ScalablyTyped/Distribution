package typings.nodeZendesk

import typings.nodeZendesk.mod.Users._UpdateIdPayload
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIds extends _UpdateIdPayload {
  var ids: js.Array[ZendeskID]
}

object AnonIds {
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): AnonIds = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIds]
  }
}

