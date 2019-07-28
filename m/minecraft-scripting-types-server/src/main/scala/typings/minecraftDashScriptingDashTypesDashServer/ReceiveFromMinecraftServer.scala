package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:block_destruction_started`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:block_destruction_stopped`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:block_interacted_with`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_acquired_item`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_carried_item_changed`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_created`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_death`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_dropped_item`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_equipped_armor`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_start_riding`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_stop_riding`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_tick`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_use_item`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:piston_moved_block`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:play_sound`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:player_attacked_entity`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:player_destroyed_block`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:player_placed_block`
import typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:weather_changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * (Server-side) Events that can be received from Minecraft
  */
/* Rewritten from type alias, can be one of: 
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:block_destruction_started`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:block_destruction_stopped`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:block_interacted_with`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_acquired_item`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_carried_item_changed`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_created`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_death`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_dropped_item`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_equipped_armor`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_start_riding`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_stop_riding`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_tick`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:entity_use_item`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:piston_moved_block`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:play_sound`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:player_attacked_entity`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:player_destroyed_block`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:player_placed_block`
  - typings.minecraftDashScriptingDashTypesDashServer.minecraftDashScriptingDashTypesDashServerStrings.`minecraft:weather_changed`
*/
trait ReceiveFromMinecraftServer extends js.Object

object ReceiveFromMinecraftServer {
  /**
    * This event is triggered whenever a player starts to destroy a block.
    */
  @scala.inline
  def BlockDestructionStarted: `minecraft:block_destruction_started` = this.cast("minecraft:block_destruction_started")
  /**
    * This event is triggered whenever a player stops destroying a block.
    */
  @scala.inline
  def BlockDestructionStopped: `minecraft:block_destruction_stopped` = this.cast("minecraft:block_destruction_stopped")
  /**
    * This event is triggered whenever a player interacts with a block.
    */
  @scala.inline
  def BlockInteractedWith: `minecraft:block_interacted_with` = this.cast("minecraft:block_interacted_with")
  /**
    * This event is triggered whenever an entity acquires an item.
    */
  @scala.inline
  def EntityAcquiredItem: `minecraft:entity_acquired_item` = this.cast("minecraft:entity_acquired_item")
  /**
    * This event is triggered whenever an entity changes the item carried in their hand.
    */
  @scala.inline
  def EntityCarriedItemChanged: `minecraft:entity_carried_item_changed` = this.cast("minecraft:entity_carried_item_changed")
  /**
    * This event is triggered whenever an entity is added to the world.
    */
  @scala.inline
  def EntityCreated: `minecraft:entity_created` = this.cast("minecraft:entity_created")
  /**
    * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
    */
  @scala.inline
  def EntityDeath: `minecraft:entity_death` = this.cast("minecraft:entity_death")
  /**
    * This event is triggered whenever an entity drops an item.
    */
  @scala.inline
  def EntityDroppedItem: `minecraft:entity_dropped_item` = this.cast("minecraft:entity_dropped_item")
  /**
    * This event is triggered whenever an entity equips an item in their armor slots.
    */
  @scala.inline
  def EntityEquippedArmor: `minecraft:entity_equipped_armor` = this.cast("minecraft:entity_equipped_armor")
  /**
    * This event is triggered whenever an entity becomes a rider on another entity.
    */
  @scala.inline
  def EntityStartRiding: `minecraft:entity_start_riding` = this.cast("minecraft:entity_start_riding")
  /**
    * This event is triggered whenever an entity stops riding another entity.
    */
  @scala.inline
  def EntityStopRiding: `minecraft:entity_stop_riding` = this.cast("minecraft:entity_stop_riding")
  /**
    * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
    */
  @scala.inline
  def EntityTick: `minecraft:entity_tick` = this.cast("minecraft:entity_tick")
  /**
    * This event is triggered whenever an entity uses an item.
    */
  @scala.inline
  def EntityUseItem: `minecraft:entity_use_item` = this.cast("minecraft:entity_use_item")
  /**
    * This event is triggered whenever a piston moves a block.
    */
  @scala.inline
  def PistonMovedBlock: `minecraft:piston_moved_block` = this.cast("minecraft:piston_moved_block")
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @scala.inline
  def PlaySound: `minecraft:play_sound` = this.cast("minecraft:play_sound")
  /**
    * This event is triggered whenever a player attacks an entity.
    */
  @scala.inline
  def PlayerAttackedEntity: `minecraft:player_attacked_entity` = this.cast("minecraft:player_attacked_entity")
  /**
    * This event is triggered whenever a player destroys a block.
    */
  @scala.inline
  def PlayerDestroyedBlock: `minecraft:player_destroyed_block` = this.cast("minecraft:player_destroyed_block")
  /**
    * This event is triggered whenever a player places a block.
    */
  @scala.inline
  def PlayerPlacedBlock: `minecraft:player_placed_block` = this.cast("minecraft:player_placed_block")
  /**
    * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
    */
  @scala.inline
  def WeatherChanged: `minecraft:weather_changed` = this.cast("minecraft:weather_changed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

