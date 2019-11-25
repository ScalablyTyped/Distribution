package typings.nodemailer.libSendmailDashTransportMod

import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.nodemailerMod.Transport
import typings.nodemailer.nodemailerNumbers.`false`
import typings.nodemailer.nodemailerNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendmailTransport extends Transport {
  var args: js.Array[String] | `false`
  var logger: Logger
  @JSName("mailer")
  var mailer_SendmailTransport: typings.nodemailer.libMailerMod.^
  var options: Options
  var path: String
  var winbreak: Boolean
}

object SendmailTransport {
  @scala.inline
  def apply(
    args: js.Array[String] | `false`,
    logger: Logger,
    mailer: typings.nodemailer.libMailerMod.^,
    name: String,
    options: Options,
    path: String,
    send: (typings.nodemailer.libMailerMailDashMessageMod.^, js.Function2[
      /* err */ Error | Null, 
      /* info */ typings.nodemailer.nodemailerMod.SentMessageInfo, 
      Unit
    ]) => Unit,
    version: String,
    winbreak: Boolean,
    close: () => Unit = null,
    verify: (js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]) with js.Function0[js.Promise[`true`]] = null
  ): SendmailTransport = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendmailTransport]
  }
}

