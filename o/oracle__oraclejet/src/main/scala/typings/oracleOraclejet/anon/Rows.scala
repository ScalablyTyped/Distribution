package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rows[K, D] extends js.Object {
  var rows: DataTypesDrag[K, D] = js.native
}

object Rows {
  @scala.inline
  def apply[K, D](rows: DataTypesDrag[K, D]): Rows[K, D] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows[K, D]]
  }
  @scala.inline
  implicit class RowsOps[Self <: Rows[_, _], K, D] (val x: Self with (Rows[K, D])) extends AnyVal {
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
    def setRows(value: DataTypesDrag[K, D]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

