package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constants for mask implementations.
  * We use `type` suffix because it leads to very different behaviours
  *
  * @name MASK_TYPES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} NONE - Mask is ignored
  * @property {number} SCISSOR - Scissor mask, rectangle on screen, cheap
  * @property {number} STENCIL - Stencil mask, 1-bit, medium, works only if renderer supports stencil
  * @property {number} SPRITE - Mask that uses SpriteMaskFilter, uses temporary RenderTexture
  */
@JSImport("pixi.js", "MASK_TYPES")
@js.native
object MASK_TYPES extends js.Object {
  /* 0 */ val NONE: typings.pixiJs.PIXI.MASK_TYPES.NONE with Double = js.native
  /* 1 */ val SCISSOR: typings.pixiJs.PIXI.MASK_TYPES.SCISSOR with Double = js.native
  /* 3 */ val SPRITE: typings.pixiJs.PIXI.MASK_TYPES.SPRITE with Double = js.native
  /* 2 */ val STENCIL: typings.pixiJs.PIXI.MASK_TYPES.STENCIL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.MASK_TYPES with Double] = js.native
}

