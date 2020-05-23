package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: TooltipDelay
}

object Delay {
  @scala.inline
  def apply(delay: TooltipDelay): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

