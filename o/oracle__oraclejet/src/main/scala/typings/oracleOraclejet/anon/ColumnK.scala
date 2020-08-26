package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnK[K] extends js.Object {
  var column: K = js.native
  var row: K = js.native
}

object ColumnK {
  @scala.inline
  def apply[K](column: K, row: K): ColumnK[K] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnK[K]]
  }
  @scala.inline
  implicit class ColumnKOps[Self <: ColumnK[_], K] (val x: Self with ColumnK[K]) extends AnyVal {
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
    def setColumn(value: K): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: K): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

