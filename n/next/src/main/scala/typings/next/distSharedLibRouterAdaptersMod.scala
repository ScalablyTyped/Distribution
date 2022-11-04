package typings.next

import typings.next.anon.PickNextRouterisReadyquer
import typings.next.anon.PropsWithChildrenrouterPi
import typings.next.distSharedLibAppRouterContextMod.AppRouterInstance
import typings.next.distSharedLibRouterRouterMod.NextRouter
import typings.react.mod.global.JSX.Element
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterAdaptersMod {
  
  @JSImport("next/dist/shared/lib/router/adapters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PathnameContextProviderAdapter(param0: PropsWithChildrenrouterPi): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PathnameContextProviderAdapter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def adaptForAppRouterInstance(router: NextRouter): AppRouterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptForAppRouterInstance")(router.asInstanceOf[js.Any]).asInstanceOf[AppRouterInstance]
  
  inline def adaptForSearchParams(router: PickNextRouterisReadyquer): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptForSearchParams")(router.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
}
