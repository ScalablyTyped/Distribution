package typings
package atOracleOraclejetLib.ojswitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSwitchSettableProperties
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[scala.Boolean, scala.Boolean, scala.Boolean] {
  var readonly: scala.Boolean
}

object ojSwitchSettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    readonly: scala.Boolean,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: scala.Boolean,
    describedBy: java.lang.String = null,
    translations: js.Object = null
  ): ojSwitchSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, readonly = readonly, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojSwitchSettableProperties]
  }
}

