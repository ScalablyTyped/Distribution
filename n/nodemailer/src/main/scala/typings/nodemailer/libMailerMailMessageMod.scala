package typings.nodemailer

import typings.nodemailer.libMailerMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMailerMailMessageMod {
  
  @JSImport("nodemailer/lib/mailer/mail-message", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with MailMessage[T] {
    def this(mailer: typings.nodemailer.libMailerMod.^[T], data: Options) = this()
  }
  
  @js.native
  trait MailMessage[T] extends StObject {
    
    var data: Options = js.native
    
    var mailer: typings.nodemailer.libMailerMod.^[T] = js.native
    
    var message: typings.nodemailer.libMimeNodeMod.^ = js.native
    
    def normalize(
      callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Options], Unit]
    ): Unit = js.native
    
    def resolveAll(
      callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Options], Unit]
    ): Unit = js.native
    
    def resolveContent(
      data: js.Array[Any],
      key: String,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[Any], Any]
    ): js.Promise[Any] = js.native
    def resolveContent(
      data: js.Array[Any],
      key: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[Any], Any]
    ): js.Promise[Any] = js.native
    def resolveContent(
      data: js.Object,
      key: String,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[Any], Any]
    ): js.Promise[Any] = js.native
    def resolveContent(
      data: js.Object,
      key: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[Any], Any]
    ): js.Promise[Any] = js.native
    
    def setListHeaders(): Unit = js.native
    
    def setMailerHeader(): Unit = js.native
    
    def setPriorityHeaders(): Unit = js.native
  }
}
