package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.AnonChildrenLabel
import typings.oracleOraclejet.AnonClass
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.AnonLabelValue
import typings.oracleOraclejet.AnonMoreMatchesFound
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectOneSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, js.Any] {
  var minimumResultsForSearch: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: AnonChildrenLabel
  var pickerAttributes: AnonClass
  var placeholder: String | Null
  var readOnly: Boolean
  var renderMode: jet | native
  var required: Boolean
  @JSName("translations")
  var translations_ojSelectOneSettableProperties: AnonMoreMatchesFound
  var valueOption: AnonLabelValue
}

object ojSelectOneSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minimumResultsForSearch: Double,
    optionsKeys: AnonChildrenLabel,
    pickerAttributes: AnonClass,
    readOnly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    translations: AnonMoreMatchesFound,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    valueOption: AnonLabelValue,
    describedBy: String = null,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null
  ): ojSelectOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minimumResultsForSearch = minimumResultsForSearch.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueOption = valueOption.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSelectOneSettableProperties[K, D]]
  }
}

