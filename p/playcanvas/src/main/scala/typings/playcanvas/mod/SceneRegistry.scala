package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./app-base.js').AppBase} AppBase */
/** @typedef {import('./entity.js').Entity} Entity */
/**
  * Callback used by {@link SceneRegistry#loadSceneHierarchy}.
  *
  * @callback LoadHierarchyCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  * @param {Entity} [entity] - The loaded root entity if no errors were encountered.
  */
/**
  * Callback used by {@link SceneRegistry#loadSceneSettings}.
  *
  * @callback LoadSettingsCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  */
/**
  * Callback used by {@link SceneRegistry#changeScene}.
  *
  * @callback ChangeSceneCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  * @param {Entity} [entity] - The loaded root entity if no errors were encountered.
  */
/**
  * Callback used by {@link SceneRegistry#loadScene}.
  *
  * @callback LoadSceneCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  * @param {Entity} [entity] - The loaded root entity if no errors were encountered.
  */
/**
  * Callback used by {@link SceneRegistry#loadSceneData}.
  *
  * @callback LoadSceneDataCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  * @param {SceneRegistryItem} [sceneItem] - The scene registry item if no errors were encountered.
  */
/**
  * Container for storing and loading of scenes. An instance of the registry is created on the
  * {@link AppBase} object as {@link AppBase#scenes}.
  */
@JSImport("playcanvas", "SceneRegistry")
@js.native
open class SceneRegistry protected () extends StObject {
  /**
    * Create a new SceneRegistry instance.
    *
    * @param {AppBase} app - The application.
    */
  def this(app: AppBase) = this()
  
  var _app: AppBase = js.native
  
  var _list: js.Array[Any] = js.native
  
  def _loadSceneData(sceneItem: Any, storeInCache: Any, callback: Any): Unit = js.native
  
  def _loadSceneHierarchy(sceneItem: Any, onBeforeAddHierarchy: Any, callback: Any): Unit = js.native
  
  /**
    * Add a new item to the scene registry.
    *
    * @param {string} name - The name of the scene.
    * @param {string} url -  The url of the scene file.
    * @returns {boolean} Returns true if the scene was successfully added to the registry, false otherwise.
    */
  def add(name: String, url: String): Boolean = js.native
  
  def changeScene(sceneItem: String): Unit = js.native
  def changeScene(sceneItem: String, callback: ChangeSceneCallback): Unit = js.native
  /**
    * Change to a new scene. Calling this function will load the scene data, delete all
    * entities and graph nodes under `app.root` and load the scene settings and hierarchy.
    *
    * @param {SceneRegistryItem | string} sceneItem - The scene item (which can be found with
    * {@link SceneRegistry#find}, URL of the scene file (e.g."scene_id.json") or name of the scene.
    * @param {ChangeSceneCallback} [callback] - The function to call after loading,
    * passed (err, entity) where err is null if no errors occurred.
    * @example
    * app.scenes.changeScene("Scene Name", function (err, entity) {
    *     if (!err) {
    *         // success
    *     } else {
    *         // error
    *     }
    * });
    */
  def changeScene(sceneItem: SceneRegistryItem): Unit = js.native
  def changeScene(sceneItem: SceneRegistryItem, callback: ChangeSceneCallback): Unit = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Find a Scene by name and return the {@link SceneRegistryItem}.
    *
    * @param {string} name - The name of the scene.
    * @returns {SceneRegistryItem|null} The stored data about a scene or null if no scene with
    * that name exists.
    */
  def find(name: String): SceneRegistryItem | Null = js.native
  
  /**
    * Find a scene by the URL and return the {@link SceneRegistryItem}.
    *
    * @param {string} url - The URL to search by.
    * @returns {SceneRegistryItem|null} The stored data about a scene or null if no scene with
    * that URL exists.
    */
  def findByUrl(url: String): SceneRegistryItem | Null = js.native
  
  /**
    * Return the list of scene.
    *
    * @returns {SceneRegistryItem[]} All items in the registry.
    */
  def list(): js.Array[SceneRegistryItem] = js.native
  
