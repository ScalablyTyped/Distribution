package typings.next

import typings.next.distServerAppRenderMod.ReadonlyHeaders
import typings.next.distServerAppRenderMod.ReadonlyRequestCookies
import typings.node.asyncHooksMod.AsyncLocalStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsRequestAsyncStorageMod {
  
  @JSImport("next/dist/client/components/request-async-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/request-async-storage", "requestAsyncStorage")
  @js.native
  def requestAsyncStorage: AsyncLocalStorage[RequestStore] | RequestStore = js.native
  inline def requestAsyncStorage_=(x: AsyncLocalStorage[RequestStore] | RequestStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAsyncStorage")(x.asInstanceOf[js.Any])
  
  trait RequestStore extends StObject {
    
    var cookies: ReadonlyRequestCookies
    
    var headers: ReadonlyHeaders
    
    var previewData: Any
  }
  object RequestStore {
    
    inline def apply(cookies: ReadonlyRequestCookies, headers: ReadonlyHeaders, previewData: Any): RequestStore = {
      val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], previewData = previewData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestStore]
    }
    
    extension [Self <: RequestStore](x: Self) {
      
      inline def setCookies(value: ReadonlyRequestCookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ReadonlyHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPreviewData(value: Any): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
    }
  }
}
