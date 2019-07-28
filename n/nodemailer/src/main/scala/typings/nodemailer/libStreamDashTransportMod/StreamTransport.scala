package typings.nodemailer.libStreamDashTransportMod

import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.nodemailerMod.Transport
import typings.nodemailer.nodemailerNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamTransport extends Transport {
  var logger: Logger
  @JSName("mailer")
  var mailer_StreamTransport: typings.nodemailer.libMailerMod.^
  var options: Options
  var winbreak: Boolean
}

object StreamTransport {
  @scala.inline
  def apply(
    logger: Logger,
    mailer: typings.nodemailer.libMailerMod.^,
    name: String,
    options: Options,
    send: (typings.nodemailer.libMailerMailDashMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ SentMessageInfo, Unit]) => Unit,
    version: String,
    winbreak: Boolean,
    close: () => Unit = null,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): StreamTransport = {
    val __obj = js.Dynamic.literal(logger = logger, mailer = mailer, name = name, options = options, send = js.Any.fromFunction2(send), version = version, winbreak = winbreak)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[StreamTransport]
  }
}

