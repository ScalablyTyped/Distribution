package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputDateSettableProperties
  extends atOracleOraclejetLib.ojinputtextMod.inputBaseSettableProperties[java.lang.String, java.lang.String, java.lang.String] {
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  var datePicker: atOracleOraclejetLib.`Anon_`
  var dayMetaData: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
    ]
  ]
  var keyboardEdit: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  var max: java.lang.String | scala.Null
  var min: java.lang.String | scala.Null
  var pickerAttributes: atOracleOraclejetLib.Anon_Class
  var renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  @JSName("translations")
  var translations_ojInputDateSettableProperties: atOracleOraclejetLib.Anon_CurrentText
  def dayFormatter(param: atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput): scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
}

