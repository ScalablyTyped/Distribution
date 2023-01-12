package typings.persona

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Persona {
  
  trait GetOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var privacyPolicy: js.UndefOr[String] = js.undefined
    
    var siteLogo: js.UndefOr[String] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var termsOfService: js.UndefOr[String] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setPrivacyPolicy(value: String): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
      
      inline def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
      
      inline def setSiteLogo(value: String): Self = StObject.set(x, "siteLogo", value.asInstanceOf[js.Any])
      
      inline def setSiteLogoUndefined: Self = StObject.set(x, "siteLogo", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
      
      inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    }
  }
  
  @js.native
  trait Persona extends StObject {
    
    def get(gotAssertion: js.Function1[/* s */ String, Unit]): Unit = js.native
    def get(gotAssertion: js.Function1[/* s */ String, Unit], options: GetOptions): Unit = js.native
    
    def logout(): Unit = js.native
    
    def request(): Unit = js.native
    def request(options: RequestOptions): Unit = js.native
    
    def watch(options: WatchOptions): Unit = js.native
  }
  
  trait RequestOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var oncancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var privacyPolicy: js.UndefOr[String] = js.undefined
    
    var returnTo: js.UndefOr[String] = js.undefined
    
    var siteLogo: js.UndefOr[String] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var termsOfService: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setOncancel(value: () => Unit): Self = StObject.set(x, "oncancel", js.Any.fromFunction0(value))
      
      inline def setOncancelUndefined: Self = StObject.set(x, "oncancel", js.undefined)
      
      inline def setPrivacyPolicy(value: String): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
      
      inline def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
      
      inline def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
      
      inline def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
      
      inline def setSiteLogo(value: String): Self = StObject.set(x, "siteLogo", value.asInstanceOf[js.Any])
      
      inline def setSiteLogoUndefined: Self = StObject.set(x, "siteLogo", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
      
      inline def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    }
  }
  
  trait WatchOptions extends StObject {
    
    var loggedInUser: String
    
    def onlogin(s: String): Unit
    
    def onlogout(): Unit
    
    var onready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(loggedInUser: String, onlogin: String => Unit, onlogout: () => Unit): WatchOptions = {
      val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any], onlogin = js.Any.fromFunction1(onlogin), onlogout = js.Any.fromFunction0(onlogout))
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      inline def setLoggedInUser(value: String): Self = StObject.set(x, "loggedInUser", value.asInstanceOf[js.Any])
      
      inline def setOnlogin(value: String => Unit): Self = StObject.set(x, "onlogin", js.Any.fromFunction1(value))
      
      inline def setOnlogout(value: () => Unit): Self = StObject.set(x, "onlogout", js.Any.fromFunction0(value))
      
      inline def setOnready(value: () => Unit): Self = StObject.set(x, "onready", js.Any.fromFunction0(value))
      
      inline def setOnreadyUndefined: Self = StObject.set(x, "onready", js.undefined)
    }
  }
}
