package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPending extends js.Object {
  var pending: Boolean
  var ts: Double
}

object AnonPending {
  @scala.inline
  def apply(pending: Boolean, ts: Double): AnonPending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPending]
  }
}

