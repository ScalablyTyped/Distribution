package typings.officeUiFabricReact.basePickerTypesMod

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<T>, 'onRenderNoResultFound' | 'suggestionsHeaderText' | 'mostRecentlyUsedHeaderText' | 'noResultsFoundText' | 'className' | 'suggestionsClassName' | 'suggestionsItemClassName' | 'searchForMoreText' | 'forceResolveText' | 'loadingText' | 'searchingText' | 'resultsFooterFull' | 'resultsFooter' | 'resultsMaximumNumber' | 'showRemoveButtons' | 'suggestionsAvailableAlertText' | 'suggestionsContainerAriaLabel' | 'showForceResolve'> */
@js.native
trait IBasePickerSuggestionsProps[T] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var forceResolveText: js.UndefOr[String] = js.native
  var loadingText: js.UndefOr[String] = js.native
  var mostRecentlyUsedHeaderText: js.UndefOr[String] = js.native
  var noResultsFoundText: js.UndefOr[String] = js.native
  var onRenderNoResultFound: js.UndefOr[IRenderFunction[Unit]] = js.native
  var resultsFooter: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], Element]] = js.native
  var resultsFooterFull: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], Element]] = js.native
  var resultsMaximumNumber: js.UndefOr[Double] = js.native
  var searchForMoreText: js.UndefOr[String] = js.native
  var searchingText: js.UndefOr[String] = js.native
  var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.native
  var showRemoveButtons: js.UndefOr[Boolean] = js.native
  var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
  var suggestionsClassName: js.UndefOr[String] = js.native
  var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
  var suggestionsHeaderText: js.UndefOr[String] = js.native
  var suggestionsItemClassName: js.UndefOr[String] = js.native
}

object IBasePickerSuggestionsProps {
  @scala.inline
  def apply[T](): IBasePickerSuggestionsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerSuggestionsProps[T]]
  }
  @scala.inline
  implicit class IBasePickerSuggestionsPropsOps[Self <: IBasePickerSuggestionsProps[_], T] (val x: Self with IBasePickerSuggestionsProps[T]) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setForceResolveText(value: String): Self = this.set("forceResolveText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceResolveText: Self = this.set("forceResolveText", js.undefined)
    @scala.inline
    def setLoadingText(value: String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    @scala.inline
    def setMostRecentlyUsedHeaderText(value: String): Self = this.set("mostRecentlyUsedHeaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostRecentlyUsedHeaderText: Self = this.set("mostRecentlyUsedHeaderText", js.undefined)
    @scala.inline
    def setNoResultsFoundText(value: String): Self = this.set("noResultsFoundText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResultsFoundText: Self = this.set("noResultsFoundText", js.undefined)
    @scala.inline
    def setOnRenderNoResultFound(
      value: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderNoResultFound", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderNoResultFound: Self = this.set("onRenderNoResultFound", js.undefined)
    @scala.inline
    def setResultsFooter(value: /* props */ ISuggestionsProps[T] => Element): Self = this.set("resultsFooter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResultsFooter: Self = this.set("resultsFooter", js.undefined)
    @scala.inline
    def setResultsFooterFull(value: /* props */ ISuggestionsProps[T] => Element): Self = this.set("resultsFooterFull", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResultsFooterFull: Self = this.set("resultsFooterFull", js.undefined)
    @scala.inline
    def setResultsMaximumNumber(value: Double): Self = this.set("resultsMaximumNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultsMaximumNumber: Self = this.set("resultsMaximumNumber", js.undefined)
    @scala.inline
    def setSearchForMoreText(value: String): Self = this.set("searchForMoreText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchForMoreText: Self = this.set("searchForMoreText", js.undefined)
    @scala.inline
    def setSearchingText(value: String): Self = this.set("searchingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchingText: Self = this.set("searchingText", js.undefined)
    @scala.inline
    def setShowForceResolve(value: () => Boolean): Self = this.set("showForceResolve", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShowForceResolve: Self = this.set("showForceResolve", js.undefined)
    @scala.inline
    def setShowRemoveButtons(value: Boolean): Self = this.set("showRemoveButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRemoveButtons: Self = this.set("showRemoveButtons", js.undefined)
    @scala.inline
    def setSuggestionsAvailableAlertText(value: String): Self = this.set("suggestionsAvailableAlertText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsAvailableAlertText: Self = this.set("suggestionsAvailableAlertText", js.undefined)
    @scala.inline
    def setSuggestionsClassName(value: String): Self = this.set("suggestionsClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsClassName: Self = this.set("suggestionsClassName", js.undefined)
    @scala.inline
    def setSuggestionsContainerAriaLabel(value: String): Self = this.set("suggestionsContainerAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsContainerAriaLabel: Self = this.set("suggestionsContainerAriaLabel", js.undefined)
    @scala.inline
    def setSuggestionsHeaderText(value: String): Self = this.set("suggestionsHeaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsHeaderText: Self = this.set("suggestionsHeaderText", js.undefined)
    @scala.inline
    def setSuggestionsItemClassName(value: String): Self = this.set("suggestionsItemClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsItemClassName: Self = this.set("suggestionsItemClassName", js.undefined)
  }
  
}

