package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.LoadHierarchy
import typings.playcanvas.pc.callbacks.LoadScene
import typings.playcanvas.pc.callbacks.LoadSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for storing the name and url for scene files.
  * @param app - The application.
  */
@js.native
trait SceneRegistry extends js.Object {
  /**
    * Add a new item to the scene registry.
    * @param name - The name of the scene.
    * @param url - The url of the scene file.
    * @returns Returns true if the scene was successfully added to the registry, false otherwise.
    */
  def add(name: String, url: String): Boolean = js.native
  /**
    * Find a Scene by name and return the {@link pc.SceneRegistryItem}.
    * @param name - The name of the scene.
    * @returns The stored data about a scene.
    */
  def find(name: String): SceneRegistryItem = js.native
  /**
    * Find a scene by the URL and return the {@link pc.SceneRegistryItem}.
    * @param url - The URL to search by.
    * @returns The stored data about a scene.
    */
  def findByUrl(url: String): SceneRegistryItem = js.native
  /**
    * Return the list of scene.
    * @returns All items in the registry.
    */
  def list(): js.Array[SceneRegistryItem] = js.native
  /**
    * Load the scene hierarchy and scene settings. This is an internal method used
    * by the pc.Application.
    * @param url - The URL of the scene file.
    * @param callback - The function called after the settings are
    * applied. Passed (err, scene) where err is null if no error occurred and scene is the
    * {@link pc.Scene}.
    */
  def loadScene(url: String, callback: LoadScene): Unit = js.native
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
  def loadSceneHierarchy(url: String, callback: LoadHierarchy): Unit = js.native
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
  def loadSceneSettings(url: String, callback: LoadSettings): Unit = js.native
  /**
    * Remove an item from the scene registry.
    * @param name - The name of the scene.
    */
  def remove(name: String): Unit = js.native
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
  implicit class SceneRegistryOps[Self <: SceneRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (String, String) => Boolean): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setFind(value: String => SceneRegistryItem): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setFindByUrl(value: String => SceneRegistryItem): Self = this.set("findByUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => js.Array[SceneRegistryItem]): Self = this.set("list", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadScene(value: (String, LoadScene) => Unit): Self = this.set("loadScene", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadSceneHierarchy(value: (String, LoadHierarchy) => Unit): Self = this.set("loadSceneHierarchy", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadSceneSettings(value: (String, LoadSettings) => Unit): Self = this.set("loadSceneSettings", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

