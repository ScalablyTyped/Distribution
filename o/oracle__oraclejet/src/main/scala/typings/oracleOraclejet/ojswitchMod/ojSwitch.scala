package typings.oracleOraclejet.ojswitchMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojswitchMod.ojSwitch.ojAnimateEnd
import typings.oracleOraclejet.ojswitchMod.ojSwitch.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typings.oracleOraclejet.oracleOraclejetStrings.readonly_
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwitch extends editableValue[Boolean, ojSwitchSettableProperties, Boolean, Boolean] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSwitch: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSwitch: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var readonly: Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  def setProperties(properties: ojSwitchSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojswitch", "ojSwitch")
@js.native
object ojSwitch extends js.Object {
  type ojAnimateEnd = CustomEvent[Action]
  type ojAnimateStart = CustomEvent[Element]
}

