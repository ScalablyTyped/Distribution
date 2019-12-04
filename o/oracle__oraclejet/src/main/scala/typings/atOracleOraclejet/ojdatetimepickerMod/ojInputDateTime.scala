package typings.atOracleOraclejet.ojdatetimepickerMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_Cancel
import typings.atOracleOraclejet.Anon_Focus
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.timePicker
import typings.atOracleOraclejet.atOracleOraclejetStrings.timePickerChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDateTime.ojAnimateEnd
import typings.atOracleOraclejet.ojdatetimepickerMod.ojInputDateTime.ojAnimateStart
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
  var onTimePickerChanged: (js.Function1[/* event */ JetElementCustomEvent[Anon_Focus], _]) | Null = js.native
  var timePicker: Anon_Focus = js.native
  @JSName("translations")
  var translations_ojInputDateTime: Anon_Cancel = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Focus], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Anon_Focus], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): Anon_Focus = js.native
  def hideTimePicker(): Unit = js.native
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: Anon_Focus): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_Cancel): Unit = js.native
  def showTimePicker(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojInputDateTime")
@js.native
object ojInputDateTime extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

