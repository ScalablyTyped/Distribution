package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.ASC
import typings.nodeSqlParser.nodeSqlParserStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy extends js.Object {
  var expr: js.Any = js.native
  var `type`: ASC | DESC = js.native
}

object OrderBy {
  @scala.inline
  def apply(expr: js.Any, `type`: ASC | DESC): OrderBy = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy]
  }
  @scala.inline
  implicit class OrderByOps[Self <: OrderBy] (val x: Self) extends AnyVal {
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
    def setExpr(value: js.Any): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ASC | DESC): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

