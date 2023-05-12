package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait COLOR_MASK_BITS extends StObject
@JSImport("@pixi/constants", "COLOR_MASK_BITS")
@js.native
object COLOR_MASK_BITS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[COLOR_MASK_BITS & Double] = js.native
  
  /**
    * Alpha channel.
    * @default 0x
    */
  @js.native
  sealed trait ALPHA
    extends StObject
       with COLOR_MASK_BITS
  /* 8 */ val ALPHA: typings.pixiConstants.mod.COLOR_MASK_BITS.ALPHA & Double = js.native
  
  /**
    * Blue channel.
    * @default 0x4
    */
  @js.native
  sealed trait BLUE
    extends StObject
       with COLOR_MASK_BITS
  /* 4 */ val BLUE: typings.pixiConstants.mod.COLOR_MASK_BITS.BLUE & Double = js.native
  
  /**
    * Green channel
    * @default 0x2
    */
  @js.native
  sealed trait GREEN
    extends StObject
       with COLOR_MASK_BITS
  /* 2 */ val GREEN: typings.pixiConstants.mod.COLOR_MASK_BITS.GREEN & Double = js.native
  
  /**
    * Red channel.
    * @default 0x1
    */
  @js.native
  sealed trait RED
    extends StObject
       with COLOR_MASK_BITS
  /* 1 */ val RED: typings.pixiConstants.mod.COLOR_MASK_BITS.RED & Double = js.native
}
