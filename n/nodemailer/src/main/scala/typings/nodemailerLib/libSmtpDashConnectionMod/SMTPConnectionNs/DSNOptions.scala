package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSNOptions extends js.Object {
  /** sender’s ‘envelope identifier’ for tracking */
  var envid: js.UndefOr[java.lang.String] = js.undefined
  /** when to send a DSN. Multiple options are OK - array or comma delimited. NEVER must appear by itself. */
  @JSName("notify")
  var notify_FDSNOptions: js.UndefOr[DSNOption | js.Array[DSNOption]] = js.undefined
  /** original recipient */
  var orcpt: js.UndefOr[java.lang.String] = js.undefined
  /** return either the full message ‘FULL’ or only headers ‘HDRS’ */
  var ret: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.Full | nodemailerLib.nodemailerLibStrings.HDRS
  ] = js.undefined
}

