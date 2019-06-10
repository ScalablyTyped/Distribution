package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the ways the player can interact with the entity to which this component is applied.
  */
trait IInteractComponent extends js.Object {
  /**
    * Loot table with items to add to the player's inventory upon successful interaction
    */
  var add_items: Anon_Table
  /**
    * Time in seconds before this entity can be interacted with again
    * @default 0.0
    */
  var cooldown: scala.Double
  /**
    * The amount of damage the item will take when used to interact with this entity. A value of 0 means the item won't lose durability
    * @default 0
    */
  var hurt_item: scala.Double
  /**
    * Text to show when the player is able to interact in this way with this entity when playing with Touch-screen controls
    */
  var interact_text: java.lang.String
  /**
    * An event identifier to fire when the interaction occurs
    */
  var on_interact: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String
  /**
    * Particle effect that will be triggered at the start of the interaction
    */
  var particle_on_start: Anon_Particleoffsettowardsinteractor
  /**
    * An array of sound identifiers to play when the interaction occurs
    */
  var play_sounds: js.Array[java.lang.String]
  /**
    * An array of entity identifiers to spawn when the interaction occurs
    */
  var spawn_entities: js.Array[java.lang.String]
  /**
    * Loot table with items to drop on the ground upon successful interaction
    */
  var spawn_items: Anon_Table
  /**
    * If true, the player will do the 'swing' animation when interacting with this entity
    * @default false
    */
  var swing: scala.Boolean
  /**
    * The item used will transform to this item upon successful interaction. Format: itemName:auxValue
    */
  var transform_to_item: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the interaction will use an item
    * @default false
    */
  var use_item: scala.Boolean
}

object IInteractComponent {
  @scala.inline
  def apply(
    add_items: Anon_Table,
    cooldown: scala.Double,
    hurt_item: scala.Double,
    interact_text: java.lang.String,
    on_interact: minecraftDashScriptingDashTypesDashSharedLib.MinecraftTrigger | java.lang.String,
    particle_on_start: Anon_Particleoffsettowardsinteractor,
    play_sounds: js.Array[java.lang.String],
    spawn_entities: js.Array[java.lang.String],
    spawn_items: Anon_Table,
    swing: scala.Boolean,
    use_item: scala.Boolean,
    transform_to_item: java.lang.String = null
  ): IInteractComponent = {
    val __obj = js.Dynamic.literal(add_items = add_items, cooldown = cooldown, hurt_item = hurt_item, interact_text = interact_text, on_interact = on_interact.asInstanceOf[js.Any], particle_on_start = particle_on_start, play_sounds = play_sounds, spawn_entities = spawn_entities, spawn_items = spawn_items, swing = swing, use_item = use_item)
    if (transform_to_item != null) __obj.updateDynamic("transform_to_item")(transform_to_item)
    __obj.asInstanceOf[IInteractComponent]
  }
}

