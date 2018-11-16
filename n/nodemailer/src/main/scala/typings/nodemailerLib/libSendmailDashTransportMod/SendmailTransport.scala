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

