package typings.nodePgMigrate

import typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReverseCreateTriggerFn extends js.Object {
  var reverse: CreateTriggerFn
}

object AnonReverseCreateTriggerFn {
  @scala.inline
  def apply(reverse: CreateTriggerFn): AnonReverseCreateTriggerFn = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReverseCreateTriggerFn]
  }
}

