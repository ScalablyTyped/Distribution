package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxManySettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Array[js.Any] | scala.Null, js.Array[js.Any] | scala.Null, java.lang.String] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
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
  var translations_ojComboboxManySettableProperties: atOracleOraclejetLib.Anon_FilterFurther
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null
  var valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null
  @JSName("value")
  var value_ojComboboxManySettableProperties: js.Array[_] | scala.Null
}

object ojComboboxManySettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]],
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
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
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] = null
  ): ojComboboxManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncValidators")(asyncValidators)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpHints")(helpHints)
    __obj.updateDynamic("labelHint")(labelHint)
    __obj.updateDynamic("messagesCustom")(messagesCustom)
    __obj.updateDynamic("minLength")(minLength)
    __obj.updateDynamic("optionsKeys")(optionsKeys)
    __obj.updateDynamic("pickerAttributes")(pickerAttributes)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(optionRenderer)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueOptions != null) __obj.updateDynamic("valueOptions")(valueOptions)
    __obj.asInstanceOf[ojComboboxManySettableProperties[K, D]]
  }
}

