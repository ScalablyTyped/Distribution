package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinecraftTrigger extends js.Object {
  var event: java.lang.String
  var filters: MinecraftFilter
  var target: java.lang.String
}

object MinecraftTrigger {
  @scala.inline
  def apply(event: java.lang.String, filters: MinecraftFilter, target: java.lang.String): MinecraftTrigger = {
    val __obj = js.Dynamic.literal(event = event, filters = filters, target = target)
  
    __obj.asInstanceOf[MinecraftTrigger]
  }
}

