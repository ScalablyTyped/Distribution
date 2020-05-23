package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.anon.Children
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.FilterFurther
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxManySettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any] | Null, js.Array[js.Any] | Null, String] {
  var asyncValidators: js.Array[AsyncValidator[js.Array[_]]]
  var converter: Converter[_] | RegisteredConverter | Null
  var minLength: Double
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.undefined
  var options: (js.Array[
    typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null
  var optionsKeys: Children
  var pickerAttributes: Class
  var placeholder: String | Null
  val rawValue: String | Null
  var readOnly: Boolean
  var required: Boolean
  @JSName("translations")
  var translations_ojComboboxManySettableProperties: FilterFurther
  var validators: (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null
  var valueOptions: js.Array[LabelValue] | Null
  @JSName("value")
  var value_ojComboboxManySettableProperties: js.Array[_] | Null
}

object ojComboboxManySettableProperties {
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[js.Array[_]]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: Children,
    pickerAttributes: Class,
    readOnly: Boolean,
    required: Boolean,
    translations: FilterFurther,
    valid: valid | pending | invalidHidden | invalidShown,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    optionRenderer: js.UndefOr[Null | (/* param0 */ OptionContext => Element)] = js.undefined,
    options: (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) = null,
    placeholder: String = null,
    rawValue: String = null,
    validators: js.Array[Validator[js.Array[_]] | RegisteredValidator] = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[LabelValue] = null
  ): ojComboboxManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueOptions = valueOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(optionRenderer)) __obj.updateDynamic("optionRenderer")(if (optionRenderer != null) js.Any.fromFunction1(optionRenderer.asInstanceOf[/* param0 */ OptionContext => Element]) else null)
    __obj.asInstanceOf[ojComboboxManySettableProperties[K, D]]
  }
}

