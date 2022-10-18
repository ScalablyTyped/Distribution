package typings.oktaOktaVue

import typings.oktaOktaAuthJs.mod.OktaAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundlesTypesTypesMod {
  
  trait OktaVueOptions extends StObject {
    
    var oktaAuth: OktaAuth
    
    def onAuthRequired(oktaAuth: OktaAuth): js.Promise[Unit] | Unit
    @JSName("onAuthRequired")
    var onAuthRequired_Original: OnAuthRequiredFunction
    
    def onAuthResume(oktaAuth: OktaAuth): js.Promise[Unit] | Unit
    @JSName("onAuthResume")
    var onAuthResume_Original: OnAuthRequiredFunction
  }
  object OktaVueOptions {
    
    inline def apply(
      oktaAuth: OktaAuth,
      onAuthRequired: /* oktaAuth */ OktaAuth => js.Promise[Unit] | Unit,
      onAuthResume: /* oktaAuth */ OktaAuth => js.Promise[Unit] | Unit
    ): OktaVueOptions = {
      val __obj = js.Dynamic.literal(oktaAuth = oktaAuth.asInstanceOf[js.Any], onAuthRequired = js.Any.fromFunction1(onAuthRequired), onAuthResume = js.Any.fromFunction1(onAuthResume))
      __obj.asInstanceOf[OktaVueOptions]
    }
    
    extension [Self <: OktaVueOptions](x: Self) {
      
      inline def setOktaAuth(value: OktaAuth): Self = StObject.set(x, "oktaAuth", value.asInstanceOf[js.Any])
      
      inline def setOnAuthRequired(value: /* oktaAuth */ OktaAuth => js.Promise[Unit] | Unit): Self = StObject.set(x, "onAuthRequired", js.Any.fromFunction1(value))
      
      inline def setOnAuthResume(value: /* oktaAuth */ OktaAuth => js.Promise[Unit] | Unit): Self = StObject.set(x, "onAuthResume", js.Any.fromFunction1(value))
    }
  }
  
  type OnAuthRequiredFunction = js.Function1[/* oktaAuth */ OktaAuth, js.Promise[Unit] | Unit]
  
  /* augmented module */
  object vueRuntimeCoreAugmentingMod {
    
    trait ComponentCustomProperties extends StObject {
      
      @JSName("$_oktaVue_handleAuthStateUpdate")
      def $_oktaVue_handleAuthStateUpdate(
        authState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthState */ Any
      ): Unit
      
      @JSName("$auth")
      var $auth: OktaAuth
      
      var authState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthState */ Any
    }
    object ComponentCustomProperties {
      
      inline def apply(
        $_oktaVue_handleAuthStateUpdate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthState */ Any => Unit,
        $auth: OktaAuth,
        authState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthState */ Any
      ): ComponentCustomProperties = {
        val __obj = js.Dynamic.literal($_oktaVue_handleAuthStateUpdate = js.Any.fromFunction1($_oktaVue_handleAuthStateUpdate), $auth = $auth.asInstanceOf[js.Any], authState = authState.asInstanceOf[js.Any])
        __obj.asInstanceOf[ComponentCustomProperties]
      }
      
      extension [Self <: ComponentCustomProperties](x: Self) {
        
        inline def set$_oktaVue_handleAuthStateUpdate(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthState */ Any => Unit
        ): Self = StObject.set(x, "$_oktaVue_handleAuthStateUpdate", js.Any.fromFunction1(value))
        
        inline def set$auth(value: OktaAuth): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
        
        inline def setAuthState(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthState */ Any
        ): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      }
    }
  }
}
