package typings.playcanvas.mod

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
@JSImport("playcanvas", "SceneRegistry")
@js.native
class SceneRegistry protected ()
  extends typings.playcanvas.pc.SceneRegistry {
  def this(app: typings.playcanvas.pc.Application) = this()
  /**
    * Add a new item to the scene registry.
    * @param name - The name of the scene.
    * @param url - The url of the scene file.
    * @returns Returns true if the scene was successfully added to the registry, false otherwise.
    */
  /* CompleteClass */
  override def add(name: String, url: String): Boolean = js.native
  /**
    * Find a Scene by name and return the {@link pc.SceneRegistryItem}.
    * @param name - The name of the scene.
    * @returns The stored data about a scene.
    */
  /* CompleteClass */
  override def find(name: String): typings.playcanvas.pc.SceneRegistryItem = js.native
  /**
    * Find a scene by the URL and return the {@link pc.SceneRegistryItem}.
    * @param url - The URL to search by.
    * @returns The stored data about a scene.
    */
  /* CompleteClass */
  override def findByUrl(url: String): typings.playcanvas.pc.SceneRegistryItem = js.native
  /**
    * Return the list of scene.
    * @returns All items in the registry.
    */
  /* CompleteClass */
  override def list(): js.Array[typings.playcanvas.pc.SceneRegistryItem] = js.native
  /**
    * Load the scene hierarchy and scene settings. This is an internal method used
    by the pc.Application.
    * @param url - The URL of the scene file.
    * @param callback - The function called after the settings are
    applied. Passed (err, scene) where err is null if no error occurred and scene is the
    {@link pc.Scene}.
    */
  /* CompleteClass */
  override def loadScene(url: String, callback: LoadScene): Unit = js.native
  /**
    * Load a scene file, create and initialize the Entity hierarchy
    and add the hierarchy to the application root Entity.
    * @example
    * var url = app.scenes.getSceneUrl("Scene Name");
    app.scenes.loadSceneHierarchy(url, function (err, entity) {
    if (!err) {
    var e = app.root.find("My New Entity");
    } else {
    // error
    }
    });
    * @param url - The URL of the scene file. Usually this will be "scene_id.json".
    * @param callback - The function to call after loading,
    passed (err, entity) where err is null if no errors occurred.
    */
  /* CompleteClass */
  override def loadSceneHierarchy(url: String, callback: LoadHierarchy): Unit = js.native
  /**
    * Load a scene file and apply the scene settings to the current scene.
    * @example
    * var url = app.getSceneUrl("Scene Name");
    app.loadSceneSettings(url, function (err) {
    if (!err) {
    // success
    } else {
    // error
    }
    });
    * @param url - The URL of the scene file. This can be looked up using app.getSceneUrl.
    * @param callback - The function called after the settings
    are applied. Passed (err) where err is null if no error occurred.
    */
  /* CompleteClass */
  override def loadSceneSettings(url: String, callback: LoadSettings): Unit = js.native
  /**
    * Remove an item from the scene registry.
    * @param name - The name of the scene.
    */
  /* CompleteClass */
  override def remove(name: String): Unit = js.native
}

