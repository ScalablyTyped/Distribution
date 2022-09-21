package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.chroming
import typings.oracleOraclejet.oracleOraclejetStrings.chromingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.display
import typings.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.focusManagement
import typings.oracleOraclejet.oracleOraclejetStrings.focusManagementChanged
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojButtonsetMany
  extends StObject
     with ojButtonset[ojButtonsetManySettableProperties] {
  
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], Any]
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Any] | Null], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.Array[Any] | Null], Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var chroming: full | half | outlined = js.native
  
  var disabled: Boolean = js.native
  
  var display: all | icons = js.native
  
  var focusManagement: oneTabstop | none = js.native
  
  @JSName("getProperty")
  def getProperty_chroming(property: chroming): full | half | outlined = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_focusManagement(property: focusManagement): oneTabstop | none = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): js.Array[Any] | Null = js.native
  
  var onChromingChanged: (js.Function1[/* event */ JetElementCustomEvent[full | half | outlined], Any]) | Null = js.native
  
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], Any]) | Null = js.native
  
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], Any]) | Null = js.native
  
  var onFocusManagementChanged: (js.Function1[/* event */ JetElementCustomEvent[oneTabstop | none], Any]) | Null = js.native
  
  var onValueChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[Any] | Null], Any]) | Null = js.native
  
  def setProperties(properties: ojButtonsetManySettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: chroming, value: full | half | outlined): Unit = js.native
  def setProperty(property: display, value: all | icons): Unit = js.native
  def setProperty(property: focusManagement, value: oneTabstop | none): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[Any]): Unit = js.native
  
  var value: js.Array[Any] | Null = js.native
}
