package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait inputBaseEventMap[V, SP /* <: inputBaseSettableProperties[V, SV, V] */, SV, RV]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueEventMap[V, SP, SV, RV] {
  var asyncValidatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]]
  var autocompleteChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
  ]
  var autofocusChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_inputBaseEventMap: atOracleOraclejetLib.ojinputtextMod.inputBaseNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_inputBaseEventMap: atOracleOraclejetLib.ojinputtextMod.inputBaseNs.ojAnimateStart
  var placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var rawValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[RV]
  var readonlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var validatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]) | scala.Null
  ]
}

