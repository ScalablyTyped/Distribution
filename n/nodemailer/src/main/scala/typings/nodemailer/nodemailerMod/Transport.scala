package typings.nodemailer.nodemailerMod

import typings.nodemailer.nodemailerNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mailer: js.UndefOr[typings.nodemailer.libMailerMod.^] = js.undefined
  var name: String
  var verify: js.UndefOr[
    (js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]]
  ] = js.undefined
  var version: String
  def send(
    mail: typings.nodemailer.libMailerMailDashMessageMod.^,
    callback: js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit
}

object Transport {
  @scala.inline
  def apply(
    name: String,
    send: (typings.nodemailer.libMailerMailDashMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]) => Unit,
    version: String,
    close: () => Unit = null,
    mailer: typings.nodemailer.libMailerMod.^ = null,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name, send = js.Any.fromFunction2(send), version = version)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (mailer != null) __obj.updateDynamic("mailer")(mailer)
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[Transport]
  }
}

