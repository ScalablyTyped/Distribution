package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.anon.AccessibleDependencyInfo
import typings.oracleOraclejet.anon.Baseline
import typings.oracleOraclejet.anon.BaselineDate
import typings.oracleOraclejet.anon.MaxWidth
import typings.oracleOraclejet.anon.Move
import typings.oracleOraclejet.anon.OffsetY
import typings.oracleOraclejet.anon.Scale
import typings.oracleOraclejet.anon.Vertical
import typings.oracleOraclejet.anon.`8`
import typings.oracleOraclejet.anon.`9`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttSettableProperties[K1, K2, D1, D2]
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  var animationOnDataChange: auto | none
  
  var animationOnDisplay: auto | none
  
  var as: String
  
  var axisPosition: bottom | top
  
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.undefined
  
  var dnd: Move
  
  var end: String
  
  var gridlines: Vertical
  
  var majorAxis: Scale
  
  var minorAxis: Scale
  
  var referenceObjects: js.Array[ReferenceObject]
  
  var rowAxis: MaxWidth[K2, D2]
  
  var rowDefaults: `8`
  
  var scrollPosition: OffsetY
  
  var selection: js.Array[K2]
  
  var selectionMode: single | multiple | none
  
  var start: String
  
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  
  var taskDefaults: Baseline
  
  var tooltip: `9`[K2, D2]
  
  @JSName("translations")
  var translations_ojGanttSettableProperties: AccessibleDependencyInfo
  
  var valueFormats: BaselineDate
  
  var viewportEnd: String
  
  var viewportStart: String
}
object ojGanttSettableProperties {
  
  inline def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    axisPosition: bottom | top,
    dnd: Move,
    end: String,
    gridlines: Vertical,
    majorAxis: Scale,
    minorAxis: Scale,
    referenceObjects: js.Array[ReferenceObject],
    rowAxis: MaxWidth[K2, D2],
    rowDefaults: `8`,
    scrollPosition: OffsetY,
    selection: js.Array[K2],
    selectionMode: single | multiple | none,
    start: String,
    taskDefaults: Baseline,
    tooltip: `9`[K2, D2],
    trackResize: on | off,
    translations: AccessibleDependencyInfo,
    valueFormats: BaselineDate,
    viewportEnd: String,
    viewportStart: String
  ): ojGanttSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], axisPosition = axisPosition.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rowAxis = rowAxis.asInstanceOf[js.Any], rowDefaults = rowDefaults.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskDefaults = taskDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttSettableProperties[K1, K2, D1, D2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojGanttSettableProperties[?, ?, ?, ?], K1, K2, D1, D2] (val x: Self & (ojGanttSettableProperties[K1, K2, D1, D2])) extends AnyVal {
    
    inline def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAxisPosition(value: bottom | top): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    inline def setDependencyData(value: DataProvider[K1, D1]): Self = StObject.set(x, "dependencyData", value.asInstanceOf[js.Any])
    
    inline def setDependencyDataUndefined: Self = StObject.set(x, "dependencyData", js.undefined)
    
    inline def setDnd(value: Move): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setGridlines(value: Vertical): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
    
    inline def setMajorAxis(value: Scale): Self = StObject.set(x, "majorAxis", value.asInstanceOf[js.Any])
    
    inline def setMinorAxis(value: Scale): Self = StObject.set(x, "minorAxis", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjects(value: js.Array[ReferenceObject]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectsVarargs(value: ReferenceObject*): Self = StObject.set(x, "referenceObjects", js.Array(value*))
    
    inline def setRowAxis(value: MaxWidth[K2, D2]): Self = StObject.set(x, "rowAxis", value.asInstanceOf[js.Any])
    
    inline def setRowDefaults(value: `8`): Self = StObject.set(x, "rowDefaults", value.asInstanceOf[js.Any])
    
    inline def setScrollPosition(value: OffsetY): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[K2]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: K2*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTaskData(value: DataProvider[K2, D2]): Self = StObject.set(x, "taskData", value.asInstanceOf[js.Any])
    
    inline def setTaskDataUndefined: Self = StObject.set(x, "taskData", js.undefined)
    
    inline def setTaskDefaults(value: Baseline): Self = StObject.set(x, "taskDefaults", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: `9`[K2, D2]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: AccessibleDependencyInfo): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setValueFormats(value: BaselineDate): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    inline def setViewportEnd(value: String): Self = StObject.set(x, "viewportEnd", value.asInstanceOf[js.Any])
    
    inline def setViewportStart(value: String): Self = StObject.set(x, "viewportStart", value.asInstanceOf[js.Any])
  }
}
