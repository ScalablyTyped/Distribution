package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayHeight extends js.Object {
  var display: String
  var height: Double
}

object DisplayHeight {
  @scala.inline
  def apply(display: String, height: Double): DisplayHeight = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayHeight]
  }
}

