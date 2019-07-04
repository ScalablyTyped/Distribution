package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids
  extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs._UpdateIdPayload {
  var ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]
}

object Anon_Ids {
  @scala.inline
  def apply(ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]): Anon_Ids = {
    val __obj = js.Dynamic.literal(ids = ids)
  
    __obj.asInstanceOf[Anon_Ids]
  }
}

