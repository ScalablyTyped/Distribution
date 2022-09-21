package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SCALE_MODES extends StObject
@JSImport("@pixi/constants", "SCALE_MODES")
@js.native
object SCALE_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SCALE_MODES & Double] = js.native
  
  @js.native
  sealed trait LINEAR
    extends StObject
       with SCALE_MODES
  /* 1 */ val LINEAR: typings.pixiConstants.mod.SCALE_MODES.LINEAR & Double = js.native
  
  @js.native
  sealed trait NEAREST
    extends StObject
       with SCALE_MODES
  /* 0 */ val NEAREST: typings.pixiConstants.mod.SCALE_MODES.NEAREST & Double = js.native
}
