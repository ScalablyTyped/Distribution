package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPreciseCoverageParameterType extends js.Object {
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.undefined
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.undefined
}

object StartPreciseCoverageParameterType {
  @scala.inline
  def apply(callCount: js.UndefOr[Boolean] = js.undefined, detailed: js.UndefOr[Boolean] = js.undefined): StartPreciseCoverageParameterType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callCount)) __obj.updateDynamic("callCount")(callCount)
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    __obj.asInstanceOf[StartPreciseCoverageParameterType]
  }
}

