package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVanillaServerSystemBase extends js.Object {
  /**
    * 
    * @param eventIdentifier Allows you to trigger an event with the desired data from script. 
    * Anything that signed up to listen for the event will be notified and the given data delivered to them.
    * @param eventData The data for the event. You can create a new JavaScript Object with the parameters you want to pass in to the listener and the engine will take care of delivering the data to them
    */
  def broadcastEvent[TEventDataType](
    eventIdentifier: java.lang.String,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[TEventDataType]
  ): scala.Boolean | scala.Null = js.native
  ///////////////////////////
  // broadcastEvent overloads
  /**
    * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @JSName("broadcastEvent")
  def broadcastEvent_minecraftdisplaychatevent(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:display_chat_event`,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[IDisplayChatParameters]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
    */
  @JSName("broadcastEvent")
  def broadcastEvent_minecraftexecutecommand(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:execute_command`,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[IExecuteCommandParameters]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @JSName("broadcastEvent")
  def broadcastEvent_minecraftplaysound(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:play_sound`,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPlaySoundParameters]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @JSName("broadcastEvent")
  def broadcastEvent_minecraftscriptloggerconfig(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:script_logger_config`,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[IScriptLoggerConfigParameters]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @JSName("broadcastEvent")
  def broadcastEvent_minecraftspawnparticleattachedentity(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_attached_entity`,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[ISpawnParticleAttachedEntityParameters]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
    */
  @JSName("broadcastEvent")
  def broadcastEvent_minecraftspawnparticleinworld(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_in_world`,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[ISpawnParticleInWorldParameters]
  ): scala.Boolean | scala.Null = js.native
  /**
    * Creates a component of the specified name and adds it to the entity. This should only be used with custom components which need 
    * to be registered first. If the entity already has the component, this will retrieve the component already there instead.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentName The name of the component to add to the entity. This is either the name of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    * @returns An object with all the fields as defined in the component, or null if something went wrong when creating the component
    */
  def createComponent[TComponent](entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftarmorcontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:armor_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IArmorContainerComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftattack(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:attack`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IAttackComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftcollisionbox(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:collision_box`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ICollisionBoxComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftdamagesensor(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:damage_sensor`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IDamageSensorComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftequipment(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:equipment`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IEquipmentComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftequippable(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:equippable`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IEquippableComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftexplode(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:explode`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IExplodeComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecrafthandcontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:hand_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHandContainerComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecrafthealable(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:healable`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHealableComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecrafthealth(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:health`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHealthComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecrafthotbarcontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:hotbar_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHotbarContainerComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftinteract(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:interact`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IInteractComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftinventory(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:inventory`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IInventoryComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftinventorycontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:inventory_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IInventoryContainerComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftlookat(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:lookat`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ILookAtComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftnameable(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:nameable`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[INameableComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftposition(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:position`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IPositionComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftrotation(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:rotation`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IRotationComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftshooter(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:shooter`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IShooterComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftspawnentity(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_entity`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ISpawnEntityComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecraftteleport(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:teleport`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ITeleportComponent] | scala.Null = js.native
  @JSName("createComponent")
  def createComponent_minecrafttickworld(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:tick_world`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ITickWorldComponent] | scala.Null = js.native
  /**
    * Creates an object with all the required fields and default data for the specified event. If the event is a custom event, it needs to have been previously registered.
    * 
    * @param eventIdentifier This is the identifier of the custom event we are registering. The namespace is required and can't be set to minecraft. 
    */
  def createEventData[TEventDataType](eventIdentifier: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IEventData[TEventDataType] | scala.Null = js.native
  ///////////////////////////
  // createEventData overloads
  /**
    * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @JSName("createEventData")
  def createEventData_minecraftdisplaychatevent(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:display_chat_event`
  ): minecraftDashScriptingDashTypesDashSharedLib.IEventData[IDisplayChatParameters] | scala.Null = js.native
  /**
    * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
    */
  @JSName("createEventData")
  def createEventData_minecraftexecutecommand(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:execute_command`
  ): minecraftDashScriptingDashTypesDashSharedLib.IEventData[IExecuteCommandParameters] | scala.Null = js.native
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @JSName("createEventData")
  def createEventData_minecraftplaysound(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:play_sound`
  ): minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPlaySoundParameters] | scala.Null = js.native
  /**
    * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @JSName("createEventData")
  def createEventData_minecraftscriptloggerconfig(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:script_logger_config`
  ): minecraftDashScriptingDashTypesDashSharedLib.IEventData[IScriptLoggerConfigParameters] | scala.Null = js.native
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @JSName("createEventData")
  def createEventData_minecraftspawnparticleattachedentity(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_attached_entity`
  ): minecraftDashScriptingDashTypesDashSharedLib.IEventData[ISpawnParticleAttachedEntityParameters] | scala.Null = js.native
  /**
    * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
    */
  @JSName("createEventData")
  def createEventData_minecraftspawnparticleinworld(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_particle_in_world`
  ): minecraftDashScriptingDashTypesDashSharedLib.IEventData[ISpawnParticleInWorldParameters] | scala.Null = js.native
  def getComponent[TComponent](
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentIdentifier: java.lang.String
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  /**
    * Looks for the specified component in the entity. If it exists, retrieves the data from the component and returns it.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentIdentifier The name of the component to retrieve from the entity. This is either the name of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    * @returns An object containing the data of the component as described in the component itself, or null if the entity did not have the component or something went wrong when getting the component
    */
  def getComponent[TComponent](
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentIdentifier: MinecraftComponent
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftarmorcontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:armor_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IArmorContainerComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftattack(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:attack`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IAttackComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftcollisionbox(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:collision_box`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ICollisionBoxComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftdamagesensor(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:damage_sensor`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IDamageSensorComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftequipment(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:equipment`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IEquipmentComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftequippable(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:equippable`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IEquippableComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftexplode(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:explode`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IExplodeComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecrafthandcontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:hand_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHandContainerComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecrafthealable(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:healable`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHealableComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecrafthealth(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:health`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHealthComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecrafthotbarcontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:hotbar_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IHotbarContainerComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftinteract(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:interact`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IInteractComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftinventory(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:inventory`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IInventoryComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftinventorycontainer(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:inventory_container`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IInventoryContainerComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftlookat(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:lookat`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ILookAtComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftnameable(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:nameable`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[INameableComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftposition(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:position`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IPositionComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftrotation(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:rotation`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IRotationComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftshooter(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:shooter`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IShooterComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftspawnentity(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:spawn_entity`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ISpawnEntityComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecraftteleport(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:teleport`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ITeleportComponent] | scala.Null = js.native
  @JSName("getComponent")
  def getComponent_minecrafttickworld(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentName: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:tick_world`
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[ITickWorldComponent] | scala.Null = js.native
  /**
    * Allows you to register a JavaScript object that gets called whenever the specified event is broadcast. The event can either be a built-in event or an event specified in script.
    * @param eventIdentifier This is the name of the event to which we want to react. Can be the identifier of a built-in event or a custom one from script
    * @param eventData The name of the JavaScript object that will get called whenever the event is broadcast
    */
  def listenForEvent[TEventDataType](
    eventIdentifier: java.lang.String,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[TEventDataType], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  ///////////////////////////
  // listenForEvent overloads
  /**
    * This event is triggered whenever a player starts to destroy a block.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftblockdestructionstarted(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:block_destruction_started`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IBlockDestructionStartedEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever a player stops destroying a block.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftblockdestructionstopped(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:block_destruction_stopped`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IBlockDestructionStoppedEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever a player interacts with a block.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftblockinteractedwith(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:block_interacted_with`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IBlockInteractedWithEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity acquires an item.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentityacquireditem(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_acquired_item`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityAcquiredItemEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity changes the item carried in their hand.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitycarrieditemchanged(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_carried_item_changed`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityCarriedItemChangedEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity is added to the world.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitycreated(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_created`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityCreatedEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitydeath(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_death`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityDeathEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity drops an item.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitydroppeditem(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_dropped_item`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityDroppedItemEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity equips an item in their armor slots.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentityequippedarmor(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_equipped_armor`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityEquippedArmorEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity becomes a rider on another entity.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitystartriding(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_start_riding`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityStartRidingEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity stops riding another entity.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitystopriding(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_stop_riding`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityStopRidingEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentitytick(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_tick`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityTickEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever an entity uses an item.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftentityuseitem(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:entity_use_item`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IEntityUseItemEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever a piston moves a block.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftpistonmovedblock(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:piston_moved_block`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPistonMovedBlockEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever a player attacks an entity.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftplayerattackedentity(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:player_attacked_entity`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPlayerAttackedEntityEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever a player destroys a block.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftplayerdestroyedblock(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:player_destroyed_block`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPlayerDestroyedBlockEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever a player places a block.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftplayerplacedblock(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:player_placed_block`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPlayerPlacedBlockEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftplaysound(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:play_sound`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IPlaySoundEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  /**
    * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
    */
  @JSName("listenForEvent")
  def listenForEvent_minecraftweatherchanged(
    eventIdentifier: minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibStrings.`minecraft:weather_changed`,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[IWeatherChangedEventData], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Generic method for other custom events
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /**
    * Registers the Event to the script engine. This allows you to create Event Data by calling createEventData and have it initialized with the correct default data and fields. Only custom events need to be registered.
    * 
    * @param eventIdentifier This is the identifier of the custom event we are registering. The namespace is required and can't be set to minecraft.
    * @param eventData The JavaScript object with the correct fields and default values for the event
    */
  def registerEventData[TEventDataType](eventIdentifier: java.lang.String, eventData: TEventDataType): minecraftDashScriptingDashTypesDashServerLib.minecraftDashScriptingDashTypesDashServerLibNumbers.`true` | scala.Null = js.native
}

