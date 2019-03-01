package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputPasswordSettableProperties
  extends inputBaseSettableProperties[
      java.lang.String | scala.Null, 
      java.lang.String | scala.Null, 
      java.lang.String | scala.Null
    ]

object ojInputPasswordSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[java.lang.String | scala.Null]
    ],
    autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String,
    autofocus: scala.Boolean,
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    placeholder: java.lang.String,
    readonly: scala.Boolean,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_Regexp,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    describedBy: java.lang.String = null,
    rawValue: java.lang.String = null,
    validators: js.Array[
      (atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[java.lang.String | scala.Null]) | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null,
    value: java.lang.String = null
  ): ojInputPasswordSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncValidators")(asyncValidators)
    __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    __obj.updateDynamic("autofocus")(autofocus)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpHints")(helpHints)
    __obj.updateDynamic("labelHint")(labelHint)
    __obj.updateDynamic("messagesCustom")(messagesCustom)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ojInputPasswordSettableProperties]
  }
}

