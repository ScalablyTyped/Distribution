package typings.next

import typings.next.distClientComponentsNavigationMod.ReadonlyURLSearchParams
import typings.next.distSharedLibAppRouterContextMod.AppRouterInstance
import typings.next.distSharedLibServerInsertedHtmlMod.ServerInsertedHTMLHook
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationMod {
  
  @JSImport("next/navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/navigation", "ServerInsertedHTMLContext")
  @js.native
  val ServerInsertedHTMLContext: Context[ServerInsertedHTMLHook | Null] = js.native
  
  inline def notFound(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")().asInstanceOf[scala.Nothing]
  
  inline def redirect(url: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def usePathname(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("usePathname")().asInstanceOf[String | Null]
  
  inline def useRouter(): AppRouterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[AppRouterInstance]
  
  inline def useSearchParams(): ReadonlyURLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("useSearchParams")().asInstanceOf[ReadonlyURLSearchParams]
  
  inline def useSelectedLayoutSegment(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegment")().asInstanceOf[String | Null]
  inline def useSelectedLayoutSegment(parallelRouteKey: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegment")(parallelRouteKey.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def useSelectedLayoutSegments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegments")().asInstanceOf[js.Array[String]]
  inline def useSelectedLayoutSegments(parallelRouteKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegments")(parallelRouteKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def useServerInsertedHTML(callback: js.Function0[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useServerInsertedHTML")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
