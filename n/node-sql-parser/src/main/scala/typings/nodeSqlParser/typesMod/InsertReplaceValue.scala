package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.expr_list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertReplaceValue extends js.Object {
  var `type`: expr_list = js.native
  var value: js.Array[_] = js.native
}

object InsertReplaceValue {
  @scala.inline
  def apply(`type`: expr_list, value: js.Array[_]): InsertReplaceValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplaceValue]
  }
  @scala.inline
  implicit class InsertReplaceValueOps[Self <: InsertReplaceValue] (val x: Self) extends AnyVal {
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
    def setType(value: expr_list): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

