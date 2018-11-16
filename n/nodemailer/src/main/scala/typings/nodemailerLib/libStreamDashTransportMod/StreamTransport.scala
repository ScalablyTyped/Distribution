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

