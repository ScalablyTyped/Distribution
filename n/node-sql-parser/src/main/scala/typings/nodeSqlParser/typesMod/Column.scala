package typings.nodeSqlParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  var as: String = js.native
  var expr: ColumnRef | AggrFunc = js.native
}

object Column {
  @scala.inline
  def apply(as: String, expr: ColumnRef | AggrFunc): Column = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpr(value: ColumnRef | AggrFunc): Self = this.set("expr", value.asInstanceOf[js.Any])
  }
  
}

