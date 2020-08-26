package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.End
import typings.oracleOraclejet.anon.Value
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typings.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typings.oracleOraclejet.oracleOraclejetStrings.innerStart
import typings.oracleOraclejet.oracleOraclejetStrings.milestone
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.normal
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttTaskSettableProperties> */
@js.native
trait ojGanttTaskSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var baseline: js.UndefOr[End] = js.native
  var borderRadius: js.UndefOr[String] = js.native
  var end: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | Null] = js.native
  var label: js.UndefOr[String] = js.native
  var labelPosition: js.UndefOr[start | innerCenter | innerStart | innerEnd | end | none] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var progress: js.UndefOr[Value] = js.native
  var rowId: js.UndefOr[js.Any] = js.native
  var shortDesc: js.UndefOr[String | Null] = js.native
  var start: js.UndefOr[String] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var `type`: js.UndefOr[normal | milestone | summary | auto] = js.native
}

object ojGanttTaskSettablePropertiesLenient {
  @scala.inline
  def apply(): ojGanttTaskSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttTaskSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojGanttTaskSettablePropertiesLenientOps[Self <: ojGanttTaskSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setBaseline(value: End): Self = this.set("baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelPosition(value: start | innerCenter | innerStart | innerEnd | end | none): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setProgress(value: Value): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setRowId(value: js.Any): Self = this.set("rowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowId: Self = this.set("rowId", js.undefined)
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    @scala.inline
    def setShortDescNull: Self = this.set("shortDesc", null)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setType(value: normal | milestone | summary | auto): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

