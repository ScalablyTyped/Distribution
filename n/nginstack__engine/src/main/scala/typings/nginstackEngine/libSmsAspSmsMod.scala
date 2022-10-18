package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSmsAspSmsMod {
  
  inline def apply(userKey: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].apply(userKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/sms/AspSms", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AspSms {
    def this(userKey: String, password: String) = this()
    
    /* CompleteClass */
    var password: String = js.native
    
    /* CompleteClass */
    override def postHttp(content: Any): String = js.native
    
    /* CompleteClass */
    override def send(
      originator: Any,
      recipientsPhoneNumbers: Any,
      title: Any,
      text: Any,
      wapPushDescription: Any,
      wapPushUrl: Any
    ): String = js.native
    
    /* CompleteClass */
    override def sms(originator: Any, recipientsPhoneNumbers: Any, title: Any, text: Any): String = js.native
    
    /* CompleteClass */
    var userKey: String = js.native
    
    /* CompleteClass */
    override def wapPush(originator: Any, recipientsPhoneNumbers: Any, wapPushDescription: Any, wapPushUrl: Any): String = js.native
  }
  @JSImport("@nginstack/engine/lib/sms/AspSms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AspSms extends StObject {
    
    var password: String
    
    def postHttp(content: Any): String
    
    def send(
      originator: Any,
      recipientsPhoneNumbers: Any,
      title: Any,
      text: Any,
      wapPushDescription: Any,
      wapPushUrl: Any
    ): String
    
    def sms(originator: Any, recipientsPhoneNumbers: Any, title: Any, text: Any): String
    
    var userKey: String
    
    def wapPush(originator: Any, recipientsPhoneNumbers: Any, wapPushDescription: Any, wapPushUrl: Any): String
  }
  object AspSms {
    
    inline def apply(
      password: String,
      postHttp: Any => String,
      send: (Any, Any, Any, Any, Any, Any) => String,
      sms: (Any, Any, Any, Any) => String,
      userKey: String,
      wapPush: (Any, Any, Any, Any) => String
    ): AspSms = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], postHttp = js.Any.fromFunction1(postHttp), send = js.Any.fromFunction6(send), sms = js.Any.fromFunction4(sms), userKey = userKey.asInstanceOf[js.Any], wapPush = js.Any.fromFunction4(wapPush))
      __obj.asInstanceOf[AspSms]
    }
    
    extension [Self <: AspSms](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPostHttp(value: Any => String): Self = StObject.set(x, "postHttp", js.Any.fromFunction1(value))
      
      inline def setSend(value: (Any, Any, Any, Any, Any, Any) => String): Self = StObject.set(x, "send", js.Any.fromFunction6(value))
      
      inline def setSms(value: (Any, Any, Any, Any) => String): Self = StObject.set(x, "sms", js.Any.fromFunction4(value))
      
      inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
      
      inline def setWapPush(value: (Any, Any, Any, Any) => String): Self = StObject.set(x, "wapPush", js.Any.fromFunction4(value))
    }
  }
}
