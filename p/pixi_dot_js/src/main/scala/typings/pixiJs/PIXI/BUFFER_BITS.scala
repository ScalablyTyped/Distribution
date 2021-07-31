package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BUFFER_BITS extends StObject
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
  
  @js.native
  sealed trait COLOR
    extends StObject
       with BUFFER_BITS
  
  @js.native
  sealed trait DEPTH
    extends StObject
       with BUFFER_BITS
  
  @js.native
  sealed trait STENCIL
    extends StObject
       with BUFFER_BITS
}
