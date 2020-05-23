package typings.oracleOraclejet.ojcheckboxsetMod

import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.Required
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typings.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCheckboxsetSettableProperties[K, D]
  extends editableValueSettableProperties[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]] {
  var labelledBy: String | Null
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
  var options: (DataProvider[K, D]) | Null
  var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
  var required: Boolean
  @JSName("translations")
  var translations_ojCheckboxsetSettableProperties: Required
  @JSName("value")
  var value_ojCheckboxsetSettableProperties: js.Array[_]
}

object ojCheckboxsetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: Required,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Array[_],
    describedBy: String = null,
    labelledBy: String = null,
    optionRenderer: js.UndefOr[Null | (/* param0 */ OptionContext[D] => Element)] = js.undefined,
    options: DataProvider[K, D] = null,
    optionsKeys: OptionsKeys = null
  ): ojCheckboxsetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], labelledBy = labelledBy.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(optionRenderer)) __obj.updateDynamic("optionRenderer")(if (optionRenderer != null) js.Any.fromFunction1(optionRenderer.asInstanceOf[/* param0 */ OptionContext[D] => Element]) else null)
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCheckboxsetSettableProperties[K, D]]
  }
}

