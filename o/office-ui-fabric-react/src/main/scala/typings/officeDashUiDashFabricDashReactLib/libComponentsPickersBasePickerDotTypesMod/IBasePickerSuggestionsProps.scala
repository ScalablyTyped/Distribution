package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePickerSuggestionsProps extends js.Object {
  /**
    * Suggestions root className.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text that appears indicating to the use to force resolve the input
    */
  var forceResolveText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to display while the results are loading.
    */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text that should appear at the top of the most recently used box.
    */
  var mostRecentlyUsedHeaderText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text that should appear when no results are returned.
    */
  var noResultsFoundText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function that specifies what to render when no results are found.
    */
  var onRenderNoResultFound: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[scala.Unit]] = js.undefined
  /**
    * A renderer that adds an element at the end of the suggestions list when there are fewer than resultsMaximumNumber.
    */
  var resultsFooter: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * A renderer that adds an element at the end of the suggestions list if it has more items than resultsMaximumNumber.
    */
  var resultsFooterFull: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Maximum number of suggestions to show in the full suggestion list.
    */
  var resultsMaximumNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text that should appear on the button to search for more.
    */
  var searchForMoreText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to display while searching for more results in a limited suggestions list.
    */
  var searchingText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether to show a button with each suggestion to remove that suggestion.
    */
  var showRemoveButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Screen reader message to read when there are suggestions available.
    */
  var suggestionsAvailableAlertText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Suggestions List className.
    */
  var suggestionsClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An ARIA label for the container that is the parent of the suggestions.
    */
  var suggestionsContainerAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text that should appear at the top of the suggestion box.
    */
  var suggestionsHeaderText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ClassName for suggestion items.
    */
  var suggestionsItemClassName: js.UndefOr[java.lang.String] = js.undefined
}

