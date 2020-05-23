package typings.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ChangeMonth
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.CurrentText
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Disabled
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typings.oracleOraclejet.ojinputtextMod.inputBaseSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputDateSettableProperties extends inputBaseSettableProperties[String, String, String] {
  var converter: Converter[String] | RegisteredConverter
  var datePicker: ChangeMonth
  var dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]]
  var keyboardEdit: enabled | disabled
  var max: String | Null
  var min: String | Null
  var pickerAttributes: Class
  var renderMode: jet | native
  @JSName("translations")
  var translations_ojInputDateSettableProperties: CurrentText
  def dayFormatter(param: DayFormatterInput): Null | all | DayFormatterOutput
}

object ojInputDateSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    datePicker: ChangeMonth,
    dayFormatter: DayFormatterInput => Null | all | DayFormatterOutput,
    dayMetaData: StringDictionary[StringDictionary[StringDictionary[Disabled]]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    keyboardEdit: enabled | disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: Class,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    translations: CurrentText,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String,
    describedBy: String = null,
    max: String = null,
    min: String = null,
    validators: js.Array[Validator[String] | RegisteredValidator] = null
  ): ojInputDateSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], datePicker = datePicker.asInstanceOf[js.Any], dayFormatter = js.Any.fromFunction1(dayFormatter), dayMetaData = dayMetaData.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputDateSettableProperties]
  }
}

