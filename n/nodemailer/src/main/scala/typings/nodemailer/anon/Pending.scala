package typings.nodemailer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pending extends js.Object {
  var pending: Boolean
  var ts: Double
}

object Pending {
  @scala.inline
  def apply(pending: Boolean, ts: Double): Pending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
}

