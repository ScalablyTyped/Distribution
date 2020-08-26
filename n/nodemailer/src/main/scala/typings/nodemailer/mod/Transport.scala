package typings.nodemailer.mod

import typings.nodemailer.mailerMod.^
import typings.nodemailer.nodemailerBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  var mailer: js.UndefOr[^] = js.native
  var name: String = js.native
  var verify: (js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
  ]) with js.UndefOr[js.Function0[js.Promise[`true`]]] = js.native
  var version: String = js.native
  def send(
    mail: typings.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
}

object Transport {
  @scala.inline
  def apply(
    name: String,
    send: (typings.nodemailer.mailMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]) => Unit,
    verify: (js.UndefOr[
      js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
    ]) with js.UndefOr[js.Function0[js.Promise[`true`]]],
    version: String
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transport]
  }
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSend(
      value: (typings.nodemailer.mailMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]) => Unit
    ): Self = this.set("send", js.Any.fromFunction2(value))
    @scala.inline
    def setVerify(
      value: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
        ]) with js.UndefOr[js.Function0[js.Promise[`true`]]]
    ): Self = this.set("verify", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setMailer(value: ^): Self = this.set("mailer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailer: Self = this.set("mailer", js.undefined)
  }
  
}

