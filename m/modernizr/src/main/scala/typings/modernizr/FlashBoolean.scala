package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashBoolean extends Boolean {
  var blocked: scala.Boolean
}

object FlashBoolean {
  @scala.inline
  def apply(blocked: scala.Boolean): FlashBoolean = {
    val __obj = js.Dynamic.literal(blocked = blocked)
  
    __obj.asInstanceOf[FlashBoolean]
  }
}

