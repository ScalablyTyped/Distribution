package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.proxyOptionsMod.ProxyOptions
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushOptionsMod {
  
  trait PushOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var callbacks: js.UndefOr[RemoteCallbacks] = js.undefined
    
    var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.undefined
    
    var pbParallelism: js.UndefOr[Double] = js.undefined
    
    var proxyOpts: js.UndefOr[ProxyOptions] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object PushOptions {
    
    inline def apply(): PushOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PushOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: RemoteCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCustomHeaders(value: Strarray | String | js.Array[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setCustomHeadersVarargs(value: String*): Self = StObject.set(x, "customHeaders", js.Array(value*))
      
      inline def setPbParallelism(value: Double): Self = StObject.set(x, "pbParallelism", value.asInstanceOf[js.Any])
      
      inline def setPbParallelismUndefined: Self = StObject.set(x, "pbParallelism", js.undefined)
      
      inline def setProxyOpts(value: ProxyOptions): Self = StObject.set(x, "proxyOpts", value.asInstanceOf[js.Any])
      
      inline def setProxyOptsUndefined: Self = StObject.set(x, "proxyOpts", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
