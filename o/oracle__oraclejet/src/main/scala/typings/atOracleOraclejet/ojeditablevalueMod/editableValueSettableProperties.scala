package typings.atOracleOraclejet.ojeditablevalueMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojmessagingMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editableValueSettableProperties[V, SV, RV] extends baseComponentSettableProperties {
  var describedBy: String | Null
  var disabled: Boolean
  var displayOptions: Anon_ConverterHint
  var help: Anon_Instruction
  var helpHints: Anon_Definition
  var labelHint: String
  var messagesCustom: js.Array[^]
  val valid: typings.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  var value: SV
}

object editableValueSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    valid: valid | pending | invalidHidden | invalidShown,
    value: SV,
    describedBy: String = null,
    translations: js.Object = null
  ): editableValueSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[editableValueSettableProperties[V, SV, RV]]
  }
}

