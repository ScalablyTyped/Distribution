package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var left: Double
  var top: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, left: Double, top: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

