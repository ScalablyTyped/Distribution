package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPreparedParsed extends js.Object {
  var binary: Boolean = js.native
  var name: String = js.native
  var rowMode: Unit | array = js.native
  var rows: Double = js.native
  var text: String = js.native
  var values: js.Array[_] = js.native
}

object IPreparedParsed {
  @scala.inline
  def apply(
    binary: Boolean,
    name: String,
    rowMode: Unit | array,
    rows: Double,
    text: String,
    values: js.Array[_]
  ): IPreparedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreparedParsed]
  }
  @scala.inline
  implicit class IPreparedParsedOps[Self <: IPreparedParsed] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowMode(value: Unit | array): Self = this.set("rowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

