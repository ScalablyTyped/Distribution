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

