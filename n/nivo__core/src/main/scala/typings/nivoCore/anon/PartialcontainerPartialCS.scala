package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  container :std.Partial<react.react.CSSProperties>,   basic :std.Partial<react.react.CSSProperties>,   chip :std.Partial<react.react.CSSProperties>,   table :std.Partial<react.react.CSSProperties>,   tableCell :std.Partial<react.react.CSSProperties>}> */
@js.native
trait PartialcontainerPartialCS extends js.Object {
  var basic: js.UndefOr[PartialCSSProperties] = js.native
  var chip: js.UndefOr[PartialCSSProperties] = js.native
  var container: js.UndefOr[PartialCSSProperties] = js.native
  var table: js.UndefOr[PartialCSSProperties] = js.native
  var tableCell: js.UndefOr[PartialCSSProperties] = js.native
}

object PartialcontainerPartialCS {
  @scala.inline
  def apply(): PartialcontainerPartialCS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcontainerPartialCS]
  }
  @scala.inline
  implicit class PartialcontainerPartialCSOps[Self <: PartialcontainerPartialCS] (val x: Self) extends AnyVal {
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
    def setBasic(value: PartialCSSProperties): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setChip(value: PartialCSSProperties): Self = this.set("chip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChip: Self = this.set("chip", js.undefined)
    @scala.inline
    def setContainer(value: PartialCSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setTable(value: PartialCSSProperties): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTableCell(value: PartialCSSProperties): Self = this.set("tableCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCell: Self = this.set("tableCell", js.undefined)
  }
  
}

