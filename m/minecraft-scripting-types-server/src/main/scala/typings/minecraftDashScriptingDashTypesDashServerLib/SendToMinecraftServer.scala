package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:display_chat_event`
  - minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:execute_command`
  - minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:play_sound`
  - minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:script_logger_config`
  - minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_attached_entity`
  - minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_in_world`
*/
trait SendToMinecraftServer extends js.Object

object SendToMinecraftServer {
  /**
    * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @scala.inline
  def DisplayChat: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:display_chat_event` = this.cast("minecraft:display_chat_event")
  /**
    * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
    */
  @scala.inline
  def ExecuteCommand: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:execute_command` = this.cast("minecraft:execute_command")
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @scala.inline
  def PlaySound: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:play_sound` = this.cast("minecraft:play_sound")
  /**
    * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @scala.inline
  def ScriptLoggerConfig: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:script_logger_config` = this.cast("minecraft:script_logger_config")
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @scala.inline
  def SpawnParticleAttachedEntity: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_attached_entity` = this.cast("minecraft:spawn_particle_attached_entity")
  /**
    * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
    */
  @scala.inline
  def SpawnParticleInWorld: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_in_world` = this.cast("minecraft:spawn_particle_in_world")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

