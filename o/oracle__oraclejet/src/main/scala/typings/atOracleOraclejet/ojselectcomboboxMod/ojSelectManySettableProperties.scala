package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.Anon_ChildKeysChildrenLabelValue
import typings.atOracleOraclejet.Anon_Class
import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_FilterFurtherMoreMatchesFound
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_LabelValue
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.atOracleOraclejetStrings.native
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.OptionContext
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectManySettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any] | Null, js.Array[js.Any] | Null, js.Array[js.Any] | Null] {
  var minimumResultsForSearch: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: Anon_ChildKeysChildrenLabelValue
  var pickerAttributes: Anon_Class
  var placeholder: String | Null
  var readOnly: Boolean
  var renderMode: jet | native
  var required: Boolean
  @JSName("translations")
  var translations_ojSelectManySettableProperties: Anon_FilterFurtherMoreMatchesFound
  var valueOptions: js.Array[Anon_LabelValue] | Null
  @JSName("value")
  var value_ojSelectManySettableProperties: js.Array[_] | Null
}

object ojSelectManySettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minimumResultsForSearch: Double,
    optionsKeys: Anon_ChildKeysChildrenLabelValue,
    pickerAttributes: Anon_Class,
    readOnly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    translations: Anon_FilterFurtherMoreMatchesFound,
    valid: valid | pending | invalidHidden | invalidShown,
    describedBy: String = null,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[Anon_LabelValue] = null
  ): ojSelectManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, minimumResultsForSearch = minimumResultsForSearch, optionsKeys = optionsKeys, pickerAttributes = pickerAttributes, readOnly = readOnly, renderMode = renderMode.asInstanceOf[js.Any], required = required, translations = translations, valid = valid.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueOptions != null) __obj.updateDynamic("valueOptions")(valueOptions)
    __obj.asInstanceOf[ojSelectManySettableProperties[K, D]]
  }
}

