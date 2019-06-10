package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVanillaServerSystemBase extends js.Object {
  ///////////////////////////
  // broadcastEvent overloads
  /**
    * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
    */
  /**
    * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
    */
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  /**
    * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  /**
    * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
    */
  def broadcastEvent(
    eventIdentifier: SendToMinecraftServer,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[
      IDisplayChatParameters | IExecuteCommandParameters | IPlaySoundParameters | IScriptLoggerConfigParameters | ISpawnParticleAttachedEntityParameters | ISpawnParticleInWorldParameters
    ]
  ): scala.Boolean | scala.Null = js.native
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
  def createComponent(entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: MinecraftComponent): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IArmorContainerComponent] | scala.Null = js.native
  /**
    * Creates a component of the specified name and adds it to the entity. This should only be used with custom components which need 
    * to be registered first. If the entity already has the component, this will retrieve the component already there instead.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentName The name of the component to add to the entity. This is either the name of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    * @returns An object with all the fields as defined in the component, or null if something went wrong when creating the component
    */
  def createComponent[TComponent](entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  ///////////////////////////
  // createEventData overloads
  /**
    * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
    */
  /**
    * This event is used to execute a slash command on the server with the World Owner permission level. The event data contains the slash command as a string. The slash command will be processed and will run after the event is sent.
    */
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  /**
    * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  /**
    * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
    */
  def createEventData(eventIdentifier: SendToMinecraftServer): minecraftDashScriptingDashTypesDashSharedLib.IEventData[IDisplayChatParameters] | scala.Null = js.native
  /**
    * Creates an object with all the required fields and default data for the specified event. If the event is a custom event, it needs to have been previously registered.
    * 
    * @param eventIdentifier This is the identifier of the custom event we are registering. The namespace is required and can't be set to minecraft. 
    */
  def createEventData[TEventDataType](eventIdentifier: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IEventData[TEventDataType] | scala.Null = js.native
  def getComponent(entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: MinecraftComponent): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IArmorContainerComponent] | scala.Null = js.native
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
  @JSName("getComponent")
  def getComponent_TComponent[TComponent](
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentIdentifier: MinecraftComponent
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  ///////////////////////////
  // listenForEvent overloads
  /**
    * This event is triggered whenever a player starts to destroy a block.
    */
  /**
    * This event is triggered whenever a player stops destroying a block.
    */
  /**
    * This event is triggered whenever a player interacts with a block.
    */
  /**
    * This event is triggered whenever an entity acquires an item.
    */
  /**
    * This event is triggered whenever an entity changes the item carried in their hand.
    */
  /**
    * This event is triggered whenever an entity is added to the world.
    */
  /**
    * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
    */
  /**
    * This event is triggered whenever an entity drops an item.
    */
  /**
    * This event is triggered whenever an entity equips an item in their armor slots.
    */
  /**
    * This event is triggered whenever an entity becomes a rider on another entity.
    */
  /**
    * This event is triggered whenever an entity stops riding another entity.
    */
  /**
    * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
    */
  /**
    * This event is triggered whenever an entity uses an item.
    */
  /**
    * This event is triggered whenever a piston moves a block.
    */
  /**
    * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
    */
  /**
    * This event is triggered whenever a player attacks an entity.
    */
  /**
    * This event is triggered whenever a player destroys a block.
    */
  /**
    * This event is triggered whenever a player places a block.
    */
  /**
    * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
    */
  def listenForEvent(
    eventIdentifier: ReceiveFromMinecraftServer,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[
        IBlockDestructionStartedEventData | IBlockDestructionStoppedEventData | IBlockInteractedWithEventData | IEntityAcquiredItemEventData | IEntityCarriedItemChangedEventData | IEntityCreatedEventData | IEntityDeathEventData | IEntityDroppedItemEventData | IEntityEquippedArmorEventData | IEntityStartRidingEventData | IEntityStopRidingEventData | IEntityTickEventData | IEntityUseItemEventData | IPistonMovedBlockEventData | IPlaySoundEventData | IPlayerAttackedEntityEventData | IPlayerDestroyedBlockEventData | IPlayerPlacedBlockEventData | IWeatherChangedEventData
      ], 
      scala.Unit
    ]
  ): scala.Boolean | scala.Null = js.native
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

