package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MASK_TYPES extends js.Object

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
@JSGlobal("PIXI.MASK_TYPES")
@js.native
object MASK_TYPES extends js.Object {
  @js.native
  sealed trait NONE extends MASK_TYPES
  
  @js.native
  sealed trait SCISSOR extends MASK_TYPES
  
  @js.native
  sealed trait SPRITE extends MASK_TYPES
  
  @js.native
  sealed trait STENCIL extends MASK_TYPES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MASK_TYPES with Double] = js.native
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 1 */ @js.native
  object SCISSOR extends TopLevel[SCISSOR with Double]
  
  /* 3 */ @js.native
  object SPRITE extends TopLevel[SPRITE with Double]
  
  /* 2 */ @js.native
  object STENCIL extends TopLevel[STENCIL with Double]
  
}

