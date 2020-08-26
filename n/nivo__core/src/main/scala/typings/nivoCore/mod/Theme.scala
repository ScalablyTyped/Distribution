package typings.nivoCore.mod

import typings.nivoCore.anon.PartialcontainerPartialCS
import typings.nivoCore.anon.PartialdomainPartiallineP
import typings.nivoCore.anon.PartiallineColorstringlin
import typings.nivoCore.anon.PartiallinePartialCSSProp
import typings.nivoCore.anon.PartiallinePartialstrokes
import typings.nivoCore.anon.PartialtextPartialCSSProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  crosshair :std.Partial<{  line :std.Partial<{  stroke :string,   strokeWidth :number,   strokeOpacity :number,   strokeDasharray :string}>}>,   background :string,   axis :std.Partial<{  domain :std.Partial<{  line :std.Partial<react.react.CSSProperties>}>,   ticks :std.Partial<{  line :std.Partial<react.react.CSSProperties>,   text :std.Partial<react.react.CSSProperties>}>,   legend :std.Partial<{  text :std.Partial<react.react.CSSProperties>}>}>,   grid :std.Partial<{  line :std.Partial<react.react.CSSProperties>}>,   legends :std.Partial<{  text :std.Partial<react.react.CSSProperties>}>,   labels :std.Partial<{  text :std.Partial<react.react.CSSProperties>}>,   markers :std.Partial<{  lineColor :string,   lineStrokeWidth :number,   textColor :string,   fontSize :string | 0}>,   dots :std.Partial<{  text :std.Partial<react.react.CSSProperties>}>,   tooltip :std.Partial<{  container :std.Partial<react.react.CSSProperties>,   basic :std.Partial<react.react.CSSProperties>,   chip :std.Partial<react.react.CSSProperties>,   table :std.Partial<react.react.CSSProperties>,   tableCell :std.Partial<react.react.CSSProperties>}>}> */
@js.native
trait Theme extends js.Object {
  var axis: js.UndefOr[PartialdomainPartiallineP] = js.native
  var background: js.UndefOr[String] = js.native
  var crosshair: js.UndefOr[PartiallinePartialstrokes] = js.native
  var dots: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var grid: js.UndefOr[PartiallinePartialCSSProp] = js.native
  var labels: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var legends: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var markers: js.UndefOr[PartiallineColorstringlin] = js.native
  var tooltip: js.UndefOr[PartialcontainerPartialCS] = js.native
}

object Theme {
  @scala.inline
  def apply(): Theme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setAxis(value: PartialdomainPartiallineP): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setCrosshair(value: PartiallinePartialstrokes): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    @scala.inline
    def setDots(value: PartialtextPartialCSSProp): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setGrid(value: PartiallinePartialCSSProp): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setLabels(value: PartialtextPartialCSSProp): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLegends(value: PartialtextPartialCSSProp): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setMarkers(value: PartiallineColorstringlin): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setTooltip(value: PartialcontainerPartialCS): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

