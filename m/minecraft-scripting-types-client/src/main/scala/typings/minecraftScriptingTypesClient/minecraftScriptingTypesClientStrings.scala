package typings.minecraftScriptingTypesClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minecraftScriptingTypesClientStrings {
  
  @scala.inline
  def minecraftColonclient_entered_world: minecraftColonclient_entered_world = "minecraft:client_entered_world".asInstanceOf[minecraftColonclient_entered_world]
  
  @scala.inline
  def minecraftColondisplay_chat_event: minecraftColondisplay_chat_event = "minecraft:display_chat_event".asInstanceOf[minecraftColondisplay_chat_event]
  
  @scala.inline
  def minecraftColonhit_result_changed: minecraftColonhit_result_changed = "minecraft:hit_result_changed".asInstanceOf[minecraftColonhit_result_changed]
  
  @scala.inline
  def minecraftColonhit_result_continuous: minecraftColonhit_result_continuous = "minecraft:hit_result_continuous".asInstanceOf[minecraftColonhit_result_continuous]
  
  @scala.inline
  def minecraftColonload_ui: minecraftColonload_ui = "minecraft:load_ui".asInstanceOf[minecraftColonload_ui]
  
  @scala.inline
  def minecraftColonmolang: minecraftColonmolang = "minecraft:molang".asInstanceOf[minecraftColonmolang]
  
  @scala.inline
  def minecraftColonpick_hit_result_changed: minecraftColonpick_hit_result_changed = "minecraft:pick_hit_result_changed".asInstanceOf[minecraftColonpick_hit_result_changed]
  
  @scala.inline
  def minecraftColonpick_hit_result_continuous: minecraftColonpick_hit_result_continuous = "minecraft:pick_hit_result_continuous".asInstanceOf[minecraftColonpick_hit_result_continuous]
  
  @scala.inline
  def minecraftColonscript_logger_config: minecraftColonscript_logger_config = "minecraft:script_logger_config".asInstanceOf[minecraftColonscript_logger_config]
  
  @scala.inline
  def minecraftColonsend_ui_event: minecraftColonsend_ui_event = "minecraft:send_ui_event".asInstanceOf[minecraftColonsend_ui_event]
  
  @scala.inline
  def minecraftColonspawn_particle_attached_entity: minecraftColonspawn_particle_attached_entity = "minecraft:spawn_particle_attached_entity".asInstanceOf[minecraftColonspawn_particle_attached_entity]
  
  @scala.inline
  def minecraftColonspawn_particle_in_world: minecraftColonspawn_particle_in_world = "minecraft:spawn_particle_in_world".asInstanceOf[minecraftColonspawn_particle_in_world]
  
  @scala.inline
  def minecraftColonui_event: minecraftColonui_event = "minecraft:ui_event".asInstanceOf[minecraftColonui_event]
  
  @scala.inline
  def minecraftColonunload_ui: minecraftColonunload_ui = "minecraft:unload_ui".asInstanceOf[minecraftColonunload_ui]
  
  @js.native
  sealed trait minecraftColonclient_entered_world extends ReceiveFromMinecraftClient
  
  @js.native
  sealed trait minecraftColondisplay_chat_event extends SendToMinecraftClient
  
  @js.native
  sealed trait minecraftColonhit_result_changed extends ReceiveFromMinecraftClient
  
  @js.native
  sealed trait minecraftColonhit_result_continuous extends ReceiveFromMinecraftClient
  
  @js.native
  sealed trait minecraftColonload_ui extends SendToMinecraftClient
  
  @js.native
  sealed trait minecraftColonmolang extends js.Object
  
  @js.native
  sealed trait minecraftColonpick_hit_result_changed extends ReceiveFromMinecraftClient
  
  @js.native
  sealed trait minecraftColonpick_hit_result_continuous extends ReceiveFromMinecraftClient
  
  @js.native
  sealed trait minecraftColonscript_logger_config extends SendToMinecraftClient
  
  @js.native
  sealed trait minecraftColonsend_ui_event extends SendToMinecraftClient
  
  @js.native
  sealed trait minecraftColonspawn_particle_attached_entity extends SendToMinecraftClient
  
  @js.native
  sealed trait minecraftColonspawn_particle_in_world extends SendToMinecraftClient
  
  @js.native
  sealed trait minecraftColonui_event extends ReceiveFromMinecraftClient
  
  @js.native
  sealed trait minecraftColonunload_ui extends SendToMinecraftClient
}
