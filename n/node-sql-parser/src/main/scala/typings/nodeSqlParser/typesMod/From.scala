package typings.nodeSqlParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From extends js.Object {
  var as: String | Null = js.native
  var db: String | Null = js.native
  var table: String = js.native
}

object From {
  @scala.inline
  def apply(table: String): From = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
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
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsNull: Self = this.set("as", null)
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def setDbNull: Self = this.set("db", null)
  }
  
}

