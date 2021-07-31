package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Dropchance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the loot table the entity uses to defines its equipment. Once the changes are applied, the equipment is re-rolled and a new set of equipment is chosen for the entity.
  */
trait IEquipmentComponent extends StObject {
  
  /**
    * A list of slots with the chance to drop an equipped item from that slot
    */
  var slot_drop_chance: js.Array[Dropchance]
  
  /**
    * The file path to the equipment table, relative to the behavior pack's root
    */
  var table: String
}
object IEquipmentComponent {
  
  @scala.inline
  def apply(slot_drop_chance: js.Array[Dropchance], table: String): IEquipmentComponent = {
    val __obj = js.Dynamic.literal(slot_drop_chance = slot_drop_chance.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEquipmentComponent]
  }
  
  @scala.inline
  implicit class IEquipmentComponentMutableBuilder[Self <: IEquipmentComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlot_drop_chance(value: js.Array[Dropchance]): Self = StObject.set(x, "slot_drop_chance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot_drop_chanceVarargs(value: Dropchance*): Self = StObject.set(x, "slot_drop_chance", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
