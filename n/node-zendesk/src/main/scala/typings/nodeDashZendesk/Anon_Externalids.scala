package typings.nodeDashZendesk

import typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs._UpdateIdPayload
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Externalids extends _UpdateIdPayload {
  var external_ids: js.Array[ZendeskID]
}

object Anon_Externalids {
  @scala.inline
  def apply(external_ids: js.Array[ZendeskID]): Anon_Externalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids)
  
    __obj.asInstanceOf[Anon_Externalids]
  }
}

