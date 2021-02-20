package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object BUFFER_BITS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.BUFFER_BITS with Double] = js.native
  
  /* 0 */ val COLOR: typings.pixiJs.PIXI.BUFFER_BITS.COLOR with Double = js.native
  
  /* 1 */ val DEPTH: typings.pixiJs.PIXI.BUFFER_BITS.DEPTH with Double = js.native
  
  /* 2 */ val STENCIL: typings.pixiJs.PIXI.BUFFER_BITS.STENCIL with Double = js.native
}
