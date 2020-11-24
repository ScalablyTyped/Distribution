package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
