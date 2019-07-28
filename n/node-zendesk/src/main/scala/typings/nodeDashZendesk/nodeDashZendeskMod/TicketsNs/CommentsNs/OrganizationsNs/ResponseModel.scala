package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.CommentsNs.OrganizationsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.PersistableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends PersistableModel {
  val name: String
}

object ResponseModel {
  @scala.inline
  def apply(id: ZendeskID, name: String): ResponseModel = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[ResponseModel]
  }
}

