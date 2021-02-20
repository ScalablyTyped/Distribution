package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.ChildrenLabel
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
import typings.oracleOraclejet.anon.MoreMatchesFound
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.OptionContext
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojSelectOneSettableProperties<K, D>> */
@js.native
trait ojSelectOneSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  
  var describedBy: js.UndefOr[String | Null] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  
  var help: js.UndefOr[Instruction] = js.native
  
  var helpHints: js.UndefOr[Definition] = js.native
  
  var labelHint: js.UndefOr[String] = js.native
  
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  
  var minimumResultsForSearch: js.UndefOr[Double] = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  
  var options: js.UndefOr[
    (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
    ]) | (DataProvider[K, D]) | Null
  ] = js.native
  
  var optionsKeys: js.UndefOr[ChildrenLabel] = js.native
  
  var pickerAttributes: js.UndefOr[Class] = js.native
  
  var placeholder: js.UndefOr[String | Null] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var renderMode: js.UndefOr[jet | native] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var translations: js.UndefOr[MoreMatchesFound] = js.native
  
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var valueOption: js.UndefOr[LabelValue] = js.native
}
object ojSelectOneSettablePropertiesLenient {
  
  @scala.inline
  def apply[K, D](): ojSelectOneSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSelectOneSettablePropertiesLenient[K, D]]
  }
  
  @scala.inline
  implicit class ojSelectOneSettablePropertiesLenientMutableBuilder[Self <: ojSelectOneSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojSelectOneSettablePropertiesLenient[K, D])) extends AnyVal {
    
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
    def setMinimumResultsForSearch(value: Double): Self = StObject.set(x, "minimumResultsForSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumResultsForSearchUndefined: Self = StObject.set(x, "minimumResultsForSearch", js.undefined)
    
    @scala.inline
    def setOptionRenderer(value: /* param0 */ OptionContext => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
    
    @scala.inline
    def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
    
    @scala.inline
    def setOptions(
      value: (js.Array[
          typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
        ]) | (DataProvider[K, D])
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsKeys(value: ChildrenLabel): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(
      value: (typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup)*
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
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRenderMode(value: jet | native): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTranslations(value: MoreMatchesFound): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
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
