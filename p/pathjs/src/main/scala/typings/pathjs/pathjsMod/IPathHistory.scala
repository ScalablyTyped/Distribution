package typings.pathjs.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathHistory extends js.Object {
  var initial: js.Any
  def listen(fallback: js.Any): Unit
  def popState(event: js.Any): Unit
  def pushState(state: js.Any, title: String, path: String): Unit
}

object IPathHistory {
  @scala.inline
  def apply(
    initial: js.Any,
    listen: js.Any => Unit,
    popState: js.Any => Unit,
    pushState: (js.Any, String, String) => Unit
  ): IPathHistory = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], listen = js.Any.fromFunction1(listen), popState = js.Any.fromFunction1(popState), pushState = js.Any.fromFunction3(pushState))
  
    __obj.asInstanceOf[IPathHistory]
  }
}

