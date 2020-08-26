package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerStrings.Full
import typings.nodemailer.nodemailerStrings.HDRS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSNOptions extends js.Object {
  /** sender’s ‘envelope identifier’ for tracking */
  var envid: js.UndefOr[String] = js.native
  /** when to send a DSN. Multiple options are OK - array or comma delimited. NEVER must appear by itself. */
  @JSName("notify")
  var notify_FDSNOptions: js.UndefOr[DSNOption | js.Array[DSNOption]] = js.native
  /** original recipient */
  var orcpt: js.UndefOr[String] = js.native
  /** return either the full message ‘FULL’ or only headers ‘HDRS’ */
  var ret: js.UndefOr[Full | HDRS] = js.native
}

object DSNOptions {
  @scala.inline
  def apply(): DSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSNOptions]
  }
  @scala.inline
  implicit class DSNOptionsOps[Self <: DSNOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvid(value: String): Self = this.set("envid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvid: Self = this.set("envid", js.undefined)
    @scala.inline
    def setNotifyVarargs(value: DSNOption*): Self = this.set("notify", js.Array(value :_*))
    @scala.inline
    def setNotify(value: DSNOption | js.Array[DSNOption]): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    @scala.inline
    def setOrcpt(value: String): Self = this.set("orcpt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrcpt: Self = this.set("orcpt", js.undefined)
    @scala.inline
    def setRet(value: Full | HDRS): Self = this.set("ret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRet: Self = this.set("ret", js.undefined)
  }
  
}

