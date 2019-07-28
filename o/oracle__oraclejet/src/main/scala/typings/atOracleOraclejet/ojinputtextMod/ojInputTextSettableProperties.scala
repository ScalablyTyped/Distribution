package typings.atOracleOraclejet.ojinputtextMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_Regexp
import typings.atOracleOraclejet.atOracleOraclejetStrings.always
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.conditional
import typings.atOracleOraclejet.atOracleOraclejetStrings.email
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.never
import typings.atOracleOraclejet.atOracleOraclejetStrings.number
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.search
import typings.atOracleOraclejet.atOracleOraclejetStrings.tel
import typings.atOracleOraclejet.atOracleOraclejetStrings.text
import typings.atOracleOraclejet.atOracleOraclejetStrings.url
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojvalidationDashBaseMod.AsyncValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputTextSettableProperties
  extends inputBaseSettableProperties[js.Any, js.Any, js.Any] {
  var clearIcon: never | always | conditional
  var converter: Converter[_] | RegisteredConverter | Null
  var list: String
  var virtualKeyboard: auto | email | number | search | tel | text | url
}

object ojInputTextSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[js.Any]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    clearIcon: never | always | conditional,
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    list: String,
    messagesCustom: js.Array[^],
    placeholder: String,
    rawValue: js.Any,
    readonly: Boolean,
    required: Boolean,
    translations: Anon_Regexp,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    virtualKeyboard: auto | email | number | search | tel | text | url,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    validators: js.Array[Validator[js.Any] | RegisteredValidator] = null
  ): ojInputTextSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, clearIcon = clearIcon.asInstanceOf[js.Any], disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, list = list, messagesCustom = messagesCustom, placeholder = placeholder, rawValue = rawValue, readonly = readonly, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value, virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojInputTextSettableProperties]
  }
}

