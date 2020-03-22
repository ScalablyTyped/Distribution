package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.AnonAction
import typings.oracleOraclejet.AnonElement
import typings.oracleOraclejet.ojdatetimepickerMod.ojDateTimePicker.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojDateTimePicker.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDateTimePicker extends ojInputDateTime[ojDateTimePickerSettableProperties] {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePicker: disabled = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDateTimePicker: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDateTimePicker: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  @JSName("renderMode")
  var renderMode_ojDateTimePicker: jet = js.native
  def setProperties(properties: ojDateTimePickerSettablePropertiesLenient): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojDateTimePicker")
@js.native
object ojDateTimePicker extends js.Object {
  type ojAnimateEnd = CustomEvent[AnonAction]
  type ojAnimateStart = CustomEvent[AnonElement]
}

