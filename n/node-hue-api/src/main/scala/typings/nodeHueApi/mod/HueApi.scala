package typings.nodeHueApi.mod

import typings.node.NodeJS.ErrnoException
import typings.nodeHueApi.mod.lightState.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-hue-api", "HueApi")
@js.native
/*
  * Constructor used for searching for bridges and registering users
  */
open class HueApi () extends StObject {
  /**
    * Creates an instance of HueApi.
    * @param {string} host Address of Hue bridge
    * @param {string} username Application username for Hue bridge
    * @param {number} [timeout]
    * @param {number} [port]
    */
  def this(host: String, username: String) = this()
  def this(host: String, username: String, timeout: Double) = this()
  def this(host: String, username: String, timeout: Double, port: Double) = this()
  def this(host: String, username: String, timeout: Unit, port: Double) = this()
  
  //modifySceneLightState(sceneId: string | number, lightId: string | number, stateValues: lightState.State | Object, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  /**
    * Helper-function that recalls a scene for a group using setGroupLightState. Reason for existence is simplicity for
    * user.
    *
    * @param sceneId The id of the scene to activate, which is an integer or a value that can be parsed into an integer value.
    * @param groupIdFilter An optional group filter to apply to the scene, to select a sub set of the lights in the scene. This can
    * be {null} or {undefined} to not apply a filter.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will set activate the scene, or {null} if a callback was provided.
    */
  def activateScene(sceneId: String): js.Promise[Boolean] = js.native
  def activateScene(sceneId: String, groupIdFilter: String): js.Promise[Boolean] = js.native
  def activateScene(sceneId: String, groupIdFilter: Double): js.Promise[Boolean] = js.native
  def activateScene(sceneId: Double): js.Promise[Boolean] = js.native
  def activateScene(sceneId: Double, groupIdFilter: String): js.Promise[Boolean] = js.native
  def activateScene(sceneId: Double, groupIdFilter: Double): js.Promise[Boolean] = js.native
  
  //getDescription(cb: (err: NodeJS.ErrnoException, data: IBridgeDescription) => void): void;
  /**
    * Reads the bridge configuration and returns it as a JSON object.
    *
    * @param cb An optional callback function to use if you do not want to use the promise for results.
    * @return {Q.promise} A promise with the result, or <null> if a callback function was provided.
    */
  def config(): js.Promise[IBridgeConfig] = js.native
  
  //createBasicScene(lightIds: string[] | number[], name: string, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  /**
    * Provides scene creation for >= 1.11.x firmware versions of the Hue Bridge.
    * @param scene The Scene object containing the details of the scene to be created.
    * @param cb An optional callback function to use if you do not want to use a promise chain for the results.
    * @return {*} A promise that will return the id of the scene that was created (as well as the values that make up the scene),
    * or null if a callback was provided.
    */
  def createAdvancedScene(scene: IScene): js.Promise[IScene] = js.native
  
  //createScene(scene: IScene, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  //createScene(lightIds: string[] | number[], cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  /**
    * Provides backwards compatibility for < 1.11.x versions of the Hue Bridge Firmware.
    * @param lightIds Lights to include in the scene
    * @param name Name to use for the scene
    * @param cb An optional callback function to use if you do not want to use a promise chain for the results.
    * @return {*} A promise that will return the id of the scene that was created (as well as the values that make up the scene),
    * or null if a callback was provided.
    */
  def createBasicScene(lightIds: js.Array[Double | String], name: String): js.Promise[IScene] = js.native
  
  /**
    * Creates a new light Group.
    *
    * @param name The name of the group that we are creating, limited to 16 characters.
    * @param lightIds {Array} of ids for the lights to be included in the group.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return {*} A promise that will return the id of the group that was created, or null if a callback was provided.
    */
  def createGroup(name: String, lightIds: js.Array[String]): js.Promise[String] = js.native
  
