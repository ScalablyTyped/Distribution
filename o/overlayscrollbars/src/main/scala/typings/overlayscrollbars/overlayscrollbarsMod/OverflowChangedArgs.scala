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
    val __obj = js.Dynamic.literal(clipped = clipped.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xScrollable = xScrollable.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yScrollable = yScrollable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OverflowChangedArgs]
  }
}

