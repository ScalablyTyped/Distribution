package typings.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XY extends js.Object {
  var x: js.Any
  var y: js.Any
}

object XY {
  @scala.inline
  def apply(x: js.Any, y: js.Any): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
}

