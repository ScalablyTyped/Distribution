package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pop3Mod {
  
  inline def apply(host: String, port: Double, useSsl: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], useSsl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/mail/Pop3", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Pop3 {
    def this(host: String, port: Double, useSsl: Boolean) = this()
  }
  @JSImport("@nginstack/engine/lib/mail/Pop3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.nginstackEngine.nginstackEngineStrings.PASS
    - typings.nginstackEngine.nginstackEngineStrings.APOP
  */
  trait AuthMode extends StObject
  object AuthMode {
    
    inline def APOP: typings.nginstackEngine.nginstackEngineStrings.APOP = "APOP".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.APOP]
    
    inline def PASS: typings.nginstackEngine.nginstackEngineStrings.PASS = "PASS".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.PASS]
  }
  
  @js.native
  trait Pop3 extends StObject {
    
    var authCommand: AuthMode = js.native
    
    def delete(messageNumber: Double): Unit = js.native
    
    var fullResult: String = js.native
    
    val host: String = js.native
    
    def list(): Unit = js.native
    def list(messageNumber: Double): Unit = js.native
    
    def login(username: String, password: String): Boolean = js.native
    
    def logout(): Boolean = js.native
    
    def noop(): Boolean = js.native
    
    val port: Double = js.native
    
    def reset(): Boolean = js.native
    
    var resultString: String = js.native
    
    def retrieve(messageNumber: Double): Unit = js.native
    
    def status(): ServerStatus = js.native
    
    var timeout: Double = js.native
    
    val useSsl: Boolean = js.native
  }
  
  trait ServerStatus extends StObject {
    
    var messageCount: Double
    
    var messagesSize: Double
  }
  object ServerStatus {
    
    inline def apply(messageCount: Double, messagesSize: Double): ServerStatus = {
      val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any], messagesSize = messagesSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStatus]
    }
    
    extension [Self <: ServerStatus](x: Self) {
      
      inline def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
      
      inline def setMessagesSize(value: Double): Self = StObject.set(x, "messagesSize", value.asInstanceOf[js.Any])
    }
  }
}
