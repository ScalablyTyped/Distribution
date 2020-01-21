package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColondisplay_chat_event
import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonload_ui
import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonscript_logger_config
import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonsend_ui_event
import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_attached_entity
import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_in_world
import typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonunload_ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColondisplay_chat_event
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonload_ui
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonscript_logger_config
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonsend_ui_event
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_attached_entity
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_in_world
  - typings.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonunload_ui
*/
trait SendToMinecraftClient extends js.Object

object SendToMinecraftClient {
  /**
    * This event is used to display a chat message to the specific player that is running the client script. The event data is the message to be displayed in plain text. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @scala.inline
  def DisplayChat: minecraftColondisplay_chat_event = this.cast("minecraft:display_chat_event")
  /**
    * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
    */
  @scala.inline
  def LoadUI: minecraftColonload_ui = this.cast("minecraft:load_ui")
  /**
    * This event is used to turn various levels of logging on and off for client scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL client scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @scala.inline
  def ScriptLoggerConfig: minecraftColonscript_logger_config = this.cast("minecraft:script_logger_config")
  /**
    * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
    * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
    */
  @scala.inline
  def SendUIEvent: minecraftColonsend_ui_event = this.cast("minecraft:send_ui_event")
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @scala.inline
  def SpawnParticleAttachedEntity: minecraftColonspawn_particle_attached_entity = this.cast("minecraft:spawn_particle_attached_entity")
  /**
    * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
    */
  @scala.inline
  def SpawnParticleInWorld: minecraftColonspawn_particle_in_world = this.cast("minecraft:spawn_particle_in_world")
  /**
    * This event is used to remove a UI screen from the stack of the specific player running the client script. The event data contains the name of the screen to remove as a string. After the event is triggered the screen will be scheduled to be removed from the stack the next time the UI Engine can do so. Only screens defined in a HTML file can be removed using this event.
    */
  @scala.inline
  def UnloadUI: minecraftColonunload_ui = this.cast("minecraft:unload_ui")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

