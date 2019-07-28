package typings.nodemailer.nodemailerMod

import typings.nodemailer.libSmtpDashTransportMod.Options
import typings.nodemailer.nodemailerNumbers.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTestAccount(): js.Promise[TestAccount] = js.native
  def createTestAccount(apiUrl: String): js.Promise[TestAccount] = js.native
  def createTestAccount(
    apiUrl: String,
    callback: js.Function2[/* err */ Error | Null, /* testAccount */ TestAccount, Unit]
  ): Unit = js.native
  def createTestAccount(callback: js.Function2[/* err */ Error | Null, /* testAccount */ TestAccount, Unit]): Unit = js.native
  def createTransport(): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: String): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: String, defaults: Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libJsonDashTransportMod.Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libJsonDashTransportMod.Options,
    defaults: typings.nodemailer.libJsonDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libJsonDashTransportMod.^): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libJsonDashTransportMod.^,
    defaults: typings.nodemailer.libJsonDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSendmailDashTransportMod.Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libSendmailDashTransportMod.Options,
    defaults: typings.nodemailer.libSendmailDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSendmailDashTransportMod.^): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libSendmailDashTransportMod.^,
    defaults: typings.nodemailer.libSendmailDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSesDashTransportMod.Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libSesDashTransportMod.Options,
    defaults: typings.nodemailer.libSesDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSesDashTransportMod.^): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libSesDashTransportMod.^,
    defaults: typings.nodemailer.libSesDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSmtpDashPoolMod.Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libSmtpDashPoolMod.Options,
    defaults: typings.nodemailer.libSmtpDashPoolMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSmtpDashPoolMod.^): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libSmtpDashPoolMod.^,
    defaults: typings.nodemailer.libSmtpDashPoolMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: Options, defaults: Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSmtpDashTransportMod.^): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libSmtpDashTransportMod.^, defaults: Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libStreamDashTransportMod.Options): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libStreamDashTransportMod.Options,
    defaults: typings.nodemailer.libStreamDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: typings.nodemailer.libStreamDashTransportMod.^): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(
    transport: typings.nodemailer.libStreamDashTransportMod.^,
    defaults: typings.nodemailer.libStreamDashTransportMod.Options
  ): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: Transport): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: TransportOptions): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: TransportOptions, defaults: TransportOptions): typings.nodemailer.libMailerMod.^ = js.native
  def createTransport(transport: Transport, defaults: TransportOptions): typings.nodemailer.libMailerMod.^ = js.native
  def getTestMessageUrl(info: typings.nodemailer.libSesDashTransportMod.SentMessageInfo): String | `false` = js.native
  def getTestMessageUrl(info: typings.nodemailer.libSmtpDashTransportMod.SentMessageInfo): String | `false` = js.native
}

