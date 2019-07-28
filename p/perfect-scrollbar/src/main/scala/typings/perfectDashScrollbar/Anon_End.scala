package typings.perfectDashScrollbar

import typings.perfectDashScrollbar.perfectDashScrollbarStrings.end
import typings.perfectDashScrollbar.perfectDashScrollbarStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var x: start | end | Null
  var y: start | end | Null
}

object Anon_End {
  @scala.inline
  def apply(x: start | end = null, y: start | end = null): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

