package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.proxyOptionsMod.ProxyOptions
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushOptionsMod {
  
  @js.native
  trait PushOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var callbacks: js.UndefOr[RemoteCallbacks] = js.native
    
    var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var pbParallelism: js.UndefOr[Double] = js.native
    
    var proxyOpts: js.UndefOr[ProxyOptions] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object PushOptions {
    
    @scala.inline
    def apply(): PushOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushOptions]
    }
    
    @scala.inline
    implicit class PushOptionsMutableBuilder[Self <: PushOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: RemoteCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCustomHeaders(value: Strarray | String | js.Array[String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setCustomHeadersVarargs(value: String*): Self = StObject.set(x, "customHeaders", js.Array(value :_*))
      
      @scala.inline
      def setPbParallelism(value: Double): Self = StObject.set(x, "pbParallelism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbParallelismUndefined: Self = StObject.set(x, "pbParallelism", js.undefined)
      
      @scala.inline
      def setProxyOpts(value: ProxyOptions): Self = StObject.set(x, "proxyOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyOptsUndefined: Self = StObject.set(x, "proxyOpts", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
