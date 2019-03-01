package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pending extends js.Object {
  var pending: scala.Boolean
  var ts: scala.Double
}

object Anon_Pending {
  @scala.inline
  def apply(pending: scala.Boolean, ts: scala.Double): Anon_Pending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("ts")(ts)
    __obj.asInstanceOf[Anon_Pending]
  }
}

