package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StrategyValues extends js.Object

@JSImport("pako", "StrategyValues")
@js.native
object StrategyValues extends js.Object {
  @js.native
  sealed trait Z_DEFAULT_STRATEGY
    extends pakoLib.pakoMod.StrategyValues
  
  @js.native
  sealed trait Z_FILTERED
    extends pakoLib.pakoMod.StrategyValues
  
  @js.native
  sealed trait Z_FIXED
    extends pakoLib.pakoMod.StrategyValues
  
  @js.native
  sealed trait Z_HUFFMAN_ONLY
    extends pakoLib.pakoMod.StrategyValues
  
  @js.native
  sealed trait Z_RLE
    extends pakoLib.pakoMod.StrategyValues
  
  /* 0 */ val Z_DEFAULT_STRATEGY: Z_DEFAULT_STRATEGY with scala.Double = js.native
  /* 1 */ val Z_FILTERED: Z_FILTERED with scala.Double = js.native
  /* 4 */ val Z_FIXED: Z_FIXED with scala.Double = js.native
  /* 2 */ val Z_HUFFMAN_ONLY: Z_HUFFMAN_ONLY with scala.Double = js.native
  /* 3 */ val Z_RLE: Z_RLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pakoLib.pakoMod.StrategyValues with scala.Double] = js.native
}

