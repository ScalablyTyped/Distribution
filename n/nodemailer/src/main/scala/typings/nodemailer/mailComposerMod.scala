package typings.nodemailer

import typings.nodemailer.mailerMod.Attachment
import typings.nodemailer.mailerMod.Options
import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailComposerMod {
  
  /** Creates the object for composing a MimeNode instance out from the mail options */
  @JSImport("nodemailer/lib/mail-composer", JSImport.Namespace)
  @js.native
  class ^ protected () extends MailComposer {
    def this(mail: Options) = this()
  }
  
  /** Creates the object for composing a MimeNode instance out from the mail options */
  @js.native
  trait MailComposer extends StObject {
    
    /** Builds MimeNode instance */
    def compile(): typings.nodemailer.mimeNodeMod.^ = js.native
    
    /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
    def getAlternatives(): js.Array[Attachment] = js.native
    
    /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
    def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
    
    var mail: Options = js.native
    
    var message: typings.nodemailer.mimeNodeMod.^ | `false` = js.native
  }
  object MailComposer {
    
    @scala.inline
    def apply(
      compile: () => typings.nodemailer.mimeNodeMod.^,
      getAlternatives: () => js.Array[Attachment],
      getAttachments: Boolean => js.Array[Attachment],
      mail: Options,
      message: typings.nodemailer.mimeNodeMod.^ | `false`
    ): MailComposer = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), getAlternatives = js.Any.fromFunction0(getAlternatives), getAttachments = js.Any.fromFunction1(getAttachments), mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailComposer]
    }
    
    @scala.inline
    implicit class MailComposerMutableBuilder[Self <: MailComposer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompile(value: () => typings.nodemailer.mimeNodeMod.^): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAlternatives(value: () => js.Array[Attachment]): Self = StObject.set(x, "getAlternatives", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttachments(value: Boolean => js.Array[Attachment]): Self = StObject.set(x, "getAttachments", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMail(value: Options): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: typings.nodemailer.mimeNodeMod.^ | `false`): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
