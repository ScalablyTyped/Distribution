package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoxSizingHeight extends js.Object {
  var boxSizing: String
  var height: Double
  var overflow: String
}

object AnonBoxSizingHeight {
  @scala.inline
  def apply(boxSizing: String, height: Double, overflow: String): AnonBoxSizingHeight = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoxSizingHeight]
  }
}

