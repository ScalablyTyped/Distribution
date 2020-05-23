package typings.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XNumber extends js.Object {
  var x: Double
  var y: Double
}

object XNumber {
  @scala.inline
  def apply(x: Double, y: Double): XNumber = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XNumber]
  }
}

