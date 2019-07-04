package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.OrganizationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.PersistableModel {
  val name: java.lang.String
}

object ResponseModel {
  @scala.inline
  def apply(id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, name: java.lang.String): ResponseModel = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ResponseModel]
  }
}

