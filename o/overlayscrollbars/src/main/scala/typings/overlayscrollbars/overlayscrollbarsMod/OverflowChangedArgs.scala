package typings.overlayscrollbars.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowChangedArgs extends js.Object {
  var clipped: Boolean
  var x: Boolean
  var xScrollable: Boolean
  var y: Boolean
  var yScrollable: Boolean
}

object OverflowChangedArgs {
  @scala.inline
  def apply(clipped: Boolean, x: Boolean, xScrollable: Boolean, y: Boolean, yScrollable: Boolean): OverflowChangedArgs = {
    val __obj = js.Dynamic.literal(clipped = clipped, x = x, xScrollable = xScrollable, y = y, yScrollable = yScrollable)
  
    __obj.asInstanceOf[OverflowChangedArgs]
  }
}

