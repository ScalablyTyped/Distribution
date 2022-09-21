package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TARGETS extends StObject
@JSImport("@pixi/constants", "TARGETS")
@js.native
object TARGETS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TARGETS & Double] = js.native
  
  @js.native
  sealed trait TEXTURE_2D
    extends StObject
       with TARGETS
  /* 3553 */ val TEXTURE_2D: typings.pixiConstants.mod.TARGETS.TEXTURE_2D & Double = js.native
  
  @js.native
  sealed trait TEXTURE_2D_ARRAY
    extends StObject
       with TARGETS
  /* 35866 */ val TEXTURE_2D_ARRAY: typings.pixiConstants.mod.TARGETS.TEXTURE_2D_ARRAY & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP
    extends StObject
       with TARGETS
  /* 34067 */ val TEXTURE_CUBE_MAP: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_X
    extends StObject
       with TARGETS
  /* 34070 */ val TEXTURE_CUBE_MAP_NEGATIVE_X: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_NEGATIVE_X & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_Y
    extends StObject
       with TARGETS
  /* 34072 */ val TEXTURE_CUBE_MAP_NEGATIVE_Y: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_NEGATIVE_Y & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_Z
    extends StObject
       with TARGETS
  /* 34074 */ val TEXTURE_CUBE_MAP_NEGATIVE_Z: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_NEGATIVE_Z & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_X
    extends StObject
       with TARGETS
  /* 34069 */ val TEXTURE_CUBE_MAP_POSITIVE_X: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_POSITIVE_X & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_Y
    extends StObject
       with TARGETS
  /* 34071 */ val TEXTURE_CUBE_MAP_POSITIVE_Y: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_POSITIVE_Y & Double = js.native
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_Z
    extends StObject
       with TARGETS
  /* 34073 */ val TEXTURE_CUBE_MAP_POSITIVE_Z: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_POSITIVE_Z & Double = js.native
}
