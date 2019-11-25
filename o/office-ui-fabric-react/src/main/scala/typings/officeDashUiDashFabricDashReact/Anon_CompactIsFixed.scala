package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompactIsFixed extends js.Object {
  /** Whether the list is in compact mode */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Whether the list is fixed in size */
  var isFixed: js.UndefOr[Boolean] = js.undefined
  /** Whether the list is horizontally constrained */
  var isHorizontalConstrained: js.UndefOr[Boolean] = js.undefined
}

object Anon_CompactIsFixed {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    isFixed: js.UndefOr[Boolean] = js.undefined,
    isHorizontalConstrained: js.UndefOr[Boolean] = js.undefined
  ): Anon_CompactIsFixed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(isFixed)) __obj.updateDynamic("isFixed")(isFixed.asInstanceOf[js.Any])
    if (!js.isUndefined(isHorizontalConstrained)) __obj.updateDynamic("isHorizontalConstrained")(isHorizontalConstrained.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompactIsFixed]
  }
}

