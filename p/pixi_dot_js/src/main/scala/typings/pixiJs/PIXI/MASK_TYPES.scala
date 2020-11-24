package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
