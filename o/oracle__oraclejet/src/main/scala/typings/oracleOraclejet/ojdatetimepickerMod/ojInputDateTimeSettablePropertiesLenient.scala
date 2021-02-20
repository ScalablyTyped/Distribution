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
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatetimepicker.ojInputDateTimeSettableProperties> */
@js.native
trait ojInputDateTimeSettablePropertiesLenient
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
  
  var keyboardEdit: js.UndefOr[enabled | disabled] = js.native
  
  var labelHint: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[String | Null] = js.native
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  
  var min: js.UndefOr[String | Null] = js.native
  
  var pickerAttributes: js.UndefOr[Class] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rawValue: js.UndefOr[String] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var renderMode: js.UndefOr[jet | native] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var timePicker: js.UndefOr[FooterLayout] = js.native
  
  var translations: js.UndefOr[Cancel] = js.native
  
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  
  var validators: js.UndefOr[(js.Array[Validator[String] | RegisteredValidator]) | Null] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object ojInputDateTimeSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojInputDateTimeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojInputDateTimeSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojInputDateTimeSettablePropertiesLenientMutableBuilder[Self <: ojInputDateTimeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[String]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    @scala.inline
    def setAsyncValidatorsVarargs(value: AsyncValidator[String]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    @scala.inline
    def setConverter(value: Converter[String] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    @scala.inline
    def setDatePicker(value: ChangeMonth): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
    
    @scala.inline
    def setDayFormatter(value: /* param */ DayFormatterInput => Null | all | DayFormatterOutput): Self = StObject.set(x, "dayFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDayFormatterUndefined: Self = StObject.set(x, "dayFormatter", js.undefined)
    
    @scala.inline
    def setDayMetaData(value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Self = StObject.set(x, "dayMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayMetaDataUndefined: Self = StObject.set(x, "dayMetaData", js.undefined)
    
    @scala.inline
    def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
    
    @scala.inline
    def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    @scala.inline
    def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setKeyboardEdit(value: enabled | disabled): Self = StObject.set(x, "keyboardEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEditUndefined: Self = StObject.set(x, "keyboardEdit", js.undefined)
    
    @scala.inline
    def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNull: Self = StObject.set(x, "max", null)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
    
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNull: Self = StObject.set(x, "min", null)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPickerAttributes(value: Class): Self = StObject.set(x, "pickerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerAttributesUndefined: Self = StObject.set(x, "pickerAttributes", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setRenderMode(value: jet | native): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTimePicker(value: FooterLayout): Self = StObject.set(x, "timePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePickerUndefined: Self = StObject.set(x, "timePicker", js.undefined)
    
    @scala.inline
    def setTranslations(value: Cancel): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Array[Validator[String] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: (Validator[String] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
