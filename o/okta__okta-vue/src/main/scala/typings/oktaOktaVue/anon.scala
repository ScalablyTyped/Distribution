package typings.oktaOktaVue

import typings.oktaOktaVue.mod.OktaVuePlugin.OktaOpenIDOptions
import typings.oktaOktaVue.oktaOktaVueStrings.cookie
import typings.oktaOktaVue.oktaOktaVueStrings.localStorage
import typings.oktaOktaVue.oktaOktaVueStrings.sessionStorage
import typings.vue.vueMod.Vue
import typings.vueRouter.routerMod.NavigationGuard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AuthRedirectGuard extends StObject {
    
    def authRedirectGuard(): js.Promise[NavigationGuard[Vue]] = js.native
    
    def getAccessToken(): js.Promise[String] = js.native
    
    def getFromUri(): String = js.native
    
    def getIdToken(): js.Promise[String] = js.native
    
    def getUser(): js.Promise[js.Any] = js.native
    
    def handleAuthentication(): js.Promise[Unit] = js.native
    
    def isAuthenticated(): js.Promise[Boolean] = js.native
    
    def loginRedirect(): Unit = js.native
    def loginRedirect(fromUri: String): Unit = js.native
    def loginRedirect(fromUri: String, additionalParams: OktaOpenIDOptions): Unit = js.native
    def loginRedirect(fromUri: Unit, additionalParams: OktaOpenIDOptions): Unit = js.native
    
    def logout(): js.Promise[Unit] = js.native
  }
  
  trait AutoRenew extends StObject {
    
    var autoRenew: js.UndefOr[Boolean] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var storage: js.UndefOr[localStorage | sessionStorage | cookie] = js.undefined
  }
  object AutoRenew {
    
    @scala.inline
    def apply(): AutoRenew = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoRenew]
    }
    
    @scala.inline
    implicit class AutoRenewMutableBuilder[Self <: AutoRenew] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRenew(value: Boolean): Self = StObject.set(x, "autoRenew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRenewUndefined: Self = StObject.set(x, "autoRenew", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setStorage(value: localStorage | sessionStorage | cookie): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
}
