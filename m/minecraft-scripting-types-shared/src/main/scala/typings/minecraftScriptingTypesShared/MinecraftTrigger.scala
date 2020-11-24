package typings.minecraftScriptingTypesShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinecraftTrigger extends js.Object {
  
  var event: String = js.native
  
  var filters: MinecraftFilter = js.native
  
  var target: String = js.native
}
object MinecraftTrigger {
  
  @scala.inline
  def apply(event: String, filters: MinecraftFilter, target: String): MinecraftTrigger = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinecraftTrigger]
  }
  
  @scala.inline
  implicit class MinecraftTriggerOps[Self <: MinecraftTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
