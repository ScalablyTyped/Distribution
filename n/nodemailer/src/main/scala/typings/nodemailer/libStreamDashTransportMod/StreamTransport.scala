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
    send: (typings.nodemailer.libMailerMailDashMessageMod.^, js.Function2[
      /* err */ Error | Null, 
      /* info */ typings.nodemailer.nodemailerMod.SentMessageInfo, 
      Unit
    ]) => Unit,
    version: String,
    winbreak: Boolean,
    close: () => Unit = null,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): StreamTransport = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamTransport]
  }
}

