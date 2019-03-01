package typings
package ngDashTagsDashInputLib.ngDashTagsDashInputMod.angularMod.ngTagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsInputParams extends js.Object {
  var addFromAutocompleteOnly: js.UndefOr[scala.Boolean] = js.undefined
  var addOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  var addOnComma: js.UndefOr[scala.Boolean] = js.undefined
  var addOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var addOnPaste: js.UndefOr[scala.Boolean] = js.undefined
  var addOnSpace: js.UndefOr[scala.Boolean] = js.undefined
  var allowLeftoverText: js.UndefOr[scala.Boolean] = js.undefined
  var allowedTagsPattern: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var displayProperty: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var enableEditingLastTag: js.UndefOr[scala.Boolean] = js.undefined
  var keyProperty: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var maxLength: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var maxTags: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var minLength: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var minTags: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var ngModel: js.UndefOr[java.lang.String] = js.undefined
  var onInvalidTag: js.UndefOr[js.Any] = js.undefined
  var onTagAdded: js.UndefOr[js.Any] = js.undefined
  var onTagAdding: js.UndefOr[js.Any] = js.undefined
  var onTagClicked: js.UndefOr[js.Any] = js.undefined
  var onTagRemoved: js.UndefOr[js.Any] = js.undefined
  var onTagRemoving: js.UndefOr[js.Any] = js.undefined
  var pasteSplitPattern: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var removeTagSymbol: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var replaceSpacesWithDashes: js.UndefOr[scala.Boolean] = js.undefined
  var spellcheck: js.UndefOr[scala.Boolean] = js.undefined
  var tabindex: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var tagClass: js.UndefOr[js.Any] = js.undefined
  var template: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var templateScope: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var useStrings: js.UndefOr[scala.Boolean] = js.undefined
}

object TagsInputParams {
  @scala.inline
  def apply(
    addFromAutocompleteOnly: js.UndefOr[scala.Boolean] = js.undefined,
    addOnBlur: js.UndefOr[scala.Boolean] = js.undefined,
    addOnComma: js.UndefOr[scala.Boolean] = js.undefined,
    addOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    addOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    addOnSpace: js.UndefOr[scala.Boolean] = js.undefined,
    allowLeftoverText: js.UndefOr[scala.Boolean] = js.undefined,
    allowedTagsPattern: java.lang.String | scala.Boolean = null,
    displayProperty: java.lang.String | scala.Boolean = null,
    enableEditingLastTag: js.UndefOr[scala.Boolean] = js.undefined,
    keyProperty: java.lang.String | scala.Boolean = null,
    maxLength: scala.Double | scala.Boolean = null,
    maxTags: scala.Double | scala.Boolean = null,
    minLength: scala.Double | scala.Boolean = null,
    minTags: scala.Double | scala.Boolean = null,
    ngModel: java.lang.String = null,
    onInvalidTag: js.Any = null,
    onTagAdded: js.Any = null,
    onTagAdding: js.Any = null,
    onTagClicked: js.Any = null,
    onTagRemoved: js.Any = null,
    onTagRemoving: js.Any = null,
    pasteSplitPattern: java.lang.String | scala.Boolean = null,
    placeholder: java.lang.String | scala.Boolean = null,
    removeTagSymbol: java.lang.String | scala.Boolean = null,
    replaceSpacesWithDashes: js.UndefOr[scala.Boolean] = js.undefined,
    spellcheck: js.UndefOr[scala.Boolean] = js.undefined,
    tabindex: scala.Double | scala.Boolean = null,
    tagClass: js.Any = null,
    template: java.lang.String | scala.Boolean = null,
    templateScope: java.lang.String | scala.Boolean = null,
    text: java.lang.String | scala.Boolean = null,
    `type`: java.lang.String | scala.Boolean = null,
    useStrings: js.UndefOr[scala.Boolean] = js.undefined
  ): TagsInputParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addFromAutocompleteOnly)) __obj.updateDynamic("addFromAutocompleteOnly")(addFromAutocompleteOnly)
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur)
    if (!js.isUndefined(addOnComma)) __obj.updateDynamic("addOnComma")(addOnComma)
    if (!js.isUndefined(addOnEnter)) __obj.updateDynamic("addOnEnter")(addOnEnter)
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste)
    if (!js.isUndefined(addOnSpace)) __obj.updateDynamic("addOnSpace")(addOnSpace)
    if (!js.isUndefined(allowLeftoverText)) __obj.updateDynamic("allowLeftoverText")(allowLeftoverText)
    if (allowedTagsPattern != null) __obj.updateDynamic("allowedTagsPattern")(allowedTagsPattern.asInstanceOf[js.Any])
    if (displayProperty != null) __obj.updateDynamic("displayProperty")(displayProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(enableEditingLastTag)) __obj.updateDynamic("enableEditingLastTag")(enableEditingLastTag)
    if (keyProperty != null) __obj.updateDynamic("keyProperty")(keyProperty.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minTags != null) __obj.updateDynamic("minTags")(minTags.asInstanceOf[js.Any])
    if (ngModel != null) __obj.updateDynamic("ngModel")(ngModel)
    if (onInvalidTag != null) __obj.updateDynamic("onInvalidTag")(onInvalidTag)
    if (onTagAdded != null) __obj.updateDynamic("onTagAdded")(onTagAdded)
    if (onTagAdding != null) __obj.updateDynamic("onTagAdding")(onTagAdding)
    if (onTagClicked != null) __obj.updateDynamic("onTagClicked")(onTagClicked)
    if (onTagRemoved != null) __obj.updateDynamic("onTagRemoved")(onTagRemoved)
    if (onTagRemoving != null) __obj.updateDynamic("onTagRemoving")(onTagRemoving)
    if (pasteSplitPattern != null) __obj.updateDynamic("pasteSplitPattern")(pasteSplitPattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (removeTagSymbol != null) __obj.updateDynamic("removeTagSymbol")(removeTagSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSpacesWithDashes)) __obj.updateDynamic("replaceSpacesWithDashes")(replaceSpacesWithDashes)
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateScope != null) __obj.updateDynamic("templateScope")(templateScope.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useStrings)) __obj.updateDynamic("useStrings")(useStrings)
    __obj.asInstanceOf[TagsInputParams]
  }
}

