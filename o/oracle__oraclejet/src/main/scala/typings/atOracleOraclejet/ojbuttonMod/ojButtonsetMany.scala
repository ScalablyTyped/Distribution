package typings.atOracleOraclejet.ojbuttonMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.chroming
import typings.atOracleOraclejet.atOracleOraclejetStrings.chromingChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabledChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.display
import typings.atOracleOraclejet.atOracleOraclejetStrings.displayChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.focusManagement
import typings.atOracleOraclejet.atOracleOraclejetStrings.focusManagementChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.full
import typings.atOracleOraclejet.atOracleOraclejetStrings.half
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.oneTabstop
import typings.atOracleOraclejet.atOracleOraclejetStrings.outlined
import typings.atOracleOraclejet.atOracleOraclejetStrings.value
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojButtonsetMany extends ojButtonset[ojButtonsetManySettableProperties] {
  var chroming: full | half | outlined = js.native
  var disabled: Boolean = js.native
  var display: all | icons = js.native
  var focusManagement: oneTabstop | none = js.native
  var onChromingChanged: (js.Function1[/* event */ JetElementCustomEvent[full | half | outlined], _]) | Null = js.native
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], _]) | Null = js.native
  var onFocusManagementChanged: (js.Function1[/* event */ JetElementCustomEvent[oneTabstop | none], _]) | Null = js.native
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[_] | Null], _]) | Null = js.native
  var value: js.Array[_] | Null = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[_] | Null], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[_] | Null], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_chroming(property: chroming): full | half | outlined = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_focusManagement(property: focusManagement): oneTabstop | none = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): js.Array[_] | Null = js.native
  def setProperties(properties: ojButtonsetManySettablePropertiesLenient): Unit = js.native
  def setProperty(property: chroming, value: full): Unit = js.native
  def setProperty(property: chroming, value: half): Unit = js.native
  def setProperty(property: chroming, value: outlined): Unit = js.native
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: focusManagement, value: none): Unit = js.native
  def setProperty(property: focusManagement, value: oneTabstop): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[_]): Unit = js.native
}

