package typings.oracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojbuttonMod.ojMenuButton.ojAction
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojMenuButton
  extends StObject
     with ojButton[ojMenuButtonSettableProperties] {
  
  @JSName("onOjAction")
  var onOjAction_ojMenuButton: (js.Function1[/* event */ ojAction, Any]) | Null = js.native
  
  def setProperties(properties: ojMenuButtonSettablePropertiesLenient): Unit = js.native
}
object ojMenuButton {
  
  type ojAction = CustomEvent[StringDictionary[Any]]
}
