package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableNode extends js.Object {
  def join(table: TableNode): JoinTableNode = js.native
  def leftJoin(table: TableNode): JoinTableNode = js.native
}

object TableNode {
  @scala.inline
  def apply(join: TableNode => JoinTableNode, leftJoin: TableNode => JoinTableNode): TableNode = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), leftJoin = js.Any.fromFunction1(leftJoin))
    __obj.asInstanceOf[TableNode]
  }
  @scala.inline
  implicit class TableNodeOps[Self <: TableNode] (val x: Self) extends AnyVal {
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
    def setJoin(value: TableNode => JoinTableNode): Self = this.set("join", js.Any.fromFunction1(value))
    @scala.inline
    def setLeftJoin(value: TableNode => JoinTableNode): Self = this.set("leftJoin", js.Any.fromFunction1(value))
  }
  
}

