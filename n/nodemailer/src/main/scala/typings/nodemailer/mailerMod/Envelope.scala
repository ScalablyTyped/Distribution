package typings.nodemailer.mailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  /** addresses from this value get added to RCPT TO list */
  var bcc: js.UndefOr[String] = js.undefined
  /** addresses from this value get added to RCPT TO list */
  var cc: js.UndefOr[String] = js.undefined
  /** the first address gets used as MAIL FROM address in SMTP */
  var from: js.UndefOr[String] = js.undefined
  /** addresses from this value get added to RCPT TO list */
  var to: js.UndefOr[String] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(bcc: String = null, cc: String = null, from: String = null, to: String = null): Envelope = {
    val __obj = js.Dynamic.literal()
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

