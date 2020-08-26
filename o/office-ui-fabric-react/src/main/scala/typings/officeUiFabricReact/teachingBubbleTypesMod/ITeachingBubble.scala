package typings.officeUiFabricReact.teachingBubbleTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubble extends js.Object {
  /** Sets focus to the TeachingBubble root element */
  def focus(): Unit = js.native
}

object ITeachingBubble {
  @scala.inline
  def apply(focus: () => Unit): ITeachingBubble = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[ITeachingBubble]
  }
  @scala.inline
  implicit class ITeachingBubbleOps[Self <: ITeachingBubble] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
  }
  
}

