package typings.officeUiFabricReact.teachingBubbleTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubble extends js.Object {
  /** Sets focus to the TeachingBubble root element */
  def focus(): Unit
}

object ITeachingBubble {
  @scala.inline
  def apply(focus: () => Unit): ITeachingBubble = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[ITeachingBubble]
  }
}

