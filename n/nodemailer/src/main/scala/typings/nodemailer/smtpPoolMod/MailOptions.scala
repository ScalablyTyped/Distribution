package typings.nodemailer.smtpPoolMod

import typings.nodemailer.smtpConnectionMod.AuthenticationType
import typings.nodemailer.smtpConnectionMod.DSNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailOptions
  extends typings.nodemailer.mailerMod.Options {
  var auth: js.UndefOr[AuthenticationType] = js.native
  var dsn: js.UndefOr[DSNOptions] = js.native
}

object MailOptions {
  @scala.inline
  def apply(): MailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailOptions]
  }
  @scala.inline
  implicit class MailOptionsOps[Self <: MailOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: AuthenticationType): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDsn(value: DSNOptions): Self = this.set("dsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDsn: Self = this.set("dsn", js.undefined)
  }
  
}

