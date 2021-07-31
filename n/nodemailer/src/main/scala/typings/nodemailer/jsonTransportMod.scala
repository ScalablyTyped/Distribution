package typings.nodemailer

import typings.nodemailer.mimeNodeMod.Envelope
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonTransportMod {
  
  @JSImport("nodemailer/lib/json-transport", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with JSONTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    @JSName("mailer")
    var mailer_JSONTransport: typings.nodemailer.mailerMod.^ = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
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
  }
  
  trait JSONTransport
    extends StObject
       with Transport {
    
    var logger: Logger
    
    @JSName("mailer")
    var mailer_JSONTransport: typings.nodemailer.mailerMod.^
    
    var options: Options
  }
  object JSONTransport {
    
    @scala.inline
    def apply(
      logger: Logger,
      mailer: typings.nodemailer.mailerMod.^,
      name: String,
      options: Options,
      send: (typings.nodemailer.mailMessageMod.^, js.Function2[/* err */ Error | Null, /* info */ typings.nodemailer.mod.SentMessageInfo, Unit]) => Unit,
      verify: (js.UndefOr[
          js.Function1[/* callback */ js.Function2[/* err */ Error | Null, `true`, Unit], Unit]
        ]) & js.UndefOr[js.Function0[js.Promise[`true`]]],
      version: String
    ): JSONTransport = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), verify = verify.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONTransport]
    }
    
    @scala.inline
    implicit class JSONTransportMutableBuilder[Self <: JSONTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailer(value: typings.nodemailer.mailerMod.^): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type MailOptions = typings.nodemailer.mailerMod.Options
  
  trait Options
    extends StObject
       with typings.nodemailer.mailerMod.Options
       with TransportOptions {
    
    var jsonTransport: `true`
    
    var skipEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal(jsonTransport = true)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsonTransport(value: `true`): Self = StObject.set(x, "jsonTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  trait SentMessageInfo extends StObject {
    
    /** an envelope object {from:‘address’, to:[‘address’]} */
    var envelope: Envelope
    
    /** JSON string */
    var message: String
    
    /** the Message-ID header value */
    var messageId: String
  }
  object SentMessageInfo {
    
    @scala.inline
    def apply(envelope: Envelope, message: String, messageId: String): SentMessageInfo = {
      val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    @scala.inline
    implicit class SentMessageInfoMutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    }
  }
}
