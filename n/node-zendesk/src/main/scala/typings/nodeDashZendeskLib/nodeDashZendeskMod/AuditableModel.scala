package typings
package nodeDashZendeskLib.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditableModel extends TemporalModel {
  val updated_at: java.lang.String | scala.Null
}

object AuditableModel {
  @scala.inline
  def apply(created_at: java.lang.String, id: ZendeskID, updated_at: java.lang.String = null): AuditableModel = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[AuditableModel]
  }
}

