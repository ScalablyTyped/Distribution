package typings.nodemailer

import typings.nodemailer.libMailerMod.Address
import typings.nodemailer.libMimeNodeMod.Envelope
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSendmailTransportMod {
  
  @JSImport("nodemailer/lib/sendmail-transport", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SendmailTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var args: js.Array[String] | `false` = js.native
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    @JSName("mailer")
    var mailer_SendmailTransport: typings.nodemailer.libMailerMod.^[SentMessageInfo] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.libMailerMailMessageMod.^[SentMessageInfo],
      callback: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var verify: (js.UndefOr[
        js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
      ]) & js.UndefOr[js.Function0[js.Promise[`true`]]] = js.native
    
    /* CompleteClass */
    var version: String = js.native
    
    /* CompleteClass */
    var winbreak: Boolean = js.native
  }
  
  type MailOptions = typings.nodemailer.libMailerMod.Options
  
  trait Options
    extends StObject
       with typings.nodemailer.libMailerMod.Options
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
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSendmail(value: `true`): Self = StObject.set(x, "sendmail", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendmailTransport
    extends StObject
       with Transport[SentMessageInfo] {
    
    var args: js.Array[String] | `false`
    
    var logger: Logger
    
    @JSName("mailer")
    var mailer_SendmailTransport: typings.nodemailer.libMailerMod.^[SentMessageInfo]
    
    var options: Options
    
    var path: String
    
    var winbreak: Boolean
  }
  object SendmailTransport {
    
    inline def apply(
      args: js.Array[String] | `false`,
      logger: Logger,
      mailer: typings.nodemailer.libMailerMod.^[SentMessageInfo],
      name: String,
      options: Options,
      path: String,
      send: (typings.nodemailer.libMailerMailMessageMod.^[SentMessageInfo], js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ js.Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String,
      winbreak: Boolean
    ): SendmailTransport = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendmailTransport]
    }
    
    extension [Self <: SendmailTransport](x: Self) {
      
      inline def setArgs(value: js.Array[String] | `false`): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMailer(value: typings.nodemailer.libMailerMod.^[SentMessageInfo]): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setWinbreak(value: Boolean): Self = StObject.set(x, "winbreak", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentMessageInfo extends StObject {
    
    var accepted: js.Array[String | Address]
    
    var envelope: Envelope
    
    var messageId: String
    
    var pending: js.Array[String | Address]
    
    var rejected: js.Array[String | Address]
    
    var response: String
  }
  object SentMessageInfo {
    
    inline def apply(
      accepted: js.Array[String | Address],
      envelope: Envelope,
      messageId: String,
      pending: js.Array[String | Address],
      rejected: js.Array[String | Address],
      response: String
    ): SentMessageInfo = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    extension [Self <: SentMessageInfo](x: Self) {
      
      inline def setAccepted(value: js.Array[String | Address]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setAcceptedVarargs(value: (String | Address)*): Self = StObject.set(x, "accepted", js.Array(value*))
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPending(value: js.Array[String | Address]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: (String | Address)*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setRejected(value: js.Array[String | Address]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedVarargs(value: (String | Address)*): Self = StObject.set(x, "rejected", js.Array(value*))
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
