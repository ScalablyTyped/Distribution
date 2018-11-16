package typings
package plottableLib.buildSrcUtilsRTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryPredicateResult extends js.Object

@JSImport("plottable/build/src/utils/rTree", "QueryPredicateResult")
@js.native
object QueryPredicateResult extends js.Object {
  @js.native
  sealed trait FAIL
    extends plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult
  
  @js.native
  sealed trait PASS
    extends plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult
  
  @js.native
  sealed trait PASS_AND_OVERWRITE
    extends plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult
  
  /* 1 */ val FAIL: FAIL with scala.Double = js.native
  /* 0 */ val PASS: PASS with scala.Double = js.native
  /* 2 */ val PASS_AND_OVERWRITE: PASS_AND_OVERWRITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult with scala.Double] = js.native
}

