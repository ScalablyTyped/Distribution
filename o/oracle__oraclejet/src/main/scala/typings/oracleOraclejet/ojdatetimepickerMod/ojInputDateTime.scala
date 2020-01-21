package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonActionElement
import typings.oracleOraclejet.AnonCancel
import typings.oracleOraclejet.AnonFocus
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDateTime.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojInputDateTime.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.timePicker
import typings.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDateTime[SP /* <: ojInputDateTimeSettableProperties */] extends ojInputDate[SP] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDateTime: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDateTime: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onTimePickerChanged: (js.Function1[/* event */ JetElementCustomEvent[AnonFocus], _]) | Null = js.native
  var timePicker: AnonFocus = js.native
  @JSName("translations")
  var translations_ojInputDateTime: AnonCancel = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonFocus], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[AnonFocus], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): AnonFocus = js.native
  def hideTimePicker(): Unit = js.native
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: AnonFocus): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonCancel): Unit = js.native
  def showTimePicker(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojInputDateTime")
@js.native
object ojInputDateTime extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonActionElement]
}

