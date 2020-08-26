package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentStack
  extends ContentBase
     with _Content {
  var stack: js.Array[Content] = js.native
}

object ContentStack {
  @scala.inline
  def apply(stack: js.Array[Content]): ContentStack = {
    val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStack]
  }
  @scala.inline
  implicit class ContentStackOps[Self <: ContentStack] (val x: Self) extends AnyVal {
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
    def setStackVarargs(value: Content*): Self = this.set("stack", js.Array(value :_*))
    @scala.inline
    def setStack(value: js.Array[Content]): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

