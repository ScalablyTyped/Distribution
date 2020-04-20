package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccepteditems extends js.Object {
  /**
    * The list of items that can go in this slot
    */
  var accepted_items: js.Array[String]
  /**
    * Text to be displayed when the entity can be equipped with this item when playing with Touch-screen controls
    */
  var interact_text: String
  /**
    * Event to trigger when this entity is equipped with this item
    */
  var on_equip: MinecraftTrigger | String
  /**
    * Event to trigger when this item is removed from this entity
    */
  var on_unequip: MinecraftTrigger | String
  /**
    * The slot number of this slot
    */
  var slot: Double
}

object AnonAccepteditems {
  @scala.inline
  def apply(
    accepted_items: js.Array[String],
    interact_text: String,
    on_equip: MinecraftTrigger | String,
    on_unequip: MinecraftTrigger | String,
    slot: Double
  ): AnonAccepteditems = {
    val __obj = js.Dynamic.literal(accepted_items = accepted_items.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_equip = on_equip.asInstanceOf[js.Any], on_unequip = on_unequip.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccepteditems]
  }
}

