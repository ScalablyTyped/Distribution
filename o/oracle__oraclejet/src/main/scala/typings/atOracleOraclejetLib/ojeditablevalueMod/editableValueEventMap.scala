package typings
package atOracleOraclejetLib.ojeditablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editableValueEventMap[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[SP] {
  var describedByChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var disabledChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var displayOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ConverterHint]
  var helpChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Instruction]
  var helpHintsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Definition]
  var labelHintChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var messagesCustomChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced]]
  var ojAnimateEnd: atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojeditablevalueMod.editableValueNs.ojAnimateStart
  var validChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown
  ]
  var valueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[V]
}

