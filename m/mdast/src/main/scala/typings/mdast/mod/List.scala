package typings.mdast.mod

import typings.mdast.mdastStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_List: js.Array[ListContent] = js.native
  var ordered: js.UndefOr[Boolean] = js.native
  var spread: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[Double] = js.native
  @JSName("type")
  var type_List: list = js.native
}

object List {
  @scala.inline
  def apply(children: js.Array[ListContent], `type`: list): List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ListContent*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ListContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: list): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    @scala.inline
    def setSpread(value: Boolean): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

