package typings.atOracleOraclejet.ojbuttonMod

import typings.atOracleOraclejet.ojbuttonMod.ojMenuButtonNs.ojAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenuButton extends ojButton[ojMenuButtonSettableProperties] {
  @JSName("onOjAction")
  var onOjAction_ojMenuButton: (js.Function1[/* event */ ojAction, _]) | Null = js.native
  def setProperties(properties: ojMenuButtonSettablePropertiesLenient): Unit = js.native
}

