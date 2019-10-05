package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var id: Double
  var value: js.Any
}

object Field {
  @scala.inline
  def apply(id: Double, value: js.Any): Field = {
    val __obj = js.Dynamic.literal(id = id, value = value)
  
    __obj.asInstanceOf[Field]
  }
}

