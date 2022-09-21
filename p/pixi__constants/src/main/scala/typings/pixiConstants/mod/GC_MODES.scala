package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GC_MODES extends StObject
@JSImport("@pixi/constants", "GC_MODES")
@js.native
object GC_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GC_MODES & Double] = js.native
  
  @js.native
  sealed trait AUTO
    extends StObject
       with GC_MODES
  /* 0 */ val AUTO: typings.pixiConstants.mod.GC_MODES.AUTO & Double = js.native
  
  @js.native
  sealed trait MANUAL
    extends StObject
       with GC_MODES
  /* 1 */ val MANUAL: typings.pixiConstants.mod.GC_MODES.MANUAL & Double = js.native
}
