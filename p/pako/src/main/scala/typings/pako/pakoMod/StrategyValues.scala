package typings.pako.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StrategyValues extends js.Object

@JSImport("pako", "StrategyValues")
@js.native
object StrategyValues extends js.Object {
  @js.native
  sealed trait Z_DEFAULT_STRATEGY extends StrategyValues
  
  @js.native
  sealed trait Z_FILTERED extends StrategyValues
  
  @js.native
  sealed trait Z_FIXED extends StrategyValues
  
  @js.native
  sealed trait Z_HUFFMAN_ONLY extends StrategyValues
  
  @js.native
  sealed trait Z_RLE extends StrategyValues
  
  /* 0 */ val Z_DEFAULT_STRATEGY: typings.pako.pakoMod.StrategyValues.Z_DEFAULT_STRATEGY with Double = js.native
  /* 1 */ val Z_FILTERED: typings.pako.pakoMod.StrategyValues.Z_FILTERED with Double = js.native
  /* 4 */ val Z_FIXED: typings.pako.pakoMod.StrategyValues.Z_FIXED with Double = js.native
  /* 2 */ val Z_HUFFMAN_ONLY: typings.pako.pakoMod.StrategyValues.Z_HUFFMAN_ONLY with Double = js.native
  /* 3 */ val Z_RLE: typings.pako.pakoMod.StrategyValues.Z_RLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrategyValues with Double] = js.native
}

