package typings.minecraftScriptingTypesServer.anon

import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accepteditems extends js.Object {
  
  /**
    * The list of items that can go in this slot
    */
  var accepted_items: js.Array[String] = js.native
  
  /**
    * Text to be displayed when the entity can be equipped with this item when playing with Touch-screen controls
    */
  var interact_text: String = js.native
  
  /**
    * Event to trigger when this entity is equipped with this item
    */
  var on_equip: MinecraftTrigger | String = js.native
  
  /**
    * Event to trigger when this item is removed from this entity
    */
  var on_unequip: MinecraftTrigger | String = js.native
  
  /**
    * The slot number of this slot
    */
  var slot: Double = js.native
}
object Accepteditems {
  
  @scala.inline
  def apply(
    accepted_items: js.Array[String],
    interact_text: String,
    on_equip: MinecraftTrigger | String,
    on_unequip: MinecraftTrigger | String,
    slot: Double
  ): Accepteditems = {
    val __obj = js.Dynamic.literal(accepted_items = accepted_items.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_equip = on_equip.asInstanceOf[js.Any], on_unequip = on_unequip.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepteditems]
  }
  
  @scala.inline
  implicit class AccepteditemsOps[Self <: Accepteditems] (val x: Self) extends AnyVal {
    
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
    def setAccepted_itemsVarargs(value: String*): Self = this.set("accepted_items", js.Array(value :_*))
    
    @scala.inline
    def setAccepted_items(value: js.Array[String]): Self = this.set("accepted_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteract_text(value: String): Self = this.set("interact_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_equip(value: MinecraftTrigger | String): Self = this.set("on_equip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_unequip(value: MinecraftTrigger | String): Self = this.set("on_unequip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: Double): Self = this.set("slot", value.asInstanceOf[js.Any])
  }
}
