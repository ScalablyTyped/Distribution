package typings
package nodemailerLib.libJsonDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONTransport
  extends nodemailerLib.nodemailerMod.Transport {
  var logger: nodemailerLib.libSharedMod.Logger
  @JSName("mailer")
  var mailer_JSONTransport: nodemailerLib.libMailerMod.^
  var options: Options
}

object JSONTransport {
  @scala.inline
  def apply(
    logger: nodemailerLib.libSharedMod.Logger,
    mailer: nodemailerLib.libMailerMod.^,
    name: java.lang.String,
    options: Options,
    send: (nodemailerLib.libMailerMailDashMessageMod.^, js.Function2[/* err */ stdLib.Error | scala.Null, /* info */ SentMessageInfo, scala.Unit]) => scala.Unit,
    version: java.lang.String,
    close: () => scala.Unit = null,
    verify: (js.Function1[
      /* callback */ js.Function2[
        /* err */ stdLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]] = null
  ): JSONTransport = {
    val __obj = js.Dynamic.literal(logger = logger, mailer = mailer, name = name, options = options, send = js.Any.fromFunction2(send), version = version)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[JSONTransport]
  }
}

