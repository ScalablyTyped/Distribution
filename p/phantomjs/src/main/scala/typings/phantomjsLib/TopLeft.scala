package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLeft extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object TopLeft {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): TopLeft = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[TopLeft]
  }
}

