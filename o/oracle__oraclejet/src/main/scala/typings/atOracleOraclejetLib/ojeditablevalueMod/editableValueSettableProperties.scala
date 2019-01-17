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

