package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttSettableProperties[K1, K2, D1, D2]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var axisPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
  var dependencyData: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]] = js.undefined
  var dnd: atOracleOraclejetLib.Anon_Move
  var end: java.lang.String
  var gridlines: atOracleOraclejetLib.Anon_AutoHidden
  var majorAxis: atOracleOraclejetLib.Anon_Converter
  var minorAxis: atOracleOraclejetLib.Anon_Converter
  var referenceObjects: js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject]
  var rowAxis: atOracleOraclejetLib.Anon_Label[K2, D2]
  var rowDefaults: atOracleOraclejetLib.Anon_HeightNumber
  var scrollPosition: atOracleOraclejetLib.Anon_OffsetY
  var selection: js.Array[K2]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var start: java.lang.String
  var taskData: js.UndefOr[atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]] = js.undefined
  var taskDefaults: atOracleOraclejetLib.Anon_AutoBaseline
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]
  @JSName("translations")
  var translations_ojGanttSettableProperties: atOracleOraclejetLib.Anon_AccessibleDependencyInfo
  var valueFormats: atOracleOraclejetLib.Anon_BaselineDate
  var viewportEnd: java.lang.String
  var viewportStart: java.lang.String
}

