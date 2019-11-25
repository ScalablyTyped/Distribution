package typings.nodeDashZendesk.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalModel extends PersistableModel {
  val created_at: String
}

object TemporalModel {
  @scala.inline
  def apply(created_at: String, id: ZendeskID): TemporalModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemporalModel]
  }
}

