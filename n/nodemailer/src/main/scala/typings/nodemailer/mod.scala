package typings.nodemailer

import typings.nodemailer.anon.Host
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.smtpTransportMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemailer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTestAccount(): js.Promise[TestAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")().asInstanceOf[js.Promise[TestAccount]]
  inline def createTestAccount(apiUrl: String): js.Promise[TestAccount] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")(apiUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TestAccount]]
  inline def createTestAccount(
    apiUrl: String,
    callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")(apiUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createTestAccount(callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestAccount")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createTransport(): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")().asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: String): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: String, defaults: Options): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: Unit, defaults: Options): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.jsonTransportMod.Options): Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.jsonTransportMod.Options,
    defaults: typings.nodemailer.jsonTransportMod.Options
  ): Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.jsonTransportMod.^): Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.jsonTransportMod.^,
    defaults: typings.nodemailer.jsonTransportMod.Options
  ): Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.jsonTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.sendmailTransportMod.Options): Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.sendmailTransportMod.Options,
    defaults: typings.nodemailer.sendmailTransportMod.Options
  ): Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.sendmailTransportMod.^): Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.sendmailTransportMod.^,
    defaults: typings.nodemailer.sendmailTransportMod.Options
  ): Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.sendmailTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.sesTransportMod.Options): Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.sesTransportMod.Options,
    defaults: typings.nodemailer.sesTransportMod.Options
  ): Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.sesTransportMod.^): Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.sesTransportMod.^,
    defaults: typings.nodemailer.sesTransportMod.Options
  ): Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.sesTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.smtpPoolMod.Options): Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.smtpPoolMod.Options,
    defaults: typings.nodemailer.smtpPoolMod.Options
  ): Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.smtpPoolMod.^): Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.smtpPoolMod.^, defaults: typings.nodemailer.smtpPoolMod.Options): Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.smtpPoolMod.SentMessageInfo]]
  inline def createTransport(transport: Options): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: Options, defaults: Options): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.smtpTransportMod.^): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.smtpTransportMod.^, defaults: Options): Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.smtpTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.streamTransportMod.Options): Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.streamTransportMod.Options,
    defaults: typings.nodemailer.streamTransportMod.Options
  ): Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo]]
  inline def createTransport(transport: typings.nodemailer.streamTransportMod.^): Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo]]
  inline def createTransport(
    transport: typings.nodemailer.streamTransportMod.^,
    defaults: typings.nodemailer.streamTransportMod.Options
  ): Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[typings.nodemailer.streamTransportMod.SentMessageInfo]]
  inline def createTransport[T](transport: Transport[T]): Transporter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[T]]
  inline def createTransport[T](transport: TransportOptions): Transporter[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any]).asInstanceOf[Transporter[T]]
  inline def createTransport[T](transport: TransportOptions, defaults: TransportOptions): Transporter[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[T]]
  inline def createTransport[T](transport: Transport[T], defaults: TransportOptions): Transporter[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransport")(transport.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Transporter[T]]
  
  inline def getTestMessageUrl(info: typings.nodemailer.sesTransportMod.SentMessageInfo): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestMessageUrl")(info.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  inline def getTestMessageUrl(info: typings.nodemailer.smtpTransportMod.SentMessageInfo): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTestMessageUrl")(info.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  
  type SendMailOptions = typings.nodemailer.mailerMod.Options
  
  type SentMessageInfo = Any
  
  trait TestAccount extends StObject {
    
    var imap: Host
    
    var pass: String
    
    var pop3: Host
    
    var smtp: Host
    
    var user: String
    
    var web: String
  }
  object TestAccount {
    
    inline def apply(imap: Host, pass: String, pop3: Host, smtp: Host, user: String, web: String): TestAccount = {
      val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestAccount]
    }
    
    extension [Self <: TestAccount](x: Self) {
      
      inline def setImap(value: Host): Self = StObject.set(x, "imap", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPop3(value: Host): Self = StObject.set(x, "pop3", value.asInstanceOf[js.Any])
      
      inline def setSmtp(value: Host): Self = StObject.set(x, "smtp", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setWeb(value: String): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transport[T] extends StObject {
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mailer: js.UndefOr[Transporter[T]] = js.undefined
    
    var name: String
    
    def send(
      mail: typings.nodemailer.mailMessageMod.^[T],
      callback: js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]
    ): Unit
    
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
      ]) & js.UndefOr[js.Function0[js.Promise[`true`]]]
    
    var version: String
  }
  object Transport {
    
    inline def apply[T](
      name: String,
      send: (typings.nodemailer.mailMessageMod.^[T], js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String
    ): Transport[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transport[T]]
    }
    
    extension [Self <: Transport[?], T](x: Self & Transport[T]) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setMailer(value: Transporter[T]): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setMailerUndefined: Self = StObject.set(x, "mailer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSend(
        value: (typings.nodemailer.mailMessageMod.^[T], js.Function2[/* err */ js.Error | Null, /* info */ T, Unit]) => Unit
      ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      inline def setVerify(
        value: (js.UndefOr[
              js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
            ]) & js.UndefOr[js.Function0[js.Promise[`true`]]]
      ): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportOptions extends StObject {
    
    var component: js.UndefOr[String] = js.undefined
  }
  object TransportOptions {
    
    inline def apply(): TransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportOptions]
    }
    
    extension [Self <: TransportOptions](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  type Transporter[T] = typings.nodemailer.mailerMod.^[T]
}
