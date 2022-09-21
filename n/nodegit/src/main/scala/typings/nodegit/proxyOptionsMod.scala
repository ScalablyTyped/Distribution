package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyOptionsMod {
  
  @JSImport("nodegit/proxy-options", "ProxyOptions")
  @js.native
  open class ProxyOptions ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var certificateCheck: js.UndefOr[js.Function] = js.native
    
    var credentials: js.UndefOr[js.Function] = js.native
    
    var payload: js.UndefOr[Any] = js.native
    
    var `type`: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
