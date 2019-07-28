package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.ojAnimateEnd
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelectNs.ojAnimateStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSelect[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV] extends editableValue[V, SP, SV, V] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelect: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelect: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  def setProperties(properties: ojSelectSettablePropertiesLenient[V, SV]): Unit = js.native
  def validate(): js.Promise[_] = js.native
}

