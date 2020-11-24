package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dropchance extends js.Object {
  
  /**
    * The chance that the item in this slot will be dropped
    */
  var drop_chance: Double = js.native
  
  /**
    * The slot number
    */
  var slot: Double = js.native
}
object Dropchance {
  
  @scala.inline
  def apply(drop_chance: Double, slot: Double): Dropchance = {
    val __obj = js.Dynamic.literal(drop_chance = drop_chance.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dropchance]
  }
  
  @scala.inline
  implicit class DropchanceOps[Self <: Dropchance] (val x: Self) extends AnyVal {
    
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
    def setDrop_chance(value: Double): Self = this.set("drop_chance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: Double): Self = this.set("slot", value.asInstanceOf[js.Any])
  }
}
