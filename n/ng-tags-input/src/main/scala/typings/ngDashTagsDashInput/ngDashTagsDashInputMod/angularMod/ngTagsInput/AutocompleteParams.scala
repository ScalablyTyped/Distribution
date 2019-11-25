package typings.ngDashTagsDashInput.ngDashTagsDashInputMod.angularMod.ngTagsInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteParams extends js.Object {
  var debounceDelay: js.UndefOr[Double | Boolean] = js.undefined
  var displayProperty: js.UndefOr[String | Boolean] = js.undefined
  var highlightMatchedText: js.UndefOr[Boolean] = js.undefined
  var loadOnDownArrow: js.UndefOr[Boolean] = js.undefined
  var loadOnEmpty: js.UndefOr[Boolean] = js.undefined
  var loadOnFocus: js.UndefOr[Boolean] = js.undefined
  var matchClass: js.UndefOr[js.Any] = js.undefined
  var maxResultsToShow: js.UndefOr[Double | Boolean] = js.undefined
  var minLength: js.UndefOr[Double | Boolean] = js.undefined
  var selectFirstMatch: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
  var template: js.UndefOr[String | Boolean] = js.undefined
}

object AutocompleteParams {
  @scala.inline
  def apply(
    debounceDelay: Double | Boolean = null,
    displayProperty: String | Boolean = null,
    highlightMatchedText: js.UndefOr[Boolean] = js.undefined,
    loadOnDownArrow: js.UndefOr[Boolean] = js.undefined,
    loadOnEmpty: js.UndefOr[Boolean] = js.undefined,
    loadOnFocus: js.UndefOr[Boolean] = js.undefined,
    matchClass: js.Any = null,
    maxResultsToShow: Double | Boolean = null,
    minLength: Double | Boolean = null,
    selectFirstMatch: js.UndefOr[Boolean] = js.undefined,
    source: js.Any = null,
    template: String | Boolean = null
  ): AutocompleteParams = {
    val __obj = js.Dynamic.literal()
    if (debounceDelay != null) __obj.updateDynamic("debounceDelay")(debounceDelay.asInstanceOf[js.Any])
    if (displayProperty != null) __obj.updateDynamic("displayProperty")(displayProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMatchedText)) __obj.updateDynamic("highlightMatchedText")(highlightMatchedText.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnDownArrow)) __obj.updateDynamic("loadOnDownArrow")(loadOnDownArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnEmpty)) __obj.updateDynamic("loadOnEmpty")(loadOnEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnFocus)) __obj.updateDynamic("loadOnFocus")(loadOnFocus.asInstanceOf[js.Any])
    if (matchClass != null) __obj.updateDynamic("matchClass")(matchClass.asInstanceOf[js.Any])
    if (maxResultsToShow != null) __obj.updateDynamic("maxResultsToShow")(maxResultsToShow.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstMatch)) __obj.updateDynamic("selectFirstMatch")(selectFirstMatch.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteParams]
  }
}

