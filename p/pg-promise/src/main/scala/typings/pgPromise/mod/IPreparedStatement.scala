package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPreparedStatement extends _QueryParam {
  var binary: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var rowMode: js.UndefOr[array | Null | Unit] = js.native
  var rows: js.UndefOr[Double] = js.native
  var text: js.UndefOr[String | QueryFile] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object IPreparedStatement {
  @scala.inline
  def apply(): IPreparedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPreparedStatement]
  }
  @scala.inline
  implicit class IPreparedStatementOps[Self <: IPreparedStatement] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowMode(value: array | Unit): Self = this.set("rowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowMode: Self = this.set("rowMode", js.undefined)
    @scala.inline
    def setRowModeNull: Self = this.set("rowMode", null)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setText(value: String | QueryFile): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

