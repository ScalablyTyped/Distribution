package typings.oktaOktaVue

import typings.oktaOktaAuthJs.mod.OktaAuth
import typings.oktaOktaVue.bundlesTypesTypesMod.OktaVueOptions
import typings.vueRouter.mod.RouteLocationNormalized
import typings.vueRuntimeCore.mod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundlesTypesOktaVueMod {
  
  @JSImport("@okta/okta-vue/bundles/types/okta-vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@okta/okta-vue/bundles/types/okta-vue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@okta/okta-vue/bundles/types/okta-vue", "default.install")
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
}
