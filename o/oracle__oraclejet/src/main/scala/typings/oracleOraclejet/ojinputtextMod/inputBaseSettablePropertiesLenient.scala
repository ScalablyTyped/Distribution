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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBaseSettableProperties<V, SV, RV>> */
@js.native
trait inputBaseSettablePropertiesLenient[V, SV, RV]
  extends /* key */ StringDictionary[js.Any] {
  
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[V]]] = js.native
  
  var autocomplete: js.UndefOr[on | off | String] = js.native
  
  var autofocus: js.UndefOr[Boolean] = js.native
  
  var describedBy: js.UndefOr[String | Null] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  
  var help: js.UndefOr[Instruction] = js.native
  
  var helpHints: js.UndefOr[Definition] = js.native
  
  var labelHint: js.UndefOr[String] = js.native
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rawValue: js.UndefOr[RV] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var translations: js.UndefOr[Regexp] = js.native
  
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  
  var validators: js.UndefOr[(js.Array[Validator[V] | RegisteredValidator]) | Null] = js.native
  
  var value: js.UndefOr[SV] = js.native
}
object inputBaseSettablePropertiesLenient {
  
  @scala.inline
  def apply[V, SV, RV](): inputBaseSettablePropertiesLenient[V, SV, RV] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[inputBaseSettablePropertiesLenient[V, SV, RV]]
  }
  
  @scala.inline
  implicit class inputBaseSettablePropertiesLenientMutableBuilder[Self <: inputBaseSettablePropertiesLenient[_, _, _], V, SV, RV] (val x: Self with (inputBaseSettablePropertiesLenient[V, SV, RV])) extends AnyVal {
    
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[V]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
    
    @scala.inline
    def setAsyncValidatorsVarargs(value: AsyncValidator[V]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
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
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRawValue(value: RV): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTranslations(value: Regexp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValidators(value: js.Array[Validator[V] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsNull: Self = StObject.set(x, "validators", null)
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: (Validator[V] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: SV): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
