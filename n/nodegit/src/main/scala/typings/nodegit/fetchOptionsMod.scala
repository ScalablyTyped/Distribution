package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchOptionsMod {
  
  @JSImport("nodegit/fetch-options", "FetchOptions")
  @js.native
  open class FetchOptions ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var callbacks: js.UndefOr[RemoteCallbacks] = js.native
    
    var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var downloadTags: js.UndefOr[Double] = js.native
    
    var proxyOpts: js.UndefOr[Any] = js.native
    
    var prune: js.UndefOr[Double] = js.native
    
    var updateFetchhead: js.UndefOr[Double] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
