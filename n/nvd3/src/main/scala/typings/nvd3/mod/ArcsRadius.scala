package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcsRadius extends js.Object {
  var inner: Double
  var outer: Double
}

object ArcsRadius {
  @scala.inline
  def apply(inner: Double, outer: Double): ArcsRadius = {
    val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArcsRadius]
  }
}

