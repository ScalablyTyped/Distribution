package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SendToMinecraftClient extends js.Object

@JSGlobal("SendToMinecraftClient")
@js.native
object SendToMinecraftClient extends js.Object {
  /**
    * This event is used to display a chat message to the specific player that is running the client script. The event data is the message to be displayed in plain text. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @js.native
  sealed trait DisplayChat
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /**
    * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
    */
  @js.native
  sealed trait LoadUI
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /**
    * This event is used to turn various levels of logging on and off for client scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL client scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @js.native
  sealed trait ScriptLoggerConfig
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /**
    * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
    * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
    */
  @js.native
  sealed trait SendUIEvent
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @js.native
  sealed trait SpawnParticleAttachedEntity
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /**
    * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
    */
  @js.native
  sealed trait SpawnParticleInWorld
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /**
    * This event is used to remove a UI screen from the stack of the specific player running the client script. The event data contains the name of the screen to remove as a string. After the event is triggered the screen will be scheduled to be removed from the stack the next time the UI Engine can do so. Only screens defined in a HTML file can be removed using this event.
    */
  @js.native
  sealed trait UnloadUI
    extends minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient
  
  /* "minecraft:display_chat_event" */ val DisplayChat: DisplayChat with java.lang.String = js.native
  /* "minecraft:load_ui" */ val LoadUI: LoadUI with java.lang.String = js.native
  /* "minecraft:script_logger_config" */ val ScriptLoggerConfig: ScriptLoggerConfig with java.lang.String = js.native
  /* "minecraft:send_ui_event" */ val SendUIEvent: SendUIEvent with java.lang.String = js.native
  /* "minecraft:spawn_particle_attached_entity" */ val SpawnParticleAttachedEntity: SpawnParticleAttachedEntity with java.lang.String = js.native
  /* "minecraft:spawn_particle_in_world" */ val SpawnParticleInWorld: SpawnParticleInWorld with java.lang.String = js.native
  /* "minecraft:unload_ui" */ val UnloadUI: UnloadUI with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashClientLib.SendToMinecraftClient with java.lang.String
  ] = js.native
}

