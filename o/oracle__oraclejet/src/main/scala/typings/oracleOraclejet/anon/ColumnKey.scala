package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnKey extends js.Object {
  var columnIndex: js.UndefOr[Double] = js.native
  var columnKey: js.UndefOr[js.Any] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
  var rowKey: js.UndefOr[js.Any] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object ColumnKey {
  @scala.inline
  def apply(): ColumnKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnKey]
  }
  @scala.inline
  implicit class ColumnKeyOps[Self <: ColumnKey] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: js.Any): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setRowKey(value: js.Any): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

