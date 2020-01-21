package typings.officeUiFabricReact.linkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILink extends js.Object {
  /** Sets focus to the link. */
  def focus(): Unit
}

object ILink {
  @scala.inline
  def apply(focus: () => Unit): ILink = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[ILink]
  }
}

