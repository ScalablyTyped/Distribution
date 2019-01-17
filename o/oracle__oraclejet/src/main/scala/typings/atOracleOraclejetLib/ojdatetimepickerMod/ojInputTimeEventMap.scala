package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputTimeEventMap
  extends atOracleOraclejetLib.ojinputtextMod.inputBaseEventMap[java.lang.String, ojInputTimeSettableProperties, java.lang.String, java.lang.String] {
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  ]
  var keyboardEditChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ]
  var maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojInputTimeEventMap: atOracleOraclejetLib.ojdatetimepickerMod.ojInputTimeNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojInputTimeEventMap: atOracleOraclejetLib.ojdatetimepickerMod.ojInputTimeNs.ojAnimateStart
  var pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class]
  var renderModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  ]
  var timePickerChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Focus]
}

