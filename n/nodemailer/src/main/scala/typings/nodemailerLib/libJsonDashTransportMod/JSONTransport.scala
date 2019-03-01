package typings
package nodemailerLib.libJsonDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONTransport
  extends nodemailerLib.nodemailerMod.Transport {
  var logger: nodemailerLib.libSharedMod.Logger
  @JSName("mailer")
  var mailer_JSONTransport: nodemailerLib.libMailerMod.namespaced
  var options: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options
}

object JSONTransport {
  @scala.inline
  def apply(
    logger: nodemailerLib.libSharedMod.Logger,
    mailer: nodemailerLib.libMailerMod.namespaced,
    name: java.lang.String,
    options: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options,
    send: js.Function2[
      nodemailerLib.libMailerMailDashMessageMod.namespaced, 
      js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* info */ nodemailerLib.libJsonDashTransportMod.JSONTransportNs.SentMessageInfo, 
        scala.Unit
      ], 
      scala.Unit
    ],
    version: java.lang.String,
    close: js.Function0[scala.Unit] = null,
    verify: (js.Function1[
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]] = null
  ): JSONTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logger")(logger)
    __obj.updateDynamic("mailer")(mailer)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("version")(version)
    if (close != null) __obj.updateDynamic("close")(close)
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[JSONTransport]
  }
}

