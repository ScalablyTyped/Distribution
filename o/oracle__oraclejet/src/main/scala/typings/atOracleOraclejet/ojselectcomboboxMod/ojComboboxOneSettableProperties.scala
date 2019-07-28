package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.Anon_ChildKeysChildren
import typings.atOracleOraclejet.Anon_Class
import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_FilterFurther
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_LabelValue
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.OptionContext
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxOneSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, String] {
  var asyncValidators: js.Array[AsyncValidator[_]]
  var converter: Converter[_] | RegisteredConverter | Null
  var filterOnOpen: none | typings.atOracleOraclejet.atOracleOraclejetStrings.rawValue
  var minLength: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: Anon_ChildKeysChildren
  var pickerAttributes: Anon_Class
  var placeholder: String | Null
  val rawValue: String | Null
  var readOnly: Boolean
  var required: Boolean
  @JSName("translations")
  var translations_ojComboboxOneSettableProperties: Anon_FilterFurther
  var validators: (js.Array[Validator[_] | RegisteredValidator]) | Null
  var valueOption: Anon_LabelValue
}

object ojComboboxOneSettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[_]],
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    filterOnOpen: none | rawValue,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: Anon_ChildKeysChildren,
    pickerAttributes: Anon_Class,
    readOnly: Boolean,
    required: Boolean,
    translations: Anon_FilterFurther,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    valueOption: Anon_LabelValue,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Option | typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null,
    rawValue: String = null,
    validators: js.Array[Validator[_] | RegisteredValidator] = null
  ): ojComboboxOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, disabled = disabled, displayOptions = displayOptions, filterOnOpen = filterOnOpen.asInstanceOf[js.Any], help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, minLength = minLength, optionsKeys = optionsKeys, pickerAttributes = pickerAttributes, readOnly = readOnly, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value, valueOption = valueOption)
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojComboboxOneSettableProperties[K, D]]
  }
}

