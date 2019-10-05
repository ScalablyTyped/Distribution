package typings.atOracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.Anon_
import typings.atOracleOraclejet.Anon_Cancel
import typings.atOracleOraclejet.Anon_Class
import typings.atOracleOraclejet.Anon_ClassNameDisabled
import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Focus
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.enabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.atOracleOraclejetStrings.native
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredConverter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputDateTimeSettableProperties extends ojInputDateSettableProperties {
  var timePicker: Anon_Focus
  @JSName("translations")
  var translations_ojInputDateTimeSettableProperties: Anon_Cancel
}

object ojInputDateTimeSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    datePicker: Anon_,
    dayFormatter: DayFormatterInput => Null | all | DayFormatterOutput,
    dayMetaData: StringDictionary[StringDictionary[StringDictionary[Anon_ClassNameDisabled]]],
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    keyboardEdit: enabled | disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: Anon_Class,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    timePicker: Anon_Focus,
    translations: Anon_Cancel,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String,
    describedBy: String = null,
    max: String = null,
    min: String = null,
    validators: js.Array[Validator[String] | RegisteredValidator] = null
  ): ojInputDateTimeSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, converter = converter.asInstanceOf[js.Any], datePicker = datePicker, dayFormatter = js.Any.fromFunction1(dayFormatter), dayMetaData = dayMetaData, disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint, messagesCustom = messagesCustom, pickerAttributes = pickerAttributes, placeholder = placeholder, rawValue = rawValue, readonly = readonly, renderMode = renderMode.asInstanceOf[js.Any], required = required, timePicker = timePicker, translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojInputDateTimeSettableProperties]
  }
}

