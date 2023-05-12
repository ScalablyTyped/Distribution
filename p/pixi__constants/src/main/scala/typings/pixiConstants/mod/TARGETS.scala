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
  
  /**
    * A two-dimensional texture
    * @default 3553
    */
  @js.native
  sealed trait TEXTURE_2D
    extends StObject
       with TARGETS
  /* 3553 */ val TEXTURE_2D: typings.pixiConstants.mod.TARGETS.TEXTURE_2D & Double = js.native
  
  /**
    * A two-dimensional array texture.
    * @default 35866
    */
  @js.native
  sealed trait TEXTURE_2D_ARRAY
    extends StObject
       with TARGETS
  /* 35866 */ val TEXTURE_2D_ARRAY: typings.pixiConstants.mod.TARGETS.TEXTURE_2D_ARRAY & Double = js.native
  
  /**
    * A cube-mapped texture. When using a WebGL 2 context, the following values are available additionally:
    * - gl.TEXTURE_3D: A three-dimensional texture.
    * - gl.TEXTURE_2D_ARRAY: A two-dimensional array texture.
    * @default 34067
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP
    extends StObject
       with TARGETS
  /* 34067 */ val TEXTURE_CUBE_MAP: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP & Double = js.native
  
  /**
    * Negative X face for a cube-mapped texture.
    * @default 34070
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_X
    extends StObject
       with TARGETS
  /* 34070 */ val TEXTURE_CUBE_MAP_NEGATIVE_X: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_NEGATIVE_X & Double = js.native
  
  /**
    * Negative Y face for a cube-mapped texture.
    * @default 34072
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_Y
    extends StObject
       with TARGETS
  /* 34072 */ val TEXTURE_CUBE_MAP_NEGATIVE_Y: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_NEGATIVE_Y & Double = js.native
  
  /**
    * Negative Z face for a cube-mapped texture.
    * @default 34074
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_Z
    extends StObject
       with TARGETS
  /* 34074 */ val TEXTURE_CUBE_MAP_NEGATIVE_Z: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_NEGATIVE_Z & Double = js.native
  
  /**
    * Positive X face for a cube-mapped texture.
    * @default 34069
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_X
    extends StObject
       with TARGETS
  /* 34069 */ val TEXTURE_CUBE_MAP_POSITIVE_X: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_POSITIVE_X & Double = js.native
  
  /**
    * Positive Y face for a cube-mapped texture.
    * @default 34071
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_Y
    extends StObject
       with TARGETS
  /* 34071 */ val TEXTURE_CUBE_MAP_POSITIVE_Y: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_POSITIVE_Y & Double = js.native
  
  /**
    * Positive Z face for a cube-mapped texture.
    * @default 34073
    */
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_Z
    extends StObject
       with TARGETS
  /* 34073 */ val TEXTURE_CUBE_MAP_POSITIVE_Z: typings.pixiConstants.mod.TARGETS.TEXTURE_CUBE_MAP_POSITIVE_Z & Double = js.native
}