  /**
    * Load the scene hierarchy and scene settings. This is an internal method used by the
    * {@link AppBase}.
    *
    * @param {string} url - The URL of the scene file.
    * @param {LoadSceneCallback} callback - The function called after the settings are
    * applied. Passed (err, scene) where err is null if no error occurred and scene is the
    * {@link Scene}.
    */
  def loadScene(url: String, callback: LoadSceneCallback): Unit = js.native
  
  def loadSceneData(sceneItem: String, callback: LoadSceneDataCallback): Unit = js.native
  /**
    * Loads and stores the scene data to reduce the number of the network requests when the same
    * scenes are loaded multiple times. Can also be used to load data before calling
    * {@link SceneRegistry#loadSceneHierarchy} and {@link SceneRegistry#loadSceneSettings} to make
    * scene loading quicker for the user.
    *
    * @param {SceneRegistryItem | string} sceneItem - The scene item (which can be found with
    * {@link SceneRegistry#find}, URL of the scene file (e.g."scene_id.json") or name of the scene.
    * @param {LoadSceneDataCallback} callback - The function to call after loading,
    * passed (err, sceneItem) where err is null if no errors occurred.
    * @example
    * var sceneItem = app.scenes.find("Scene Name");
    * app.scenes.loadSceneData(sceneItem, function (err, sceneItem) {
    *     if (err) {
    *         // error
    *     }
    * });
    */
  def loadSceneData(sceneItem: SceneRegistryItem, callback: LoadSceneDataCallback): Unit = js.native
  
  def loadSceneHierarchy(sceneItem: String, callback: LoadHierarchyCallback): Unit = js.native
  /**
    * Load a scene file, create and initialize the Entity hierarchy and add the hierarchy to the
    * application root Entity.
    *
    * @param {SceneRegistryItem | string} sceneItem - The scene item (which can be found with
    * {@link SceneRegistry#find}, URL of the scene file (e.g."scene_id.json") or name of the scene.
    * @param {LoadHierarchyCallback} callback - The function to call after loading,
    * passed (err, entity) where err is null if no errors occurred.
    * @example
    * var sceneItem = app.scenes.find("Scene Name");
    * app.scenes.loadSceneHierarchy(sceneItem, function (err, entity) {
    *     if (!err) {
    *         var e = app.root.find("My New Entity");
    *     } else {
    *         // error
    *     }
    * });
    */
  def loadSceneHierarchy(sceneItem: SceneRegistryItem, callback: LoadHierarchyCallback): Unit = js.native
  
  def loadSceneSettings(sceneItem: String, callback: LoadSettingsCallback): Unit = js.native
  /**
    * Load a scene file and apply the scene settings to the current scene.
    *
    * @param {SceneRegistryItem | string} sceneItem - The scene item (which can be found with
    * {@link SceneRegistry#find}, URL of the scene file (e.g."scene_id.json") or name of the scene.
    * @param {LoadSettingsCallback} callback - The function called after the settings
    * are applied. Passed (err) where err is null if no error occurred.
    * @example
    * var sceneItem = app.scenes.find("Scene Name");
    * app.scenes.loadSceneSettings(sceneItem, function (err) {
    *     if (!err) {
    *         // success
    *     } else {
    *         // error
    *     }
    * });
    */
  def loadSceneSettings(sceneItem: SceneRegistryItem, callback: LoadSettingsCallback): Unit = js.native
  
  /**
    * Remove an item from the scene registry.
    *
    * @param {string} name - The name of the scene.
    */
  def remove(name: String): Unit = js.native
  
  def unloadSceneData(sceneItem: String): Unit = js.native
  /**
    * Unloads scene data that has been loaded previously using {@link SceneRegistry#loadSceneData}.
    *
    * @param {SceneRegistryItem | string} sceneItem - The scene item (which can be found with
    * {@link SceneRegistry#find} or URL of the scene file. Usually this will be "scene_id.json".
    * @example
    * var sceneItem = app.scenes.find("Scene Name");
    * app.scenes.unloadSceneData(sceneItem);
    */
  def unloadSceneData(sceneItem: SceneRegistryItem): Unit = js.native
}
