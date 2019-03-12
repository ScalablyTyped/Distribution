package typings
package nodemailerDashMailgunDashTransportLib.nodemailerDashMailgunDashTransportMod.mailgunTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailgunTransport
  extends nodemailerLib.nodemailerMod.Transport

object MailgunTransport {
  @scala.inline
  def apply(
    name: java.lang.String,
    send: (nodemailerLib.libMailerMailDashMessageMod.namespaced, js.Function2[/* err */ stdLib.Error | scala.Null, /* info */ js.UndefOr[Information], scala.Unit]) => scala.Unit,
    version: java.lang.String,
    close: () => scala.Unit = null,
    mailer: nodemailerLib.libMailerMod.namespaced = null,
    verify: (js.Function1[
      /* callback */ js.Function2[
        /* err */ stdLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]] = null
  ): MailgunTransport = {
    val __obj = js.Dynamic.literal(name = name, send = js.Any.fromFunction2(send), version = version)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (mailer != null) __obj.updateDynamic("mailer")(mailer)
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[MailgunTransport]
  }
}

