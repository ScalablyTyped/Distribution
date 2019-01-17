package typings
package atOracleOraclejetLib.ojinputtextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait inputBaseSettableProperties[V, SV, RV]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[V, SV, RV] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[V]]
  var autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
  var autofocus: scala.Boolean
  var placeholder: java.lang.String
  val rawValue: RV
  var readonly: scala.Boolean
  var required: scala.Boolean
  @JSName("translations")
  var translations_inputBaseSettableProperties: atOracleOraclejetLib.Anon_Regexp
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[V] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null
}

