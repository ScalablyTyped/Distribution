package typings.next

import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.next.distSharedLibAppRouterContextMod.AppRouterInstance
import typings.next.distSharedLibFlushEffectsMod.FlushEffectsHook
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsHooksClientMod {
  
  @JSImport("next/dist/client/components/hooks-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/hooks-client", "FlushEffectsContext")
  @js.native
  val FlushEffectsContext: Context[FlushEffectsHook | Null] = js.native
  
  inline def useFlushEffects(callback: js.Function0[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlushEffects")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def usePathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("usePathname")().asInstanceOf[String]
  
  inline def useRouter(): AppRouterInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[AppRouterInstance]
  
  inline def useSearchParam(key: String): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSearchParam")(key.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  
  inline def useSearchParams(): NextParsedUrlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("useSearchParams")().asInstanceOf[NextParsedUrlQuery]
  
  inline def useSelectedLayoutSegment(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegment")().asInstanceOf[String]
  inline def useSelectedLayoutSegment(parallelRouteKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectedLayoutSegment")(parallelRouteKey.asInstanceOf[js.Any]).asInstanceOf[String]
}
