package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WRAP_MODES extends StObject
@JSImport("@pixi/constants", "WRAP_MODES")
@js.native
object WRAP_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WRAP_MODES & Double] = js.native
  
  @js.native
  sealed trait CLAMP
    extends StObject
       with WRAP_MODES
  /* 33071 */ val CLAMP: typings.pixiConstants.mod.WRAP_MODES.CLAMP & Double = js.native
  
  @js.native
  sealed trait MIRRORED_REPEAT
    extends StObject
       with WRAP_MODES
  /* 33648 */ val MIRRORED_REPEAT: typings.pixiConstants.mod.WRAP_MODES.MIRRORED_REPEAT & Double = js.native
  
  @js.native
  sealed trait REPEAT
    extends StObject
       with WRAP_MODES
  /* 10497 */ val REPEAT: typings.pixiConstants.mod.WRAP_MODES.REPEAT & Double = js.native
}
