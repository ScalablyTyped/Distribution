package typings
package pathjsLib.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathHistory extends js.Object {
  var initial: js.Any
  def listen(fallback: js.Any): scala.Unit
  def popState(event: js.Any): scala.Unit
  def pushState(state: js.Any, title: java.lang.String, path: java.lang.String): scala.Unit
}

object IPathHistory {
  @scala.inline
  def apply(
    initial: js.Any,
    listen: js.Any => scala.Unit,
    popState: js.Any => scala.Unit,
    pushState: (js.Any, java.lang.String, java.lang.String) => scala.Unit
  ): IPathHistory = {
    val __obj = js.Dynamic.literal(initial = initial, listen = js.Any.fromFunction1(listen), popState = js.Any.fromFunction1(popState), pushState = js.Any.fromFunction3(pushState))
  
    __obj.asInstanceOf[IPathHistory]
  }
}

