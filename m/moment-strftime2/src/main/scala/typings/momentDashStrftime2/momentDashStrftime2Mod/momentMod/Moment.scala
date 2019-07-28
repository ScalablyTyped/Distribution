package typings.momentDashStrftime2.momentDashStrftime2Mod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def strftime(pattern: String): String
}

object Moment {
  @scala.inline
  def apply(strftime: String => String): Moment = {
    val __obj = js.Dynamic.literal(strftime = js.Any.fromFunction1(strftime))
  
    __obj.asInstanceOf[Moment]
  }
}

