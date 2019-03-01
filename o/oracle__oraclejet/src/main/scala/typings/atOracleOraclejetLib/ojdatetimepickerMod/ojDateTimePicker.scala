package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDateTimePicker extends ojInputDateTime[ojDateTimePickerSettableProperties] {
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePicker: atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojDateTimePickerNs.ojAnimateEnd, 
    _
  ]) | scala.Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDateTimePicker: (js.Function1[
    /* event */ atOracleOraclejetLib.ojdatetimepickerMod.ojDateTimePickerNs.ojAnimateStart, 
    _
  ]) | scala.Null = js.native
  @JSName("renderMode")
  var renderMode_ojDateTimePicker: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet = js.native
  def setProperties(properties: ojDateTimePickerSettablePropertiesLenient): scala.Unit = js.native
}

