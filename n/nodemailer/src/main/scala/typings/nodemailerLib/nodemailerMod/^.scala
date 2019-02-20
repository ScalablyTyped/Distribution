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
  def createTransport(transport: java.lang.String): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: java.lang.String,
    defaults: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options,
    defaults: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libJsonDashTransportMod.namespaced): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libJsonDashTransportMod.namespaced,
    defaults: nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options,
    defaults: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSendmailDashTransportMod.namespaced): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSendmailDashTransportMod.namespaced,
    defaults: nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSesDashTransportMod.SESTransportNs.Options): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSesDashTransportMod.SESTransportNs.Options,
    defaults: nodemailerLib.libSesDashTransportMod.SESTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSesDashTransportMod.namespaced): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSesDashTransportMod.namespaced,
    defaults: nodemailerLib.libSesDashTransportMod.SESTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options,
    defaults: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashPoolMod.namespaced): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashPoolMod.namespaced,
    defaults: nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options,
    defaults: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashTransportMod.namespaced): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashTransportMod.namespaced,
    defaults: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options,
    defaults: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: nodemailerLib.libStreamDashTransportMod.namespaced): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.namespaced,
    defaults: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options
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
  def getTestMessageUrl(info: nodemailerLib.libSesDashTransportMod.SESTransportNs.SentMessageInfo): java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  def getTestMessageUrl(info: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.SentMessageInfo): java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
}

