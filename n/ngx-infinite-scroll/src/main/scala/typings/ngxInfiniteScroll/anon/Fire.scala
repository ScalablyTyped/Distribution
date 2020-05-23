package typings.ngxInfiniteScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fire extends js.Object {
  var fire: Boolean
  var scrollDown: Boolean
}

object Fire {
  @scala.inline
  def apply(fire: Boolean, scrollDown: Boolean): Fire = {
    val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fire]
  }
}

