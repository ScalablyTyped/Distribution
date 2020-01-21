package typings.oracleOraclejet.ojinputnumberMod

import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.AnonNumberRange
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
import scala.scalajs.js.annotation._

trait ojInputNumberSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, String] {
  var asyncValidators: js.Array[AsyncValidator[Double]]
  var autocomplete: on | off | String
  var autofocus: Boolean
  var converter: Converter[Double] | RegisteredConverter
  var max: Double | Null
  var min: Double | Null
  var placeholder: String | Null
  val rawValue: String
  var readonly: Boolean | Null
  var required: Boolean
  var step: Double | Null
  @JSName("translations")
  var translations_ojInputNumberSettableProperties: AnonNumberRange
  var validators: js.Array[Validator[Double] | RegisteredValidator]
  var virtualKeyboard: auto | number | text
}

object ojInputNumberSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[Double]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[Double] | RegisteredConverter,
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    labelHint: String,
    messagesCustom: js.Array[^],
    rawValue: String,
    required: Boolean,
    translations: AnonNumberRange,
    valid: valid | pending | invalidHidden | invalidShown,
    validators: js.Array[Validator[Double] | RegisteredValidator],
    virtualKeyboard: auto | number | text,
    describedBy: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    value: Int | Double = null
  ): ojInputNumberSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputNumberSettableProperties]
  }
}

