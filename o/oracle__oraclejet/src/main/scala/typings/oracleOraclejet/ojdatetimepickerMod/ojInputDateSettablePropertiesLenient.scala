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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatetimepicker.ojInputDateSettableProperties> */
trait ojInputDateSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[String]]] = js.undefined
  
  var autocomplete: js.UndefOr[on | off | String] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var converter: js.UndefOr[Converter[String] | RegisteredConverter] = js.undefined
  
  var datePicker: js.UndefOr[ChangeMonth] = js.undefined
  
  var dayFormatter: js.UndefOr[js.Function1[/* param */ DayFormatterInput, Null | all | DayFormatterOutput]] = js.undefined
  
  var dayMetaData: js.UndefOr[StringDictionary[StringDictionary[StringDictionary[Disabled]]]] = js.undefined
  
  var describedBy: js.UndefOr[String | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayOptions: js.UndefOr[ConverterHint] = js.undefined
  
  var help: js.UndefOr[Instruction] = js.undefined
  
  var helpHints: js.UndefOr[Definition] = js.undefined
  
  var keyboardEdit: js.UndefOr[enabled | disabled] = js.undefined
  
  var labelHint: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[String | Null] = js.undefined
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  
  var min: js.UndefOr[String | Null] = js.undefined
  
  var pickerAttributes: js.UndefOr[Class] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var rawValue: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var renderMode: js.UndefOr[jet | native] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var translations: js.UndefOr[CurrentText] = js.undefined
  
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  
  var validators: js.UndefOr[(js.Array[Validator[String] | RegisteredValidator]) | Null] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object ojInputDateSettablePropertiesLenient {
  
  inline def apply(): ojInputDateSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojInputDateSettablePropertiesLenient]
  }
  
  extension [Self <: ojInputDateSettablePropertiesLenient](x: Self) {
    
    inline def setAsyncValidators(value: js.Array[AsyncValidator[String]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidator[String]*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
    
    inline def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setConverter(value: Converter[String] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setDatePicker(value: ChangeMonth): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
    
    inline def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
    
    inline def setDayFormatter(value: /* param */ DayFormatterInput => Null | all | DayFormatterOutput): Self = StObject.set(x, "dayFormatter", js.Any.fromFunction1(value))
    
    inline def setDayFormatterUndefined: Self = StObject.set(x, "dayFormatter", js.undefined)
    
    inline def setDayMetaData(value: StringDictionary[StringDictionary[StringDictionary[Disabled]]]): Self = StObject.set(x, "dayMetaData", value.asInstanceOf[js.Any])
    
    inline def setDayMetaDataUndefined: Self = StObject.set(x, "dayMetaData", js.undefined)
    
    inline def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    inline def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
    
    inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
    
    inline def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setKeyboardEdit(value: enabled | disabled): Self = StObject.set(x, "keyboardEdit", value.asInstanceOf[js.Any])
    
    inline def setKeyboardEditUndefined: Self = StObject.set(x, "keyboardEdit", js.undefined)
    
    inline def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
    
    inline def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
    
    inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
    
    inline def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value*))
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPickerAttributes(value: Class): Self = StObject.set(x, "pickerAttributes", value.asInstanceOf[js.Any])
    
    inline def setPickerAttributesUndefined: Self = StObject.set(x, "pickerAttributes", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRenderMode(value: jet | native): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTranslations(value: CurrentText): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValidators(value: js.Array[Validator[String] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: (Validator[String] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
