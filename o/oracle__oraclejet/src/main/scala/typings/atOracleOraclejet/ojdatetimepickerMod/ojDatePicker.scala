package typings.atOracleOraclejet.ojdatetimepickerMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDatePicker.ojAnimateEnd
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDatePicker.ojAnimateStart
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
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

