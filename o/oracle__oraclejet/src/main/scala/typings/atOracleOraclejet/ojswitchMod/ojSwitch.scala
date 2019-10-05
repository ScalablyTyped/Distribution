package typings.atOracleOraclejet.ojswitchMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.readonly
import typings.atOracleOraclejet.atOracleOraclejetStrings.readonlyChanged
import typings.atOracleOraclejet.ojeditablevalueMod.editableValue
import typings.atOracleOraclejet.ojswitchMod.ojSwitch.ojAnimateEnd
import typings.atOracleOraclejet.ojswitchMod.ojSwitch.ojAnimateStart
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
    `type`: readonlyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly): Boolean = js.native
  def setProperties(properties: ojSwitchSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojswitch", "ojSwitch")
@js.native
object ojSwitch extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

