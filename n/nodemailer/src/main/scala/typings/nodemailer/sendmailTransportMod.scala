package typings.nodemailer

import typings.nodemailer.mimeNodeMod.Envelope
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendmailTransportMod {
  
  @JSImport("nodemailer/lib/sendmail-transport", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with SendmailTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var args: js.Array[String] | `false` = js.native
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    @JSName("mailer")
    var mailer_SendmailTransport: typings.nodemailer.mailerMod.^ = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.mailMessageMod.^,
      callback: js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
      ]) & js.UndefOr[js.Function0[js.Promise[`true`]]] = js.native
    
    /* CompleteClass */
    var version: String = js.native
    
    /* CompleteClass */
    var winbreak: Boolean = js.native
  }
  
  type MailOptions = typings.nodemailer.mailerMod.Options
  
  trait Options
    extends StObject
       with typings.nodemailer.mailerMod.Options
       with TransportOptions {
    
    /** an optional array of command line options to pass to the sendmail command (ie. ["-f", "foo@blurdybloop.com"]). This overrides all default arguments except for ’-i’ and recipient list so you need to make sure you have all required arguments set (ie. the ‘-f’ flag). */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
    var newline: js.UndefOr[String] = js.undefined
    
    /** path to the sendmail command (defaults to ‘sendmail’) */
    var path: js.UndefOr[String] = js.undefined
    
    var sendmail: `true`
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(sendmail = true)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSendmail(value: `true`): Self = StObject.set(x, "sendmail", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendmailTransport
    extends StObject
       with Transport {
    
    var args: js.Array[String] | `false`
    
    var logger: Logger
    
    @JSName("mailer")
    var mailer_SendmailTransport: typings.nodemailer.mailerMod.^
    
    var options: Options
    
    var path: String
    
    var winbreak: Boolean
  }
  object SendmailTransport {
    
    inline def apply(
      args: js.Array[String] | `false`,
      logger: Logger,
      mailer: typings.nodemailer.mailerMod.^,
      name: String,
      options: Options,
      path: String,
      send: (typings.nodemailer.mailMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String,
      winbreak: Boolean
    ): SendmailTransport = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendmailTransport]
    }
    
    extension [Self <: SendmailTransport](x: Self) {
      
      inline def setArgs(value: js.Array[String] | `false`): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMailer(value: typings.nodemailer.mailerMod.^): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setWinbreak(value: Boolean): Self = StObject.set(x, "winbreak", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentMessageInfo extends StObject {
    
    var envelope: Envelope
    
    var messageId: String
    
    var response: String
  }
  object SentMessageInfo {
    
    inline def apply(envelope: Envelope, messageId: String, response: String): SentMessageInfo = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    extension [Self <: SentMessageInfo](x: Self) {
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
