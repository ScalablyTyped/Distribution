package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Particleoffsettowardsinteractor
import typings.minecraftScriptingTypesServer.anon.Table
import typings.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the ways the player can interact with the entity to which this component is applied.
  */
@js.native
trait IInteractComponent extends js.Object {
  
  /**
    * Loot table with items to add to the player's inventory upon successful interaction
    */
  var add_items: Table = js.native
  
  /**
    * Time in seconds before this entity can be interacted with again
    * @default 0.0
    */
  var cooldown: Double = js.native
  
  /**
    * The amount of damage the item will take when used to interact with this entity. A value of 0 means the item won't lose durability
    * @default 0
    */
  var hurt_item: Double = js.native
  
  /**
    * Text to show when the player is able to interact in this way with this entity when playing with Touch-screen controls
    */
  var interact_text: String = js.native
  
  /**
    * An event identifier to fire when the interaction occurs
    */
  var on_interact: MinecraftTrigger | String = js.native
  
  /**
    * Particle effect that will be triggered at the start of the interaction
    */
  var particle_on_start: Particleoffsettowardsinteractor = js.native
  
  /**
    * An array of sound identifiers to play when the interaction occurs
    */
  var play_sounds: js.Array[String] = js.native
  
  /**
    * An array of entity identifiers to spawn when the interaction occurs
    */
  var spawn_entities: js.Array[String] = js.native
  
  /**
    * Loot table with items to drop on the ground upon successful interaction
    */
  var spawn_items: Table = js.native
  
  /**
    * If true, the player will do the 'swing' animation when interacting with this entity
    * @default false
    */
  var swing: Boolean = js.native
  
  /**
    * The item used will transform to this item upon successful interaction. Format: itemName:auxValue
    */
  var transform_to_item: js.UndefOr[String] = js.native
  
  /**
    * If true, the interaction will use an item
    * @default false
    */
  var use_item: Boolean = js.native
}
object IInteractComponent {
  
  @scala.inline
  def apply(
    add_items: Table,
    cooldown: Double,
    hurt_item: Double,
    interact_text: String,
    on_interact: MinecraftTrigger | String,
    particle_on_start: Particleoffsettowardsinteractor,
    play_sounds: js.Array[String],
    spawn_entities: js.Array[String],
    spawn_items: Table,
    swing: Boolean,
    use_item: Boolean
  ): IInteractComponent = {
    val __obj = js.Dynamic.literal(add_items = add_items.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], hurt_item = hurt_item.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_interact = on_interact.asInstanceOf[js.Any], particle_on_start = particle_on_start.asInstanceOf[js.Any], play_sounds = play_sounds.asInstanceOf[js.Any], spawn_entities = spawn_entities.asInstanceOf[js.Any], spawn_items = spawn_items.asInstanceOf[js.Any], swing = swing.asInstanceOf[js.Any], use_item = use_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractComponent]
  }
  
  @scala.inline
  implicit class IInteractComponentOps[Self <: IInteractComponent] (val x: Self) extends AnyVal {
    
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
    def setAdd_items(value: Table): Self = this.set("add_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: Double): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHurt_item(value: Double): Self = this.set("hurt_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteract_text(value: String): Self = this.set("interact_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_interact(value: MinecraftTrigger | String): Self = this.set("on_interact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticle_on_start(value: Particleoffsettowardsinteractor): Self = this.set("particle_on_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay_soundsVarargs(value: String*): Self = this.set("play_sounds", js.Array(value :_*))
    
    @scala.inline
    def setPlay_sounds(value: js.Array[String]): Self = this.set("play_sounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpawn_entitiesVarargs(value: String*): Self = this.set("spawn_entities", js.Array(value :_*))
    
    @scala.inline
    def setSpawn_entities(value: js.Array[String]): Self = this.set("spawn_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpawn_items(value: Table): Self = this.set("spawn_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwing(value: Boolean): Self = this.set("swing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_item(value: Boolean): Self = this.set("use_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform_to_item(value: String): Self = this.set("transform_to_item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform_to_item: Self = this.set("transform_to_item", js.undefined)
  }
}
