package typings
package nodemailerLib.nodemailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTestAccount(): js.Promise[TestAccount] = js.native
  def createTestAccount(apiUrl: java.lang.String): js.Promise[TestAccount] = js.native
  def createTestAccount(
    apiUrl: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* testAccount */ TestAccount, scala.Unit]
  ): scala.Unit = js.native
  def createTestAccount(
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* testAccount */ TestAccount, scala.Unit]
  ): scala.Unit = js.native
  def createTransport(): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: java.lang.String): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: java.lang.String, defaults: nodemailerLib.libSmtpDashTransportMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libJsonDashTransportMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libJsonDashTransportMod.Options,
    defaults: nodemailerLib.libJsonDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libJsonDashTransportMod.^): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libJsonDashTransportMod.^,
    defaults: nodemailerLib.libJsonDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSendmailDashTransportMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSendmailDashTransportMod.Options,
    defaults: nodemailerLib.libSendmailDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSendmailDashTransportMod.^): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSendmailDashTransportMod.^,
    defaults: nodemailerLib.libSendmailDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSesDashTransportMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSesDashTransportMod.Options,
    defaults: nodemailerLib.libSesDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSesDashTransportMod.^): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSesDashTransportMod.^,
    defaults: nodemailerLib.libSesDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashPoolMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashPoolMod.Options,
    defaults: nodemailerLib.libSmtpDashPoolMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashPoolMod.^): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashPoolMod.^, defaults: nodemailerLib.libSmtpDashPoolMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashTransportMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashTransportMod.Options,
    defaults: nodemailerLib.libSmtpDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libSmtpDashTransportMod.^): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libSmtpDashTransportMod.^,
    defaults: nodemailerLib.libSmtpDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libStreamDashTransportMod.Options): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.Options,
    defaults: nodemailerLib.libStreamDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: nodemailerLib.libStreamDashTransportMod.^): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.^,
    defaults: nodemailerLib.libStreamDashTransportMod.Options
  ): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: Transport): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: TransportOptions): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: TransportOptions, defaults: TransportOptions): nodemailerLib.libMailerMod.^ = js.native
  def createTransport(transport: Transport, defaults: TransportOptions): nodemailerLib.libMailerMod.^ = js.native
  def getTestMessageUrl(info: nodemailerLib.libSesDashTransportMod.SentMessageInfo): java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  def getTestMessageUrl(info: nodemailerLib.libSmtpDashTransportMod.SentMessageInfo): java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
}

