package typings.atOracleOraclejet.ojinputtextMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_Regexp
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputPasswordSettableProperties extends inputBaseSettableProperties[String | Null, String | Null, String | Null]

object ojInputPasswordSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String | Null]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    readonly: Boolean,
    required: Boolean,
    translations: Anon_Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    describedBy: String = null,
    rawValue: String = null,
    validators: js.Array[(Validator[String | Null]) | RegisteredValidator] = null,
    value: String = null
  ): ojInputPasswordSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, placeholder = placeholder, readonly = readonly, required = required, translations = translations, valid = valid.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ojInputPasswordSettableProperties]
  }
}

