package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Fetch")
@js.native
open class Fetch ()
  extends typings.nodegit.fetchMod.Fetch
/* static members */
object Fetch {
  
  @JSImport("nodegit", "Fetch")
  @js.native
  val ^ : js.Any = js.native
  
  inline def initOptions(opts: typings.nodegit.fetchOptionsMod.FetchOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
