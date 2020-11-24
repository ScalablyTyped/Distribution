package typings.oracleOraclejet.ojinputnumberMod

import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.NumberRange
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.text
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputNumberSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, String] {
  
  var asyncValidators: js.Array[AsyncValidator[Double]] = js.native
  
  var autocomplete: on | off | String = js.native
  
  var autofocus: Boolean = js.native
  
  var converter: Converter[Double] | RegisteredConverter = js.native
  
  var max: Double | Null = js.native
  
  var min: Double | Null = js.native
  
  var placeholder: String | Null = js.native
  
  val rawValue: String = js.native
  
  var readonly: Boolean | Null = js.native
  
  var required: Boolean = js.native
  
  var step: Double | Null = js.native
  
  @JSName("translations")
  var translations_ojInputNumberSettableProperties: NumberRange = js.native
  
  var validators: js.Array[Validator[Double] | RegisteredValidator] = js.native
  
  var virtualKeyboard: auto | number | text = js.native
}
object ojInputNumberSettableProperties {
  
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[Double]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[Double] | RegisteredConverter,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    rawValue: String,
    required: Boolean,
    translations: NumberRange,
    valid: valid | pending | invalidHidden | invalidShown,
    validators: js.Array[Validator[Double] | RegisteredValidator],
    virtualKeyboard: auto | number | text
  ): ojInputNumberSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputNumberSettableProperties]
  }
  
  @scala.inline
  implicit class ojInputNumberSettablePropertiesOps[Self <: ojInputNumberSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setAsyncValidatorsVarargs(value: AsyncValidator[Double]*): Self = this.set("asyncValidators", js.Array(value :_*))
    
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[Double]]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocomplete(value: on | off | String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverter(value: Converter[Double] | RegisteredConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValue(value: String): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: NumberRange): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsVarargs(value: (Validator[Double] | RegisteredValidator)*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[Validator[Double] | RegisteredValidator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualKeyboard(value: auto | number | text): Self = this.set("virtualKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNull: Self = this.set("max", null)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNull: Self = this.set("min", null)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = this.set("readonly", null)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNull: Self = this.set("step", null)
  }
}