  def createScene(lightIds: js.Array[Double | String], name: String): js.Promise[IScene] = js.native
  //deleteScene(id: string | number, cb: (err: NodeJS.ErrnoException, data: Object) => void): void;
  /**
    * Creates a new Scene.
    * When the scene is created, it will store the current state of the lights and will use those "current" settings
    * when the scene is recalled/activated later.
    *
    * There are two variants to this function, one that accepts lightIds and a name and another that takes a Scene object.
    * The former is to maintain backwards compatibility with the 1.2.x version of this library.
    * 
    * @param scene Scene configuration to create
    * @param lightIds {Array} of ids for the lights to be included in the scene.
    * @param name {String} The name of the scene to be created. If one is not provided, then the id of the scene will become the name.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return {*} A promise that will return the id of the scene that was created (as well as the values that make up the scene),
    * or null if a callback was provided.
    */
  def createScene(scene: IScene): js.Promise[IScene] = js.native
  
  //scheduleEvent(schedule: ISchedule, cb: (err: NodeJS.ErrnoException, data: string) => void): void;
  def createSchedule(schedule: ISchedule): js.Promise[String] = js.native
  
  //registerUser(host: string, deviceDescription?: string, cb: (err: NodeJS.ErrnoException, data: string) => void): void;
  def createUser(host: String): js.Promise[String] = js.native
  def createUser(host: String, deviceDescription: String): js.Promise[String] = js.native
  
  //createGroup(name: string, lightIds: string[], cb: (err: NodeJS.ErrnoException, data: string) => void): void;
  /**
    * Deletes a group with the specified id, returning <true> if the action was successful.
    *
    * @param id The id of the group to delete.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return {*} A promise that will return <true> if the deletion was successful, or null if a callback was provided.
    */
  def deleteGroup(id: String): js.Promise[Boolean] = js.native
  def deleteGroup(id: Double): js.Promise[Boolean] = js.native
  
  //getScene(id: string | number, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  /**
    * Deletes a Scene (that is stored inside the bridge, not in the lights).
    * @param sceneId The ID for the scene to delete
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @returns {*} A promise that will return the result from deleting the scene or null if a callback was provided.
    */
  def deleteScene(id: String): js.Promise[js.Object] = js.native
  def deleteScene(id: Double): js.Promise[js.Object] = js.native
  
  //createSchedule(schedule: ISchedule, cb: (err: NodeJS.ErrnoException, data: string) => void): void;
  /**
    * Deletes a schedule by id, returning {true} if the deletion was successful.
    *
    * @param id of the schedule
    * @param cb An option callback function to use if you do not want to use a promise for the results.
    * @return {Q.promise} A promise that will return the result of the deletion, or <null> if a callback was provided.
    */
  def deleteSchedule(id: String): js.Promise[js.Object] = js.native
  def deleteSchedule(id: Double): js.Promise[js.Object] = js.native
  
  //pressLinkButton(cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Deletes an existing user from the Phillips Hue Bridge.
    *
    * @param username The username of the user to delete.
    * @param cb An optional callback function to use if you do not want to get the result via a promise chain.
    * @returns {Q.promise} A promise with the result of the deletion, or <null> if a callback was provided.
    */
  def deleteUser(username: String): js.Promise[Boolean] = js.native
  
  //version(cb: (err: NodeJS.ErrnoException, data: IBridgeVersion) => void): void;
  /**
    * Loads the description for the Philips Hue.
    *
    * @param cb An optional callback function if you don't want to be informed via a promise.
    * @return {Q.promise} A promise that will be provided with a description object, or {null} if a callback was provided.
    */
  def description(): js.Promise[IBridgeDescription] = js.native
  
  //getFullState(cb: (err: NodeJS.ErrnoException, data: IState) => void): void;
  def fullState(): js.Promise[IState] = js.native
  
  //getGroups(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  def getAllGroups(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //config(cb: (err: NodeJS.ErrnoException, data: IBridgeConfig) => void): void;
  def getConfig(): js.Promise[IBridgeConfig] = js.native
  
  //description(cb: (err: NodeJS.ErrnoException, data: IBridgeDescription) => void): void;
  def getDescription(): js.Promise[IBridgeDescription] = js.native
  
