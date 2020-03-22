package typings.oracleOraclejet.ojcheckboxsetMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.AnonRequired
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcheckboxset.ojCheckboxsetSettableProperties<K, D>> */
trait ojCheckboxsetSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var describedBy: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayOptions: js.UndefOr[AnonConverterHint] = js.undefined
  var help: js.UndefOr[AnonInstruction] = js.undefined
  var helpHints: js.UndefOr[AnonDefinition] = js.undefined
  var labelHint: js.UndefOr[String] = js.undefined
  var labelledBy: js.UndefOr[String] = js.undefined
  var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* param0 */ OptionContext[D], Element]] = js.undefined
  var options: js.UndefOr[DataProvider[K, D]] = js.undefined
  var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[AnonRequired] = js.undefined
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object ojCheckboxsetSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    describedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayOptions: AnonConverterHint = null,
    help: AnonInstruction = null,
    helpHints: AnonDefinition = null,
    labelHint: String = null,
    labelledBy: String = null,
    messagesCustom: js.Array[^] = null,
    optionRenderer: /* param0 */ OptionContext[D] => Element = null,
    options: DataProvider[K, D] = null,
    optionsKeys: OptionsKeys = null,
    required: js.UndefOr[Boolean] = js.undefined,
    translations: AnonRequired = null,
    valid: valid | pending | invalidHidden | invalidShown = null,
    value: js.Array[_] = null
  ): ojCheckboxsetSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (helpHints != null) __obj.updateDynamic("helpHints")(helpHints.asInstanceOf[js.Any])
    if (labelHint != null) __obj.updateDynamic("labelHint")(labelHint.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (messagesCustom != null) __obj.updateDynamic("messagesCustom")(messagesCustom.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCheckboxsetSettablePropertiesLenient[K, D]]
  }
}

