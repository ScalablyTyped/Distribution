package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object minecraftDashScriptingDashTypesDashServerLibStrings {
  @js.native
  sealed trait `minecraft:armor_container` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:attack` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:block_destruction_started` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:block_destruction_stopped` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:block_interacted_with` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:collision_box` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:damage_sensor` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:display_chat_event` extends SendToMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_acquired_item` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_carried_item_changed` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_created` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_death` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_dropped_item` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_equipped_armor` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_start_riding` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_stop_riding` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_tick` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:entity_use_item` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:equipment` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:equippable` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:execute_command` extends SendToMinecraftServer
  
  @js.native
  sealed trait `minecraft:explode` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:hand_container` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:healable` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:health` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:hotbar_container` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:interact` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:inventory` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:inventory_container` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:lookat` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:nameable` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:piston_moved_block` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:play_sound`
    extends ReceiveFromMinecraftServer
       with SendToMinecraftServer
  
  @js.native
  sealed trait `minecraft:player_attacked_entity` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:player_destroyed_block` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:player_placed_block` extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait `minecraft:position` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:rotation` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:script_logger_config` extends SendToMinecraftServer
  
  @js.native
  sealed trait `minecraft:shooter` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:spawn_entity` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:spawn_particle_attached_entity` extends SendToMinecraftServer
  
  @js.native
  sealed trait `minecraft:spawn_particle_in_world` extends SendToMinecraftServer
  
  @js.native
  sealed trait `minecraft:teleport` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:tick_world` extends MinecraftComponent
  
  @js.native
  sealed trait `minecraft:weather_changed` extends ReceiveFromMinecraftServer
  
  @scala.inline
  def `minecraft:armor_container`: `minecraft:armor_container` = "minecraft:armor_container".asInstanceOf[`minecraft:armor_container`]
  @scala.inline
  def `minecraft:attack`: `minecraft:attack` = "minecraft:attack".asInstanceOf[`minecraft:attack`]
  @scala.inline
  def `minecraft:block_destruction_started`: `minecraft:block_destruction_started` = "minecraft:block_destruction_started".asInstanceOf[`minecraft:block_destruction_started`]
  @scala.inline
  def `minecraft:block_destruction_stopped`: `minecraft:block_destruction_stopped` = "minecraft:block_destruction_stopped".asInstanceOf[`minecraft:block_destruction_stopped`]
  @scala.inline
  def `minecraft:block_interacted_with`: `minecraft:block_interacted_with` = "minecraft:block_interacted_with".asInstanceOf[`minecraft:block_interacted_with`]
  @scala.inline
  def `minecraft:collision_box`: `minecraft:collision_box` = "minecraft:collision_box".asInstanceOf[`minecraft:collision_box`]
  @scala.inline
  def `minecraft:damage_sensor`: `minecraft:damage_sensor` = "minecraft:damage_sensor".asInstanceOf[`minecraft:damage_sensor`]
  @scala.inline
  def `minecraft:display_chat_event`: `minecraft:display_chat_event` = "minecraft:display_chat_event".asInstanceOf[`minecraft:display_chat_event`]
  @scala.inline
  def `minecraft:entity_acquired_item`: `minecraft:entity_acquired_item` = "minecraft:entity_acquired_item".asInstanceOf[`minecraft:entity_acquired_item`]
  @scala.inline
  def `minecraft:entity_carried_item_changed`: `minecraft:entity_carried_item_changed` = "minecraft:entity_carried_item_changed".asInstanceOf[`minecraft:entity_carried_item_changed`]
  @scala.inline
  def `minecraft:entity_created`: `minecraft:entity_created` = "minecraft:entity_created".asInstanceOf[`minecraft:entity_created`]
  @scala.inline
  def `minecraft:entity_death`: `minecraft:entity_death` = "minecraft:entity_death".asInstanceOf[`minecraft:entity_death`]
  @scala.inline
  def `minecraft:entity_dropped_item`: `minecraft:entity_dropped_item` = "minecraft:entity_dropped_item".asInstanceOf[`minecraft:entity_dropped_item`]
  @scala.inline
  def `minecraft:entity_equipped_armor`: `minecraft:entity_equipped_armor` = "minecraft:entity_equipped_armor".asInstanceOf[`minecraft:entity_equipped_armor`]
  @scala.inline
  def `minecraft:entity_start_riding`: `minecraft:entity_start_riding` = "minecraft:entity_start_riding".asInstanceOf[`minecraft:entity_start_riding`]
  @scala.inline
  def `minecraft:entity_stop_riding`: `minecraft:entity_stop_riding` = "minecraft:entity_stop_riding".asInstanceOf[`minecraft:entity_stop_riding`]
  @scala.inline
  def `minecraft:entity_tick`: `minecraft:entity_tick` = "minecraft:entity_tick".asInstanceOf[`minecraft:entity_tick`]
  @scala.inline
  def `minecraft:entity_use_item`: `minecraft:entity_use_item` = "minecraft:entity_use_item".asInstanceOf[`minecraft:entity_use_item`]
  @scala.inline
  def `minecraft:equipment`: `minecraft:equipment` = "minecraft:equipment".asInstanceOf[`minecraft:equipment`]
  @scala.inline
  def `minecraft:equippable`: `minecraft:equippable` = "minecraft:equippable".asInstanceOf[`minecraft:equippable`]
  @scala.inline
  def `minecraft:execute_command`: `minecraft:execute_command` = "minecraft:execute_command".asInstanceOf[`minecraft:execute_command`]
  @scala.inline
  def `minecraft:explode`: `minecraft:explode` = "minecraft:explode".asInstanceOf[`minecraft:explode`]
  @scala.inline
  def `minecraft:hand_container`: `minecraft:hand_container` = "minecraft:hand_container".asInstanceOf[`minecraft:hand_container`]
  @scala.inline
  def `minecraft:healable`: `minecraft:healable` = "minecraft:healable".asInstanceOf[`minecraft:healable`]
  @scala.inline
  def `minecraft:health`: `minecraft:health` = "minecraft:health".asInstanceOf[`minecraft:health`]
  @scala.inline
  def `minecraft:hotbar_container`: `minecraft:hotbar_container` = "minecraft:hotbar_container".asInstanceOf[`minecraft:hotbar_container`]
  @scala.inline
  def `minecraft:interact`: `minecraft:interact` = "minecraft:interact".asInstanceOf[`minecraft:interact`]
  @scala.inline
  def `minecraft:inventory`: `minecraft:inventory` = "minecraft:inventory".asInstanceOf[`minecraft:inventory`]
  @scala.inline
  def `minecraft:inventory_container`: `minecraft:inventory_container` = "minecraft:inventory_container".asInstanceOf[`minecraft:inventory_container`]
  @scala.inline
  def `minecraft:lookat`: `minecraft:lookat` = "minecraft:lookat".asInstanceOf[`minecraft:lookat`]
  @scala.inline
  def `minecraft:nameable`: `minecraft:nameable` = "minecraft:nameable".asInstanceOf[`minecraft:nameable`]
  @scala.inline
  def `minecraft:piston_moved_block`: `minecraft:piston_moved_block` = "minecraft:piston_moved_block".asInstanceOf[`minecraft:piston_moved_block`]
  @scala.inline
  def `minecraft:play_sound`: `minecraft:play_sound` = "minecraft:play_sound".asInstanceOf[`minecraft:play_sound`]
  @scala.inline
  def `minecraft:player_attacked_entity`: `minecraft:player_attacked_entity` = "minecraft:player_attacked_entity".asInstanceOf[`minecraft:player_attacked_entity`]
  @scala.inline
  def `minecraft:player_destroyed_block`: `minecraft:player_destroyed_block` = "minecraft:player_destroyed_block".asInstanceOf[`minecraft:player_destroyed_block`]
  @scala.inline
  def `minecraft:player_placed_block`: `minecraft:player_placed_block` = "minecraft:player_placed_block".asInstanceOf[`minecraft:player_placed_block`]
  @scala.inline
  def `minecraft:position`: `minecraft:position` = "minecraft:position".asInstanceOf[`minecraft:position`]
  @scala.inline
  def `minecraft:rotation`: `minecraft:rotation` = "minecraft:rotation".asInstanceOf[`minecraft:rotation`]
  @scala.inline
  def `minecraft:script_logger_config`: `minecraft:script_logger_config` = "minecraft:script_logger_config".asInstanceOf[`minecraft:script_logger_config`]
  @scala.inline
  def `minecraft:shooter`: `minecraft:shooter` = "minecraft:shooter".asInstanceOf[`minecraft:shooter`]
  @scala.inline
  def `minecraft:spawn_entity`: `minecraft:spawn_entity` = "minecraft:spawn_entity".asInstanceOf[`minecraft:spawn_entity`]
  @scala.inline
  def `minecraft:spawn_particle_attached_entity`: `minecraft:spawn_particle_attached_entity` = "minecraft:spawn_particle_attached_entity".asInstanceOf[`minecraft:spawn_particle_attached_entity`]
  @scala.inline
  def `minecraft:spawn_particle_in_world`: `minecraft:spawn_particle_in_world` = "minecraft:spawn_particle_in_world".asInstanceOf[`minecraft:spawn_particle_in_world`]
  @scala.inline
  def `minecraft:teleport`: `minecraft:teleport` = "minecraft:teleport".asInstanceOf[`minecraft:teleport`]
  @scala.inline
  def `minecraft:tick_world`: `minecraft:tick_world` = "minecraft:tick_world".asInstanceOf[`minecraft:tick_world`]
  @scala.inline
  def `minecraft:weather_changed`: `minecraft:weather_changed` = "minecraft:weather_changed".asInstanceOf[`minecraft:weather_changed`]
}

