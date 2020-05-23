package typings.officeUiFabricReact.basePickerMod

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
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMostRecentlyUsedVisible)) __obj.updateDynamic("isMostRecentlyUsedVisible")(isMostRecentlyUsedVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isResultsFooterVisible)) __obj.updateDynamic("isResultsFooterVisible")(isResultsFooterVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearching)) __obj.updateDynamic("isSearching")(isSearching.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(moreSuggestionsAvailable)) __obj.updateDynamic("moreSuggestionsAvailable")(moreSuggestionsAvailable.get.asInstanceOf[js.Any])
    if (selectedIndices != null) __obj.updateDynamic("selectedIndices")(selectedIndices.asInstanceOf[js.Any])
    if (suggestedDisplayValue != null) __obj.updateDynamic("suggestedDisplayValue")(suggestedDisplayValue.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsLoading)) __obj.updateDynamic("suggestionsLoading")(suggestionsLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsVisible)) __obj.updateDynamic("suggestionsVisible")(suggestionsVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePickerState]
  }
}

