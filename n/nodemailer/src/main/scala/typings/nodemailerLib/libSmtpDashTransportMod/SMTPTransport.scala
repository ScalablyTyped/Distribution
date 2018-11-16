package typings
package nodemailerLib.libSmtpDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPTransport
  extends nodeLib.eventsMod.EventEmitter
     with nodemailerLib.nodemailerMod.Transport {
  var auth: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.AuthenticationType = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  @JSName("mailer")
  var mailer_SMTPTransport: nodemailerLib.libMailerMod.namespaced = js.native
  var options: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options = js.native
  /** Releases resources */
  @JSName("close")
  def close_MSMTPTransport(): scala.Unit = js.native
  def getAuth(authOpts: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.AuthenticationTypeLogin): nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.AuthenticationType = js.native
  def getAuth(authOpts: nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.AuthenticationTypeOAuth2): nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.AuthenticationType = js.native
  /** Placeholder function for creating proxy sockets. This method immediatelly returns without a socket */
  def getSocket(
    options: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* socketOptions */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("verify")
  def verify_MSMTPTransport(): stdLib.Promise[nodemailerLib.nodemailerLibNumbers.`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_MSMTPTransport(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      nodemailerLib.nodemailerLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

