package typings
package nodemailerLib.nodemailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var mailer: js.UndefOr[nodemailerLib.libMailerMod.namespaced] = js.undefined
  var name: java.lang.String
  var verify: js.UndefOr[
    (js.Function1[
      /* callback */ js.Function2[
        /* err */ stdLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]]
  ] = js.undefined
  var version: java.lang.String
  def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.namespaced,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* info */ SentMessageInfo, scala.Unit]
  ): scala.Unit
}

object Transport {
  @scala.inline
  def apply(
    name: java.lang.String,
    send: (nodemailerLib.libMailerMailDashMessageMod.namespaced, js.Function2[/* err */ stdLib.Error | scala.Null, /* info */ SentMessageInfo, scala.Unit]) => scala.Unit,
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
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name, send = js.Any.fromFunction2(send), version = version)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (mailer != null) __obj.updateDynamic("mailer")(mailer)
    if (verify != null) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[Transport]
  }
}

