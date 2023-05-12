package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Ticker")
@js.native
open class Ticker ()
  extends typings.pixiTicker.mod.Ticker
/* static members */
object Ticker {
  
  @JSImport("@pixi/core", "Ticker")
  @js.native
  val ^ : js.Any = js.native
  
  /** The private shared ticker instance */
  @JSImport("@pixi/core", "Ticker._shared")
  @js.native
  def _shared: Any = js.native
  inline def _shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_shared")(x.asInstanceOf[js.Any])
  
  /** The private system ticker instance  */
  @JSImport("@pixi/core", "Ticker._system")
  @js.native
  def _system: Any = js.native
  inline def _system_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_system")(x.asInstanceOf[js.Any])
  
  /**
    * Target frames per millisecond.
    * @static
    */
  @JSImport("@pixi/core", "Ticker.targetFPMS")
  @js.native
  def targetFPMS: Double = js.native
  inline def targetFPMS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("targetFPMS")(x.asInstanceOf[js.Any])
}
