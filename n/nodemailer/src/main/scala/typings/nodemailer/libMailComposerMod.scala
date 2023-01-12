package typings.nodemailer

import typings.nodemailer.libMailerMod.Attachment
import typings.nodemailer.libMailerMod.Options
import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMailComposerMod {
  
  /** Creates the object for composing a MimeNode instance out from the mail options */
  @JSImport("nodemailer/lib/mail-composer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MailComposer {
    def this(mail: Options) = this()
    
    /** Builds MimeNode instance */
    /* CompleteClass */
    override def compile(): typings.nodemailer.libMimeNodeMod.^ = js.native
    
    /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
    /* CompleteClass */
    override def getAlternatives(): js.Array[Attachment] = js.native
    
    /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
    /* CompleteClass */
    override def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
    
    /* CompleteClass */
    var mail: Options = js.native
    
    /* CompleteClass */
    var message: typings.nodemailer.libMimeNodeMod.^ | `false` = js.native
  }
  
  /** Creates the object for composing a MimeNode instance out from the mail options */
  trait MailComposer extends StObject {
    
    /** Builds MimeNode instance */
    def compile(): typings.nodemailer.libMimeNodeMod.^
    
    /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
    def getAlternatives(): js.Array[Attachment]
    
    /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
    def getAttachments(findRelated: Boolean): js.Array[Attachment]
    
    var mail: Options
    
    var message: typings.nodemailer.libMimeNodeMod.^ | `false`
  }
  object MailComposer {
    
    inline def apply(
      compile: () => typings.nodemailer.libMimeNodeMod.^,
      getAlternatives: () => js.Array[Attachment],
      getAttachments: Boolean => js.Array[Attachment],
      mail: Options,
      message: typings.nodemailer.libMimeNodeMod.^ | `false`
    ): MailComposer = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), getAlternatives = js.Any.fromFunction0(getAlternatives), getAttachments = js.Any.fromFunction1(getAttachments), mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailComposer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailComposer] (val x: Self) extends AnyVal {
      
      inline def setCompile(value: () => typings.nodemailer.libMimeNodeMod.^): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
      
      inline def setGetAlternatives(value: () => js.Array[Attachment]): Self = StObject.set(x, "getAlternatives", js.Any.fromFunction0(value))
      
      inline def setGetAttachments(value: Boolean => js.Array[Attachment]): Self = StObject.set(x, "getAttachments", js.Any.fromFunction1(value))
      
      inline def setMail(value: Options): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: typings.nodemailer.libMimeNodeMod.^ | `false`): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
