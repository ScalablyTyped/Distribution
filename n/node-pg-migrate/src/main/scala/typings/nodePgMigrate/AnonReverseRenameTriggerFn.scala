package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.triggersTypesMod.RenameTriggerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameTriggerFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTriggerFn = js.native
  def reverse(tableName: Name, oldTriggerName: String, newTriggerName: String): String | js.Array[String] = js.native
}

