package typings.next

import typings.next.distServerNextMod.NextServer
import typings.next.distServerNextMod.NextServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibStartServerMod {
  
  @JSImport("next/dist/server/lib/start-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startServer(opts: StartServerOptions): js.Promise[NextServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("startServer")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NextServer]]
  
  trait StartServerOptions
    extends StObject
       with NextServerOptions {
    
    var allowRetry: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveTimeout: js.UndefOr[Double] = js.undefined
  }
  object StartServerOptions {
    
    inline def apply(): StartServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartServerOptions]
    }
    
    extension [Self <: StartServerOptions](x: Self) {
      
      inline def setAllowRetry(value: Boolean): Self = StObject.set(x, "allowRetry", value.asInstanceOf[js.Any])
      
      inline def setAllowRetryUndefined: Self = StObject.set(x, "allowRetry", js.undefined)
      
      inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
    }
  }
}
