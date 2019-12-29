package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonblock_destruction_started
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonblock_destruction_stopped
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonblock_interacted_with
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_acquired_item
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_carried_item_changed
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_created
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_death
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_dropped_item
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_equipped_armor
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_start_riding
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_stop_riding
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_tick
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_use_item
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonpiston_moved_block
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplay_sound
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplayer_attacked_entity
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplayer_destroyed_block
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplayer_placed_block
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonweather_changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * (Server-side) Events that can be received from Minecraft
  */
/* Rewritten from type alias, can be one of: 
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonblock_destruction_started
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonblock_destruction_stopped
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonblock_interacted_with
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_acquired_item
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_carried_item_changed
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_created
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_death
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_dropped_item
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_equipped_armor
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_start_riding
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_stop_riding
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_tick
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonentity_use_item
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonpiston_moved_block
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplay_sound
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplayer_attacked_entity
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplayer_destroyed_block
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonplayer_placed_block
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.minecraftColonweather_changed
*/
trait ReceiveFromMinecraftServer extends js.Object

object ReceiveFromMinecraftServer {
  /**
    * This event is triggered whenever a player starts to destroy a block.
    */
  @scala.inline
  def BlockDestructionStarted: minecraftColonblock_destruction_started = this.cast("minecraft:block_destruction_started")
  /**
    * This event is triggered whenever a player stops destroying a block.
    */
  @scala.inline
  def BlockDestructionStopped: minecraftColonblock_destruction_stopped = this.cast("minecraft:block_destruction_stopped")
  /**
    * This event is triggered whenever a player interacts with a block.
    */
  @scala.inline
  def BlockInteractedWith: minecraftColonblock_interacted_with = this.cast("minecraft:block_interacted_with")
  /**
    * This event is triggered whenever an entity acquires an item.
    */
  @scala.inline
  def EntityAcquiredItem: minecraftColonentity_acquired_item = this.cast("minecraft:entity_acquired_item")
  /**
    * This event is triggered whenever an entity changes the item carried in their hand.
    */
  @scala.inline
  def EntityCarriedItemChanged: minecraftColonentity_carried_item_changed = this.cast("minecraft:entity_carried_item_changed")
  /**
    * This event is triggered whenever an entity is added to the world.
    */
  @scala.inline
  def EntityCreated: minecraftColonentity_created = this.cast("minecraft:entity_created")
  /**
    * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
    */
  @scala.inline
  def EntityDeath: minecraftColonentity_death = this.cast("minecraft:entity_death")
  /**
    * This event is triggered whenever an entity drops an item.
    */
  @scala.inline
  def EntityDroppedItem: minecraftColonentity_dropped_item = this.cast("minecraft:entity_dropped_item")
  /**
    * This event is triggered whenever an entity equips an item in their armor slots.
    */
  @scala.inline
  def EntityEquippedArmor: minecraftColonentity_equipped_armor = this.cast("minecraft:entity_equipped_armor")
  /**
    * This event is triggered whenever an entity becomes a rider on another entity.
    */
  @scala.inline
  def EntityStartRiding: minecraftColonentity_start_riding = this.cast("minecraft:entity_start_riding")
  /**
    * This event is triggered whenever an entity stops riding another entity.
    */
  @scala.inline
  def EntityStopRiding: minecraftColonentity_stop_riding = this.cast("minecraft:entity_stop_riding")
  /**
    * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
    */
  @scala.inline
  def EntityTick: minecraftColonentity_tick = this.cast("minecraft:entity_tick")
  /**
    * This event is triggered whenever an entity uses an item.
    */
  @scala.inline
  def EntityUseItem: minecraftColonentity_use_item = this.cast("minecraft:entity_use_item")
  /**
    * This event is triggered whenever a piston moves a block.
    */
  @scala.inline
  def PistonMovedBlock: minecraftColonpiston_moved_block = this.cast("minecraft:piston_moved_block")
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @scala.inline
  def PlaySound: minecraftColonplay_sound = this.cast("minecraft:play_sound")
  /**
    * This event is triggered whenever a player attacks an entity.
    */
  @scala.inline
  def PlayerAttackedEntity: minecraftColonplayer_attacked_entity = this.cast("minecraft:player_attacked_entity")
  /**
    * This event is triggered whenever a player destroys a block.
    */
  @scala.inline
  def PlayerDestroyedBlock: minecraftColonplayer_destroyed_block = this.cast("minecraft:player_destroyed_block")
  /**
    * This event is triggered whenever a player places a block.
    */
  @scala.inline
  def PlayerPlacedBlock: minecraftColonplayer_placed_block = this.cast("minecraft:player_placed_block")
  /**
    * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
    */
  @scala.inline
  def WeatherChanged: minecraftColonweather_changed = this.cast("minecraft:weather_changed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

