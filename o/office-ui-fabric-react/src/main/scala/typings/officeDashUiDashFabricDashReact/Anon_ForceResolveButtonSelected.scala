package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceResolveButtonSelected extends js.Object {
  /** Whether the forceResolve actionButton is selected. */
  var forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined
  /** Whether the searchForMore actionButton is selected. */
  var searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined
}

object Anon_ForceResolveButtonSelected {
  @scala.inline
  def apply(
    forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined,
    searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined
  ): Anon_ForceResolveButtonSelected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceResolveButtonSelected)) __obj.updateDynamic("forceResolveButtonSelected")(forceResolveButtonSelected)
    if (!js.isUndefined(searchForMoreButtonSelected)) __obj.updateDynamic("searchForMoreButtonSelected")(searchForMoreButtonSelected)
    __obj.asInstanceOf[Anon_ForceResolveButtonSelected]
  }
}

