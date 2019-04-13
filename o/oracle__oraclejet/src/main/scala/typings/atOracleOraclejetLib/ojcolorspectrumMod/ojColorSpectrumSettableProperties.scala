package typings
package atOracleOraclejetLib.ojcolorspectrumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorSpectrumSettableProperties
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[
      atOracleOraclejetLib.ojcolorMod.^, 
      atOracleOraclejetLib.ojcolorMod.^, 
      atOracleOraclejetLib.ojcolorMod.^
    ] {
  var labelledBy: java.lang.String | scala.Null
  val transientValue: atOracleOraclejetLib.ojcolorMod.^
  @JSName("translations")
  var translations_ojColorSpectrumSettableProperties: atOracleOraclejetLib.Anon_LabelHue
}

object ojColorSpectrumSettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    transientValue: atOracleOraclejetLib.ojcolorMod.^,
    translations: atOracleOraclejetLib.Anon_LabelHue,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: atOracleOraclejetLib.ojcolorMod.^,
    describedBy: java.lang.String = null,
    labelledBy: java.lang.String = null
  ): ojColorSpectrumSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, transientValue = transientValue, translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy)
    __obj.asInstanceOf[ojColorSpectrumSettableProperties]
  }
}

