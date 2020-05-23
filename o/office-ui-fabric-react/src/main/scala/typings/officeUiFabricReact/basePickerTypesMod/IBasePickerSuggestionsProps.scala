package typings.officeUiFabricReact.basePickerTypesMod

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<T>, 'onRenderNoResultFound' | 'suggestionsHeaderText' | 'mostRecentlyUsedHeaderText' | 'noResultsFoundText' | 'className' | 'suggestionsClassName' | 'suggestionsItemClassName' | 'searchForMoreText' | 'forceResolveText' | 'loadingText' | 'searchingText' | 'resultsFooterFull' | 'resultsFooter' | 'resultsMaximumNumber' | 'showRemoveButtons' | 'suggestionsAvailableAlertText' | 'suggestionsContainerAriaLabel' | 'showForceResolve'> */
trait IBasePickerSuggestionsProps[T] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var forceResolveText: js.UndefOr[String] = js.undefined
  var loadingText: js.UndefOr[String] = js.undefined
  var mostRecentlyUsedHeaderText: js.UndefOr[String] = js.undefined
  var noResultsFoundText: js.UndefOr[String] = js.undefined
  var onRenderNoResultFound: js.UndefOr[IRenderFunction[Unit]] = js.undefined
  var resultsFooter: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], Element]] = js.undefined
  var resultsFooterFull: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], Element]] = js.undefined
  var resultsMaximumNumber: js.UndefOr[Double] = js.undefined
  var searchForMoreText: js.UndefOr[String] = js.undefined
  var searchingText: js.UndefOr[String] = js.undefined
  var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var showRemoveButtons: js.UndefOr[Boolean] = js.undefined
  var suggestionsAvailableAlertText: js.UndefOr[String] = js.undefined
  var suggestionsClassName: js.UndefOr[String] = js.undefined
  var suggestionsContainerAriaLabel: js.UndefOr[String] = js.undefined
  var suggestionsHeaderText: js.UndefOr[String] = js.undefined
  var suggestionsItemClassName: js.UndefOr[String] = js.undefined
}

object IBasePickerSuggestionsProps {
  @scala.inline
  def apply[T](
    className: String = null,
    forceResolveText: String = null,
    loadingText: String = null,
    mostRecentlyUsedHeaderText: String = null,
    noResultsFoundText: String = null,
    onRenderNoResultFound: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], Element | Null]]) => Element | Null = null,
    resultsFooter: /* props */ ISuggestionsProps[T] => Element = null,
    resultsFooterFull: /* props */ ISuggestionsProps[T] => Element = null,
    resultsMaximumNumber: js.UndefOr[Double] = js.undefined,
    searchForMoreText: String = null,
    searchingText: String = null,
    showForceResolve: () => Boolean = null,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined,
    suggestionsAvailableAlertText: String = null,
    suggestionsClassName: String = null,
    suggestionsContainerAriaLabel: String = null,
    suggestionsHeaderText: String = null,
    suggestionsItemClassName: String = null
  ): IBasePickerSuggestionsProps[T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (forceResolveText != null) __obj.updateDynamic("forceResolveText")(forceResolveText.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (mostRecentlyUsedHeaderText != null) __obj.updateDynamic("mostRecentlyUsedHeaderText")(mostRecentlyUsedHeaderText.asInstanceOf[js.Any])
    if (noResultsFoundText != null) __obj.updateDynamic("noResultsFoundText")(noResultsFoundText.asInstanceOf[js.Any])
    if (onRenderNoResultFound != null) __obj.updateDynamic("onRenderNoResultFound")(js.Any.fromFunction2(onRenderNoResultFound))
    if (resultsFooter != null) __obj.updateDynamic("resultsFooter")(js.Any.fromFunction1(resultsFooter))
    if (resultsFooterFull != null) __obj.updateDynamic("resultsFooterFull")(js.Any.fromFunction1(resultsFooterFull))
    if (!js.isUndefined(resultsMaximumNumber)) __obj.updateDynamic("resultsMaximumNumber")(resultsMaximumNumber.get.asInstanceOf[js.Any])
    if (searchForMoreText != null) __obj.updateDynamic("searchForMoreText")(searchForMoreText.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (showForceResolve != null) __obj.updateDynamic("showForceResolve")(js.Any.fromFunction0(showForceResolve))
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.get.asInstanceOf[js.Any])
    if (suggestionsAvailableAlertText != null) __obj.updateDynamic("suggestionsAvailableAlertText")(suggestionsAvailableAlertText.asInstanceOf[js.Any])
    if (suggestionsClassName != null) __obj.updateDynamic("suggestionsClassName")(suggestionsClassName.asInstanceOf[js.Any])
    if (suggestionsContainerAriaLabel != null) __obj.updateDynamic("suggestionsContainerAriaLabel")(suggestionsContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsHeaderText != null) __obj.updateDynamic("suggestionsHeaderText")(suggestionsHeaderText.asInstanceOf[js.Any])
    if (suggestionsItemClassName != null) __obj.updateDynamic("suggestionsItemClassName")(suggestionsItemClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePickerSuggestionsProps[T]]
  }
}

