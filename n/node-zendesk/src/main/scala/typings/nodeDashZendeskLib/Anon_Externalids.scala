package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Externalids
  extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs._UpdateIdPayload {
  var external_ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]
}

object Anon_Externalids {
  @scala.inline
  def apply(external_ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]): Anon_Externalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids)
  
    __obj.asInstanceOf[Anon_Externalids]
  }
}

