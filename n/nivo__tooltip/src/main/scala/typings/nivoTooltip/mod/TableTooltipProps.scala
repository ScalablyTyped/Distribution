package typings.nivoTooltip.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableTooltipProps extends js.Object {
  var renderContent: js.UndefOr[js.Function0[ReactNode]] = js.native
  var rows: js.Array[js.Array[ReactNode]] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object TableTooltipProps {
  @scala.inline
  def apply(rows: js.Array[js.Array[ReactNode]]): TableTooltipProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTooltipProps]
  }
  @scala.inline
  implicit class TableTooltipPropsOps[Self <: TableTooltipProps] (val x: Self) extends AnyVal {
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
    def setRowsVarargs(value: js.Array[ReactNode]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[ReactNode]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderContent(value: () => ReactNode): Self = this.set("renderContent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderContent: Self = this.set("renderContent", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

