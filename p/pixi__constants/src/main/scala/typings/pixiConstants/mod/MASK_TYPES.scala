package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MASK_TYPES extends StObject
@JSImport("@pixi/constants", "MASK_TYPES")
@js.native
object MASK_TYPES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MASK_TYPES & Double] = js.native
  
  @js.native
  sealed trait COLOR
    extends StObject
       with MASK_TYPES
  /* 4 */ val COLOR: typings.pixiConstants.mod.MASK_TYPES.COLOR & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with MASK_TYPES
  /* 0 */ val NONE: typings.pixiConstants.mod.MASK_TYPES.NONE & Double = js.native
  
  @js.native
  sealed trait SCISSOR
    extends StObject
       with MASK_TYPES
  /* 1 */ val SCISSOR: typings.pixiConstants.mod.MASK_TYPES.SCISSOR & Double = js.native
  
  @js.native
  sealed trait SPRITE
    extends StObject
       with MASK_TYPES
  /* 3 */ val SPRITE: typings.pixiConstants.mod.MASK_TYPES.SPRITE & Double = js.native
  
  @js.native
  sealed trait STENCIL
    extends StObject
       with MASK_TYPES
  /* 2 */ val STENCIL: typings.pixiConstants.mod.MASK_TYPES.STENCIL & Double = js.native
}
