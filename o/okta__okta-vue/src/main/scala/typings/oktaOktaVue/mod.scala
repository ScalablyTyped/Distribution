package typings.oktaOktaVue

import typings.oktaOktaAuthJs.mod.OktaAuth
import typings.oktaOktaVue.bundlesTypesTypesMod.OktaVueOptions
import typings.vueRouter.mod.RouteLocationNormalized
import typings.vueRuntimeCore.mod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@okta/okta-vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@okta/okta-vue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@okta/okta-vue", "default.install")
    @js.native
    def install: js.Function2[
        /* app */ App[Any], 
        /* hasOktaAuthOnAuthRequiredOnAuthResume */ js.UndefOr[OktaVueOptions], 
        Unit
      ] = js.native
    inline def install(app: App[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def install(app: App[Any], hasOktaAuthOnAuthRequiredOnAuthResume: OktaVueOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(app.asInstanceOf[js.Any], hasOktaAuthOnAuthRequiredOnAuthResume.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def install_=(
      x: js.Function2[
          /* app */ App[Any], 
          /* hasOktaAuthOnAuthRequiredOnAuthResume */ js.UndefOr[OktaVueOptions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
  }
  
  inline def navigationGuard(to: RouteLocationNormalized): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("navigationGuard")(to.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def useAuth(): OktaAuth = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuth")().asInstanceOf[OktaAuth]
  
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
