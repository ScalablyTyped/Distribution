package typings.perfectScrollbar.anon

import typings.perfectScrollbar.perfectScrollbarStrings.end
import typings.perfectScrollbar.perfectScrollbarStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var x: start | end | Null
  var y: start | end | Null
}

object X {
  @scala.inline
  def apply(x: start | end = null, y: start | end = null): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

