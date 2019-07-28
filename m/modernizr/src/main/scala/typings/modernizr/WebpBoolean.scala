package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpBoolean extends Boolean {
  var alpha: scala.Boolean
  var animation: scala.Boolean
  var lossless: scala.Boolean
}

object WebpBoolean {
  @scala.inline
  def apply(alpha: scala.Boolean, animation: scala.Boolean, lossless: scala.Boolean): WebpBoolean = {
    val __obj = js.Dynamic.literal(alpha = alpha, animation = animation, lossless = lossless)
  
    __obj.asInstanceOf[WebpBoolean]
  }
}

