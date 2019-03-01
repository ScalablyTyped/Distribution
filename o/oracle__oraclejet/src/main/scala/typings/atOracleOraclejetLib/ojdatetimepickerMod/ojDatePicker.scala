package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDatePicker extends ojInputDate[ojDatePickerSettableProperties] {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDatePicker: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDatePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojDatePickerNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDatePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojDatePickerNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  @JSName("renderMode")
  var renderMode_ojDatePicker: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet = js.native
  def setProperties(properties: ojDatePickerSettablePropertiesLenient): scala.Unit = js.native
}

