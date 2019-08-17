package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LinkIsSelected extends js.Object {
  /**
    * Indicates whether Pivot link is selected.
    * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
    */
  var linkIsSelected: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether Pivot has large format. */
  var rootIsLarge: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether Pivot has tabbed format. */
  var rootIsTabs: js.UndefOr[Boolean] = js.undefined
}

object Anon_LinkIsSelected {
  @scala.inline
  def apply(
    linkIsSelected: js.UndefOr[Boolean] = js.undefined,
    rootIsLarge: js.UndefOr[Boolean] = js.undefined,
    rootIsTabs: js.UndefOr[Boolean] = js.undefined
  ): Anon_LinkIsSelected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(linkIsSelected)) __obj.updateDynamic("linkIsSelected")(linkIsSelected)
    if (!js.isUndefined(rootIsLarge)) __obj.updateDynamic("rootIsLarge")(rootIsLarge)
    if (!js.isUndefined(rootIsTabs)) __obj.updateDynamic("rootIsTabs")(rootIsTabs)
    __obj.asInstanceOf[Anon_LinkIsSelected]
  }
}

