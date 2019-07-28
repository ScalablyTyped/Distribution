package typings.atOracleOraclejet.ojdatetimepickerMod

import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDatePickerNs.ojAnimateEnd
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDatePickerNs.ojAnimateStart
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

