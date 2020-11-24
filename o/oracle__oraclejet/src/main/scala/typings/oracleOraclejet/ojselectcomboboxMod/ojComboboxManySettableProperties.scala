package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.anon.Children
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.FilterFurther
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojComboboxManySettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any] | Null, js.Array[js.Any] | Null, String] {
  
  var asyncValidators: js.Array[AsyncValidator[js.Array[_]]] = js.native
  
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  
  var minLength: Double = js.native
  
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  
  var options: (js.Array[
    typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
  ]) | (DataProvider[K, D]) | Null = js.native
  
  var optionsKeys: Children = js.native
  
  var pickerAttributes: Class = js.native
  
  var placeholder: String | Null = js.native
  
  val rawValue: String | Null = js.native
  
  var readOnly: Boolean = js.native
  
  var required: Boolean = js.native
  
  @JSName("translations")
  var translations_ojComboboxManySettableProperties: FilterFurther = js.native
  
  var validators: (js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null = js.native
  
  var valueOptions: js.Array[LabelValue] | Null = js.native
  
  @JSName("value")
  var value_ojComboboxManySettableProperties: js.Array[_] | Null = js.native
}
object ojComboboxManySettableProperties {
  
  @scala.inline
  def apply[K, D](
    asyncValidators: js.Array[AsyncValidator[js.Array[_]]],
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    minLength: Double,
    optionsKeys: Children,
    pickerAttributes: Class,
    readOnly: Boolean,
    required: Boolean,
    translations: FilterFurther,
    valid: valid | pending | invalidHidden | invalidShown
  ): ojComboboxManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], optionsKeys = optionsKeys.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxManySettableProperties[K, D]]
  }
  
  @scala.inline
  implicit class ojComboboxManySettablePropertiesOps[Self <: ojComboboxManySettableProperties[_, _], K, D] (val x: Self with (ojComboboxManySettableProperties[K, D])) extends AnyVal {
    
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
    def setAsyncValidatorsVarargs(value: AsyncValidator[js.Array[js.Any]]*): Self = this.set("asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[js.Array[_]]]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsKeys(value: Children): Self = this.set("optionsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerAttributes(value: Class): Self = this.set("pickerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: FilterFurther): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverter(value: Converter[_] | RegisteredConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterNull: Self = this.set("converter", null)
    
    @scala.inline
    def setOptionRenderer(value: /* param0 */ OptionContext => Element): Self = this.set("optionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOptionRenderer: Self = this.set("optionRenderer", js.undefined)
    
    @scala.inline
    def setOptionRendererNull: Self = this.set("optionRenderer", null)
    
    @scala.inline
    def setOptionsVarargs(
      value: (typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
    ): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(
      value: (js.Array[
          typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ]) | (DataProvider[K, D])
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    
    @scala.inline
    def setRawValue(value: String): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValueNull: Self = this.set("rawValue", null)
    
    @scala.inline
    def setValidatorsVarargs(value: (Validator[js.Array[js.Any]] | RegisteredValidator)*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[Validator[js.Array[_]] | RegisteredValidator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsNull: Self = this.set("validators", null)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setValueOptionsVarargs(value: LabelValue*): Self = this.set("valueOptions", js.Array(value :_*))
    
    @scala.inline
    def setValueOptions(value: js.Array[LabelValue]): Self = this.set("valueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOptionsNull: Self = this.set("valueOptions", null)
  }
}
