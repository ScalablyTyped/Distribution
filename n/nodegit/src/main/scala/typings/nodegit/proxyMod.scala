package typings.nodegit

import typings.nodegit.proxyOptionsMod.ProxyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyMod {
  
  @JSImport("nodegit/proxy", "Proxy")
  @js.native
  open class Proxy () extends StObject
  /* static members */
  object Proxy {
    
    @JSImport("nodegit/proxy", "Proxy")
    @js.native
    val ^ : js.Any = js.native
    
    inline def initOptions(opts: ProxyOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
