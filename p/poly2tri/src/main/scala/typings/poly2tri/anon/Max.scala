package typings.poly2tri.anon

import typings.poly2tri.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: Point
  var min: Point
}

object Max {
  @scala.inline
  def apply(max: Point, min: Point): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

