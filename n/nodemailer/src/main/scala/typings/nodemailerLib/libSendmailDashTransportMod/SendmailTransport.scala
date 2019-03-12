package typings
package nodemailerLib.libSendmailDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendmailTransport
  extends nodemailerLib.nodemailerMod.Transport {
  var args: js.Array[java.lang.String] | nodemailerLib.nodemailerLibNumbers.`false`
  var logger: nodemailerLib.libSharedMod.Logger
  @JSName("mailer")
  var mailer_SendmailTransport: nodemailerLib.libMailerMod.namespaced
  var options: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options
  var path: java.lang.String
  var winbreak: scala.Boolean
}

object SendmailTransport {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] | nodemailerLib.nodemailerLibNumbers.`false`,
    logger: nodemailerLib.libSharedMod.Logger,
    mailer: nodemailerLib.libMailerMod.namespaced,
    name: java.lang.String,
    options: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options,
    path: java.lang.String,
    send: (nodemailerLib.libMailerMailDashMessageMod.namespaced, js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* info */ nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.SentMessageInfo, 
      scala.Unit
    ]) => scala.Unit,
    version: java.lang.String,
    winbreak: scala.Boolean,
    close: () => scala.Unit = null,
    verify: (js.Function1[
      /* callback */ js.Function2[
        /* err */ stdLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]] = null
  ): SendmailTransport = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger, mailer = mailer, name = name, options = options, path = path, send = js.Any.fromFunction2(send), version = version, winbreak = winbreak)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SendmailTransport]
  }
}

