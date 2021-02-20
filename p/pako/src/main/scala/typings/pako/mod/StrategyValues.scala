package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StrategyValues extends StObject
@JSImport("pako", "StrategyValues")
@js.native
object StrategyValues extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrategyValues with Double] = js.native
  
  @js.native
  sealed trait Z_DEFAULT_STRATEGY extends StrategyValues
  /* 0 */ val Z_DEFAULT_STRATEGY: typings.pako.mod.StrategyValues.Z_DEFAULT_STRATEGY with Double = js.native
  
  @js.native
  sealed trait Z_FILTERED extends StrategyValues
  /* 1 */ val Z_FILTERED: typings.pako.mod.StrategyValues.Z_FILTERED with Double = js.native
  
  @js.native
  sealed trait Z_FIXED extends StrategyValues
  /* 4 */ val Z_FIXED: typings.pako.mod.StrategyValues.Z_FIXED with Double = js.native
  
  @js.native
  sealed trait Z_HUFFMAN_ONLY extends StrategyValues
  /* 2 */ val Z_HUFFMAN_ONLY: typings.pako.mod.StrategyValues.Z_HUFFMAN_ONLY with Double = js.native
  
  @js.native
  sealed trait Z_RLE extends StrategyValues
  /* 3 */ val Z_RLE: typings.pako.mod.StrategyValues.Z_RLE with Double = js.native
}
