package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drop extends js.Object {
  var drag: Nodes = js.native
  var drop: Background = js.native
}

object Drop {
  @scala.inline
  def apply(drag: Nodes, drop: Background): Drop = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drop]
  }
  @scala.inline
  implicit class DropOps[Self <: Drop] (val x: Self) extends AnyVal {
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
    def setDrag(value: Nodes): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrop(value: Background): Self = this.set("drop", value.asInstanceOf[js.Any])
  }
  
}

