package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipRect
  extends TopLeft
     with Size

object ClipRect {
  @scala.inline
  def apply(height: scala.Double, left: scala.Double, top: scala.Double, width: scala.Double): ClipRect = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
  
    __obj.asInstanceOf[ClipRect]
  }
}

