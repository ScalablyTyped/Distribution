package typings
package ngDashTagsDashInputLib.ngDashTagsDashInputMod.angularMod.ngTagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteParams extends js.Object {
  var debounceDelay: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var displayProperty: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var highlightMatchedText: js.UndefOr[scala.Boolean] = js.undefined
  var loadOnDownArrow: js.UndefOr[scala.Boolean] = js.undefined
  var loadOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var loadOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var matchClass: js.UndefOr[js.Any] = js.undefined
  var maxResultsToShow: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var minLength: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var selectFirstMatch: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var template: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object AutocompleteParams {
  @scala.inline
  def apply(
    debounceDelay: scala.Double | scala.Boolean = null,
    displayProperty: java.lang.String | scala.Boolean = null,
    highlightMatchedText: js.UndefOr[scala.Boolean] = js.undefined,
    loadOnDownArrow: js.UndefOr[scala.Boolean] = js.undefined,
    loadOnEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    loadOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    matchClass: js.Any = null,
    maxResultsToShow: scala.Double | scala.Boolean = null,
    minLength: scala.Double | scala.Boolean = null,
    selectFirstMatch: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Any = null,
    template: java.lang.String | scala.Boolean = null
  ): AutocompleteParams = {
    val __obj = js.Dynamic.literal()
    if (debounceDelay != null) __obj.updateDynamic("debounceDelay")(debounceDelay.asInstanceOf[js.Any])
    if (displayProperty != null) __obj.updateDynamic("displayProperty")(displayProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMatchedText)) __obj.updateDynamic("highlightMatchedText")(highlightMatchedText)
    if (!js.isUndefined(loadOnDownArrow)) __obj.updateDynamic("loadOnDownArrow")(loadOnDownArrow)
    if (!js.isUndefined(loadOnEmpty)) __obj.updateDynamic("loadOnEmpty")(loadOnEmpty)
    if (!js.isUndefined(loadOnFocus)) __obj.updateDynamic("loadOnFocus")(loadOnFocus)
    if (matchClass != null) __obj.updateDynamic("matchClass")(matchClass)
    if (maxResultsToShow != null) __obj.updateDynamic("maxResultsToShow")(maxResultsToShow.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstMatch)) __obj.updateDynamic("selectFirstMatch")(selectFirstMatch)
    if (source != null) __obj.updateDynamic("source")(source)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteParams]
  }
}

