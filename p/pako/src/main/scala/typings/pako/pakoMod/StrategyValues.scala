package typings.pako.pakoMod

import org.scalablytyped.runtime.TopLevel
import typings.pako.pakoMod.StrategyValues.Z_DEFAULT_STRATEGY
import typings.pako.pakoMod.StrategyValues.Z_FILTERED
import typings.pako.pakoMod.StrategyValues.Z_FIXED
import typings.pako.pakoMod.StrategyValues.Z_HUFFMAN_ONLY
import typings.pako.pakoMod.StrategyValues.Z_RLE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrategyValues with Double] = js.native
  /* 0 */ @js.native
  object Z_DEFAULT_STRATEGY extends TopLevel[Z_DEFAULT_STRATEGY with Double]
  
  /* 1 */ @js.native
  object Z_FILTERED extends TopLevel[Z_FILTERED with Double]
  
  /* 4 */ @js.native
  object Z_FIXED extends TopLevel[Z_FIXED with Double]
  
  /* 2 */ @js.native
  object Z_HUFFMAN_ONLY extends TopLevel[Z_HUFFMAN_ONLY with Double]
  
  /* 3 */ @js.native
  object Z_RLE extends TopLevel[Z_RLE with Double]
  
}

