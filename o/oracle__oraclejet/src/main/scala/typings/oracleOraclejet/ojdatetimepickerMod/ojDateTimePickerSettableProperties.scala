package typings.oracleOraclejet.ojdatetimepickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Cancel
import typings.oracleOraclejet.anon.ChangeMonth
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Disabled
import typings.oracleOraclejet.anon.FooterLayout
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterInput
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDate.DayFormatterOutput
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDateTimePickerSettableProperties extends ojInputDateTimeSettableProperties {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePickerSettableProperties: disabled = js.native
  @JSName("renderMode")
  var renderMode_ojDateTimePickerSettableProperties: jet = js.native
}

object ojDateTimePickerSettableProperties {
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
    keyboardEdit: disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: Class,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet,
    required: Boolean,
    timePicker: FooterLayout,
    translations: Cancel,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String
  ): ojDateTimePickerSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], datePicker = datePicker.asInstanceOf[js.Any], dayFormatter = js.Any.fromFunction1(dayFormatter), dayMetaData = dayMetaData.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], timePicker = timePicker.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDateTimePickerSettableProperties]
  }
  @scala.inline
  implicit class ojDateTimePickerSettablePropertiesOps[Self <: ojDateTimePickerSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyboardEdit(value: disabled): Self = this.set("keyboardEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderMode(value: jet): Self = this.set("renderMode", value.asInstanceOf[js.Any])
  }
  
}

