package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEmailEmailMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/email/Email", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Email
  @JSImport("@nginstack/engine/lib/email/Email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasDefaultSMTPSettings(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDefaultSMTPSettings")().asInstanceOf[Boolean]
  
  @js.native
  trait Email extends StObject {
    
    def addAttachment(name: String, content: String): Unit = js.native
    def addAttachment(name: String, content: js.typedarray.ArrayBuffer): Unit = js.native
    
    def addRecipient(nameOrEmail: String): Unit = js.native
    def addRecipient(nameOrEmail: String, email: String): Unit = js.native
    
    def addRecipientBcc(nameOrEmail: String): Unit = js.native
    def addRecipientBcc(nameOrEmail: String, email: String): Unit = js.native
    
    def addRelatedContent(name: String, content: String): String = js.native
    def addRelatedContent(name: String, content: js.typedarray.ArrayBuffer): String = js.native
    
    var autoTls: Boolean = js.native
    
    def clear(): Unit = js.native
    
    var content: String = js.native
    
    var fullSsl: Boolean = js.native
    
    var htmlContent: String = js.native
    
    var log: String = js.native
    
    var logEnabled: Boolean = js.native
    
    var password: String = js.native
    
    def sendLocally(): Unit = js.native
    
    var senderEmailAddress: String = js.native
    
    var senderName: String = js.native
    
    var smtpServer: String = js.native
    
    var subject: String = js.native
    
    var userName: String = js.native
    
    def write(content: Any): Unit = js.native
  }
}
