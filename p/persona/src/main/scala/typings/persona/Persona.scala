package typings.persona

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Persona {
  
  @js.native
  trait GetOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var privacyPolicy: js.UndefOr[String] = js.native
    
    var siteLogo: js.UndefOr[String] = js.native
    
    var siteName: js.UndefOr[String] = js.native
    
    var termsOfService: js.UndefOr[String] = js.native
  }
  object GetOptions {
    
    @scala.inline
    def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setPrivacyPolicy(value: String): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
      
      @scala.inline
      def setSiteLogo(value: String): Self = StObject.set(x, "siteLogo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteLogoUndefined: Self = StObject.set(x, "siteLogo", js.undefined)
      
      @scala.inline
      def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      @scala.inline
      def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
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
  
  @js.native
  trait RequestOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var oncancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var privacyPolicy: js.UndefOr[String] = js.native
    
    var returnTo: js.UndefOr[String] = js.native
    
    var siteLogo: js.UndefOr[String] = js.native
    
    var siteName: js.UndefOr[String] = js.native
    
    var termsOfService: js.UndefOr[String] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setOncancel(value: () => Unit): Self = StObject.set(x, "oncancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncancelUndefined: Self = StObject.set(x, "oncancel", js.undefined)
      
      @scala.inline
      def setPrivacyPolicy(value: String): Self = StObject.set(x, "privacyPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivacyPolicyUndefined: Self = StObject.set(x, "privacyPolicy", js.undefined)
      
      @scala.inline
      def setReturnTo(value: String): Self = StObject.set(x, "returnTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnToUndefined: Self = StObject.set(x, "returnTo", js.undefined)
      
      @scala.inline
      def setSiteLogo(value: String): Self = StObject.set(x, "siteLogo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteLogoUndefined: Self = StObject.set(x, "siteLogo", js.undefined)
      
      @scala.inline
      def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      @scala.inline
      def setTermsOfService(value: String): Self = StObject.set(x, "termsOfService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermsOfServiceUndefined: Self = StObject.set(x, "termsOfService", js.undefined)
    }
  }
  
  @js.native
  trait WatchOptions extends StObject {
    
    var loggedInUser: String = js.native
    
    def onlogin(s: String): Unit = js.native
    
    def onlogout(): Unit = js.native
    
    var onready: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(loggedInUser: String, onlogin: String => Unit, onlogout: () => Unit): WatchOptions = {
      val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any], onlogin = js.Any.fromFunction1(onlogin), onlogout = js.Any.fromFunction0(onlogout))
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoggedInUser(value: String): Self = StObject.set(x, "loggedInUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlogin(value: String => Unit): Self = StObject.set(x, "onlogin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlogout(value: () => Unit): Self = StObject.set(x, "onlogout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnready(value: () => Unit): Self = StObject.set(x, "onready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnreadyUndefined: Self = StObject.set(x, "onready", js.undefined)
    }
  }
}
