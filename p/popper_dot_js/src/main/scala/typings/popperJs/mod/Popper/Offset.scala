package typings.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object Offset {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): Offset = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

