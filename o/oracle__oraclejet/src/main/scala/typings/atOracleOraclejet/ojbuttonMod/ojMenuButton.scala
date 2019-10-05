package typings.atOracleOraclejet.ojbuttonMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojbuttonMod.ojMenuButton.ojAction
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenuButton extends ojButton[ojMenuButtonSettableProperties] {
  @JSName("onOjAction")
  var onOjAction_ojMenuButton: (js.Function1[/* event */ ojAction, _]) | Null = js.native
  def setProperties(properties: ojMenuButtonSettablePropertiesLenient): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojbutton", "ojMenuButton")
@js.native
object ojMenuButton extends js.Object {
  type ojAction = CustomEvent[StringDictionary[js.Any]]
}

