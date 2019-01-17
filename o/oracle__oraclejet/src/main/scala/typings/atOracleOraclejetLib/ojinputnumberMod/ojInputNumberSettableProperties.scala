package typings
package atOracleOraclejetLib.ojinputnumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputNumberSettableProperties
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[scala.Double | scala.Null, scala.Double | scala.Null, java.lang.String] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]]
  var autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
  var autofocus: scala.Boolean
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  var max: scala.Double | scala.Null
  var min: scala.Double | scala.Null
  var placeholder: java.lang.String | scala.Null
  val rawValue: java.lang.String
  var readonly: scala.Boolean | scala.Null
  var required: scala.Boolean
  var step: scala.Double | scala.Null
  @JSName("translations")
  var translations_ojInputNumberSettableProperties: atOracleOraclejetLib.Anon_NumberRange
  var validators: js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]
  var virtualKeyboard: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.text
}

