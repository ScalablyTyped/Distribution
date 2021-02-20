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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendmailTransportMod {
  
  @JSImport("nodemailer/lib/sendmail-transport", JSImport.Namespace)
  @js.native
  class ^ protected () extends SendmailTransport {
    def this(options: Options) = this()
  }
  
  type MailOptions = typings.nodemailer.mailerMod.Options
  
  @js.native
  trait Options
    extends typings.nodemailer.mailerMod.Options
       with TransportOptions {
    
    /** an optional array of command line options to pass to the sendmail command (ie. ["-f", "foo@blurdybloop.com"]). This overrides all default arguments except for ’-i’ and recipient list so you need to make sure you have all required arguments set (ie. the ‘-f’ flag). */
    var args: js.UndefOr[js.Array[String]] = js.native
    
    /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
    var newline: js.UndefOr[String] = js.native
    
    /** path to the sendmail command (defaults to ‘sendmail’) */
    var path: js.UndefOr[String] = js.native
    
    var sendmail: `true` = js.native
  }
  object Options {
    
    @scala.inline
    def apply(sendmail: `true`): Options = {
      val __obj = js.Dynamic.literal(sendmail = sendmail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSendmail(value: `true`): Self = StObject.set(x, "sendmail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendmailTransport extends Transport {
    
    var args: js.Array[String] | `false` = js.native
    
    var logger: Logger = js.native
    
    @JSName("mailer")
    var mailer_SendmailTransport: typings.nodemailer.mailerMod.^ = js.native
    
    var options: Options = js.native
    
    var path: String = js.native
    
    var winbreak: Boolean = js.native
  }
  object SendmailTransport {
    
    @scala.inline
    def apply(
      args: js.Array[String] | `false`,
      logger: Logger,
      mailer: typings.nodemailer.mailerMod.^,
      name: String,
      options: Options,
      path: String,
      send: (typings.nodemailer.mailMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
        ]) with js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String,
      winbreak: Boolean
    ): SendmailTransport = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendmailTransport]
    }
    
    @scala.inline
    implicit class SendmailTransportMutableBuilder[Self <: SendmailTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String] | `false`): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailer(value: typings.nodemailer.mailerMod.^): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWinbreak(value: Boolean): Self = StObject.set(x, "winbreak", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SentMessageInfo extends StObject {
    
    var envelope: Envelope = js.native
    
    var messageId: String = js.native
    
    var response: String = js.native
  }
  object SentMessageInfo {
    
    @scala.inline
    def apply(envelope: Envelope, messageId: String, response: String): SentMessageInfo = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    @scala.inline
    implicit class SentMessageInfoMutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
