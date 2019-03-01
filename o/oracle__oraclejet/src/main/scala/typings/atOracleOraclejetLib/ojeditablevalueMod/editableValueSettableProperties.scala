package typings
package atOracleOraclejetLib.ojeditablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editableValueSettableProperties[V, SV, RV]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var describedBy: java.lang.String | scala.Null
  var disabled: scala.Boolean
  var displayOptions: atOracleOraclejetLib.Anon_ConverterHint
  var help: atOracleOraclejetLib.Anon_Instruction
  var helpHints: atOracleOraclejetLib.Anon_Definition
  var labelHint: java.lang.String
  var messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]
  val valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
  var value: SV
}

object editableValueSettableProperties {
  @scala.inline
  def apply[V, SV, RV](
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: SV,
    describedBy: java.lang.String = null,
    translations: js.Object = null
  ): editableValueSettableProperties[V, SV, RV] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpHints")(helpHints)
    __obj.updateDynamic("labelHint")(labelHint)
    __obj.updateDynamic("messagesCustom")(messagesCustom)
    __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[editableValueSettableProperties[V, SV, RV]]
  }
}

