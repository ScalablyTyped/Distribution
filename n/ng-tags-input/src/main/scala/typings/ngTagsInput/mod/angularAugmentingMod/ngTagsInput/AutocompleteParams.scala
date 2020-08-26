package typings.ngTagsInput.mod.angularAugmentingMod.ngTagsInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteParams extends js.Object {
  var debounceDelay: js.UndefOr[Double | Boolean] = js.native
  var displayProperty: js.UndefOr[String | Boolean] = js.native
  var highlightMatchedText: js.UndefOr[Boolean] = js.native
  var loadOnDownArrow: js.UndefOr[Boolean] = js.native
  var loadOnEmpty: js.UndefOr[Boolean] = js.native
  var loadOnFocus: js.UndefOr[Boolean] = js.native
  var matchClass: js.UndefOr[js.Any] = js.native
  var maxResultsToShow: js.UndefOr[Double | Boolean] = js.native
  var minLength: js.UndefOr[Double | Boolean] = js.native
  var selectFirstMatch: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[js.Any] = js.native
  var template: js.UndefOr[String | Boolean] = js.native
}

object AutocompleteParams {
  @scala.inline
  def apply(): AutocompleteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteParams]
  }
  @scala.inline
  implicit class AutocompleteParamsOps[Self <: AutocompleteParams] (val x: Self) extends AnyVal {
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
    def setDebounceDelay(value: Double | Boolean): Self = this.set("debounceDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounceDelay: Self = this.set("debounceDelay", js.undefined)
    @scala.inline
    def setDisplayProperty(value: String | Boolean): Self = this.set("displayProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayProperty: Self = this.set("displayProperty", js.undefined)
    @scala.inline
    def setHighlightMatchedText(value: Boolean): Self = this.set("highlightMatchedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMatchedText: Self = this.set("highlightMatchedText", js.undefined)
    @scala.inline
    def setLoadOnDownArrow(value: Boolean): Self = this.set("loadOnDownArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDownArrow: Self = this.set("loadOnDownArrow", js.undefined)
    @scala.inline
    def setLoadOnEmpty(value: Boolean): Self = this.set("loadOnEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnEmpty: Self = this.set("loadOnEmpty", js.undefined)
    @scala.inline
    def setLoadOnFocus(value: Boolean): Self = this.set("loadOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnFocus: Self = this.set("loadOnFocus", js.undefined)
    @scala.inline
    def setMatchClass(value: js.Any): Self = this.set("matchClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchClass: Self = this.set("matchClass", js.undefined)
    @scala.inline
    def setMaxResultsToShow(value: Double | Boolean): Self = this.set("maxResultsToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResultsToShow: Self = this.set("maxResultsToShow", js.undefined)
    @scala.inline
    def setMinLength(value: Double | Boolean): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setSelectFirstMatch(value: Boolean): Self = this.set("selectFirstMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectFirstMatch: Self = this.set("selectFirstMatch", js.undefined)
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTemplate(value: String | Boolean): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

