package typings.next

import typings.next.anon.Cache
import typings.std.CacheStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesCacheMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/cache", "caches")
  @js.native
  val caches: CacheStorage = js.native
  
  inline def createCaches(): js.UndefOr[Cache] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCaches")().asInstanceOf[js.UndefOr[Cache]]
}
