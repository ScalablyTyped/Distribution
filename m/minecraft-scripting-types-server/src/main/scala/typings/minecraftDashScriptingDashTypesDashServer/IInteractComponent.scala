package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.MinecraftTrigger
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
  var cooldown: Double
  /**
    * The amount of damage the item will take when used to interact with this entity. A value of 0 means the item won't lose durability
    * @default 0
    */
  var hurt_item: Double
  /**
    * Text to show when the player is able to interact in this way with this entity when playing with Touch-screen controls
    */
  var interact_text: String
  /**
    * An event identifier to fire when the interaction occurs
    */
  var on_interact: MinecraftTrigger | String
  /**
    * Particle effect that will be triggered at the start of the interaction
    */
  var particle_on_start: Anon_Particleoffsettowardsinteractor
  /**
    * An array of sound identifiers to play when the interaction occurs
    */
  var play_sounds: js.Array[String]
  /**
    * An array of entity identifiers to spawn when the interaction occurs
    */
  var spawn_entities: js.Array[String]
  /**
    * Loot table with items to drop on the ground upon successful interaction
    */
  var spawn_items: Anon_Table
  /**
    * If true, the player will do the 'swing' animation when interacting with this entity
    * @default false
    */
  var swing: Boolean
  /**
    * The item used will transform to this item upon successful interaction. Format: itemName:auxValue
    */
  var transform_to_item: js.UndefOr[String] = js.undefined
  /**
    * If true, the interaction will use an item
    * @default false
    */
  var use_item: Boolean
}

object IInteractComponent {
  @scala.inline
  def apply(
    add_items: Anon_Table,
    cooldown: Double,
    hurt_item: Double,
    interact_text: String,
    on_interact: MinecraftTrigger | String,
    particle_on_start: Anon_Particleoffsettowardsinteractor,
    play_sounds: js.Array[String],
    spawn_entities: js.Array[String],
    spawn_items: Anon_Table,
    swing: Boolean,
    use_item: Boolean,
    transform_to_item: String = null
  ): IInteractComponent = {
    val __obj = js.Dynamic.literal(add_items = add_items.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], hurt_item = hurt_item.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_interact = on_interact.asInstanceOf[js.Any], particle_on_start = particle_on_start.asInstanceOf[js.Any], play_sounds = play_sounds.asInstanceOf[js.Any], spawn_entities = spawn_entities.asInstanceOf[js.Any], spawn_items = spawn_items.asInstanceOf[js.Any], swing = swing.asInstanceOf[js.Any], use_item = use_item.asInstanceOf[js.Any])
    if (transform_to_item != null) __obj.updateDynamic("transform_to_item")(transform_to_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractComponent]
  }
}

