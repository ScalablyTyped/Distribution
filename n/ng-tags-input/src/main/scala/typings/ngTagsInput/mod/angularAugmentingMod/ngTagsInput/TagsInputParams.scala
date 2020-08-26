package typings.ngTagsInput.mod.angularAugmentingMod.ngTagsInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsInputParams extends js.Object {
  var addFromAutocompleteOnly: js.UndefOr[Boolean] = js.native
  var addOnBlur: js.UndefOr[Boolean] = js.native
  var addOnComma: js.UndefOr[Boolean] = js.native
  var addOnEnter: js.UndefOr[Boolean] = js.native
  var addOnPaste: js.UndefOr[Boolean] = js.native
  var addOnSpace: js.UndefOr[Boolean] = js.native
  var allowLeftoverText: js.UndefOr[Boolean] = js.native
  var allowedTagsPattern: js.UndefOr[String | Boolean] = js.native
  var displayProperty: js.UndefOr[String | Boolean] = js.native
  var enableEditingLastTag: js.UndefOr[Boolean] = js.native
  var keyProperty: js.UndefOr[String | Boolean] = js.native
  var maxLength: js.UndefOr[Double | Boolean] = js.native
  var maxTags: js.UndefOr[Double | Boolean] = js.native
  var minLength: js.UndefOr[Double | Boolean] = js.native
  var minTags: js.UndefOr[Double | Boolean] = js.native
  var ngModel: js.UndefOr[String] = js.native
  var onInvalidTag: js.UndefOr[js.Any] = js.native
  var onTagAdded: js.UndefOr[js.Any] = js.native
  var onTagAdding: js.UndefOr[js.Any] = js.native
  var onTagClicked: js.UndefOr[js.Any] = js.native
  var onTagRemoved: js.UndefOr[js.Any] = js.native
  var onTagRemoving: js.UndefOr[js.Any] = js.native
  var pasteSplitPattern: js.UndefOr[String | Boolean] = js.native
  var placeholder: js.UndefOr[String | Boolean] = js.native
  var removeTagSymbol: js.UndefOr[String | Boolean] = js.native
  var replaceSpacesWithDashes: js.UndefOr[Boolean] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var tabindex: js.UndefOr[Double | Boolean] = js.native
  var tagClass: js.UndefOr[js.Any] = js.native
  var template: js.UndefOr[String | Boolean] = js.native
  var templateScope: js.UndefOr[String | Boolean] = js.native
  var text: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[String | Boolean] = js.native
  var useStrings: js.UndefOr[Boolean] = js.native
}

object TagsInputParams {
  @scala.inline
  def apply(): TagsInputParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagsInputParams]
  }
  @scala.inline
  implicit class TagsInputParamsOps[Self <: TagsInputParams] (val x: Self) extends AnyVal {
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
    def setAddFromAutocompleteOnly(value: Boolean): Self = this.set("addFromAutocompleteOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFromAutocompleteOnly: Self = this.set("addFromAutocompleteOnly", js.undefined)
    @scala.inline
    def setAddOnBlur(value: Boolean): Self = this.set("addOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnBlur: Self = this.set("addOnBlur", js.undefined)
    @scala.inline
    def setAddOnComma(value: Boolean): Self = this.set("addOnComma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnComma: Self = this.set("addOnComma", js.undefined)
    @scala.inline
    def setAddOnEnter(value: Boolean): Self = this.set("addOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnEnter: Self = this.set("addOnEnter", js.undefined)
    @scala.inline
    def setAddOnPaste(value: Boolean): Self = this.set("addOnPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnPaste: Self = this.set("addOnPaste", js.undefined)
    @scala.inline
    def setAddOnSpace(value: Boolean): Self = this.set("addOnSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnSpace: Self = this.set("addOnSpace", js.undefined)
    @scala.inline
    def setAllowLeftoverText(value: Boolean): Self = this.set("allowLeftoverText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLeftoverText: Self = this.set("allowLeftoverText", js.undefined)
    @scala.inline
    def setAllowedTagsPattern(value: String | Boolean): Self = this.set("allowedTagsPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedTagsPattern: Self = this.set("allowedTagsPattern", js.undefined)
    @scala.inline
    def setDisplayProperty(value: String | Boolean): Self = this.set("displayProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayProperty: Self = this.set("displayProperty", js.undefined)
    @scala.inline
    def setEnableEditingLastTag(value: Boolean): Self = this.set("enableEditingLastTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableEditingLastTag: Self = this.set("enableEditingLastTag", js.undefined)
    @scala.inline
    def setKeyProperty(value: String | Boolean): Self = this.set("keyProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyProperty: Self = this.set("keyProperty", js.undefined)
    @scala.inline
    def setMaxLength(value: Double | Boolean): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxTags(value: Double | Boolean): Self = this.set("maxTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTags: Self = this.set("maxTags", js.undefined)
    @scala.inline
    def setMinLength(value: Double | Boolean): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMinTags(value: Double | Boolean): Self = this.set("minTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTags: Self = this.set("minTags", js.undefined)
    @scala.inline
    def setNgModel(value: String): Self = this.set("ngModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNgModel: Self = this.set("ngModel", js.undefined)
    @scala.inline
    def setOnInvalidTag(value: js.Any): Self = this.set("onInvalidTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInvalidTag: Self = this.set("onInvalidTag", js.undefined)
    @scala.inline
    def setOnTagAdded(value: js.Any): Self = this.set("onTagAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTagAdded: Self = this.set("onTagAdded", js.undefined)
    @scala.inline
    def setOnTagAdding(value: js.Any): Self = this.set("onTagAdding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTagAdding: Self = this.set("onTagAdding", js.undefined)
    @scala.inline
    def setOnTagClicked(value: js.Any): Self = this.set("onTagClicked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTagClicked: Self = this.set("onTagClicked", js.undefined)
    @scala.inline
    def setOnTagRemoved(value: js.Any): Self = this.set("onTagRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTagRemoved: Self = this.set("onTagRemoved", js.undefined)
    @scala.inline
    def setOnTagRemoving(value: js.Any): Self = this.set("onTagRemoving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTagRemoving: Self = this.set("onTagRemoving", js.undefined)
    @scala.inline
    def setPasteSplitPattern(value: String | Boolean): Self = this.set("pasteSplitPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteSplitPattern: Self = this.set("pasteSplitPattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String | Boolean): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRemoveTagSymbol(value: String | Boolean): Self = this.set("removeTagSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveTagSymbol: Self = this.set("removeTagSymbol", js.undefined)
    @scala.inline
    def setReplaceSpacesWithDashes(value: Boolean): Self = this.set("replaceSpacesWithDashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceSpacesWithDashes: Self = this.set("replaceSpacesWithDashes", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setTabindex(value: Double | Boolean): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setTagClass(value: js.Any): Self = this.set("tagClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagClass: Self = this.set("tagClass", js.undefined)
    @scala.inline
    def setTemplate(value: String | Boolean): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateScope(value: String | Boolean): Self = this.set("templateScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateScope: Self = this.set("templateScope", js.undefined)
    @scala.inline
    def setText(value: String | Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String | Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseStrings(value: Boolean): Self = this.set("useStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStrings: Self = this.set("useStrings", js.undefined)
  }
  
}

