package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePickerState extends js.Object {
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.undefined
  var isResultsFooterVisible: js.UndefOr[Boolean] = js.undefined
  var isSearching: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var moreSuggestionsAvailable: js.UndefOr[Boolean] = js.undefined
  var selectedIndices: js.UndefOr[js.Array[Double]] = js.undefined
  var suggestedDisplayValue: js.UndefOr[String] = js.undefined
  var suggestionsLoading: js.UndefOr[Boolean] = js.undefined
  var suggestionsVisible: js.UndefOr[Boolean] = js.undefined
}

object IBasePickerState {
  @scala.inline
  def apply(
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.undefined,
    isResultsFooterVisible: js.UndefOr[Boolean] = js.undefined,
    isSearching: js.UndefOr[Boolean] = js.undefined,
    items: js.Any = null,
    moreSuggestionsAvailable: js.UndefOr[Boolean] = js.undefined,
    selectedIndices: js.Array[Double] = null,
    suggestedDisplayValue: String = null,
    suggestionsLoading: js.UndefOr[Boolean] = js.undefined,
    suggestionsVisible: js.UndefOr[Boolean] = js.undefined
  ): IBasePickerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (!js.isUndefined(isMostRecentlyUsedVisible)) __obj.updateDynamic("isMostRecentlyUsedVisible")(isMostRecentlyUsedVisible)
    if (!js.isUndefined(isResultsFooterVisible)) __obj.updateDynamic("isResultsFooterVisible")(isResultsFooterVisible)
    if (!js.isUndefined(isSearching)) __obj.updateDynamic("isSearching")(isSearching)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(moreSuggestionsAvailable)) __obj.updateDynamic("moreSuggestionsAvailable")(moreSuggestionsAvailable)
    if (selectedIndices != null) __obj.updateDynamic("selectedIndices")(selectedIndices)
    if (suggestedDisplayValue != null) __obj.updateDynamic("suggestedDisplayValue")(suggestedDisplayValue)
    if (!js.isUndefined(suggestionsLoading)) __obj.updateDynamic("suggestionsLoading")(suggestionsLoading)
    if (!js.isUndefined(suggestionsVisible)) __obj.updateDynamic("suggestionsVisible")(suggestionsVisible)
    __obj.asInstanceOf[IBasePickerState]
  }
}

