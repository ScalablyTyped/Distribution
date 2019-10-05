package typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses

import typings.nodeDashZendesk.nodeDashZendeskMod.PersistableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends PersistableModel {
  val action: String
  val status: String
  val success: Boolean
}

object Result {
  @scala.inline
  def apply(action: String, id: ZendeskID, status: String, success: Boolean): Result = {
    val __obj = js.Dynamic.literal(action = action, id = id, status = status, success = success)
  
    __obj.asInstanceOf[Result]
  }
}

