package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<openfin.openfin.fin.Bounds, 'height' | 'width' | 'top' | 'left'> */
trait PickBoundsheightwidthtopl extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object PickBoundsheightwidthtopl {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): PickBoundsheightwidthtopl = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBoundsheightwidthtopl]
  }
}

