package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TARGETS extends js.Object

/**
  * Various GL target types.
  *
  * @memberof PIXI
  * @static
  * @name TARGETS
  * @enum {number}
  * @property {number} TEXTURE_2D=3553
  * @property {number} TEXTURE_CUBE_MAP=34067
  * @property {number} TEXTURE_2D_ARRAY=35866
  * @property {number} TEXTURE_CUBE_MAP_POSITIVE_X=34069
  * @property {number} TEXTURE_CUBE_MAP_NEGATIVE_X=34070
  * @property {number} TEXTURE_CUBE_MAP_POSITIVE_Y=34071
  * @property {number} TEXTURE_CUBE_MAP_NEGATIVE_Y=34072
  * @property {number} TEXTURE_CUBE_MAP_POSITIVE_Z=34073
  * @property {number} TEXTURE_CUBE_MAP_NEGATIVE_Z=34074
  */
@JSGlobal("PIXI.TARGETS")
@js.native
object TARGETS extends js.Object {
  @js.native
  sealed trait TEXTURE_2D extends TARGETS
  
  @js.native
  sealed trait TEXTURE_2D_ARRAY extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_X extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_Y extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_NEGATIVE_Z extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_X extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_Y extends TARGETS
  
  @js.native
  sealed trait TEXTURE_CUBE_MAP_POSITIVE_Z extends TARGETS
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TARGETS with Double] = js.native
  /* 0 */ @js.native
  object TEXTURE_2D extends TopLevel[TEXTURE_2D with Double]
  
  /* 2 */ @js.native
  object TEXTURE_2D_ARRAY extends TopLevel[TEXTURE_2D_ARRAY with Double]
  
  /* 1 */ @js.native
  object TEXTURE_CUBE_MAP extends TopLevel[TEXTURE_CUBE_MAP with Double]
  
  /* 4 */ @js.native
  object TEXTURE_CUBE_MAP_NEGATIVE_X extends TopLevel[TEXTURE_CUBE_MAP_NEGATIVE_X with Double]
  
  /* 6 */ @js.native
  object TEXTURE_CUBE_MAP_NEGATIVE_Y extends TopLevel[TEXTURE_CUBE_MAP_NEGATIVE_Y with Double]
  
  /* 8 */ @js.native
  object TEXTURE_CUBE_MAP_NEGATIVE_Z extends TopLevel[TEXTURE_CUBE_MAP_NEGATIVE_Z with Double]
  
  /* 3 */ @js.native
  object TEXTURE_CUBE_MAP_POSITIVE_X extends TopLevel[TEXTURE_CUBE_MAP_POSITIVE_X with Double]
  
  /* 5 */ @js.native
  object TEXTURE_CUBE_MAP_POSITIVE_Y extends TopLevel[TEXTURE_CUBE_MAP_POSITIVE_Y with Double]
  
  /* 7 */ @js.native
  object TEXTURE_CUBE_MAP_POSITIVE_Z extends TopLevel[TEXTURE_CUBE_MAP_POSITIVE_Z with Double]
  
}

