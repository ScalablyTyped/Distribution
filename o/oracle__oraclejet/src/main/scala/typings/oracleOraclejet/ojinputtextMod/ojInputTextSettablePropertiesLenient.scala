package typings.oracleOraclejet.ojinputtextMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.AnonRegexp
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.always
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.conditional
import typings.oracleOraclejet.oracleOraclejetStrings.email
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.never
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.search
import typings.oracleOraclejet.oracleOraclejetStrings.tel
import typings.oracleOraclejet.oracleOraclejetStrings.text
import typings.oracleOraclejet.oracleOraclejetStrings.url
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojInputTextSettableProperties> */
trait ojInputTextSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[_]]] = js.undefined
  var autocomplete: js.UndefOr[on | off | String] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var clearIcon: js.UndefOr[never | always | conditional] = js.undefined
  var converter: js.UndefOr[Converter[_] | RegisteredConverter] = js.undefined
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[AnonConverterHint] = js.undefined
  var help: js.UndefOr[AnonInstruction] = js.undefined
  var helpHints: js.UndefOr[AnonDefinition] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rawValue: js.UndefOr[js.Any] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[AnonRegexp] = js.undefined
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var validators: js.UndefOr[js.Array[Validator[_] | RegisteredValidator]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var virtualKeyboard: js.UndefOr[auto | email | number | search | tel | text | url] = js.undefined
}

object ojInputTextSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    asyncValidators: js.Array[AsyncValidator[_]] = null,
    autocomplete: on | off | String = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    clearIcon: never | always | conditional = null,
    converter: Converter[_] | RegisteredConverter = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: AnonConverterHint = null,
    help: AnonInstruction = null,
    helpHints: AnonDefinition = null,
    labelHint: String = null,
    list: String = null,
    messagesCustom: js.Array[^] = null,
    placeholder: String = null,
    rawValue: js.Any = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    translations: AnonRegexp = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    validators: js.Array[Validator[_] | RegisteredValidator] = null,
    value: js.Any = null,
    virtualKeyboard: auto | email | number | search | tel | text | url = null
  ): ojInputTextSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (virtualKeyboard != null) __obj.updateDynamic("virtualKeyboard")(virtualKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojInputTextSettablePropertiesLenient]
  }
}

