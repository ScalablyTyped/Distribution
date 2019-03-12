package typings
package atOracleOraclejetLib.ojradiosetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRadiosetSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Any, js.Any, js.Any] {
  var labelledBy: java.lang.String | scala.Null
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionContext[D], 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: js.UndefOr[atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionsKeys] = js.undefined
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojRadiosetSettableProperties: atOracleOraclejetLib.Anon_Required
}

object ojRadiosetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_Required,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: js.Any,
    describedBy: java.lang.String = null,
    labelledBy: java.lang.String = null,
    optionRenderer: /* param0 */ atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionContext[D] => stdLib.Element = null,
    options: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    optionsKeys: atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionsKeys = null
  ): ojRadiosetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, required = required, translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options)
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys)
    __obj.asInstanceOf[ojRadiosetSettableProperties[K, D]]
  }
}

