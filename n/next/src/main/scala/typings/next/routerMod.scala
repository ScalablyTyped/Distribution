package typings.next

import typings.next.anon.Component
import typings.next.distClientRouterMod.RouterEvent
import typings.next.distClientRouterMod.SingletonRouter
import typings.next.distClientWithRouterMod.ExcludeRouterProps
import typings.next.distClientWithRouterMod.WithRouterProps
import typings.next.distSharedLibMittMod.MittEmitter
import typings.next.distSharedLibRouterRouterMod.NextRouter
import typings.next.distSharedLibUtilsMod.BaseContext
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.next.nextBooleans.`true`
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("next/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/router", JSImport.Default)
  @js.native
  val default: SingletonRouter = js.native
  
  @JSImport("next/router", "Router")
  @js.native
  open class Router protected ()
    extends typings.next.distClientRouterMod.Router {
    def this(
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      param3: Component
    ) = this()
  }
  /* static members */
  object Router {
    
    @JSImport("next/router", "Router")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/router", "Router.events")
    @js.native
    def events: MittEmitter[RouterEvent] = js.native
    inline def events_=(x: MittEmitter[RouterEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  inline def useRouter(): NextRouter = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[NextRouter]
  
  inline def useRouter_true(throwOnMissing: `true`): NextRouter = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")(throwOnMissing.asInstanceOf[js.Any]).asInstanceOf[NextRouter]
  
  inline def withRouter[P /* <: WithRouterProps */, C /* <: BaseContext */](ComposedComponent: NextComponentType[C, Any, P]): ComponentType[ExcludeRouterProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[ExcludeRouterProps[P]]]
}
