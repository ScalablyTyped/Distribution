package typings.oracleOraclejet.ojinputtextMod

import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.Regexp
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait inputBaseSettableProperties[V, SV, RV] extends editableValueSettableProperties[V, SV, RV] {
  var asyncValidators: js.Array[AsyncValidator[V]] = js.native
  var autocomplete: on | off | String = js.native
  var autofocus: Boolean = js.native
  var placeholder: String = js.native
  val rawValue: RV = js.native
  var readonly: Boolean = js.native
  var required: Boolean = js.native
  @JSName("translations")
  var translations_inputBaseSettableProperties: Regexp = js.native
  var validators: (js.Array[Validator[V] | RegisteredValidator]) | Null = js.native
}

object inputBaseSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    asyncValidators: js.Array[AsyncValidator[V]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: RV,
    readonly: Boolean,
    required: Boolean,
    translations: Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: SV
  ): inputBaseSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[inputBaseSettableProperties[V, SV, RV]]
  }
  @scala.inline
  implicit class inputBaseSettablePropertiesOps[Self <: inputBaseSettableProperties[_, _, _], V, SV, RV] (val x: Self with (inputBaseSettableProperties[V, SV, RV])) extends AnyVal {
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
    def setAsyncValidatorsVarargs(value: AsyncValidator[V]*): Self = this.set("asyncValidators", js.Array(value :_*))
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[V]]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutocomplete(value: on | off | String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawValue(value: RV): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: Regexp): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatorsVarargs(value: (Validator[V] | RegisteredValidator)*): Self = this.set("validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: js.Array[Validator[V] | RegisteredValidator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatorsNull: Self = this.set("validators", null)
  }
  
}

