package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait inputBaseSettableProperties[V, SV, RV]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[V, SV, RV] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]
  var autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
  var autofocus: scala.Boolean
  var placeholder: java.lang.String
  val rawValue: RV
  var readonly: scala.Boolean
  var required: scala.Boolean
  @JSName("translations")
  var translations_inputBaseSettableProperties: atOracleOraclejetLib.Anon_Regexp
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null
}

object inputBaseSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]],
    autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String,
    autofocus: scala.Boolean,
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    placeholder: java.lang.String,
    rawValue: RV,
    readonly: scala.Boolean,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_Regexp,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: SV,
    describedBy: java.lang.String = null,
    validators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null
  ): inputBaseSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, placeholder = placeholder, rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[inputBaseSettableProperties[V, SV, RV]]
  }
}

