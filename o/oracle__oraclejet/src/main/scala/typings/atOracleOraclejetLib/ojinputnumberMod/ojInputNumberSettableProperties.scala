package typings
package atOracleOraclejetLib.ojinputnumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputNumberSettableProperties
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[scala.Double | scala.Null, scala.Double | scala.Null, java.lang.String] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]]
  var autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
  var autofocus: scala.Boolean
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  var max: scala.Double | scala.Null
  var min: scala.Double | scala.Null
  var placeholder: java.lang.String | scala.Null
  val rawValue: java.lang.String
  var readonly: scala.Boolean | scala.Null
  var required: scala.Boolean
  var step: scala.Double | scala.Null
  @JSName("translations")
  var translations_ojInputNumberSettableProperties: atOracleOraclejetLib.Anon_NumberRange
  var validators: js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]
  var virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.text
}

object ojInputNumberSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]],
    autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String,
    autofocus: scala.Boolean,
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter,
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    rawValue: java.lang.String,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_NumberRange,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    validators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ],
    virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.text,
    describedBy: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): ojInputNumberSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, converter = converter.asInstanceOf[js.Any], disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, rawValue = rawValue, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], validators = validators, virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputNumberSettableProperties]
  }
}

