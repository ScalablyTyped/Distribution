package typings.minecraftDashScriptingDashTypesDashShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinecraftTrigger extends js.Object {
  var event: String
  var filters: MinecraftFilter
  var target: String
}

object MinecraftTrigger {
  @scala.inline
  def apply(event: String, filters: MinecraftFilter, target: String): MinecraftTrigger = {
    val __obj = js.Dynamic.literal(event = event, filters = filters, target = target)
  
    __obj.asInstanceOf[MinecraftTrigger]
  }
}

