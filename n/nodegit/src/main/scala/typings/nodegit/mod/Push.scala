package typings.nodegit.mod

import typings.nodegit.pushOptionsMod.PushOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Push")
@js.native
class Push ()
  extends typings.nodegit.pushMod.Push
/* static members */
object Push {
  
  @JSImport("nodegit", "Push")
  @js.native
  val ^ : js.Any = js.native
  
  inline def initOptions(opts: PushOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
