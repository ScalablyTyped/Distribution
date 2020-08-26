package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Dropchance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the loot table the entity uses to defines its equipment. Once the changes are applied, the equipment is re-rolled and a new set of equipment is chosen for the entity.
  */
@js.native
trait IEquipmentComponent extends js.Object {
  /**
    * A list of slots with the chance to drop an equipped item from that slot
    */
  var slot_drop_chance: js.Array[Dropchance] = js.native
  /**
    * The file path to the equipment table, relative to the behavior pack's root
    */
  var table: String = js.native
}

object IEquipmentComponent {
  @scala.inline
  def apply(slot_drop_chance: js.Array[Dropchance], table: String): IEquipmentComponent = {
    val __obj = js.Dynamic.literal(slot_drop_chance = slot_drop_chance.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEquipmentComponent]
  }
  @scala.inline
  implicit class IEquipmentComponentOps[Self <: IEquipmentComponent] (val x: Self) extends AnyVal {
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
    def setSlot_drop_chanceVarargs(value: Dropchance*): Self = this.set("slot_drop_chance", js.Array(value :_*))
    @scala.inline
    def setSlot_drop_chance(value: js.Array[Dropchance]): Self = this.set("slot_drop_chance", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
  }
  
}

