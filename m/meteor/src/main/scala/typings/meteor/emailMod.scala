package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.anon.Attachments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMod {
  
  object Email {
    
    @JSImport("meteor/email", "Email.send")
    @js.native
    def send(options: Attachments): Unit = js.native
  }
  
  @js.native
  trait MailComposer extends StObject {
    
    def addHeader(name: String, value: String): Unit = js.native
    
    def pipe(stream: js.Any): Unit = js.native
    
    def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
    
    def streamMessage(): Unit = js.native
  }
  object MailComposer {
    
    @JSImport("meteor/email", "MailComposer")
    @js.native
    val ^ : typings.meteor.emailMod.MailComposerStatic = js.native
    
    @scala.inline
    implicit class MailComposerMutableBuilder[Self <: typings.meteor.emailMod.MailComposer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHeader(value: (String, String) => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPipe(value: js.Any => Unit): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMessageOption(value: (String, String, String, String) => Unit): Self = StObject.set(x, "setMessageOption", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStreamMessage(value: () => Unit): Self = StObject.set(x, "streamMessage", js.Any.fromFunction0(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/email", "MailComposer")
  @js.native
  class MailComposerCls protected ()
    extends typings.meteor.emailMod.MailComposer {
    def this(options: typings.meteor.emailMod.MailComposerOptions) = this()
  }
  
  @js.native
  trait MailComposerOptions extends StObject {
    
    var charset: String = js.native
    
    var encoding: String = js.native
    
    var escapeSMTP: Boolean = js.native
    
    var forceEmbeddedImages: Boolean = js.native
    
    var keepBcc: Boolean = js.native
  }
  object MailComposerOptions {
    
    @scala.inline
    def apply(
      charset: String,
      encoding: String,
      escapeSMTP: Boolean,
      forceEmbeddedImages: Boolean,
      keepBcc: Boolean
    ): typings.meteor.emailMod.MailComposerOptions = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.emailMod.MailComposerOptions]
    }
    
    @scala.inline
    implicit class MailComposerOptionsMutableBuilder[Self <: typings.meteor.emailMod.MailComposerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeSMTP(value: Boolean): Self = StObject.set(x, "escapeSMTP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEmbeddedImages(value: Boolean): Self = StObject.set(x, "forceEmbeddedImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepBcc(value: Boolean): Self = StObject.set(x, "keepBcc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MailComposerStatic
    extends Instantiable1[
          /* options */ typings.meteor.emailMod.MailComposerOptions, 
          typings.meteor.emailMod.MailComposer
        ]
}
