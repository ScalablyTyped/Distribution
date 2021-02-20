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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttSettableProperties<K1, K2, D1, D2>> */
@js.native
trait ojGanttSettablePropertiesLenient[K1, K2, D1, D2]
  extends /* key */ StringDictionary[js.Any] {
  
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  
  var as: js.UndefOr[String] = js.native
  
  var axisPosition: js.UndefOr[bottom | top] = js.native
  
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  
  var dnd: js.UndefOr[Move] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var gridlines: js.UndefOr[Vertical] = js.native
  
  var majorAxis: js.UndefOr[Scale] = js.native
  
  var minorAxis: js.UndefOr[Scale] = js.native
  
  var referenceObjects: js.UndefOr[js.Array[ReferenceObject]] = js.native
  
  var rowAxis: js.UndefOr[MaxWidth[K2, D2]] = js.native
  
  var rowDefaults: js.UndefOr[`8`] = js.native
  
  var scrollPosition: js.UndefOr[OffsetY] = js.native
  
  var selection: js.UndefOr[js.Array[K2]] = js.native
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  
  var taskDefaults: js.UndefOr[Baseline] = js.native
  
  var tooltip: js.UndefOr[`9`[K2, D2]] = js.native
  
  var trackResize: js.UndefOr[on | off] = js.native
  
  var translations: js.UndefOr[AccessibleDependencyInfo] = js.native
  
  var valueFormats: js.UndefOr[BaselineDate] = js.native
  
  var viewportEnd: js.UndefOr[String] = js.native
  
  var viewportStart: js.UndefOr[String] = js.native
}
object ojGanttSettablePropertiesLenient {
  
  @scala.inline
  def apply[K1, K2, D1, D2](): ojGanttSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttSettablePropertiesLenient[K1, K2, D1, D2]]
  }
  
  @scala.inline
  implicit class ojGanttSettablePropertiesLenientMutableBuilder[Self <: ojGanttSettablePropertiesLenient[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojGanttSettablePropertiesLenient[K1, K2, D1, D2])) extends AnyVal {
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAxisPosition(value: bottom | top): Self = StObject.set(x, "axisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisPositionUndefined: Self = StObject.set(x, "axisPosition", js.undefined)
    
    @scala.inline
    def setDependencyData(value: DataProvider[K1, D1]): Self = StObject.set(x, "dependencyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyDataUndefined: Self = StObject.set(x, "dependencyData", js.undefined)
    
    @scala.inline
    def setDnd(value: Move): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setGridlines(value: Vertical): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
    
    @scala.inline
    def setMajorAxis(value: Scale): Self = StObject.set(x, "majorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorAxisUndefined: Self = StObject.set(x, "majorAxis", js.undefined)
    
    @scala.inline
    def setMinorAxis(value: Scale): Self = StObject.set(x, "minorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorAxisUndefined: Self = StObject.set(x, "minorAxis", js.undefined)
    
    @scala.inline
    def setReferenceObjects(value: js.Array[ReferenceObject]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjectsUndefined: Self = StObject.set(x, "referenceObjects", js.undefined)
    
    @scala.inline
    def setReferenceObjectsVarargs(value: ReferenceObject*): Self = StObject.set(x, "referenceObjects", js.Array(value :_*))
    
    @scala.inline
    def setRowAxis(value: MaxWidth[K2, D2]): Self = StObject.set(x, "rowAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowAxisUndefined: Self = StObject.set(x, "rowAxis", js.undefined)
    
    @scala.inline
    def setRowDefaults(value: `8`): Self = StObject.set(x, "rowDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDefaultsUndefined: Self = StObject.set(x, "rowDefaults", js.undefined)
    
    @scala.inline
    def setScrollPosition(value: OffsetY): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
    
    @scala.inline
    def setSelection(value: js.Array[K2]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: K2*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTaskData(value: DataProvider[K2, D2]): Self = StObject.set(x, "taskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDataUndefined: Self = StObject.set(x, "taskData", js.undefined)
    
    @scala.inline
    def setTaskDefaults(value: Baseline): Self = StObject.set(x, "taskDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefaultsUndefined: Self = StObject.set(x, "taskDefaults", js.undefined)
    
    @scala.inline
    def setTooltip(value: `9`[K2, D2]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: AccessibleDependencyInfo): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setValueFormats(value: BaselineDate): Self = StObject.set(x, "valueFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatsUndefined: Self = StObject.set(x, "valueFormats", js.undefined)
    
    @scala.inline
    def setViewportEnd(value: String): Self = StObject.set(x, "viewportEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportEndUndefined: Self = StObject.set(x, "viewportEnd", js.undefined)
    
    @scala.inline
    def setViewportStart(value: String): Self = StObject.set(x, "viewportStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportStartUndefined: Self = StObject.set(x, "viewportStart", js.undefined)
  }
}
