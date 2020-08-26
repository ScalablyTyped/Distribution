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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ojGanttSettablePropertiesLenientOps[Self <: ojGanttSettablePropertiesLenient[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojGanttSettablePropertiesLenient[K1, K2, D1, D2])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAxisPosition(value: bottom | top): Self = this.set("axisPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisPosition: Self = this.set("axisPosition", js.undefined)
    @scala.inline
    def setDependencyData(value: DataProvider[K1, D1]): Self = this.set("dependencyData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyData: Self = this.set("dependencyData", js.undefined)
    @scala.inline
    def setDnd(value: Move): Self = this.set("dnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setGridlines(value: Vertical): Self = this.set("gridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridlines: Self = this.set("gridlines", js.undefined)
    @scala.inline
    def setMajorAxis(value: Scale): Self = this.set("majorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorAxis: Self = this.set("majorAxis", js.undefined)
    @scala.inline
    def setMinorAxis(value: Scale): Self = this.set("minorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorAxis: Self = this.set("minorAxis", js.undefined)
    @scala.inline
    def setReferenceObjectsVarargs(value: ReferenceObject*): Self = this.set("referenceObjects", js.Array(value :_*))
    @scala.inline
    def setReferenceObjects(value: js.Array[ReferenceObject]): Self = this.set("referenceObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceObjects: Self = this.set("referenceObjects", js.undefined)
    @scala.inline
    def setRowAxis(value: MaxWidth[K2, D2]): Self = this.set("rowAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowAxis: Self = this.set("rowAxis", js.undefined)
    @scala.inline
    def setRowDefaults(value: `8`): Self = this.set("rowDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDefaults: Self = this.set("rowDefaults", js.undefined)
    @scala.inline
    def setScrollPosition(value: OffsetY): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: K2*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[K2]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTaskData(value: DataProvider[K2, D2]): Self = this.set("taskData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskData: Self = this.set("taskData", js.undefined)
    @scala.inline
    def setTaskDefaults(value: Baseline): Self = this.set("taskDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskDefaults: Self = this.set("taskDefaults", js.undefined)
    @scala.inline
    def setTooltip(value: `9`[K2, D2]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTranslations(value: AccessibleDependencyInfo): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setValueFormats(value: BaselineDate): Self = this.set("valueFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormats: Self = this.set("valueFormats", js.undefined)
    @scala.inline
    def setViewportEnd(value: String): Self = this.set("viewportEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportEnd: Self = this.set("viewportEnd", js.undefined)
    @scala.inline
    def setViewportStart(value: String): Self = this.set("viewportStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportStart: Self = this.set("viewportStart", js.undefined)
  }
  
}

