package typings.atOracleOraclejet.ojganttMod

import typings.atOracleOraclejet.Anon_AccessibleDependencyInfo
import typings.atOracleOraclejet.Anon_AutoBaseline
import typings.atOracleOraclejet.Anon_AutoHidden
import typings.atOracleOraclejet.Anon_BaselineDate
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefault
import typings.atOracleOraclejet.Anon_Converter
import typings.atOracleOraclejet.Anon_HeightNumber
import typings.atOracleOraclejet.Anon_Label
import typings.atOracleOraclejet.Anon_Move
import typings.atOracleOraclejet.Anon_OffsetY
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var axisPosition: bottom | top
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.undefined
  var dnd: Anon_Move
  var end: String
  var gridlines: Anon_AutoHidden
  var majorAxis: Anon_Converter
  var minorAxis: Anon_Converter
  var referenceObjects: js.Array[ReferenceObject]
  var rowAxis: Anon_Label[K2, D2]
  var rowDefaults: Anon_HeightNumber
  var scrollPosition: Anon_OffsetY
  var selection: js.Array[K2]
  var selectionMode: single | multiple | none
  var start: String
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  var taskDefaults: Anon_AutoBaseline
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2]
  @JSName("translations")
  var translations_ojGanttSettableProperties: Anon_AccessibleDependencyInfo
  var valueFormats: Anon_BaselineDate
  var viewportEnd: String
  var viewportStart: String
}

object ojGanttSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    axisPosition: bottom | top,
    dnd: Anon_Move,
    end: String,
    gridlines: Anon_AutoHidden,
    majorAxis: Anon_Converter,
    minorAxis: Anon_Converter,
    referenceObjects: js.Array[ReferenceObject],
    rowAxis: Anon_Label[K2, D2],
    rowDefaults: Anon_HeightNumber,
    scrollPosition: Anon_OffsetY,
    selection: js.Array[K2],
    selectionMode: single | multiple | none,
    start: String,
    taskDefaults: Anon_AutoBaseline,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefault[K2, D2],
    trackResize: on | off,
    translations: Anon_AccessibleDependencyInfo,
    valueFormats: Anon_BaselineDate,
    viewportEnd: String,
    viewportStart: String,
    dependencyData: DataProvider[K1, D1] = null,
    taskData: DataProvider[K2, D2] = null
  ): ojGanttSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], axisPosition = axisPosition.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rowAxis = rowAxis.asInstanceOf[js.Any], rowDefaults = rowDefaults.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskDefaults = taskDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    if (dependencyData != null) __obj.updateDynamic("dependencyData")(dependencyData.asInstanceOf[js.Any])
    if (taskData != null) __obj.updateDynamic("taskData")(taskData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttSettableProperties[K1, K2, D1, D2]]
  }
}

