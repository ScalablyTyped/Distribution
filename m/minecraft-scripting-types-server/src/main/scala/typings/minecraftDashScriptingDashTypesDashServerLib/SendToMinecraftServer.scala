package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SendToMinecraftServer extends js.Object

@JSGlobal("SendToMinecraftServer")
@js.native
object SendToMinecraftServer extends js.Object {
  /**
    * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @js.native
  sealed trait DisplayChat
    extends minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer
  
  /**
    * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
    */
  @js.native
  sealed trait ExecuteCommand
    extends minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer
  
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @js.native
  sealed trait PlaySound
    extends minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer
  
  /**
    * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @js.native
  sealed trait ScriptLoggerConfig
    extends minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer
  
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @js.native
  sealed trait SpawnParticleAttachedEntity
    extends minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer
  
  /**
    * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
    */
  @js.native
  sealed trait SpawnParticleInWorld
    extends minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer
  
  /* "minecraft:display_chat_event" */ val DisplayChat: DisplayChat with java.lang.String = js.native
  /* "minecraft:execute_command" */ val ExecuteCommand: ExecuteCommand with java.lang.String = js.native
  /* "minecraft:play_sound" */ val PlaySound: PlaySound with java.lang.String = js.native
  /* "minecraft:script_logger_config" */ val ScriptLoggerConfig: ScriptLoggerConfig with java.lang.String = js.native
  /* "minecraft:spawn_particle_attached_entity" */ val SpawnParticleAttachedEntity: SpawnParticleAttachedEntity with java.lang.String = js.native
  /* "minecraft:spawn_particle_in_world" */ val SpawnParticleInWorld: SpawnParticleInWorld with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashServerLib.SendToMinecraftServer with java.lang.String
  ] = js.native
}

