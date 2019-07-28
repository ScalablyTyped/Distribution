package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pending extends js.Object {
  var pending: Boolean
  var ts: Double
}

object Anon_Pending {
  @scala.inline
  def apply(pending: Boolean, ts: Double): Anon_Pending = {
    val __obj = js.Dynamic.literal(pending = pending, ts = ts)
  
    __obj.asInstanceOf[Anon_Pending]
  }
}

