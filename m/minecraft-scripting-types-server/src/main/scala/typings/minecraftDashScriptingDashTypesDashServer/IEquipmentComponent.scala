package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the loot table the entity uses to defines its equipment. Once the changes are applied, the equipment is re-rolled and a new set of equipment is chosen for the entity.
  */
trait IEquipmentComponent extends js.Object {
  /**
    * A list of slots with the chance to drop an equipped item from that slot
    */
  var slot_drop_chance: js.Array[Anon_Dropchance]
  /**
    * The file path to the equipment table, relative to the behavior pack's root
    */
  var table: String
}

object IEquipmentComponent {
  @scala.inline
  def apply(slot_drop_chance: js.Array[Anon_Dropchance], table: String): IEquipmentComponent = {
    val __obj = js.Dynamic.literal(slot_drop_chance = slot_drop_chance.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEquipmentComponent]
  }
}

