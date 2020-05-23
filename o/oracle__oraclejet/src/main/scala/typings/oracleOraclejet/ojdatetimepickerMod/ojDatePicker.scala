package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.ojdatetimepickerMod.ojDatePicker.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojDatePicker.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDatePicker extends ojInputDate[ojDatePickerSettableProperties] {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDatePicker: disabled = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDatePicker: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDatePicker: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  @JSName("renderMode")
  var renderMode_ojDatePicker: jet = js.native
  def setProperties(properties: ojDatePickerSettablePropertiesLenient): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojdatetimepicker", "ojDatePicker")
@js.native
object ojDatePicker extends js.Object {
  type ojAnimateEnd = CustomEvent[Action]
  type ojAnimateStart = CustomEvent[Element]
}

