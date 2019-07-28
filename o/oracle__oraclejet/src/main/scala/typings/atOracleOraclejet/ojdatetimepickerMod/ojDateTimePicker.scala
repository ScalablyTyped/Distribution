package typings.atOracleOraclejet.ojdatetimepickerMod

import typings.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typings.atOracleOraclejet.atOracleOraclejetStrings.jet
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDateTimePickerNs.ojAnimateEnd
import typings.atOracleOraclejet.ojdatetimepickerMod.ojDateTimePickerNs.ojAnimateStart
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

