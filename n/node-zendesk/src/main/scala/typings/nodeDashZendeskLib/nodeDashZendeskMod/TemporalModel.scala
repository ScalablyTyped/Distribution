package typings
package nodeDashZendeskLib.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalModel extends PersistableModel {
  val created_at: java.lang.String
}

object TemporalModel {
  @scala.inline
  def apply(created_at: java.lang.String, id: ZendeskID): TemporalModel = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id)
  
    __obj.asInstanceOf[TemporalModel]
  }
}

