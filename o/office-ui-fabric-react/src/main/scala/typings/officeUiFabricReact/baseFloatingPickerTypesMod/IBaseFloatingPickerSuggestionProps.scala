package typings.officeUiFabricReact.baseFloatingPickerTypesMod

import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/Suggestions.types.ISuggestionsControlProps<any>, 'shouldSelectFirstItem' | 'headerItemsProps' | 'footerItemsProps' | 'showRemoveButtons'> */
trait IBaseFloatingPickerSuggestionProps extends js.Object {
  var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.undefined
  var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.undefined
  var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var showRemoveButtons: js.UndefOr[Boolean] = js.undefined
}

object IBaseFloatingPickerSuggestionProps {
  @scala.inline
  def apply(
    footerItemsProps: js.Array[ISuggestionsHeaderFooterProps] = null,
    headerItemsProps: js.Array[ISuggestionsHeaderFooterProps] = null,
    shouldSelectFirstItem: () => Boolean = null,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined
  ): IBaseFloatingPickerSuggestionProps = {
    val __obj = js.Dynamic.literal()
    if (footerItemsProps != null) __obj.updateDynamic("footerItemsProps")(footerItemsProps.asInstanceOf[js.Any])
    if (headerItemsProps != null) __obj.updateDynamic("headerItemsProps")(headerItemsProps.asInstanceOf[js.Any])
    if (shouldSelectFirstItem != null) __obj.updateDynamic("shouldSelectFirstItem")(js.Any.fromFunction0(shouldSelectFirstItem))
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseFloatingPickerSuggestionProps]
  }
}

