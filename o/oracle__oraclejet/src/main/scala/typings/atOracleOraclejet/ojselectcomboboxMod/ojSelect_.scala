package typings.atOracleOraclejet.ojselectcomboboxMod

import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.ojAnimateEnd
import typings.atOracleOraclejet.ojselectcomboboxMod.ojSelect.ojAnimateStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojSelect")
@js.native
trait ojSelect_[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV] extends editableValue[V, SP, SV, V] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelect_ : (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelect_ : (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  def setProperties(properties: ojSelectSettablePropertiesLenient[V, SV]): Unit = js.native
  def validate(): js.Promise[_] = js.native
}

