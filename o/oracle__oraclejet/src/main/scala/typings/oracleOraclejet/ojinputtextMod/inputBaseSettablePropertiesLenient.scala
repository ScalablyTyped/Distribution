package typings.oracleOraclejet.ojinputtextMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.Regexp
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBaseSettableProperties<V, SV, RV>> */
trait inputBaseSettablePropertiesLenient[V, SV, RV]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[V]]] = js.undefined
  
  var autocomplete: js.UndefOr[on | off | String] = js.undefined
  
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  var describedBy: js.UndefOr[String | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayOptions: js.UndefOr[ConverterHint] = js.undefined
  
  var help: js.UndefOr[Instruction] = js.undefined
  
  var helpHints: js.UndefOr[Definition] = js.undefined
  
  var labelHint: js.UndefOr[String] = js.undefined
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var rawValue: js.UndefOr[RV] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var translations: js.UndefOr[Regexp] = js.undefined
  
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  
  var validators: js.UndefOr[(js.Array[Validator[V] | RegisteredValidator]) | Null] = js.undefined
  
  var value: js.UndefOr[SV] = js.undefined
}
object inputBaseSettablePropertiesLenient {
  
  inline def apply[V, SV, RV](): inputBaseSettablePropertiesLenient[V, SV, RV] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[inputBaseSettablePropertiesLenient[V, SV, RV]]
  }
  
  extension [Self <: inputBaseSettablePropertiesLenient[?, ?, ?], V, SV, RV](x: Self & (inputBaseSettablePropertiesLenient[V, SV, RV])) {
    
    inline def setAsyncValidators(value: js.Array[AsyncValidator[V]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    inline def setAsyncValidatorsVarargs(value: AsyncValidator[V]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
    
    inline def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
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
    
    inline def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
    
    inline def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
    
    inline def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
    
    inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
    
    inline def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRawValue(value: RV): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTranslations(value: Regexp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValidators(value: js.Array[Validator[V] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    inline def setValidatorsVarargs(value: (Validator[V] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
    
    inline def setValue(value: SV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
