package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BUFFER_BITS extends js.Object
/**
  * Bitwise OR of masks that indicate the buffers to be cleared.
  *
  * @static
  * @memberof PIXI
  * @name BUFFER_BITS
  * @enum {number}
  * @property {number} COLOR - Indicates the buffers currently enabled for color writing.
  * @property {number} DEPTH - Indicates the depth buffer.
  * @property {number} STENCIL - Indicates the stencil buffer.
  */
@JSGlobal("PIXI.BUFFER_BITS")
@js.native
object BUFFER_BITS extends js.Object {
  
  @js.native
  sealed trait COLOR extends BUFFER_BITS
  
  @js.native
  sealed trait DEPTH extends BUFFER_BITS
  
  @js.native
  sealed trait STENCIL extends BUFFER_BITS
}
