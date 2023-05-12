package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BUFFER_BITS extends StObject
@JSImport("@pixi/constants", "BUFFER_BITS")
@js.native
object BUFFER_BITS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BUFFER_BITS & Double] = js.native
  
  /**
    * Indicates the buffers currently enabled for color writing.
    * @default 0x00004000
    */
  @js.native
  sealed trait COLOR
    extends StObject
       with BUFFER_BITS
  /* 16384 */ val COLOR: typings.pixiConstants.mod.BUFFER_BITS.COLOR & Double = js.native
  
  /**
    * Indicates the depth buffer.
    * @default 0x00000100
    */
  @js.native
  sealed trait DEPTH
    extends StObject
       with BUFFER_BITS
  /* 256 */ val DEPTH: typings.pixiConstants.mod.BUFFER_BITS.DEPTH & Double = js.native
  
  /**
    * Indicates the stencil buffer.
    * @default 0x00000400
    */
  @js.native
  sealed trait STENCIL
    extends StObject
       with BUFFER_BITS
  /* 1024 */ val STENCIL: typings.pixiConstants.mod.BUFFER_BITS.STENCIL & Double = js.native
}
