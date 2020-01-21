package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViaSource extends js.Object {
  var from: js.Object
  var rel: String | Null
  var to: js.Object
}

object ViaSource {
  @scala.inline
  def apply(from: js.Object, to: js.Object, rel: String = null): ViaSource = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViaSource]
  }
}

