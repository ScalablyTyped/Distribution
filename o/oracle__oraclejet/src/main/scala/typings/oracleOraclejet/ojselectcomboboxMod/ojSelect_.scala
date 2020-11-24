package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.ojAnimateEnd
import typings.oracleOraclejet.ojselectcomboboxMod.ojSelect.ojAnimateStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSelect_[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV] extends editableValue[V, SP, SV, V] {
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSelect_ : (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSelect_ : (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  
  def setProperties(properties: ojSelectSettablePropertiesLenient[V, SV]): Unit = js.native
  
  def validate(): js.Promise[_] = js.native
}
