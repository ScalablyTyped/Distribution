package typings
package nodemailerLib.nodemailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTestAccount(): js.Promise[nodemailerLib.nodemailerMod.TestAccount] = js.native
  def createTestAccount(apiUrl: java.lang.String): js.Promise[nodemailerLib.nodemailerMod.TestAccount] = js.native
  def createTestAccount(
    apiUrl: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* testAccount */ nodemailerLib.nodemailerMod.TestAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createTestAccount(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* testAccount */ nodemailerLib.nodemailerMod.TestAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createTransport(): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options | nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options | nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options | nodemailerLib.libSesDashTransportMod.SESTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.namespaced | nodemailerLib.libSmtpDashTransportMod.namespaced | nodemailerLib.libStreamDashTransportMod.namespaced | nodemailerLib.libSendmailDashTransportMod.namespaced | nodemailerLib.libJsonDashTransportMod.namespaced | nodemailerLib.libSesDashTransportMod.namespaced
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options | nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options | nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options | nodemailerLib.libSesDashTransportMod.SESTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.namespaced | nodemailerLib.libSmtpDashTransportMod.namespaced | nodemailerLib.libStreamDashTransportMod.namespaced | nodemailerLib.libSendmailDashTransportMod.namespaced | nodemailerLib.libJsonDashTransportMod.namespaced | nodemailerLib.libSesDashTransportMod.namespaced,
    defaults: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options | nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options | nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options | nodemailerLib.libSesDashTransportMod.SESTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: java.lang.String): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: java.lang.String,
    defaults: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.nodemailerMod.Transport): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.nodemailerMod.TransportOptions): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.nodemailerMod.TransportOptions,
    defaults: nodemailerLib.nodemailerMod.TransportOptions
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.nodemailerMod.Transport,
    defaults: nodemailerLib.nodemailerMod.TransportOptions
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def getTestMessageUrl(
    info: nodemailerLib.libSesDashTransportMod.SESTransportNs.SentMessageInfo | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.SentMessageInfo
  ): java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
}

