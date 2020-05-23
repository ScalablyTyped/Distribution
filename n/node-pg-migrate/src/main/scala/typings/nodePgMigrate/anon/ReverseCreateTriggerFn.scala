package typings.nodePgMigrate.anon

import typings.nodePgMigrate.triggersTypesMod.CreateTriggerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseCreateTriggerFn extends js.Object {
  var reverse: CreateTriggerFn
}

object ReverseCreateTriggerFn {
  @scala.inline
  def apply(reverse: CreateTriggerFn): ReverseCreateTriggerFn = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseCreateTriggerFn]
  }
}

