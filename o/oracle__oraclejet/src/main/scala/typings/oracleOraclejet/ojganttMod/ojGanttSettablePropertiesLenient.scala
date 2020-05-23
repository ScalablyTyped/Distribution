package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AccessibleDependencyInfo
import typings.oracleOraclejet.anon.Baseline
import typings.oracleOraclejet.anon.BaselineDate
import typings.oracleOraclejet.anon.HeightNumber
import typings.oracleOraclejet.anon.MaxWidth
import typings.oracleOraclejet.anon.Move
import typings.oracleOraclejet.anon.OffsetY
import typings.oracleOraclejet.anon.Scale
import typings.oracleOraclejet.anon.Vertical
import typings.oracleOraclejet.anon.`7`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttSettableProperties<K1, K2, D1, D2>> */
trait ojGanttSettablePropertiesLenient[K1, K2, D1, D2]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var axisPosition: js.UndefOr[bottom | top] = js.undefined
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.undefined
  var dnd: js.UndefOr[Move] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var gridlines: js.UndefOr[Vertical] = js.undefined
  var majorAxis: js.UndefOr[Scale] = js.undefined
  var minorAxis: js.UndefOr[Scale] = js.undefined
  var referenceObjects: js.UndefOr[js.Array[ReferenceObject]] = js.undefined
  var rowAxis: js.UndefOr[MaxWidth[K2, D2]] = js.undefined
  var rowDefaults: js.UndefOr[HeightNumber] = js.undefined
  var scrollPosition: js.UndefOr[OffsetY] = js.undefined
  var selection: js.UndefOr[js.Array[K2]] = js.undefined
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  var taskDefaults: js.UndefOr[Baseline] = js.undefined
  var tooltip: js.UndefOr[`7`[K2, D2]] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AccessibleDependencyInfo] = js.undefined
  var valueFormats: js.UndefOr[BaselineDate] = js.undefined
  var viewportEnd: js.UndefOr[String] = js.undefined
  var viewportStart: js.UndefOr[String] = js.undefined
}

object ojGanttSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, D1, D2](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    as: String = null,
    axisPosition: bottom | top = null,
    dependencyData: DataProvider[K1, D1] = null,
    dnd: Move = null,
    end: String = null,
    gridlines: Vertical = null,
    majorAxis: Scale = null,
    minorAxis: Scale = null,
    referenceObjects: js.Array[ReferenceObject] = null,
    rowAxis: MaxWidth[K2, D2] = null,
    rowDefaults: HeightNumber = null,
    scrollPosition: OffsetY = null,
    selection: js.Array[K2] = null,
    selectionMode: single | multiple | none = null,
    start: String = null,
    taskData: DataProvider[K2, D2] = null,
    taskDefaults: Baseline = null,
    tooltip: `7`[K2, D2] = null,
    trackResize: on | off = null,
    translations: AccessibleDependencyInfo = null,
    valueFormats: BaselineDate = null,
    viewportEnd: String = null,
    viewportStart: String = null
  ): ojGanttSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (axisPosition != null) __obj.updateDynamic("axisPosition")(axisPosition.asInstanceOf[js.Any])
    if (dependencyData != null) __obj.updateDynamic("dependencyData")(dependencyData.asInstanceOf[js.Any])
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (gridlines != null) __obj.updateDynamic("gridlines")(gridlines.asInstanceOf[js.Any])
    if (majorAxis != null) __obj.updateDynamic("majorAxis")(majorAxis.asInstanceOf[js.Any])
    if (minorAxis != null) __obj.updateDynamic("minorAxis")(minorAxis.asInstanceOf[js.Any])
    if (referenceObjects != null) __obj.updateDynamic("referenceObjects")(referenceObjects.asInstanceOf[js.Any])
    if (rowAxis != null) __obj.updateDynamic("rowAxis")(rowAxis.asInstanceOf[js.Any])
    if (rowDefaults != null) __obj.updateDynamic("rowDefaults")(rowDefaults.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (taskData != null) __obj.updateDynamic("taskData")(taskData.asInstanceOf[js.Any])
    if (taskDefaults != null) __obj.updateDynamic("taskDefaults")(taskDefaults.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valueFormats != null) __obj.updateDynamic("valueFormats")(valueFormats.asInstanceOf[js.Any])
    if (viewportEnd != null) __obj.updateDynamic("viewportEnd")(viewportEnd.asInstanceOf[js.Any])
    if (viewportStart != null) __obj.updateDynamic("viewportStart")(viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttSettablePropertiesLenient[K1, K2, D1, D2]]
  }
}

