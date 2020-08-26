package typings.officeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cells extends js.Object {
  var cells: js.Any = js.native
  var format: js.Any = js.native
}

object Cells {
  @scala.inline
  def apply(cells: js.Any, format: js.Any): Cells = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cells]
  }
  @scala.inline
  implicit class CellsOps[Self <: Cells] (val x: Self) extends AnyVal {
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
    def setCells(value: js.Any): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

