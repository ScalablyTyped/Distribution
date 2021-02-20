package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinecraftTrigger extends StObject {
  
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
  implicit class MinecraftTriggerMutableBuilder[Self <: MinecraftTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
