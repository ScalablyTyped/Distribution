package typings.offlineDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: Double
  var initialDelay: Double
}

object Anon_Delay {
  @scala.inline
  def apply(delay: Double, initialDelay: Double): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, initialDelay = initialDelay)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

