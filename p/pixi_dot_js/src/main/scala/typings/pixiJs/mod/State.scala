package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "State")
@js.native
open class State ()
  extends typings.pixiCore.mod.State
/* static members */
object State {
  
  @JSImport("pixi.js", "State")
  @js.native
  val ^ : js.Any = js.native
  
  inline def for2d(): typings.pixiCore.libStateStateMod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("for2d")().asInstanceOf[typings.pixiCore.libStateStateMod.State]
}
