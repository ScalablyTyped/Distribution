package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link SceneRegistry#loadSceneHierarchy}.
  *
  * @callback LoadHierarchyCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  * @param {import('./entity.js').Entity} [entity] - The loaded root entity if no errors were encountered.
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
  * @param {import('./entity.js').Entity} [entity] - The loaded root entity if no errors were encountered.
  */
/**
  * Callback used by {@link SceneRegistry#loadScene}.
  *
  * @callback LoadSceneCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  * @param {import('./entity.js').Entity} [entity] - The loaded root entity if no errors were encountered.
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
@JSGlobal("pc.SceneRegistry")
@js.native
open class SceneRegistry protected ()
  extends typings.playcanvas.mod.SceneRegistry {
  /**
    * Create a new SceneRegistry instance.
    *
    * @param {import('./app-base.js').AppBase} app - The application.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
