package typings.pg.mod

import typings.pg.pgStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryArrayConfig[I /* <: js.Array[_] */] extends QueryConfig[I] {
  var rowMode: array = js.native
}

object QueryArrayConfig {
  @scala.inline
  def apply[/* <: js.Array[_] */ I](rowMode: array, text: String): QueryArrayConfig[I] = {
    val __obj = js.Dynamic.literal(rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayConfig[I]]
  }
  @scala.inline
  implicit class QueryArrayConfigOps[Self <: QueryArrayConfig[_], /* <: js.Array[_] */ I] (val x: Self with QueryArrayConfig[I]) extends AnyVal {
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
    def setRowMode(value: array): Self = this.set("rowMode", value.asInstanceOf[js.Any])
  }
  
}

