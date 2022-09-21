package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MIPMAP_MODES extends StObject
@JSImport("@pixi/constants", "MIPMAP_MODES")
@js.native
object MIPMAP_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MIPMAP_MODES & Double] = js.native
  
  @js.native
  sealed trait OFF
    extends StObject
       with MIPMAP_MODES
  /* 0 */ val OFF: typings.pixiConstants.mod.MIPMAP_MODES.OFF & Double = js.native
  
  @js.native
  sealed trait ON
    extends StObject
       with MIPMAP_MODES
  /* 2 */ val ON: typings.pixiConstants.mod.MIPMAP_MODES.ON & Double = js.native
  
  @js.native
  sealed trait ON_MANUAL
    extends StObject
       with MIPMAP_MODES
  /* 3 */ val ON_MANUAL: typings.pixiConstants.mod.MIPMAP_MODES.ON_MANUAL & Double = js.native
  
  @js.native
  sealed trait POW2
    extends StObject
       with MIPMAP_MODES
  /* 1 */ val POW2: typings.pixiConstants.mod.MIPMAP_MODES.POW2 & Double = js.native
}
