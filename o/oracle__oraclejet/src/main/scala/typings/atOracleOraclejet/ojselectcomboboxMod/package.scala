package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojselectcomboboxMod {
  import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties

  type ojCombobox[V, SP /* <: ojComboboxSettableProperties[V, SV, RV] */, SV, RV] = ojCombobox_[V, SP, SV, RV]
  type ojComboboxSettableProperties[V, SV, RV] = editableValueSettableProperties[V, SV, RV]
  type ojSelect[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV] = ojSelect_[V, SP, SV]
  type ojSelectSettableProperties[V, SV] = editableValueSettableProperties[V, SV, V]
}
