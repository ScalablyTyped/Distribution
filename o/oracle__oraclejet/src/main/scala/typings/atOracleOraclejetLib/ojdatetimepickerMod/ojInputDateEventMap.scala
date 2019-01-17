package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputDateEventMap[SP /* <: ojInputDateSettableProperties */]
  extends atOracleOraclejetLib.ojinputtextMod.inputBaseEventMap[java.lang.String, SP, java.lang.String, java.lang.String] {
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  ]
  var datePickerChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.`Anon_`]
  var dayFormatterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Function1[
      /* param */ atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput, 
      scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
    ]
  ]
  var dayMetaDataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
      ]
    ]
  ]
  var keyboardEditChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ]
  var maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojInputDateEventMap: atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojInputDateEventMap: atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.ojAnimateStart
  var pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class]
  var renderModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  ]
}

