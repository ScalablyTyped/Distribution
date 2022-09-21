package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object humanSmsMod {
  
  inline def apply(account: String, code: String): Unit = (^.asInstanceOf[js.Dynamic].apply(account.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/sms/HumanSms", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HumanSms {
    def this(account: String, code: String) = this()
    
    /* CompleteClass */
    var account: String = js.native
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    override def sms(originator: Any, recipientsPhoneNumbers: Any, title: Any, text: Any): String = js.native
  }
  @JSImport("@nginstack/engine/lib/sms/HumanSms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HumanSms extends StObject {
    
    var account: String
    
    var code: String
    
    def sms(originator: Any, recipientsPhoneNumbers: Any, title: Any, text: Any): String
  }
  object HumanSms {
    
    inline def apply(account: String, code: String, sms: (Any, Any, Any, Any) => String): HumanSms = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], sms = js.Any.fromFunction4(sms))
      __obj.asInstanceOf[HumanSms]
    }
    
    extension [Self <: HumanSms](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setSms(value: (Any, Any, Any, Any) => String): Self = StObject.set(x, "sms", js.Any.fromFunction4(value))
    }
  }
}
