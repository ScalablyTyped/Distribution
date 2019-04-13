package typings
package atOracleOraclejetLib.ojcheckboxsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCheckboxsetSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]] {
  var labelledBy: java.lang.String | scala.Null
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys] = js.undefined
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojCheckboxsetSettableProperties: atOracleOraclejetLib.Anon_Required
  @JSName("value")
  var value_ojCheckboxsetSettableProperties: js.Array[_]
}

object ojCheckboxsetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_Required,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: js.Array[_],
    describedBy: java.lang.String = null,
    labelledBy: java.lang.String = null,
    optionRenderer: /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D] => stdLib.Element = null,
    options: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    optionsKeys: atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys = null
  ): ojCheckboxsetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options)
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys)
    __obj.asInstanceOf[ojCheckboxsetSettableProperties[K, D]]
  }
}

