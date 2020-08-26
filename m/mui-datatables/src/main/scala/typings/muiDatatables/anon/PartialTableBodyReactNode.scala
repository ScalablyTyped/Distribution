package typings.muiDatatables.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  TableBody :react.react.ReactNode,   TableFooter :react.react.ReactNode,   TableHead :react.react.ReactNode,   TableResize :react.react.ReactNode,   TableToolbar :react.react.ReactNode,   TableToolbarSelect :react.react.ReactNode,   TableFilterList :react.react.ReactNode,   Tooltip :react.react.ReactNode}> */
@js.native
trait PartialTableBodyReactNode extends js.Object {
  var TableBody: js.UndefOr[ReactNode] = js.native
  var TableFilterList: js.UndefOr[ReactNode] = js.native
  var TableFooter: js.UndefOr[ReactNode] = js.native
  var TableHead: js.UndefOr[ReactNode] = js.native
  var TableResize: js.UndefOr[ReactNode] = js.native
  var TableToolbar: js.UndefOr[ReactNode] = js.native
  var TableToolbarSelect: js.UndefOr[ReactNode] = js.native
  var Tooltip: js.UndefOr[ReactNode] = js.native
}

object PartialTableBodyReactNode {
  @scala.inline
  def apply(): PartialTableBodyReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableBodyReactNode]
  }
  @scala.inline
  implicit class PartialTableBodyReactNodeOps[Self <: PartialTableBodyReactNode] (val x: Self) extends AnyVal {
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
    def setTableBody(value: ReactNode): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableBody: Self = this.set("TableBody", js.undefined)
    @scala.inline
    def setTableFilterList(value: ReactNode): Self = this.set("TableFilterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableFilterList: Self = this.set("TableFilterList", js.undefined)
    @scala.inline
    def setTableFooter(value: ReactNode): Self = this.set("TableFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableFooter: Self = this.set("TableFooter", js.undefined)
    @scala.inline
    def setTableHead(value: ReactNode): Self = this.set("TableHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableHead: Self = this.set("TableHead", js.undefined)
    @scala.inline
    def setTableResize(value: ReactNode): Self = this.set("TableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableResize: Self = this.set("TableResize", js.undefined)
    @scala.inline
    def setTableToolbar(value: ReactNode): Self = this.set("TableToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableToolbar: Self = this.set("TableToolbar", js.undefined)
    @scala.inline
    def setTableToolbarSelect(value: ReactNode): Self = this.set("TableToolbarSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableToolbarSelect: Self = this.set("TableToolbarSelect", js.undefined)
    @scala.inline
    def setTooltip(value: ReactNode): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("Tooltip", js.undefined)
  }
  
}

