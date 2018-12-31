package typings
package nodemailerLib.libStreamDashTransportMod.StreamTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends nodemailerLib.libMailerMod.MailNs.Options
     with nodemailerLib.nodemailerMod.TransportOptions {
  /** if true, then returns the message as a Buffer object instead of a stream */
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  var streamTransport: nodemailerLib.nodemailerLibNumbers.`true`
}

