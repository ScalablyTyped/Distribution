package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dispatch: d3DashDispatchLib.d3DashDispatchMod.Dispatch[stdLib.EventTarget]
}

object State {
  @scala.inline
  def apply(dispatch: d3DashDispatchLib.d3DashDispatchMod.Dispatch[stdLib.EventTarget]): State = {
    val __obj = js.Dynamic.literal(dispatch = dispatch)
  
    __obj.asInstanceOf[State]
  }
}

