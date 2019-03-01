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
    listen: js.Function1[js.Any, scala.Unit],
    popState: js.Function1[js.Any, scala.Unit],
    pushState: js.Function3[js.Any, java.lang.String, java.lang.String, scala.Unit]
  ): IPathHistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initial")(initial)
    __obj.updateDynamic("listen")(listen)
    __obj.updateDynamic("popState")(popState)
    __obj.updateDynamic("pushState")(pushState)
    __obj.asInstanceOf[IPathHistory]
  }
}

