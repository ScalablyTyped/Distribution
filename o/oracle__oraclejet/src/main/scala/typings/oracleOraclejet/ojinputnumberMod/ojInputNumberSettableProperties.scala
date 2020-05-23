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
  var translations_ojInputNumberSettableProperties: NumberRange
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
    virtualKeyboard: auto | number | text,
    describedBy: String = null,
    max: Double = null.asInstanceOf[Double],
    min: Double = null.asInstanceOf[Double],
    placeholder: String = null,
    readonly: Boolean = null.asInstanceOf[Boolean],
    step: Double = null.asInstanceOf[Double],
    value: Double = null.asInstanceOf[Double]
  ): ojInputNumberSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputNumberSettableProperties]
  }
}

