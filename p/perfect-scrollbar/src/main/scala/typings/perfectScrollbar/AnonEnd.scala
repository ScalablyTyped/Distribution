package typings.perfectScrollbar

import typings.perfectScrollbar.perfectScrollbarStrings.end
import typings.perfectScrollbar.perfectScrollbarStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var x: start | end | Null
  var y: start | end | Null
}

object AnonEnd {
  @scala.inline
  def apply(x: start | end = null, y: start | end = null): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

