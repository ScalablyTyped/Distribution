package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Cancel
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.FooterLayout
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDateTime.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDateTime.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.timePicker
import typings.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputDateTime[SP /* <: ojInputDateTimeSettableProperties */] extends ojInputDate[SP] {
  
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[FooterLayout], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[FooterLayout], _],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): FooterLayout = js.native
  
  def hideTimePicker(): Unit = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDateTime: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDateTime: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  
  var onTimePickerChanged: (js.Function1[/* event */ JetElementCustomEvent[FooterLayout], _]) | Null = js.native
  
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: FooterLayout): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Cancel): Unit = js.native
  
  def showTimePicker(): Unit = js.native
  
  var timePicker: FooterLayout = js.native
  
  @JSName("translations")
  var translations_ojInputDateTime: Cancel = js.native
}
object ojInputDateTime {
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[Element]
}
