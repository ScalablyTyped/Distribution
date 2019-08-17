package typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseFloatingPickerState extends js.Object {
  var didBind: Boolean
  var queryString: String
  var suggestionsVisible: js.UndefOr[Boolean] = js.undefined
}

object IBaseFloatingPickerState {
  @scala.inline
  def apply(didBind: Boolean, queryString: String, suggestionsVisible: js.UndefOr[Boolean] = js.undefined): IBaseFloatingPickerState = {
    val __obj = js.Dynamic.literal(didBind = didBind, queryString = queryString)
    if (!js.isUndefined(suggestionsVisible)) __obj.updateDynamic("suggestionsVisible")(suggestionsVisible)
    __obj.asInstanceOf[IBaseFloatingPickerState]
  }
}

