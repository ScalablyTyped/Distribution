package typings.atOracleOraclejet.ojswitchMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.atOracleOraclejet.ojmessagingMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSwitchSettableProperties extends editableValueSettableProperties[Boolean, Boolean, Boolean] {
  var readonly: Boolean
}

object ojSwitchSettableProperties {
  @scala.inline
  def apply(
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    readonly: Boolean,
    valid: valid | pending | invalidHidden | invalidShown,
    value: Boolean,
    describedBy: String = null,
    translations: js.Object = null
  ): ojSwitchSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, readonly = readonly, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojSwitchSettableProperties]
  }
}

