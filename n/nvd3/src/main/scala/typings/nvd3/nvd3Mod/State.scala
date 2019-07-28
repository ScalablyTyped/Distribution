package typings.nvd3.nvd3Mod

import typings.d3DashDispatch.d3DashDispatchMod.Dispatch
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dispatch: Dispatch[EventTarget]
}

object State {
  @scala.inline
  def apply(dispatch: Dispatch[EventTarget]): State = {
    val __obj = js.Dynamic.literal(dispatch = dispatch)
  
    __obj.asInstanceOf[State]
  }
}

