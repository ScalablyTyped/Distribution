package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Children
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.FilterFurther
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
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
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.rawValue
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxOneSettableProperties<K, D>> */
@js.native
trait ojComboboxOneSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[_]]] = js.native
  
  var converter: js.UndefOr[Converter[_] | RegisteredConverter | Null] = js.native
  
  var describedBy: js.UndefOr[String | Null] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  
  var filterOnOpen: js.UndefOr[none | rawValue] = js.native
  
  var help: js.UndefOr[Instruction] = js.native
  
  var helpHints: js.UndefOr[Definition] = js.native
  
  var labelHint: js.UndefOr[String] = js.native
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  
  var options: js.UndefOr[
    (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) | Null
  ] = js.native
  
  var optionsKeys: js.UndefOr[Children] = js.native
  
  var pickerAttributes: js.UndefOr[Class] = js.native
  
  var placeholder: js.UndefOr[String | Null] = js.native
  
  var rawValue: js.UndefOr[String | Null] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var translations: js.UndefOr[FilterFurther] = js.native
  
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  
  var validators: js.UndefOr[(js.Array[Validator[_] | RegisteredValidator]) | Null] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var valueOption: js.UndefOr[LabelValue] = js.native
}
object ojComboboxOneSettablePropertiesLenient {
  
  @scala.inline
  def apply[K, D](): ojComboboxOneSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojComboboxOneSettablePropertiesLenient[K, D]]
  }
  
  @scala.inline
  implicit class ojComboboxOneSettablePropertiesLenientMutableBuilder[Self <: ojComboboxOneSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojComboboxOneSettablePropertiesLenient[K, D])) extends AnyVal {
    
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[_]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    @scala.inline
    def setAsyncValidatorsVarargs(value: AsyncValidator[js.Any]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setConverter(value: Converter[_] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterNull: Self = StObject.set(x, "converter", null)
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
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
    def setFilterOnOpen(value: none | rawValue): Self = StObject.set(x, "filterOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOnOpenUndefined: Self = StObject.set(x, "filterOnOpen", js.undefined)
    
    @scala.inline
    def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
    
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
    
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setOptionRenderer(value: /* param0 */ OptionContext => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
    
    @scala.inline
    def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
    
    @scala.inline
    def setOptions(
      value: (js.Array[
          typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ]) | (DataProvider[K, D])
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsKeys(value: Children): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(
      value: (typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
    ): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPickerAttributes(value: Class): Self = StObject.set(x, "pickerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerAttributesUndefined: Self = StObject.set(x, "pickerAttributes", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueNull: Self = StObject.set(x, "rawValue", null)
    
    @scala.inline
    def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTranslations(value: FilterFurther): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Array[Validator[_] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: (Validator[js.Any] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOption(value: LabelValue): Self = StObject.set(x, "valueOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOptionUndefined: Self = StObject.set(x, "valueOption", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
