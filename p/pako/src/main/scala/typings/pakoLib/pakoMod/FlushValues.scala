package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlushValues extends js.Object

@JSImport("pako", "FlushValues")
@js.native
object FlushValues extends js.Object {
  @js.native
  sealed trait Z_BLOCK
    extends pakoLib.pakoMod.FlushValues
  
  @js.native
  sealed trait Z_FINISH
    extends pakoLib.pakoMod.FlushValues
  
  @js.native
  sealed trait Z_FULL_FLUSH
    extends pakoLib.pakoMod.FlushValues
  
  @js.native
  sealed trait Z_NO_FLUSH
    extends pakoLib.pakoMod.FlushValues
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH
    extends pakoLib.pakoMod.FlushValues
  
  @js.native
  sealed trait Z_SYNC_FLUSH
    extends pakoLib.pakoMod.FlushValues
  
  @js.native
  sealed trait Z_TREES
    extends pakoLib.pakoMod.FlushValues
  
  /* 5 */ val Z_BLOCK: Z_BLOCK with scala.Double = js.native
  /* 4 */ val Z_FINISH: Z_FINISH with scala.Double = js.native
  /* 3 */ val Z_FULL_FLUSH: Z_FULL_FLUSH with scala.Double = js.native
  /* 0 */ val Z_NO_FLUSH: Z_NO_FLUSH with scala.Double = js.native
  /* 1 */ val Z_PARTIAL_FLUSH: Z_PARTIAL_FLUSH with scala.Double = js.native
  /* 2 */ val Z_SYNC_FLUSH: Z_SYNC_FLUSH with scala.Double = js.native
  /* 6 */ val Z_TREES: Z_TREES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pakoLib.pakoMod.FlushValues with scala.Double] = js.native
}

