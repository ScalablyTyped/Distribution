package typings.plottable.buildSrcUtilsRTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryPredicateResult extends js.Object

@JSImport("plottable/build/src/utils/rTree", "QueryPredicateResult")
@js.native
object QueryPredicateResult extends js.Object {
  @js.native
  sealed trait FAIL extends QueryPredicateResult
  
  @js.native
  sealed trait PASS extends QueryPredicateResult
  
  @js.native
  sealed trait PASS_AND_OVERWRITE extends QueryPredicateResult
  
  /* 1 */ val FAIL: typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.FAIL with Double = js.native
  /* 0 */ val PASS: typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS with Double = js.native
  /* 2 */ val PASS_AND_OVERWRITE: typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryPredicateResult with Double] = js.native
}