  //getConfig(cb: (err: NodeJS.ErrnoException, data: IBridgeConfig) => void): void;
  /**
    * Obtains the complete state for the Bridge. This is considered to be a very expensive operation and should not be invoked
    * frequently. The results detail all config, users, groups, schedules and lights for the system.
    *
    * @param cb An optional callback function if you don't want to be informed via a promise.
    * @returns {Q.promise} A promise with the result, or {null} if a callback function was provided
    */
  def getFullState(): js.Promise[IState] = js.native
  
  //getLightGroups(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  /**
    * Obtains the details for a specified group in a format of {id: {*}, name: {*}, lights: [], lastAction: {*}}.
    *
    * @param id {Number} or {String} which is the id of the group to get the details for.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will set the specified state on the light, or {null} if a callback was provided.
    */
  def getGroup(id: String): js.Promise[ILightGroup] = js.native
  def getGroup(id: Double): js.Promise[ILightGroup] = js.native
  
  //groups(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  def getGroups(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //lightGroups(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  def getLightGroups(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //lightSources(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  def getLightSources(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //lightStatus(id: string|number, cb: (err: NodeJS.ErrnoException, data: ILight) => void): void;
  def getLightStatus(id: String): js.Promise[ILight] = js.native
  def getLightStatus(id: Double): js.Promise[ILight] = js.native
  
  //lightStatusWithRGB(id: string|number, cb: (err: NodeJS.ErrnoException, data: ILight) => void): void;
  def getLightStatusWithRGB(id: String): js.Promise[ILight] = js.native
  def getLightStatusWithRGB(id: Double): js.Promise[ILight] = js.native
  
  //lights(cb: (err: NodeJS.ErrnoException, data: ILightsApiResponse) => void): void;
  def getLights(): js.Promise[ILightsApiResponse] = js.native
  
  //luminaires(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  def getLuminaires(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //newLights(cb: (err: NodeJS.ErrnoException, data: INewLightsResponse) => void): void;
  def getNewLights(): js.Promise[INewLightsResponse] = js.native
  
  //registeredUsers(cb: (err: NodeJS.ErrnoException, data: IRegisteredUser) => void): void;
  def getRegisteredUsers(): js.Promise[IRegisteredUser] = js.native
  
  //scene(id: string | number, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  def getScene(id: String): js.Promise[IScene] = js.native
  def getScene(id: Double): js.Promise[IScene] = js.native
  
  def getScenes(): js.Promise[js.Array[IScene]] = js.native
  
  //schedule(id: string | number, cb: (err: NodeJS.ErrnoException, data: ISchedule) => void): void;
  def getSchedule(id: String): js.Promise[ISchedule] = js.native
  def getSchedule(id: Double): js.Promise[ISchedule] = js.native
  
  //schedules(cb: (err: NodeJS.ErrnoException, data: ISchedule[]) => void): void;
  def getSchedules(): js.Promise[js.Array[ISchedule]] = js.native
  
  //sensors(cb: (err: NodeJS.ErrnoException, data: ISensorsApiResponse) => void): void;
  def getSensors(): js.Promise[ISensorsApiResponse] = js.native
  
