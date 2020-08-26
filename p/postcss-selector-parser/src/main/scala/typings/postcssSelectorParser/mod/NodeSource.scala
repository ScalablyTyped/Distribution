package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSource extends js.Object {
  var end: js.UndefOr[Column] = js.native
  var start: js.UndefOr[Column] = js.native
}

object NodeSource {
  @scala.inline
  def apply(): NodeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSource]
  }
  @scala.inline
  implicit class NodeSourceOps[Self <: NodeSource] (val x: Self) extends AnyVal {
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
    def setEnd(value: Column): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: Column): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

