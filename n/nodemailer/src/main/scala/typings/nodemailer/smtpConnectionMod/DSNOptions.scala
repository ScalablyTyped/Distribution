package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.Full
import typings.nodemailer.nodemailerStrings.HDRS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSNOptions extends js.Object {
  /** sender’s ‘envelope identifier’ for tracking */
  var envid: js.UndefOr[String] = js.undefined
  /** when to send a DSN. Multiple options are OK - array or comma delimited. NEVER must appear by itself. */
  @JSName("notify")
  var notify_FDSNOptions: js.UndefOr[DSNOption | js.Array[DSNOption]] = js.undefined
  /** original recipient */
  var orcpt: js.UndefOr[String] = js.undefined
  /** return either the full message ‘FULL’ or only headers ‘HDRS’ */
  var ret: js.UndefOr[Full | HDRS] = js.undefined
}

object DSNOptions {
  @scala.inline
  def apply(
    envid: String = null,
    notify: DSNOption | js.Array[DSNOption] = null,
    orcpt: String = null,
    ret: Full | HDRS = null
  ): DSNOptions = {
    val __obj = js.Dynamic.literal()
    if (envid != null) __obj.updateDynamic("envid")(envid.asInstanceOf[js.Any])
    if (notify != null) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    if (orcpt != null) __obj.updateDynamic("orcpt")(orcpt.asInstanceOf[js.Any])
    if (ret != null) __obj.updateDynamic("ret")(ret.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNOptions]
  }
}

