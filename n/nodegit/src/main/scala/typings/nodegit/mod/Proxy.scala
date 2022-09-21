package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Proxy")
@js.native
open class Proxy ()
  extends typings.nodegit.proxyMod.Proxy
/* static members */
object Proxy {
  
  @JSImport("nodegit", "Proxy")
  @js.native
  val ^ : js.Any = js.native
  
  inline def initOptions(opts: typings.nodegit.proxyOptionsMod.ProxyOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
