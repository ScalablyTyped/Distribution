package typings.next

import typings.next.anon.FnCall
import typings.next.distSharedLibAppRouterContextMod.AppRouterInstance
import typings.next.distSharedLibServerInsertedHtmlMod.ServerInsertedHTMLHook
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsNavigationMod {
  
  @JSImport("next/dist/client/components/navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/navigation", "ServerInsertedHTMLContext")
  @js.native
  val ServerInsertedHTMLContext: Context[ServerInsertedHTMLHook | Null] = js.native
  
  inline def notFound(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")().asInstanceOf[Unit]
  
  inline def redirect(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def usePathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("usePathname")().asInstanceOf[String]
  
  inline def useRouter(): AppRouterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[AppRouterInstance]
  
  inline def useSearchParams(): ReadonlyURLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("useSearchParams")().asInstanceOf[ReadonlyURLSearchParams]
  
  inline def useSelectedLayoutSegment(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegment")().asInstanceOf[String]
  inline def useSelectedLayoutSegment(parallelRouteKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegment")(parallelRouteKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useSelectedLayoutSegments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegments")().asInstanceOf[js.Array[String]]
  inline def useSelectedLayoutSegments(parallelRouteKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegments")(parallelRouteKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def useServerInsertedHTML(callback: js.Function0[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useServerInsertedHTML")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait ReadonlyURLSearchParams extends StObject {
    
    def append(): Unit = js.native
    
    def delete(): Unit = js.native
    
    var entries: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    var forEach: FnCall = js.native
    
    var get: js.Function1[/* name */ String, String | Null] = js.native
    
    var getAll: js.Function1[/* name */ String, js.Array[String]] = js.native
    
    var has: js.Function1[/* name */ String, Boolean] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    var keys: js.Function0[IterableIterator[String]] = js.native
    
    def set(): Unit = js.native
    
    def sort(): Unit = js.native
    
    @JSName("toString")
    var toString_FReadonlyURLSearchParams: js.Function0[String] = js.native
    
    var values: js.Function0[IterableIterator[String]] = js.native
  }
}
