package typings
package nodemailerLib.libStreamDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamTransport
  extends nodemailerLib.nodemailerMod.Transport {
  var logger: nodemailerLib.libSharedMod.Logger
  @JSName("mailer")
  var mailer_StreamTransport: nodemailerLib.libMailerMod.namespaced
  var options: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options
  var winbreak: scala.Boolean
}

object StreamTransport {
  @scala.inline
  def apply(
    logger: nodemailerLib.libSharedMod.Logger,
    mailer: nodemailerLib.libMailerMod.namespaced,
    name: java.lang.String,
    options: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options,
    send: js.Function2[
      nodemailerLib.libMailerMailDashMessageMod.namespaced, 
      js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* info */ nodemailerLib.libStreamDashTransportMod.StreamTransportNs.SentMessageInfo, 
        scala.Unit
      ], 
      scala.Unit
    ],
    version: java.lang.String,
    winbreak: scala.Boolean,
    close: js.Function0[scala.Unit] = null,
    verify: (js.Function1[
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]] = null
  ): StreamTransport = {
    val __obj = js.Dynamic.literal(logger = logger, mailer = mailer, name = name, options = options, send = send, version = version, winbreak = winbreak)
    if (close != null) __obj.updateDynamic("close")(close)
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[StreamTransport]
  }
}

