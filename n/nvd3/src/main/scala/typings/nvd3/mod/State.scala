package typings.nvd3.mod

import typings.d3Dispatch.mod.Dispatch_
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dispatch: Dispatch_[EventTarget]
}

object State {
  @scala.inline
  def apply(dispatch: Dispatch_[EventTarget]): State = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

