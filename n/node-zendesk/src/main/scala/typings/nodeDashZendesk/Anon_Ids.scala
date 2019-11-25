package typings.nodeDashZendesk

import typings.nodeDashZendesk.nodeDashZendeskMod.Users._UpdateIdPayload
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids extends _UpdateIdPayload {
  var ids: js.Array[ZendeskID]
}

object Anon_Ids {
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): Anon_Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ids]
  }
}

