package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViaSource extends js.Object {
  var from: js.Object
  var rel: java.lang.String | scala.Null
  var to: js.Object
}

object ViaSource {
  @scala.inline
  def apply(from: js.Object, to: js.Object, rel: java.lang.String = null): ViaSource = {
    val __obj = js.Dynamic.literal(from = from, to = to)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    __obj.asInstanceOf[ViaSource]
  }
}

