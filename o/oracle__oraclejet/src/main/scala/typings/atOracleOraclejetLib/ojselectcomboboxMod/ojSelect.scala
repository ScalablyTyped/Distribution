package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelect[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[V, SP, SV, V] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelect: (js.Function1[/* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelect: (js.Function1[/* event */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.ojAnimateStart, _]) | scala.Null = js.native
  def setProperties(properties: ojSelectSettablePropertiesLenient[V, SV]): scala.Unit = js.native
  def validate(): js.Promise[_] = js.native
}

