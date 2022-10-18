package typings.next

import typings.next.distSharedLibRouterRouterMod.NextRouter
import typings.next.distSharedLibUtilsMod.BaseContext
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.next.nextStrings.router
import typings.react.mod.ComponentType
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientWithRouterMod {
  
  @JSImport("next/dist/client/with-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: WithRouterProps */, C /* <: BaseContext */](ComposedComponent: NextComponentType[C, Any, P]): ComponentType[ExcludeRouterProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[ExcludeRouterProps[P]]]
  
  type ExcludeRouterProps[P] = Pick[P, Exclude[/* keyof P */ String, router]]
  
  trait WithRouterProps extends StObject {
    
    var router: NextRouter
  }
  object WithRouterProps {
    
    inline def apply(router: NextRouter): WithRouterProps = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithRouterProps]
    }
    
    extension [Self <: WithRouterProps](x: Self) {
      
      inline def setRouter(value: NextRouter): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
