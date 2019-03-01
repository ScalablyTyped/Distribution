package typings
package nodemailerLib.libMailerMod.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  /** addresses from this value get added to RCPT TO list */
  var bcc: js.UndefOr[java.lang.String] = js.undefined
  /** addresses from this value get added to RCPT TO list */
  var cc: js.UndefOr[java.lang.String] = js.undefined
  /** the first address gets used as MAIL FROM address in SMTP */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /** addresses from this value get added to RCPT TO list */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    bcc: java.lang.String = null,
    cc: java.lang.String = null,
    from: java.lang.String = null,
    to: java.lang.String = null
  ): Envelope = {
    val __obj = js.Dynamic.literal()
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Envelope]
  }
}

