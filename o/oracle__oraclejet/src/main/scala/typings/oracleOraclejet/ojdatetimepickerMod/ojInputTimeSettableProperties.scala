package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.AnonAmpmWheelLabel
import typings.oracleOraclejet.AnonClass
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonFooterLayout
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.ojinputtextMod.inputBaseSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.native
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputTimeSettableProperties extends inputBaseSettableProperties[String, String, String] {
  var converter: Converter[String] | RegisteredConverter
  var keyboardEdit: enabled | disabled
  var max: String | Null
  var min: String | Null
  var pickerAttributes: AnonClass
  var renderMode: jet | native
  var timePicker: AnonFooterLayout
  @JSName("translations")
  var translations_ojInputTimeSettableProperties: AnonAmpmWheelLabel
}

object ojInputTimeSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[AsyncValidator[String]],
    autocomplete: on | off | String,
    autofocus: Boolean,
    converter: Converter[String] | RegisteredConverter,
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
    keyboardEdit: enabled | disabled,
    labelHint: String,
    messagesCustom: js.Array[^],
    pickerAttributes: AnonClass,
    placeholder: String,
    rawValue: String,
    readonly: Boolean,
    renderMode: jet | native,
    required: Boolean,
    timePicker: AnonFooterLayout,
    translations: AnonAmpmWheelLabel,
    valid: valid | pending | invalidHidden | invalidShown,
    value: String,
    describedBy: String = null,
    max: String = null,
    min: String = null,
    validators: js.Array[Validator[String] | RegisteredValidator] = null
  ): ojInputTimeSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], pickerAttributes = pickerAttributes.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], timePicker = timePicker.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputTimeSettableProperties]
  }
}

