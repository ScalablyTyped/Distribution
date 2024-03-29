package typings.nodemailer

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.nodemailer.libMailerMod.Address
import typings.nodemailer.libMimeNodeMod.Envelope
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.mod.Transport
import typings.nodemailer.mod.TransportOptions
import typings.nodemailer.nodemailerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStreamTransportMod {
  
  @JSImport("nodemailer/lib/stream-transport", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StreamTransport {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var logger: Logger = js.native
    
    /* CompleteClass */
    @JSName("mailer")
    var mailer_StreamTransport: typings.nodemailer.libMailerMod.^[SentMessageInfo] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    override def send(
      mail: typings.nodemailer.libMailerMailMessageMod.^[SentMessageInfo],
      callback: js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]
    ): Unit = js.native
    
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
    
    /** if true, then returns the message as a Buffer object instead of a stream */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
    var newline: js.UndefOr[String] = js.undefined
    
    var streamTransport: `true`
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal(streamTransport = true)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setStreamTransport(value: `true`): Self = StObject.set(x, "streamTransport", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentMessageInfo extends StObject {
    
    var accepted: js.Array[String | Address]
    
    /** an envelope object {from:‘address’, to:[‘address’]} */
    var envelope: Envelope
    
    /** either stream (default) of buffer depending on the options */
    var message: Buffer | Readable
    
    /** the Message-ID header value */
    var messageId: String
    
    var pending: js.Array[String | Address]
    
    var rejected: js.Array[String | Address]
    
    var response: String
  }
  object SentMessageInfo {
    
    inline def apply(
      accepted: js.Array[String | Address],
      envelope: Envelope,
      message: Buffer | Readable,
      messageId: String,
      pending: js.Array[String | Address],
      rejected: js.Array[String | Address],
      response: String
    ): SentMessageInfo = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentMessageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
      
      inline def setAccepted(value: js.Array[String | Address]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
      
      inline def setAcceptedVarargs(value: (String | Address)*): Self = StObject.set(x, "accepted", js.Array(value*))
      
      inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Buffer | Readable): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setPending(value: js.Array[String | Address]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: (String | Address)*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setRejected(value: js.Array[String | Address]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedVarargs(value: (String | Address)*): Self = StObject.set(x, "rejected", js.Array(value*))
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamTransport
    extends StObject
       with Transport[SentMessageInfo] {
    
    var logger: Logger
    
    @JSName("mailer")
    var mailer_StreamTransport: typings.nodemailer.libMailerMod.^[SentMessageInfo]
    
    var options: Options
    
    var winbreak: Boolean
  }
  object StreamTransport {
    
    inline def apply(
      logger: Logger,
      mailer: typings.nodemailer.libMailerMod.^[SentMessageInfo],
      name: String,
      options: Options,
      send: (typings.nodemailer.libMailerMailMessageMod.^[SentMessageInfo], js.Function2[/* err */ js.Error | Null, SentMessageInfo, Unit]) => Unit,
      version: String,
      winbreak: Boolean
    ): StreamTransport = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mailer = mailer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), version = version.asInstanceOf[js.Any], winbreak = winbreak.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTransport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamTransport] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMailer(value: typings.nodemailer.libMailerMod.^[SentMessageInfo]): Self = StObject.set(x, "mailer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setWinbreak(value: Boolean): Self = StObject.set(x, "winbreak", value.asInstanceOf[js.Any])
    }
  }
}