  //recallScene(sceneId: string|number, groupIdFilter: string|number, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Obtains all the allowed timezones from the bridge.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return {*} A promise that will return the id of the scene that was created, or null if a callback was provided.
    */
  def getTimezones(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Gets the version data for the Philips Hue Bridge.
    *
    * @param cb An optional callback function if you don't want to be informed via a promise.
    * @returns {Q.promise} A promise will be provided that will resolve to the version data for the bridge, or {null} if a
    * callback was provided.
    */
  def getVersion(): js.Promise[IBridgeVersion] = js.native
  
  def group(id: String): js.Promise[ILightGroup] = js.native
  def group(id: Double): js.Promise[ILightGroup] = js.native
  
  //setGroupLightState(id: string|number, stateValues: lightState.State | Object, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Obtains all the groups from the Hue Bridge as an Array of {id: {*}, name: {*}} objects.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will obtain the groups, or {null} if a callback was provided.
    */
  def groups(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //getLightSources(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  /**
    * Obtains all the LightGroups from the Hue Bridge as an Array of {id: {*}, name: {*}} objects.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will obtain the LightGroups, or {null} if a callback was provided.
    */
  def lightGroups(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //getLuminaires(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  /**
    * Obtains all the LightSources from the Hue Bridge as an Array of {id: {*}, name: {*}} objects.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will obtain the lightsources, or {null} if a callback was provided.
    */
  def lightSources(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //getLights(cb: (err: NodeJS.ErrnoException, data: ILightsApiResponse) => void): void;
  /**
    * Obtains the status of the specified light.
    *
    * @param id The id of the light as an integer, this value will be parsed into an integer value so can be a {String} or
    * {Number} value.
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return A promise that will be provided with the light status, or {null} if a callback function was provided.
    */
  def lightStatus(id: String): js.Promise[ILight] = js.native
  def lightStatus(id: Double): js.Promise[ILight] = js.native
  
  //getLightStatus(id: string|number, cb: (err: NodeJS.ErrnoException, data: ILight) => void): void;
  def lightStatusWithRGB(id: String): js.Promise[ILight] = js.native
  def lightStatusWithRGB(id: Double): js.Promise[ILight] = js.native
  
  //getSensors(cb: (err: NodeJS.ErrnoException, data: ISensorsApiResponse) => void): void;
  /**
    * Obtains the details of the individual lights that are attached to the Philips Hue.
    *
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return A promise that will be provided with the lights object, or {null} if a callback function was provided.
    */
  def lights(): js.Promise[ILightsApiResponse] = js.native
  
  //getAllGroups(cb: (err: NodeJS.ErrnoException, data: ILightGroup) => void): void;
  /**
    * Obtains all the Luminaires from the Hue Bridge as an Array of {id: {*}, name: {*}} objects.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will obtain the luminaires, or {null} if a callback was provided.
    */
  def luminaires(): js.Promise[js.Array[ILightGroup]] = js.native
  
  //updateScene(sceneId: string | number, scene: IScene, storeLightState: boolean, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  def modifyScene(sceneId: String, scene: IScene, storeLightState: Boolean): js.Promise[IScene] = js.native
  def modifyScene(sceneId: Double, scene: IScene, storeLightState: Boolean): js.Promise[IScene] = js.native
  
  def modifySceneLightState(sceneId: String, lightId: String, stateValues: js.Object): js.Promise[IScene] = js.native
  //updateSceneLightState(sceneId: string | number, lightId: string | number, stateValues: lightState.State | Object, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  def modifySceneLightState(sceneId: String, lightId: String, stateValues: State): js.Promise[IScene] = js.native
  def modifySceneLightState(sceneId: String, lightId: Double, stateValues: js.Object): js.Promise[IScene] = js.native
  def modifySceneLightState(sceneId: String, lightId: Double, stateValues: State): js.Promise[IScene] = js.native
  def modifySceneLightState(sceneId: Double, lightId: String, stateValues: js.Object): js.Promise[IScene] = js.native
  def modifySceneLightState(sceneId: Double, lightId: String, stateValues: State): js.Promise[IScene] = js.native
  def modifySceneLightState(sceneId: Double, lightId: Double, stateValues: js.Object): js.Promise[IScene] = js.native
  def modifySceneLightState(sceneId: Double, lightId: Double, stateValues: State): js.Promise[IScene] = js.native
  
  //getLightStatusWithRGB(id: string|number, cb: (err: NodeJS.ErrnoException, data: ILight) => void): void;
  /**
    * Obtains the new lights found by the bridge, dependant upon the last search.
    *
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return A promise that will be provided with the new lights search result, or {null} if a callback function was provided.
    */
  def newLights(): js.Promise[INewLightsResponse] = js.native
  
  //createUser(host: string, deviceDescription?: string, cb: (err: NodeJS.ErrnoException, data: string) => void): void;
  /**
    * Presses the Link Button on the Bridge (without the user actually having to do it). If successful then {true} will be
    * returned as the result.
    *
    * @param cb An optional callback function to use if you do not want to use the promise returned.
    * @return {Q.promise} A promise with the result, or <null> if a callback was provided.
    */
  def pressLinkButton(): js.Promise[Boolean] = js.native
  
  //activateScene(sceneId: string|number, groupIdFilter: string|number, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  def recallScene(sceneId: String): js.Promise[Boolean] = js.native
  def recallScene(sceneId: String, groupIdFilter: String): js.Promise[Boolean] = js.native
  def recallScene(sceneId: String, groupIdFilter: Double): js.Promise[Boolean] = js.native
  def recallScene(sceneId: Double): js.Promise[Boolean] = js.native
  def recallScene(sceneId: Double, groupIdFilter: String): js.Promise[Boolean] = js.native
  def recallScene(sceneId: Double, groupIdFilter: Double): js.Promise[Boolean] = js.native
  
  //fullState(cb: (err: NodeJS.ErrnoException, data: IState) => void): void;
  /**
    * Allows a new user/device to be registered with the Philips Hue Bridge. This will return the name of the user that was
    * created by the function call.
    *
    * This function does not require the HueApi to have been initialized with a host or username. It does however require
    * the end user to have pressed the link button on the bridge, before invoking this function.
    *
    * @param host The hostname or IP Address of the Hue Bridge.
    * @param deviceDescription The description for the user/device that is being registered. This is a human readable
    * description of the user/device. If one is not provided then a default will be set.
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return {Q.promise} A promise with the result, or <null> if a callback was provided.
    */
  def registerUser(host: String): js.Promise[String] = js.native
  def registerUser(host: String, deviceDescription: String): js.Promise[String] = js.native
  
  //unregisterUser(username: string, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void
  /**
    * Obtain a list of registered "users" or "devices" that can interact with the Philips Hue.
    *
    * @param cb An optional callback function if you do not want to use the promise to obtain the results.
    * @return A promise that will provide the results of registered users, or <null> if a callback was provided.
    */
  def registeredUsers(): js.Promise[IRegisteredUser] = js.native
  
  /**
    * Obtains a scene by a given id.
    * @param sceneId {String} The id of the scene to obtain.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will return the scene or <null> if a callback was provided.
    */
  def scene(id: String): js.Promise[IScene] = js.native
  def scene(id: Double): js.Promise[IScene] = js.native
  
  //updateSchedule(id: string | number, schedule: ISchedule, cb: (err: NodeJS.ErrnoException, data: ISchedule) => void): void;
  /**
    * Gets the scenes on the Bridge, as an array of {"id": {String}, "name": {String}, "lights": {Array}, "active": {Boolean}}
    * objects.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will return the results or <null> if a callback was provided.
    */
  def scenes(): js.Promise[js.Array[IScene]] = js.native
  
  //getSchedules(cb: (err: NodeJS.ErrnoException, data: ISchedule[]) => void): void;
  /**
    * Gets the specified schedule by id, which is in an identical format the the Hue API documentation, with the addition
    * of an "id" value for the schedule.
    *
    * @param id The id of the schedule to retrieve.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @returns A promise that will return the results or <null> if a callback was provided.
    */
  def schedule(id: String): js.Promise[ISchedule] = js.native
  def schedule(id: Double): js.Promise[ISchedule] = js.native
  
  //getSchedule(id: string | number, cb: (err: NodeJS.ErrnoException, data: ISchedule) => void): void;
  /**
    * Creates a one time scheduled event. The results from this function is the id of the created schedule. The bridge only
    * supports 100 schedules, so once they are triggered, they are removed from the bridge.
    *
    * @param schedule {ScheduledEvent}
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will return the id value of the schedule that was created, or <null> if a callback was provided.
    */
  def scheduleEvent(schedule: ISchedule): js.Promise[String] = js.native
  
  //deleteGroup(id: string|number, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Gets the schedules on the Bridge, as an array of {"id": {String}, "name": {String}} objects.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will return the results or <null> if a callback was provided.
    */
  def schedules(): js.Promise[js.Array[ISchedule]] = js.native
  
  //getNewLights(cb: (err: NodeJS.ErrnoException, data: INewLightsResponse) => void): void;
  /**
    * Starts a search for new lights.
    *
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return A promise that will be provided with the new lights, or {null} if a callback function was provided.
    */
  def searchForNewLights(): js.Promise[Boolean] = js.native
  
  //getRegisteredUsers(cb: (err: NodeJS.ErrnoException, data: IRegisteredUser) => void): void;
  /**
    * Obtains the details of the individual sensors that are attached to the Philips Hue.
    *
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return A promise that will be provided with the lights object, or {null} if a callback function was provided.
    */
  def sensors(): js.Promise[ISensorsApiResponse] = js.native
  
  def setGroupLightState(id: String, stateValues: js.Object): js.Promise[Boolean] = js.native
  //setLightState(id: string|number, stateValues: lightState.State | Object, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Sets the light state to the provided values for an entire group.
    *
    * @param id The id of the group which is an integer or a value that can be parsed into an integer value.
    * @param stateValues {lightState.State} containing the properties and values to set on the light.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return {Q.promise} A promise that will set the specified state on the group, or {null} if a callback was provided.
    */
  def setGroupLightState(id: String, stateValues: State): js.Promise[Boolean] = js.native
  def setGroupLightState(id: Double, stateValues: js.Object): js.Promise[Boolean] = js.native
  def setGroupLightState(id: Double, stateValues: State): js.Promise[Boolean] = js.native
  
  //searchForNewLights(cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Sets the name of a light on the Bridge.
    *
    * @param id The ID of the light to set the name for.
    * @param name The name to apply to the light.
    * @param cb An optional callback function to use if you do not want a promise returned.
    * @return A promise that will be provided with the results of setting the name, or {null} if a callback function was provided.
    */
  def setLightName(id: String, name: String): js.Promise[Boolean] = js.native
  def setLightName(id: Double, name: String): js.Promise[Boolean] = js.native
  
  def setLightState(id: String, stateValues: js.Object): js.Promise[Boolean] = js.native
  //setLightName(id: string|number, name: string, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  /**
    * Sets the light state to the provided values.
    *
    * @param id The id of the light which is an integer or a value that can be parsed into an integer value.
    * @param stateValues {lightState.State} containing the properties and values to set on the light.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will set the specified state on the light, or {null} if a callback was provided.
    */
  def setLightState(id: String, stateValues: State): js.Promise[Boolean] = js.native
  def setLightState(id: Double, stateValues: js.Object): js.Promise[Boolean] = js.native
  def setLightState(id: Double, stateValues: State): js.Promise[Boolean] = js.native
  
  def setSceneLightState(sceneId: String, lightId: String, stateValues: js.Object): js.Promise[IScene] = js.native
  //modifyScene(sceneId: string | number, scene: IScene, storeLightState: boolean, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  /**
    * Modifies the light state of one of the lights in a scene.
    *
    * @param sceneId The scene id, which if it does not exist a new scene will be created.
    * @param lightId integer The id of light that is having the state values set.
    * @param stateValues {IState} containing the properties and values to set on the light.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise that will return the state values on the light, or {null} if a callback was provided.
    */
  def setSceneLightState(sceneId: String, lightId: String, stateValues: State): js.Promise[IScene] = js.native
  def setSceneLightState(sceneId: String, lightId: Double, stateValues: js.Object): js.Promise[IScene] = js.native
  def setSceneLightState(sceneId: String, lightId: Double, stateValues: State): js.Promise[IScene] = js.native
  def setSceneLightState(sceneId: Double, lightId: String, stateValues: js.Object): js.Promise[IScene] = js.native
  def setSceneLightState(sceneId: Double, lightId: String, stateValues: State): js.Promise[IScene] = js.native
  def setSceneLightState(sceneId: Double, lightId: Double, stateValues: js.Object): js.Promise[IScene] = js.native
  def setSceneLightState(sceneId: Double, lightId: Double, stateValues: State): js.Promise[IScene] = js.native
  
  //getTimezones(cb: (err: NodeJS.ErrnoException, data: string[]) => void): void;
  def timezones(): js.Promise[js.Array[String]] = js.native
  
  //deleteUser(username: string, cb: (err: NodeJS.ErrnoException, data: boolean) => void): void;
  def unregisterUser(username: String): js.Promise[Boolean] = js.native
  
  /**
    * Updates a light group to the specified name and/or lights ids. The name and light ids can be specified independently or
    * together when calling this function.
    *
    * @param id The id of the group to update the name and/or light ids associated with it.
    * @param name {String} The name of the group
    * @param lightIds {Array} An array of light ids to be assigned to the group. If any of the ids are not present in the
    * bridge the creation will fail with an error being produced.
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return A promise with a result of <true> if the update was successful, or null if a callback was provided.
    */
  def updateGroup(id: String, name: String, lightIds: js.Array[String]): js.Promise[Boolean] = js.native
  def updateGroup(
    id: String,
    name: String,
    lightIds: js.Array[String],
    cb: js.Function2[/* err */ ErrnoException, /* data */ Boolean, Unit]
  ): Unit = js.native
  def updateGroup(id: Double, name: String, lightIds: js.Array[String]): js.Promise[Boolean] = js.native
  def updateGroup(
    id: Double,
    name: String,
    lightIds: js.Array[String],
    cb: js.Function2[/* err */ ErrnoException, /* data */ Boolean, Unit]
  ): Unit = js.native
  
  //createAdvancedScene(scene: IScene, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  /**
    * Update the lights and/or name associated with a scene (or will create a new one if the
    * sceneId is not present in the bridge).
    *
    * @param sceneId {String} The id for the scene in the bridge
    * @param scene The configuration of the scene with the details to modify, which can be either a name or an array of
    * light ids.
    * @param storeLightState {Boolean} flag to save the current light state of the lights in the scene.
    *
    * @param cb An optional callback function to use if you do not want to use a promise for the results.
    * @return {*} A promise that will return the id of the scene that was updated and the light ids that are now set,
    * or null if a callback was provided.
    */
  def updateScene(sceneId: String, scene: IScene, storeLightState: Boolean): js.Promise[IScene] = js.native
  def updateScene(sceneId: Double, scene: IScene, storeLightState: Boolean): js.Promise[IScene] = js.native
  
  def updateSceneLightState(sceneId: String, lightId: String, stateValues: js.Object): js.Promise[IScene] = js.native
  //setSceneLightState(sceneId: string | number, lightId: string | number, stateValues: lightState.State | Object, cb: (err: NodeJS.ErrnoException, data: IScene) => void): void;
  def updateSceneLightState(sceneId: String, lightId: String, stateValues: State): js.Promise[IScene] = js.native
  def updateSceneLightState(sceneId: String, lightId: Double, stateValues: js.Object): js.Promise[IScene] = js.native
  def updateSceneLightState(sceneId: String, lightId: Double, stateValues: State): js.Promise[IScene] = js.native
  def updateSceneLightState(sceneId: Double, lightId: String, stateValues: js.Object): js.Promise[IScene] = js.native
  def updateSceneLightState(sceneId: Double, lightId: String, stateValues: State): js.Promise[IScene] = js.native
  def updateSceneLightState(sceneId: Double, lightId: Double, stateValues: js.Object): js.Promise[IScene] = js.native
  def updateSceneLightState(sceneId: Double, lightId: Double, stateValues: State): js.Promise[IScene] = js.native
  
  //deleteSchedule(id: string | number, cb: (err: NodeJS.ErrnoException, data: Object) => void): void;
  /**
    * Updates an existing schedule event with the provided details.
    *
    * @param id The id of the schedule being updated.
    * @param schedule The object containing the details to update for the existing schedule event.
    * @param cb An optional callback function to use if you do not want to deal with a promise for the results.
    * @return {Q.promise} A promise that will return the result, or <null> if a callback was provided.
    */
  def updateSchedule(id: String, schedule: ISchedule): js.Promise[ISchedule] = js.native
  def updateSchedule(id: Double, schedule: ISchedule): js.Promise[ISchedule] = js.native
  
  //getVersion(cb: (err: NodeJS.ErrnoException, data: IBridgeVersion) => void): void;
  def version(): js.Promise[IBridgeVersion] = js.native
}
