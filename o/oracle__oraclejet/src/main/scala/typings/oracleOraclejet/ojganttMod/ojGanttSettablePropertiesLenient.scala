package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttSettableProperties<K1, K2, D1, D2>> */
trait ojGanttSettablePropertiesLenient[K1, K2, D1, D2]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
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
  
  var rowDefaults: js.UndefOr[`8`] = js.undefined
  
  var scrollPosition: js.UndefOr[OffsetY] = js.undefined
  
  var selection: js.UndefOr[js.Array[K2]] = js.undefined
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  
  var taskDefaults: js.UndefOr[Baseline] = js.undefined
  
  var tooltip: js.UndefOr[`9`[K2, D2]] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[AccessibleDependencyInfo] = js.undefined
  
  var valueFormats: js.UndefOr[BaselineDate] = js.undefined
  
  var viewportEnd: js.UndefOr[String] = js.undefined
  
  var viewportStart: js.UndefOr[String] = js.undefined
}
object ojGanttSettablePropertiesLenient {
  
  inline def apply[K1, K2, D1, D2](): ojGanttSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttSettablePropertiesLenient[K1, K2, D1, D2]]
  }
  
  extension [Self <: ojGanttSettablePropertiesLenient[?, ?, ?, ?], K1, K2, D1, D2](x: Self & (ojGanttSettablePropertiesLenient[K1, K2, D1, D2])) {
    
    inline def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAxisPosition(value: bottom | top): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    inline def setAxisPositionUndefined: Self = StObject.set(x, "axisPosition", js.undefined)
    
    inline def setDependencyData(value: DataProvider[K1, D1]): Self = StObject.set(x, "dependencyData", value.asInstanceOf[js.Any])
    
    inline def setDependencyDataUndefined: Self = StObject.set(x, "dependencyData", js.undefined)
    
    inline def setDnd(value: Move): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setGridlines(value: Vertical): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
    
    inline def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
    
    inline def setMajorAxis(value: Scale): Self = StObject.set(x, "majorAxis", value.asInstanceOf[js.Any])
    
    inline def setMajorAxisUndefined: Self = StObject.set(x, "majorAxis", js.undefined)
    
    inline def setMinorAxis(value: Scale): Self = StObject.set(x, "minorAxis", value.asInstanceOf[js.Any])
    
    inline def setMinorAxisUndefined: Self = StObject.set(x, "minorAxis", js.undefined)
    
    inline def setReferenceObjects(value: js.Array[ReferenceObject]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectsUndefined: Self = StObject.set(x, "referenceObjects", js.undefined)
    
    inline def setReferenceObjectsVarargs(value: ReferenceObject*): Self = StObject.set(x, "referenceObjects", js.Array(value :_*))
    
    inline def setRowAxis(value: MaxWidth[K2, D2]): Self = StObject.set(x, "rowAxis", value.asInstanceOf[js.Any])
    
    inline def setRowAxisUndefined: Self = StObject.set(x, "rowAxis", js.undefined)
    
    inline def setRowDefaults(value: `8`): Self = StObject.set(x, "rowDefaults", value.asInstanceOf[js.Any])
    
    inline def setRowDefaultsUndefined: Self = StObject.set(x, "rowDefaults", js.undefined)
    
    inline def setScrollPosition(value: OffsetY): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
    
    inline def setSelection(value: js.Array[K2]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: K2*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTaskData(value: DataProvider[K2, D2]): Self = StObject.set(x, "taskData", value.asInstanceOf[js.Any])
    
    inline def setTaskDataUndefined: Self = StObject.set(x, "taskData", js.undefined)
    
    inline def setTaskDefaults(value: Baseline): Self = StObject.set(x, "taskDefaults", value.asInstanceOf[js.Any])
    
    inline def setTaskDefaultsUndefined: Self = StObject.set(x, "taskDefaults", js.undefined)
    
    inline def setTooltip(value: `9`[K2, D2]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: AccessibleDependencyInfo): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValueFormats(value: BaselineDate): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    inline def setValueFormatsUndefined: Self = StObject.set(x, "valueFormats", js.undefined)
    
    inline def setViewportEnd(value: String): Self = StObject.set(x, "viewportEnd", value.asInstanceOf[js.Any])
    
    inline def setViewportEndUndefined: Self = StObject.set(x, "viewportEnd", js.undefined)
    
    inline def setViewportStart(value: String): Self = StObject.set(x, "viewportStart", value.asInstanceOf[js.Any])
    
    inline def setViewportStartUndefined: Self = StObject.set(x, "viewportStart", js.undefined)
  }
}
