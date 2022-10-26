package typings.next

import typings.node.asyncHooksMod.AsyncLocalStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsStaticGenerationAsyncStorageStorageBrowserMod {
  
  @JSImport("next/dist/client/components/static-generation-async-storage/storage-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/static-generation-async-storage/storage-browser", "staticGenerationAsyncStorage")
  @js.native
  def staticGenerationAsyncStorage: AsyncLocalStorage[StaticGenerationStore] | StaticGenerationStore = js.native
  inline def staticGenerationAsyncStorage_=(x: AsyncLocalStorage[StaticGenerationStore] | StaticGenerationStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticGenerationAsyncStorage")(x.asInstanceOf[js.Any])
  
  trait StaticGenerationStore extends StObject {
    
    var fetchRevalidate: js.UndefOr[Double] = js.undefined
    
    var inUse: js.UndefOr[Boolean] = js.undefined
    
    var isStaticGeneration: js.UndefOr[Boolean] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var revalidate: js.UndefOr[Double] = js.undefined
  }
  object StaticGenerationStore {
    
    inline def apply(): StaticGenerationStore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticGenerationStore]
    }
    
    extension [Self <: StaticGenerationStore](x: Self) {
      
      inline def setFetchRevalidate(value: Double): Self = StObject.set(x, "fetchRevalidate", value.asInstanceOf[js.Any])
      
      inline def setFetchRevalidateUndefined: Self = StObject.set(x, "fetchRevalidate", js.undefined)
      
      inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
      
      inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
      
      inline def setIsStaticGeneration(value: Boolean): Self = StObject.set(x, "isStaticGeneration", value.asInstanceOf[js.Any])
      
      inline def setIsStaticGenerationUndefined: Self = StObject.set(x, "isStaticGeneration", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setRevalidate(value: Double): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
    }
  }
}
