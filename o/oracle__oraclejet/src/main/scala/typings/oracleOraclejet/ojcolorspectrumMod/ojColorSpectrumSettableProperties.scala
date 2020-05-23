package typings.oracleOraclejet.ojcolorspectrumMod

import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelHue
import typings.oracleOraclejet.ojcolorMod.^
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorSpectrumSettableProperties extends editableValueSettableProperties[^, ^, ^] {
  var labelledBy: String | Null
  val transientValue: ^
  @JSName("translations")
  var translations_ojColorSpectrumSettableProperties: LabelHue
}

object ojColorSpectrumSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: ConverterHint,
    help: Instruction,
    helpHints: Definition,
    labelHint: String,
    messagesCustom: js.Array[typings.oracleOraclejet.ojmessagingMod.^],
    transientValue: ^,
    translations: LabelHue,
    valid: valid | pending | invalidHidden | invalidShown,
    value: ^,
    describedBy: String = null,
    labelledBy: String = null
  ): ojColorSpectrumSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], transientValue = transientValue.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = describedBy.asInstanceOf[js.Any], labelledBy = labelledBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojColorSpectrumSettableProperties]
  }
}

