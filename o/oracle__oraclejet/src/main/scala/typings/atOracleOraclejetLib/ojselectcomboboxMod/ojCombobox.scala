package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCombobox[V, SP /* <: ojComboboxSettableProperties[V, SV, RV] */, SV, RV]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[V, SP, SV, RV] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojCombobox: (js.Function1[/* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojCombobox: (js.Function1[
    /* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  def setProperties(properties: ojComboboxSettablePropertiesLenient[V, SV, RV]): scala.Unit = js.native
  def validate(): js.Promise[_] = js.native
}

