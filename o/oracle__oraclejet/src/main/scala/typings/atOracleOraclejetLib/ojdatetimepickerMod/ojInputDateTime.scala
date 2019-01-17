package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputDateTime[SP /* <: ojInputDateTimeSettableProperties */] extends ojInputDate[SP] {
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputDateTime: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateTimeNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputDateTime: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateTimeNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  var onTimePickerChanged: (js.Function1[
    /* event */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focus], 
    _
  ]) | scala.Null = js.native
  var timePicker: atOracleOraclejetLib.Anon_Focus = js.native
  @JSName("translations")
  var translations_ojInputDateTime: atOracleOraclejetLib.Anon_Cancel = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.timePickerChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focus], 
      _
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.timePickerChanged,
    listener: js.ThisFunction1[
      /* this */ stdLib.HTMLElement, 
      /* ev */ atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focus], 
      _
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getProperty")
  def getProperty_timePicker(property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timePicker): atOracleOraclejetLib.Anon_Focus = js.native
  def hideTimePicker(): scala.Unit = js.native
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_timePicker(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.timePicker,
    value: atOracleOraclejetLib.Anon_Focus
  ): scala.Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(
    property: atOracleOraclejetLib.atOracleOraclejetLibStrings.translations,
    value: atOracleOraclejetLib.Anon_Cancel
  ): scala.Unit = js.native
  def showTimePicker(): scala.Unit = js.native
}

