package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accepteditems extends js.Object {
  /**
    * The list of items that can go in this slot
    */
  var accepted_items: js.Array[java.lang.String]
  /**
    * Text to be displayed when the entity can be equipped with this item when playing with Touch-screen controls
    */
  var interact_text: java.lang.String
  /**
    * Event to trigger when this entity is equipped with this item
    */
  var on_equip: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
  /**
    * Event to trigger when this item is removed from this entity
    */
  var on_unequip: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
  /**
    * The slot number of this slot
    */
  var slot: scala.Double
}

object Anon_Accepteditems {
  @scala.inline
  def apply(
    accepted_items: js.Array[java.lang.String],
    interact_text: java.lang.String,
    on_equip: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String,
    on_unequip: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String,
    slot: scala.Double
  ): Anon_Accepteditems = {
    val __obj = js.Dynamic.literal(accepted_items = accepted_items, interact_text = interact_text, on_equip = on_equip.asInstanceOf[js.Any], on_unequip = on_unequip.asInstanceOf[js.Any], slot = slot)
  
    __obj.asInstanceOf[Anon_Accepteditems]
  }
}

