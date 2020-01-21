package typings.oracleOraclejet.ojeditablevalueMod

import typings.oracleOraclejet.AnonConverterHint
import typings.oracleOraclejet.AnonDefinition
import typings.oracleOraclejet.AnonInstruction
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editableValueSettableProperties[V, SV, RV] extends baseComponentSettableProperties {
  var describedBy: String | Null
  var disabled: Boolean
  var displayOptions: AnonConverterHint
  var help: AnonInstruction
  var helpHints: AnonDefinition
  var labelHint: String
  var messagesCustom: js.Array[^]
  val valid: typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  var value: SV
}

object editableValueSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    disabled: Boolean,
    displayOptions: AnonConverterHint,
    help: AnonInstruction,
    helpHints: AnonDefinition,
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

