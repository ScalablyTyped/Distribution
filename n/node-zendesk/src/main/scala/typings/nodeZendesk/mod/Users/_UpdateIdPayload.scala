package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UpdateIdPayload extends js.Object

object _UpdateIdPayload {
  @scala.inline
  def AnonIds(ids: js.Array[ZendeskID]): _UpdateIdPayload = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UpdateIdPayload]
  }
  @scala.inline
  def AnonExternalids(external_ids: js.Array[ZendeskID]): _UpdateIdPayload = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UpdateIdPayload]
  }
}

