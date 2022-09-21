package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CLEAR_MODES extends StObject
@JSImport("@pixi/constants", "CLEAR_MODES")
@js.native
object CLEAR_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CLEAR_MODES & Double] = js.native
  
  @js.native
  sealed trait AUTO
    extends StObject
       with CLEAR_MODES
  /* 2 */ val AUTO: typings.pixiConstants.mod.CLEAR_MODES.AUTO & Double = js.native
  
  @js.native
  sealed trait BLEND
    extends StObject
       with CLEAR_MODES
  /* 0 */ val BLEND: typings.pixiConstants.mod.CLEAR_MODES.BLEND & Double = js.native
  
  @js.native
  sealed trait BLIT
    extends StObject
       with CLEAR_MODES
  /* 2 */ val BLIT: typings.pixiConstants.mod.CLEAR_MODES.BLIT & Double = js.native
  
  @js.native
  sealed trait CLEAR
    extends StObject
       with CLEAR_MODES
  /* 1 */ val CLEAR: typings.pixiConstants.mod.CLEAR_MODES.CLEAR & Double = js.native
  
  @js.native
  sealed trait NO
    extends StObject
       with CLEAR_MODES
  /* 0 */ val NO: typings.pixiConstants.mod.CLEAR_MODES.NO & Double = js.native
  
  @js.native
  sealed trait YES
    extends StObject
       with CLEAR_MODES
  /* 1 */ val YES: typings.pixiConstants.mod.CLEAR_MODES.YES & Double = js.native
}
