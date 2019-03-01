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
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    readonly: scala.Boolean,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: scala.Boolean,
    describedBy: java.lang.String = null,
    translations: js.Object = null
  ): ojSwitchSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpHints")(helpHints)
    __obj.updateDynamic("labelHint")(labelHint)
    __obj.updateDynamic("messagesCustom")(messagesCustom)
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojSwitchSettableProperties]
  }
}

