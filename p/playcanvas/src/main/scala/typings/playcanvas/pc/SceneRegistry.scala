package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.LoadHierarchy
import typings.playcanvas.pc.callbacks.LoadScene
import typings.playcanvas.pc.callbacks.LoadSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for storing the name and url for scene files.
  * @param app - The application.
  */
trait SceneRegistry extends StObject {
  
  /**
    * Add a new item to the scene registry.
    * @param name - The name of the scene.
    * @param url - The url of the scene file.
    * @returns Returns true if the scene was successfully added to the registry, false otherwise.
    */
  def add(name: String, url: String): Boolean
  
  /**
    * Find a Scene by name and return the {@link pc.SceneRegistryItem}.
    * @param name - The name of the scene.
    * @returns The stored data about a scene.
    */
  def find(name: String): SceneRegistryItem
  
  /**
    * Find a scene by the URL and return the {@link pc.SceneRegistryItem}.
    * @param url - The URL to search by.
    * @returns The stored data about a scene.
    */
  def findByUrl(url: String): SceneRegistryItem
  
  /**
    * Return the list of scene.
    * @returns All items in the registry.
    */
  def list(): js.Array[SceneRegistryItem]
  
  /**
    * Load the scene hierarchy and scene settings. This is an internal method used
    * by the pc.Application.
    * @param url - The URL of the scene file.
    * @param callback - The function called after the settings are
    * applied. Passed (err, scene) where err is null if no error occurred and scene is the
    * {@link pc.Scene}.
    */
  def loadScene(url: String, callback: LoadScene): Unit
  
  /**
    * Load a scene file, create and initialize the Entity hierarchy
    * and add the hierarchy to the application root Entity.
    * @example
    * var url = app.scenes.getSceneUrl("Scene Name");
    * app.scenes.loadSceneHierarchy(url, function (err, entity) {
    *     if (!err) {
    *         var e = app.root.find("My New Entity");
    *     } else {
    *         // error
    *     }
    * });
    * @param url - The URL of the scene file. Usually this will be "scene_id.json".
    * @param callback - The function to call after loading,
    * passed (err, entity) where err is null if no errors occurred.
    */
  def loadSceneHierarchy(url: String, callback: LoadHierarchy): Unit
  
  /**
    * Load a scene file and apply the scene settings to the current scene.
    * @example
    * var url = app.getSceneUrl("Scene Name");
    * app.loadSceneSettings(url, function (err) {
    *     if (!err) {
    *       // success
    *     } else {
    *       // error
    *     }
    * });
    * @param url - The URL of the scene file. This can be looked up using app.getSceneUrl.
    * @param callback - The function called after the settings
    * are applied. Passed (err) where err is null if no error occurred.
    */
  def loadSceneSettings(url: String, callback: LoadSettings): Unit
  
  /**
    * Remove an item from the scene registry.
    * @param name - The name of the scene.
    */
  def remove(name: String): Unit
}
object SceneRegistry {
  
  @scala.inline
  def apply(
    add: (String, String) => Boolean,
    find: String => SceneRegistryItem,
    findByUrl: String => SceneRegistryItem,
    list: () => js.Array[SceneRegistryItem],
    loadScene: (String, LoadScene) => Unit,
    loadSceneHierarchy: (String, LoadHierarchy) => Unit,
    loadSceneSettings: (String, LoadSettings) => Unit,
    remove: String => Unit
  ): SceneRegistry = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), find = js.Any.fromFunction1(find), findByUrl = js.Any.fromFunction1(findByUrl), list = js.Any.fromFunction0(list), loadScene = js.Any.fromFunction2(loadScene), loadSceneHierarchy = js.Any.fromFunction2(loadSceneHierarchy), loadSceneSettings = js.Any.fromFunction2(loadSceneSettings), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[SceneRegistry]
  }
  
  @scala.inline
  implicit class SceneRegistryMutableBuilder[Self <: SceneRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, String) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFind(value: String => SceneRegistryItem): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindByUrl(value: String => SceneRegistryItem): Self = StObject.set(x, "findByUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Array[SceneRegistryItem]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadScene(value: (String, LoadScene) => Unit): Self = StObject.set(x, "loadScene", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadSceneHierarchy(value: (String, LoadHierarchy) => Unit): Self = StObject.set(x, "loadSceneHierarchy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadSceneSettings(value: (String, LoadSettings) => Unit): Self = StObject.set(x, "loadSceneSettings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
