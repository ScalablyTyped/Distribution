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
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatetimepicker.ojDateTimePickerSettableProperties> */
@js.native
trait ojDateTimePickerSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[String]]] = js.native
  var autocomplete: js.UndefOr[on | off | String] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var converter: js.UndefOr[Converter[String] | RegisteredConverter] = js.native
  var datePicker: js.UndefOr[ChangeMonth] = js.native
  var dayFormatter: js.UndefOr[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]] = js.native
  var dayMetaData: js.UndefOr[StringDictionary[StringDictionary[StringDictionary[Disabled]]]] = js.native
  var describedBy: js.UndefOr[String | Null] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var keyboardEdit: js.UndefOr[disabled] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var max: js.UndefOr[String | Null] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var min: js.UndefOr[String | Null] = js.native
  var pickerAttributes: js.UndefOr[Class] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var rawValue: js.UndefOr[String] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var renderMode: js.UndefOr[jet] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var timePicker: js.UndefOr[FooterLayout] = js.native
  var translations: js.UndefOr[Cancel] = js.native
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var validators: js.UndefOr[(js.Array[Validator[String] | RegisteredValidator]) | Null] = js.native
  var value: js.UndefOr[String] = js.native
}

object ojDateTimePickerSettablePropertiesLenient {
  @scala.inline
  def apply(): ojDateTimePickerSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDateTimePickerSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojDateTimePickerSettablePropertiesLenientOps[Self <: ojDateTimePickerSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setAsyncValidatorsVarargs(value: AsyncValidator[String]*): Self = this.set("asyncValidators", js.Array(value :_*))
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[String]]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncValidators: Self = this.set("asyncValidators", js.undefined)
    @scala.inline
    def setAutocomplete(value: on | off | String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setConverter(value: Converter[String] | RegisteredConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setDatePicker(value: ChangeMonth): Self = this.set("datePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePicker: Self = this.set("datePicker", js.undefined)
    @scala.inline
    def setDayFormatter(value: /* param */ DayFormatterInput => Null | all | DayFormatterOutput): Self = this.set("dayFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDayFormatter: Self = this.set("dayFormatter", js.undefined)
    @scala.inline
    def setDayMetaData(value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Self = this.set("dayMetaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayMetaData: Self = this.set("dayMetaData", js.undefined)
    @scala.inline
    def setDescribedBy(value: String): Self = this.set("describedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescribedBy: Self = this.set("describedBy", js.undefined)
    @scala.inline
    def setDescribedByNull: Self = this.set("describedBy", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayOptions(value: ConverterHint): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    @scala.inline
    def setHelp(value: Instruction): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHelpHints(value: Definition): Self = this.set("helpHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpHints: Self = this.set("helpHints", js.undefined)
    @scala.inline
    def setKeyboardEdit(value: disabled): Self = this.set("keyboardEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardEdit: Self = this.set("keyboardEdit", js.undefined)
    @scala.inline
    def setLabelHint(value: String): Self = this.set("labelHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHint: Self = this.set("labelHint", js.undefined)
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxNull: Self = this.set("max", null)
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = this.set("messagesCustom", js.Array(value :_*))
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = this.set("messagesCustom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesCustom: Self = this.set("messagesCustom", js.undefined)
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinNull: Self = this.set("min", null)
    @scala.inline
    def setPickerAttributes(value: Class): Self = this.set("pickerAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerAttributes: Self = this.set("pickerAttributes", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRawValue(value: String): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawValue: Self = this.set("rawValue", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setRenderMode(value: jet): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTimePicker(value: FooterLayout): Self = this.set("timePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePicker: Self = this.set("timePicker", js.undefined)
    @scala.inline
    def setTranslations(value: Cancel): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValidatorsVarargs(value: (Validator[String] | RegisteredValidator)*): Self = this.set("validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: js.Array[Validator[String] | RegisteredValidator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
    @scala.inline
    def setValidatorsNull: Self = this.set("validators", null)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

