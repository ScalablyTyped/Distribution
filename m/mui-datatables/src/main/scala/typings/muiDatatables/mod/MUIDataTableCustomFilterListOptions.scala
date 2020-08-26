package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableCustomFilterListOptions extends js.Object {
  var render: js.UndefOr[js.Function1[/* value */ js.Any, ReactNode]] = js.native
  var update: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Array[String]]] = js.native
}

object MUIDataTableCustomFilterListOptions {
  @scala.inline
  def apply(): MUIDataTableCustomFilterListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableCustomFilterListOptions]
  }
  @scala.inline
  implicit class MUIDataTableCustomFilterListOptionsOps[Self <: MUIDataTableCustomFilterListOptions] (val x: Self) extends AnyVal {
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
    def setRender(value: /* value */ js.Any => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setUpdate(value: /* repeated */ js.Any => js.Array[String]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

