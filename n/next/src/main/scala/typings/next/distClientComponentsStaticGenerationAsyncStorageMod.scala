package typings.next

import typings.next.distClientComponentsStaticGenerationAsyncStorageStorageMod.StaticGenerationStore
import typings.node.asyncHooksMod.AsyncLocalStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsStaticGenerationAsyncStorageMod {
  
  @JSImport("next/dist/client/components/static-generation-async-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/static-generation-async-storage", "staticGenerationAsyncStorage")
  @js.native
  def staticGenerationAsyncStorage: AsyncLocalStorage[StaticGenerationStore] | StaticGenerationStore = js.native
  inline def staticGenerationAsyncStorage_=(x: AsyncLocalStorage[StaticGenerationStore] | StaticGenerationStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticGenerationAsyncStorage")(x.asInstanceOf[js.Any])
}
