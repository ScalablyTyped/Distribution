package typings.nvd3.nvd3Mod

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
    val __obj = js.Dynamic.literal(inner = inner, outer = outer)
  
    __obj.asInstanceOf[ArcsRadius]
  }
}

