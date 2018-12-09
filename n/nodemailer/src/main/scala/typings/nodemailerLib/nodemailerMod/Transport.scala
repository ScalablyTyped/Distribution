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
        /* err */ nodeLib.Error | scala.Null, 
        nodemailerLib.nodemailerLibNumbers.`true`, 
        scala.Unit
      ], 
      scala.Unit
    ]) with js.Function0[js.Promise[nodemailerLib.nodemailerLibNumbers.`true`]]
  ] = js.undefined
  var version: java.lang.String
  def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.namespaced,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* info */ SentMessageInfo, scala.Unit]
  ): scala.Unit
}

