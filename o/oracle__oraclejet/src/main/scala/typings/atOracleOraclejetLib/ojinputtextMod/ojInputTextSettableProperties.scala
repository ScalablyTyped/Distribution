package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputTextSettableProperties
  extends inputBaseSettableProperties[js.Any, js.Any, js.Any] {
  var clearIcon: atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
  var list: java.lang.String
  var virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url
}

object ojInputTextSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Any]],
    autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String,
    autofocus: scala.Boolean,
    clearIcon: atOracleOraclejetLib.atOracleOraclejetLibStrings.never | atOracleOraclejetLib.atOracleOraclejetLibStrings.always | atOracleOraclejetLib.atOracleOraclejetLibStrings.conditional,
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    list: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    placeholder: java.lang.String,
    rawValue: js.Any,
    readonly: scala.Boolean,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_Regexp,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: js.Any,
    virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.email | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.search | atOracleOraclejetLib.atOracleOraclejetLibStrings.tel | atOracleOraclejetLib.atOracleOraclejetLibStrings.text | atOracleOraclejetLib.atOracleOraclejetLibStrings.url,
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter = null,
    describedBy: java.lang.String = null,
    validators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Any] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null
  ): ojInputTextSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, clearIcon = clearIcon.asInstanceOf[js.Any], disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, list = list, messagesCustom = messagesCustom, placeholder = placeholder, rawValue = rawValue, readonly = readonly, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value, virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojInputTextSettableProperties]
  }
}

