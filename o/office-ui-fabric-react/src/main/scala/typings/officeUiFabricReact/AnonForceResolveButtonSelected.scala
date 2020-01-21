package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceResolveButtonSelected extends js.Object {
  /** Whether the forceResolve actionButton is selected. */
  var forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined
  /** Whether the searchForMore actionButton is selected. */
  var searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined
}

object AnonForceResolveButtonSelected {
  @scala.inline
  def apply(
    forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined,
    searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined
  ): AnonForceResolveButtonSelected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceResolveButtonSelected)) __obj.updateDynamic("forceResolveButtonSelected")(forceResolveButtonSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(searchForMoreButtonSelected)) __obj.updateDynamic("searchForMoreButtonSelected")(searchForMoreButtonSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceResolveButtonSelected]
  }
}

