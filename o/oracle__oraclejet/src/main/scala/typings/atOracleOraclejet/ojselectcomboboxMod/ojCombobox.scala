package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
import typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.ojAnimateEnd
import typings.atOracleOraclejet.ojselectcomboboxMod.ojComboboxNs.ojAnimateStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCombobox[V, SP /* <: ojComboboxSettableProperties[V, SV, RV] */, SV, RV] extends editableValue[V, SP, SV, RV] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCombobox: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCombobox: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  def setProperties(properties: ojComboboxSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def validate(): js.Promise[_] = js.native
}

