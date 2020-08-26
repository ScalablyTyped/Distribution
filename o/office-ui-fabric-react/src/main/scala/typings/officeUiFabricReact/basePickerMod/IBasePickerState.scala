package typings.officeUiFabricReact.basePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePickerState extends js.Object {
  var isFocused: js.UndefOr[Boolean] = js.native
  var isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.native
  var isResultsFooterVisible: js.UndefOr[Boolean] = js.native
  var isSearching: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Any] = js.native
  var moreSuggestionsAvailable: js.UndefOr[Boolean] = js.native
  var selectedIndices: js.UndefOr[js.Array[Double]] = js.native
  var suggestedDisplayValue: js.UndefOr[String] = js.native
  var suggestionsLoading: js.UndefOr[Boolean] = js.native
  var suggestionsVisible: js.UndefOr[Boolean] = js.native
}

object IBasePickerState {
  @scala.inline
  def apply(): IBasePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerState]
  }
  @scala.inline
  implicit class IBasePickerStateOps[Self <: IBasePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setIsMostRecentlyUsedVisible(value: Boolean): Self = this.set("isMostRecentlyUsedVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMostRecentlyUsedVisible: Self = this.set("isMostRecentlyUsedVisible", js.undefined)
    @scala.inline
    def setIsResultsFooterVisible(value: Boolean): Self = this.set("isResultsFooterVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResultsFooterVisible: Self = this.set("isResultsFooterVisible", js.undefined)
    @scala.inline
    def setIsSearching(value: Boolean): Self = this.set("isSearching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSearching: Self = this.set("isSearching", js.undefined)
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMoreSuggestionsAvailable(value: Boolean): Self = this.set("moreSuggestionsAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreSuggestionsAvailable: Self = this.set("moreSuggestionsAvailable", js.undefined)
    @scala.inline
    def setSelectedIndicesVarargs(value: Double*): Self = this.set("selectedIndices", js.Array(value :_*))
    @scala.inline
    def setSelectedIndices(value: js.Array[Double]): Self = this.set("selectedIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndices: Self = this.set("selectedIndices", js.undefined)
    @scala.inline
    def setSuggestedDisplayValue(value: String): Self = this.set("suggestedDisplayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDisplayValue: Self = this.set("suggestedDisplayValue", js.undefined)
    @scala.inline
    def setSuggestionsLoading(value: Boolean): Self = this.set("suggestionsLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsLoading: Self = this.set("suggestionsLoading", js.undefined)
    @scala.inline
    def setSuggestionsVisible(value: Boolean): Self = this.set("suggestionsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsVisible: Self = this.set("suggestionsVisible", js.undefined)
  }
  
}

