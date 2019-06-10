package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiveFromMinecraftServer extends js.Object

/**
  * (Server-side) Events that can be received from Minecraft
  */
@JSGlobal("ReceiveFromMinecraftServer")
@js.native
object ReceiveFromMinecraftServer extends js.Object {
  /**
    * This event is triggered whenever a player starts to destroy a block.
    */
  @js.native
  sealed trait BlockDestructionStarted
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever a player stops destroying a block.
    */
  @js.native
  sealed trait BlockDestructionStopped
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever a player interacts with a block.
    */
  @js.native
  sealed trait BlockInteractedWith
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity acquires an item.
    */
  @js.native
  sealed trait EntityAcquiredItem
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity changes the item carried in their hand.
    */
  @js.native
  sealed trait EntityCarriedItemChanged
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity is added to the world.
    */
  @js.native
  sealed trait EntityCreated
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
    */
  @js.native
  sealed trait EntityDeath
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity drops an item.
    */
  @js.native
  sealed trait EntityDroppedItem
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity equips an item in their armor slots.
    */
  @js.native
  sealed trait EntityEquippedArmor
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity becomes a rider on another entity.
    */
  @js.native
  sealed trait EntityStartRiding
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity stops riding another entity.
    */
  @js.native
  sealed trait EntityStopRiding
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
    */
  @js.native
  sealed trait EntityTick
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever an entity uses an item.
    */
  @js.native
  sealed trait EntityUseItem
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever a piston moves a block.
    */
  @js.native
  sealed trait PistonMovedBlock
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @js.native
  sealed trait PlaySound
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever a player attacks an entity.
    */
  @js.native
  sealed trait PlayerAttackedEntity
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever a player destroys a block.
    */
  @js.native
  sealed trait PlayerDestroyedBlock
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever a player places a block.
    */
  @js.native
  sealed trait PlayerPlacedBlock
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /**
    * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
    */
  @js.native
  sealed trait WeatherChanged
    extends minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer
  
  /* "minecraft:block_destruction_started" */ val BlockDestructionStarted: BlockDestructionStarted with java.lang.String = js.native
  /* "minecraft:block_destruction_stopped" */ val BlockDestructionStopped: BlockDestructionStopped with java.lang.String = js.native
  /* "minecraft:block_interacted_with" */ val BlockInteractedWith: BlockInteractedWith with java.lang.String = js.native
  /* "minecraft:entity_acquired_item" */ val EntityAcquiredItem: EntityAcquiredItem with java.lang.String = js.native
  /* "minecraft:entity_carried_item_changed" */ val EntityCarriedItemChanged: EntityCarriedItemChanged with java.lang.String = js.native
  /* "minecraft:entity_created" */ val EntityCreated: EntityCreated with java.lang.String = js.native
  /* "minecraft:entity_death" */ val EntityDeath: EntityDeath with java.lang.String = js.native
  /* "minecraft:entity_dropped_item" */ val EntityDroppedItem: EntityDroppedItem with java.lang.String = js.native
  /* "minecraft:entity_equipped_armor" */ val EntityEquippedArmor: EntityEquippedArmor with java.lang.String = js.native
  /* "minecraft:entity_start_riding" */ val EntityStartRiding: EntityStartRiding with java.lang.String = js.native
  /* "minecraft:entity_stop_riding" */ val EntityStopRiding: EntityStopRiding with java.lang.String = js.native
  /* "minecraft:entity_tick" */ val EntityTick: EntityTick with java.lang.String = js.native
  /* "minecraft:entity_use_item" */ val EntityUseItem: EntityUseItem with java.lang.String = js.native
  /* "minecraft:piston_moved_block" */ val PistonMovedBlock: PistonMovedBlock with java.lang.String = js.native
  /* "minecraft:play_sound" */ val PlaySound: PlaySound with java.lang.String = js.native
  /* "minecraft:player_attacked_entity" */ val PlayerAttackedEntity: PlayerAttackedEntity with java.lang.String = js.native
  /* "minecraft:player_destroyed_block" */ val PlayerDestroyedBlock: PlayerDestroyedBlock with java.lang.String = js.native
  /* "minecraft:player_placed_block" */ val PlayerPlacedBlock: PlayerPlacedBlock with java.lang.String = js.native
  /* "minecraft:weather_changed" */ val WeatherChanged: WeatherChanged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashServerLib.ReceiveFromMinecraftServer with java.lang.String
  ] = js.native
}

