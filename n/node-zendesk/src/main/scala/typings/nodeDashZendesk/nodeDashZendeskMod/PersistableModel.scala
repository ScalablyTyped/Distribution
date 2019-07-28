package typings.nodeDashZendesk.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistableModel extends js.Object {
  val id: ZendeskID
}

object PersistableModel {
  @scala.inline
  def apply(id: ZendeskID): PersistableModel = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[PersistableModel]
  }
}

