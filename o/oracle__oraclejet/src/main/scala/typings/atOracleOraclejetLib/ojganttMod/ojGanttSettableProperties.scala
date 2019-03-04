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

object ojGanttSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    axisPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top,
    dnd: atOracleOraclejetLib.Anon_Move,
    end: java.lang.String,
    gridlines: atOracleOraclejetLib.Anon_AutoHidden,
    majorAxis: atOracleOraclejetLib.Anon_Converter,
    minorAxis: atOracleOraclejetLib.Anon_Converter,
    referenceObjects: js.Array[atOracleOraclejetLib.ojganttMod.ojGanttNs.ReferenceObject],
    rowAxis: atOracleOraclejetLib.Anon_Label[K2, D2],
    rowDefaults: atOracleOraclejetLib.Anon_HeightNumber,
    scrollPosition: atOracleOraclejetLib.Anon_OffsetY,
    selection: js.Array[K2],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    start: java.lang.String,
    taskDefaults: atOracleOraclejetLib.Anon_AutoBaseline,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2],
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_AccessibleDependencyInfo,
    valueFormats: atOracleOraclejetLib.Anon_BaselineDate,
    viewportEnd: java.lang.String,
    viewportStart: java.lang.String,
    dependencyData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1] = null,
    taskData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2] = null
  ): ojGanttSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as, axisPosition = axisPosition.asInstanceOf[js.Any], dnd = dnd, end = end, gridlines = gridlines, majorAxis = majorAxis, minorAxis = minorAxis, referenceObjects = referenceObjects, rowAxis = rowAxis, rowDefaults = rowDefaults, scrollPosition = scrollPosition, selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], start = start, taskDefaults = taskDefaults, tooltip = tooltip, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, valueFormats = valueFormats, viewportEnd = viewportEnd, viewportStart = viewportStart)
    if (dependencyData != null) __obj.updateDynamic("dependencyData")(dependencyData)
    if (taskData != null) __obj.updateDynamic("taskData")(taskData)
    __obj.asInstanceOf[ojGanttSettableProperties[K1, K2, D1, D2]]
  }
}

