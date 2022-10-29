package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Ticker")
@js.native
open class Ticker ()
  extends typings.pixiCore.mod.Ticker
/* static members */
object Ticker {
  
  @JSImport("pixi.js", "Ticker")
  @js.native
  val ^ : js.Any = js.native
  
  /** The private shared ticker instance */
  @JSImport("pixi.js", "Ticker._shared")
  @js.native
  def _shared: Any = js.native
  inline def _shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_shared")(x.asInstanceOf[js.Any])
  
  /** The private system ticker instance  */
  @JSImport("pixi.js", "Ticker._system")
  @js.native
  def _system: Any = js.native
  inline def _system_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_system")(x.asInstanceOf[js.Any])
}
