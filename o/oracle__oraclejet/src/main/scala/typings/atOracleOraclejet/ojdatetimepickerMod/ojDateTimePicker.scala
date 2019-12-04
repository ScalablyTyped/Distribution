package typings.atOracleOraclejet.ojdatetimepickerMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDateTimePicker.ojAnimateEnd
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDateTimePicker.ojAnimateStart
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
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

