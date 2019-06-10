package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVanillaClientSystemBase extends js.Object {
  ///////////////////////////
  // broadcastEvent overloads
  /**
    * This event is used to display a chat message to the specific player that is running the client script. The event data is the message to be displayed in plain text. Special formatting is supported the same way it would be if a player was sending the message.
    */
  /**
    * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
    */
  /**
    * This event is used to turn various levels of logging on and off for client scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL client scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  /**
    * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
    * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
    */
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  /**
    * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
    */
  /**
    * This event is used to remove a UI screen from the stack of the specific player running the client script. The event data contains the name of the screen to remove as a string. After the event is triggered the screen will be scheduled to be removed from the stack the next time the UI Engine can do so. Only screens defined in a HTML file can be removed using this event.
    */
  def broadcastEvent(
    eventIdentifier: SendToMinecraftClient,
    eventData: minecraftDashScriptingDashTypesDashSharedLib.IEventData[
      IDisplayChatParameters | ILoadUIParameters | IScriptLoggerConfigParameters | ISendUIEventParameters | ISpawnParticleAttachedEntityParameters | ISpawnParticleInWorldParameters | IUnloadUIParameters
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
  def createComponent(entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: MinecraftComponent): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IMoLangComponent] | scala.Null = js.native
  /**
    * Creates a component of the specified name and adds it to the entity. This should only be used with custom components which need 
    * to be registered first. If the entity already has the component, this will retrieve the component already there instead.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentName The name of the component to add to the entity. This is either the name of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    * @returns An object with all the fields as defined in the component
    */
  def createComponent[TComponent](entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  ///////////////////////////
  // createEventData overloads
  /**
    * This event is used to display a chat message to the specific player that is running the client script. The event data is the message to be displayed in plain text. Special formatting is supported the same way it would be if a player was sending the message.
    */
  /**
    * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
    */
  /**
    * This event is used to turn various levels of logging on and off for client scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL client scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  /**
    * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
    * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
    */
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  /**
    * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
    */
  /**
    * This event is used to remove a UI screen from the stack of the specific player running the client script. The event data contains the name of the screen to remove as a string. After the event is triggered the screen will be scheduled to be removed from the stack the next time the UI Engine can do so. Only screens defined in a HTML file can be removed using this event.
    */
  def createEventData(eventIdentifier: SendToMinecraftClient): minecraftDashScriptingDashTypesDashSharedLib.IEventData[IDisplayChatParameters] | scala.Null = js.native
  /**
    * Creates an object with all the required fields and default data for the specified event. If the event is a custom event, it needs to have been previously registered.
    * 
    * @param eventIdentifier This is the identifier of the custom event we are registering. The namespace is required and can't be set to minecraft. 
    */
  def createEventData[TEventDataType](eventIdentifier: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IEventData[TEventDataType] | scala.Null = js.native
  def getComponent(entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity, componentName: MinecraftComponent): minecraftDashScriptingDashTypesDashSharedLib.IComponent[IMoLangComponent] | scala.Null = js.native
  /**
    * Looks for the specified component in the entity. If it exists, retrieves the data from the component and returns it.
    * @param entity The EntityObject that was retrieved from a call to createEntity() or retrieved from an event
    * @param componentIdentifier The name of the component to retrieve from the entity. This is either the name of a built-in component (check the Script Components section) or a custom component created with a call to registerComponent()
    * @returns An object containing the data of the component as described in the component itself, or null if the entity did not have the component or something went wrong when getting the component
    */
  def getComponent[TComponent](
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    componentIdentifier: java.lang.String
  ): minecraftDashScriptingDashTypesDashSharedLib.IComponent[TComponent] | scala.Null = js.native
  ///////////////////////////
  // listenForEvent overloads
  /**
    * This event is fired whenever a player joins the world. The event data contains the player entity object.
    */
  /**
    * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  /**
    * This event is triggered every update and tells you what entity the reticle is pointing to in the world up to 1000 blocks away.
    */
  /**
    * This event is triggered whenever the mouse pointer changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
    */
  /**
    * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
    */
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  def listenForEvent(
    eventIdentifier: ReceiveFromMinecraftClient,
    callback: js.Function1[
      /* eventData */ minecraftDashScriptingDashTypesDashSharedLib.IEventData[
        IClientEnteredWorldEventData | IHitResultChangedEventData | IHitResultContinuousEventData | IPickHitResultChangedEventData | IPickHitResultContinuousEventData | java.lang.String
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
  def registerEventData[TEventDataType](eventIdentifier: java.lang.String, eventData: TEventDataType): minecraftDashScriptingDashTypesDashClientLib.minecraftDashScriptingDashTypesDashClientLibNumbers.`true` | scala.Null = js.native
  /**
    * Allows you to register a query. A query will contain all entities that meet the filter requirement.
    * No filters are added by default when you register a query so it will capture all entities.
    */
  //Ideally this would be in system.d.ts, but it seems to conflict with the parameterized version
  def registerQuery(): minecraftDashScriptingDashTypesDashSharedLib.IQuery | scala.Null = js.native
  def registerQuery(component: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  def registerQuery(component: java.lang.String, componentField1: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  def registerQuery(component: java.lang.String, componentField1: java.lang.String, componentField2: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  def registerQuery(
    component: java.lang.String,
    componentField1: java.lang.String,
    componentField2: java.lang.String,
    componentField3: java.lang.String
  ): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  /**
    * Allows you to register a query that will only show entities that have the given component and define which fields of that component will be used as a filter when getting the entities from the query.
    * 
    * This is the identifier of the component that will be used to filter entities when
    * @param componentField1 This is the name of the first field of the component that we want to filter entities by. By default this is set to x. If the component you used doesn't have the field you defined here, the field will be ignored
    * @param componentField2 This is the name of the second field of the component that we want to filter entities by. By default this is set to y. If the component you used doesn't have the field you defined here, the field will be ignored
    * @param componentField3 This is the name of the third field of the component that we want to filter entities by. By default this is set to z. If the component you used doesn't have the field you defined here, the field will be ignored
    */
  def registerQuery(component: MinecraftComponent): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  def registerQuery(component: MinecraftComponent, componentField1: java.lang.String): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  def registerQuery(
    component: MinecraftComponent,
    componentField1: java.lang.String,
    componentField2: java.lang.String
  ): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
  def registerQuery(
    component: MinecraftComponent,
    componentField1: java.lang.String,
    componentField2: java.lang.String,
    componentField3: java.lang.String
  ): minecraftDashScriptingDashTypesDashSharedLib.IQuery = js.native
}

