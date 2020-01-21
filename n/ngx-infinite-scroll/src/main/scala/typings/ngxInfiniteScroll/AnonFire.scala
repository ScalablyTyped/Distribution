package typings.ngxInfiniteScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFire extends js.Object {
  var fire: Boolean
  var scrollDown: Boolean
}

object AnonFire {
  @scala.inline
  def apply(fire: Boolean, scrollDown: Boolean): AnonFire = {
    val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFire]
  }
}

