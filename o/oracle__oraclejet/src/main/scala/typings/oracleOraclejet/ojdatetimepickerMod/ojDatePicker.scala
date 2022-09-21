package typings.oracleOraclejet.ojdatetimepickerMod

import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.ojdatetimepickerMod.ojDatePicker.ojAnimateEnd
import typings.oracleOraclejet.ojdatetimepickerMod.ojDatePicker.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.jet
import typings.oracleOraclejet.oracleOraclejetStrings.keyboardEdit
import typings.oracleOraclejet.oracleOraclejetStrings.renderMode
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDatePicker
  extends StObject
     with ojInputDate[ojDatePickerSettableProperties] {
  
  @JSName("keyboardEdit")
  var keyboardEdit_ojDatePicker: disabled = js.native
  
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojDatePicker: (js.Function1[/* event */ ojAnimateEnd, Any]) | Null = js.native
  
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojDatePicker: (js.Function1[/* event */ ojAnimateStart, Any]) | Null = js.native
  
  @JSName("renderMode")
  var renderMode_ojDatePicker: jet = js.native
  
  def setProperties(properties: ojDatePickerSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
}
object ojDatePicker {
  
  type ojAnimateEnd = CustomEvent[Action]
  
  type ojAnimateStart = CustomEvent[Element]
}
