package typings
package nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result
  extends nodeDashZendeskLib.nodeDashZendeskMod.PersistableModel {
  val action: java.lang.String
  val status: java.lang.String
  val success: scala.Boolean
}

object Result {
  @scala.inline
  def apply(
    action: java.lang.String,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    status: java.lang.String,
    success: scala.Boolean
  ): Result = {
    val __obj = js.Dynamic.literal(action = action, id = id, status = status, success = success)
  
    __obj.asInstanceOf[Result]
  }
}

