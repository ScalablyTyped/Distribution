package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxOneSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Any, js.Any, java.lang.String] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[_]]
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
  var filterOnOpen: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue
  var minLength: scala.Double
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildren
  var pickerAttributes: atOracleOraclejetLib.Anon_Class
  var placeholder: java.lang.String | scala.Null
  val rawValue: java.lang.String | scala.Null
  var readOnly: scala.Boolean
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojComboboxOneSettableProperties: atOracleOraclejetLib.Anon_FilterFurther
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null
  var valueOption: atOracleOraclejetLib.Anon_LabelValue
}

object ojComboboxOneSettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[_]],
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    filterOnOpen: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    minLength: scala.Double,
    optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildren,
    pickerAttributes: atOracleOraclejetLib.Anon_Class,
    readOnly: scala.Boolean,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_FilterFurther,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: js.Any,
    valueOption: atOracleOraclejetLib.Anon_LabelValue,
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter = null,
    describedBy: java.lang.String = null,
    optionRenderer: js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
      stdLib.Element
    ] = null,
    options: (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) = null,
    placeholder: java.lang.String = null,
    rawValue: java.lang.String = null,
    validators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null
  ): ojComboboxOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, disabled = disabled, displayOptions = displayOptions, filterOnOpen = filterOnOpen.asInstanceOf[js.Any], help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, minLength = minLength, optionsKeys = optionsKeys, pickerAttributes = pickerAttributes, readOnly = readOnly, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value, valueOption = valueOption)
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(optionRenderer)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojComboboxOneSettableProperties[K, D]]
  }
}

