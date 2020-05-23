package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSizingHeight extends js.Object {
  var boxSizing: String
  var height: Double
  var overflow: String
}

object BoxSizingHeight {
  @scala.inline
  def apply(boxSizing: String, height: Double, overflow: String): BoxSizingHeight = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizingHeight]
  }
}

