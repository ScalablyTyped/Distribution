package typings.officeUiFabricReact.expandingCardBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpandingCardState extends js.Object {
  var firstFrameRendered: Boolean
  var needsScroll: Boolean
}

object IExpandingCardState {
  @scala.inline
  def apply(firstFrameRendered: Boolean, needsScroll: Boolean): IExpandingCardState = {
    val __obj = js.Dynamic.literal(firstFrameRendered = firstFrameRendered.asInstanceOf[js.Any], needsScroll = needsScroll.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IExpandingCardState]
  }
}

