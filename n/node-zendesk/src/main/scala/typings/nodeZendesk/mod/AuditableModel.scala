package typings.nodeZendesk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditableModel extends TemporalModel {
  val updated_at: String | Null
}

object AuditableModel {
  @scala.inline
  def apply(created_at: String, id: ZendeskID, updated_at: String = null): AuditableModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditableModel]
  }
}

