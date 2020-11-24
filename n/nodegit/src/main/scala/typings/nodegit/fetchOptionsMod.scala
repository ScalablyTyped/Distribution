package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/fetch-options", JSImport.Namespace)
@js.native
object fetchOptionsMod extends js.Object {
  
  @js.native
  class FetchOptions ()
    extends /* key */ StringDictionary[js.Any] {
    
    var callbacks: js.UndefOr[RemoteCallbacks] = js.native
    
    var customHeaders: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var downloadTags: js.UndefOr[Double] = js.native
    
    var proxyOpts: js.UndefOr[js.Any] = js.native
    
    var prune: js.UndefOr[Double] = js.native
    
    var updateFetchhead: js.UndefOr[Double] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
