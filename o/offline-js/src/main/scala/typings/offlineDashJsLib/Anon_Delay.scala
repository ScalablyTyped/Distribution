package typings
package offlineDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: scala.Double
  var initialDelay: scala.Double
}

object Anon_Delay {
  @scala.inline
  def apply(delay: scala.Double, initialDelay: scala.Double): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("initialDelay")(initialDelay)
    __obj.asInstanceOf[Anon_Delay]
  }
}

