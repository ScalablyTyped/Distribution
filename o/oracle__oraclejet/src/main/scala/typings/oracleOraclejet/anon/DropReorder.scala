package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropReorder[K, D] extends js.Object {
  var drag: Rows[K, D] = js.native
  var drop: Columns = js.native
  var reorder: `20` = js.native
}

object DropReorder {
  @scala.inline
  def apply[K, D](drag: Rows[K, D], drop: Columns, reorder: `20`): DropReorder[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropReorder[K, D]]
  }
  @scala.inline
  implicit class DropReorderOps[Self <: DropReorder[_, _], K, D] (val x: Self with (DropReorder[K, D])) extends AnyVal {
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
    def setDrag(value: Rows[K, D]): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrop(value: Columns): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def setReorder(value: `20`): Self = this.set("reorder", value.asInstanceOf[js.Any])
  }
  
}

