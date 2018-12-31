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

