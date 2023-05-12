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
  
  /**
    * Alias for BLIT
    * @default 2
    */
  @js.native
  sealed trait AUTO
    extends StObject
       with CLEAR_MODES
  /* 2 */ val AUTO: typings.pixiConstants.mod.CLEAR_MODES.AUTO & Double = js.native
  
  /**
    * Do not clear the filter texture. The filter's output will blend on top of the output texture.
    * @default 0
    */
  @js.native
  sealed trait BLEND
    extends StObject
       with CLEAR_MODES
  /* 0 */ val BLEND: typings.pixiConstants.mod.CLEAR_MODES.BLEND & Double = js.native
  
  /**
    * Clear only if {@link PIXI.FilterSystem.forceClear} is set or if the filter uses pixel blending.
    * @default 2
    */
  @js.native
  sealed trait BLIT
    extends StObject
       with CLEAR_MODES
  /* 2 */ val BLIT: typings.pixiConstants.mod.CLEAR_MODES.BLIT & Double = js.native
  
  /**
    * Always clear the filter texture.
    * @default 1
    */
  @js.native
  sealed trait CLEAR
    extends StObject
       with CLEAR_MODES
  /* 1 */ val CLEAR: typings.pixiConstants.mod.CLEAR_MODES.CLEAR & Double = js.native
  
  /**
    * Alias for BLEND, same as `false` in earlier versions
    * @default 0
    */
  @js.native
  sealed trait NO
    extends StObject
       with CLEAR_MODES
  /* 0 */ val NO: typings.pixiConstants.mod.CLEAR_MODES.NO & Double = js.native
  
  /**
    * Alias for CLEAR, same as `true` in earlier versions
    * @default 1
    */
  @js.native
  sealed trait YES
    extends StObject
       with CLEAR_MODES
  /* 1 */ val YES: typings.pixiConstants.mod.CLEAR_MODES.YES & Double = js.native
}
