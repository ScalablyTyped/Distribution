package typings
package atOracleOraclejetLib.ojswitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwitch
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValue[scala.Boolean, ojSwitchSettableProperties, scala.Boolean, scala.Boolean] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSwitch: (js.Function1[/* event */ atOracleOraclejetLib.ojswitchMod.ojSwitchNs.ojAnimateEnd, _]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSwitch: (js.Function1[/* event */ atOracleOraclejetLib.ojswitchMod.ojSwitchNs.ojAnimateStart, _]) | scala.Null = js.native
  var onReadonlyChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
    _
  ]) | scala.Null = js.native
  var readonly: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonlyChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly): scala.Boolean = js.native
  def setProperties(properties: ojSwitchSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.readonly, value: scala.Boolean): scala.Unit = js.native
}

