package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonChildren
import typings.oracleOraclejet.AnonClass
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonFilterFurther
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.AnonLabelValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxManySettableProperties<K, D>> */
trait ojComboboxManySettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[js.Array[_]]]] = js.undefined
  var converter: js.UndefOr[Converter[_] | RegisteredConverter] = js.undefined
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[AnonConverterHint] = js.undefined
  var help: js.UndefOr[AnonInstruction] = js.undefined
  var helpHints: js.UndefOr[AnonDefinition] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* param0 */ OptionContext, Element]] = js.undefined
  var options: js.UndefOr[
    (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D])
  ] = js.undefined
  var optionsKeys: js.UndefOr[AnonChildren] = js.undefined
  var pickerAttributes: js.UndefOr[AnonClass] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rawValue: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[AnonFilterFurther] = js.undefined
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var validators: js.UndefOr[js.Array[Validator[js.Array[_]] | RegisteredValidator]] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
  var valueOptions: js.UndefOr[js.Array[AnonLabelValue]] = js.undefined
}

object ojComboboxManySettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    asyncValidators: js.Array[AsyncValidator[js.Array[_]]] = null,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: AnonConverterHint = null,
    help: AnonInstruction = null,
    helpHints: AnonDefinition = null,
    labelHint: String = null,
    messagesCustom: js.Array[^] = null,
    minLength: Int | Double = null,
    optionRenderer: /* param0 */ OptionContext => Element = null,
    options: (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) = null,
    optionsKeys: AnonChildren = null,
    pickerAttributes: AnonClass = null,
    placeholder: String = null,
    rawValue: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    translations: AnonFilterFurther = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    validators: js.Array[Validator[js.Array[_]] | RegisteredValidator] = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[AnonLabelValue] = null
  ): ojComboboxManySettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    if (pickerAttributes != null) __obj.updateDynamic("pickerAttributes")(pickerAttributes.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueOptions != null) __obj.updateDynamic("valueOptions")(valueOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxManySettablePropertiesLenient[K, D]]
  }
}

