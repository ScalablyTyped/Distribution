package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object minecraftScriptingTypesServerStrings {
  @js.native
  sealed trait minecraftColonarmor_container extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonattack extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonblock_destruction_started extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonblock_destruction_stopped extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonblock_interacted_with extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColoncollision_box extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColondamage_sensor extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColondisplay_chat_event extends SendToMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_acquired_item extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_carried_item_changed extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_created extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_death extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_dropped_item extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_equipped_armor extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_start_riding extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_stop_riding extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_tick extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonentity_use_item extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonequipment extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonequippable extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonexecute_command extends SendToMinecraftServer
  
  @js.native
  sealed trait minecraftColonexplode extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonhand_container extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonhealable extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonhealth extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonhotbar_container extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColoninteract extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColoninventory extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColoninventory_container extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonlookat extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonnameable extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonpiston_moved_block extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonplay_sound
    extends ReceiveFromMinecraftServer
       with SendToMinecraftServer
  
  @js.native
  sealed trait minecraftColonplayer_attacked_entity extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonplayer_destroyed_block extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonplayer_placed_block extends ReceiveFromMinecraftServer
  
  @js.native
  sealed trait minecraftColonposition extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonrotation extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonscript_logger_config extends SendToMinecraftServer
  
  @js.native
  sealed trait minecraftColonshooter extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonspawn_entity extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonspawn_particle_attached_entity extends SendToMinecraftServer
  
  @js.native
  sealed trait minecraftColonspawn_particle_in_world extends SendToMinecraftServer
  
  @js.native
  sealed trait minecraftColonteleport extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColontick_world extends MinecraftComponent
  
  @js.native
  sealed trait minecraftColonweather_changed extends ReceiveFromMinecraftServer
  
  @scala.inline
  def minecraftColonarmor_container: minecraftColonarmor_container = "minecraft:armor_container".asInstanceOf[minecraftColonarmor_container]
  @scala.inline
  def minecraftColonattack: minecraftColonattack = "minecraft:attack".asInstanceOf[minecraftColonattack]
  @scala.inline
  def minecraftColonblock_destruction_started: minecraftColonblock_destruction_started = "minecraft:block_destruction_started".asInstanceOf[minecraftColonblock_destruction_started]
  @scala.inline
  def minecraftColonblock_destruction_stopped: minecraftColonblock_destruction_stopped = "minecraft:block_destruction_stopped".asInstanceOf[minecraftColonblock_destruction_stopped]
  @scala.inline
  def minecraftColonblock_interacted_with: minecraftColonblock_interacted_with = "minecraft:block_interacted_with".asInstanceOf[minecraftColonblock_interacted_with]
  @scala.inline
  def minecraftColoncollision_box: minecraftColoncollision_box = "minecraft:collision_box".asInstanceOf[minecraftColoncollision_box]
  @scala.inline
  def minecraftColondamage_sensor: minecraftColondamage_sensor = "minecraft:damage_sensor".asInstanceOf[minecraftColondamage_sensor]
  @scala.inline
  def minecraftColondisplay_chat_event: minecraftColondisplay_chat_event = "minecraft:display_chat_event".asInstanceOf[minecraftColondisplay_chat_event]
  @scala.inline
  def minecraftColonentity_acquired_item: minecraftColonentity_acquired_item = "minecraft:entity_acquired_item".asInstanceOf[minecraftColonentity_acquired_item]
  @scala.inline
  def minecraftColonentity_carried_item_changed: minecraftColonentity_carried_item_changed = "minecraft:entity_carried_item_changed".asInstanceOf[minecraftColonentity_carried_item_changed]
  @scala.inline
  def minecraftColonentity_created: minecraftColonentity_created = "minecraft:entity_created".asInstanceOf[minecraftColonentity_created]
  @scala.inline
  def minecraftColonentity_death: minecraftColonentity_death = "minecraft:entity_death".asInstanceOf[minecraftColonentity_death]
  @scala.inline
  def minecraftColonentity_dropped_item: minecraftColonentity_dropped_item = "minecraft:entity_dropped_item".asInstanceOf[minecraftColonentity_dropped_item]
  @scala.inline
  def minecraftColonentity_equipped_armor: minecraftColonentity_equipped_armor = "minecraft:entity_equipped_armor".asInstanceOf[minecraftColonentity_equipped_armor]
  @scala.inline
  def minecraftColonentity_start_riding: minecraftColonentity_start_riding = "minecraft:entity_start_riding".asInstanceOf[minecraftColonentity_start_riding]
  @scala.inline
  def minecraftColonentity_stop_riding: minecraftColonentity_stop_riding = "minecraft:entity_stop_riding".asInstanceOf[minecraftColonentity_stop_riding]
  @scala.inline
  def minecraftColonentity_tick: minecraftColonentity_tick = "minecraft:entity_tick".asInstanceOf[minecraftColonentity_tick]
  @scala.inline
  def minecraftColonentity_use_item: minecraftColonentity_use_item = "minecraft:entity_use_item".asInstanceOf[minecraftColonentity_use_item]
  @scala.inline
  def minecraftColonequipment: minecraftColonequipment = "minecraft:equipment".asInstanceOf[minecraftColonequipment]
  @scala.inline
  def minecraftColonequippable: minecraftColonequippable = "minecraft:equippable".asInstanceOf[minecraftColonequippable]
  @scala.inline
  def minecraftColonexecute_command: minecraftColonexecute_command = "minecraft:execute_command".asInstanceOf[minecraftColonexecute_command]
  @scala.inline
  def minecraftColonexplode: minecraftColonexplode = "minecraft:explode".asInstanceOf[minecraftColonexplode]
  @scala.inline
  def minecraftColonhand_container: minecraftColonhand_container = "minecraft:hand_container".asInstanceOf[minecraftColonhand_container]
  @scala.inline
  def minecraftColonhealable: minecraftColonhealable = "minecraft:healable".asInstanceOf[minecraftColonhealable]
  @scala.inline
  def minecraftColonhealth: minecraftColonhealth = "minecraft:health".asInstanceOf[minecraftColonhealth]
  @scala.inline
  def minecraftColonhotbar_container: minecraftColonhotbar_container = "minecraft:hotbar_container".asInstanceOf[minecraftColonhotbar_container]
  @scala.inline
  def minecraftColoninteract: minecraftColoninteract = "minecraft:interact".asInstanceOf[minecraftColoninteract]
  @scala.inline
  def minecraftColoninventory: minecraftColoninventory = "minecraft:inventory".asInstanceOf[minecraftColoninventory]
  @scala.inline
  def minecraftColoninventory_container: minecraftColoninventory_container = "minecraft:inventory_container".asInstanceOf[minecraftColoninventory_container]
  @scala.inline
  def minecraftColonlookat: minecraftColonlookat = "minecraft:lookat".asInstanceOf[minecraftColonlookat]
  @scala.inline
  def minecraftColonnameable: minecraftColonnameable = "minecraft:nameable".asInstanceOf[minecraftColonnameable]
  @scala.inline
  def minecraftColonpiston_moved_block: minecraftColonpiston_moved_block = "minecraft:piston_moved_block".asInstanceOf[minecraftColonpiston_moved_block]
  @scala.inline
  def minecraftColonplay_sound: minecraftColonplay_sound = "minecraft:play_sound".asInstanceOf[minecraftColonplay_sound]
  @scala.inline
  def minecraftColonplayer_attacked_entity: minecraftColonplayer_attacked_entity = "minecraft:player_attacked_entity".asInstanceOf[minecraftColonplayer_attacked_entity]
  @scala.inline
  def minecraftColonplayer_destroyed_block: minecraftColonplayer_destroyed_block = "minecraft:player_destroyed_block".asInstanceOf[minecraftColonplayer_destroyed_block]
  @scala.inline
  def minecraftColonplayer_placed_block: minecraftColonplayer_placed_block = "minecraft:player_placed_block".asInstanceOf[minecraftColonplayer_placed_block]
  @scala.inline
  def minecraftColonposition: minecraftColonposition = "minecraft:position".asInstanceOf[minecraftColonposition]
  @scala.inline
  def minecraftColonrotation: minecraftColonrotation = "minecraft:rotation".asInstanceOf[minecraftColonrotation]
  @scala.inline
  def minecraftColonscript_logger_config: minecraftColonscript_logger_config = "minecraft:script_logger_config".asInstanceOf[minecraftColonscript_logger_config]
  @scala.inline
  def minecraftColonshooter: minecraftColonshooter = "minecraft:shooter".asInstanceOf[minecraftColonshooter]
  @scala.inline
  def minecraftColonspawn_entity: minecraftColonspawn_entity = "minecraft:spawn_entity".asInstanceOf[minecraftColonspawn_entity]
  @scala.inline
  def minecraftColonspawn_particle_attached_entity: minecraftColonspawn_particle_attached_entity = "minecraft:spawn_particle_attached_entity".asInstanceOf[minecraftColonspawn_particle_attached_entity]
  @scala.inline
  def minecraftColonspawn_particle_in_world: minecraftColonspawn_particle_in_world = "minecraft:spawn_particle_in_world".asInstanceOf[minecraftColonspawn_particle_in_world]
  @scala.inline
  def minecraftColonteleport: minecraftColonteleport = "minecraft:teleport".asInstanceOf[minecraftColonteleport]
  @scala.inline
  def minecraftColontick_world: minecraftColontick_world = "minecraft:tick_world".asInstanceOf[minecraftColontick_world]
  @scala.inline
  def minecraftColonweather_changed: minecraftColonweather_changed = "minecraft:weather_changed".asInstanceOf[minecraftColonweather_changed]
}

