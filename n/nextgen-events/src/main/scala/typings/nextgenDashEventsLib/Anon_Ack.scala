package typings
package nextgenDashEventsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ack extends js.Object {
  var ack: scala.Boolean
  var emit: scala.Boolean
  var listen: scala.Boolean
}

object Anon_Ack {
  @scala.inline
  def apply(ack: scala.Boolean, emit: scala.Boolean, listen: scala.Boolean): Anon_Ack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ack")(ack)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("listen")(listen)
    __obj.asInstanceOf[Anon_Ack]
  }
}

