package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Item to be stored in the {@link SceneRegistry}.
  */
@JSImport("playcanvas", "SceneRegistryItem")
@js.native
open class SceneRegistryItem protected () extends StObject {
  /**
    * Creates a new SceneRegistryItem instance.
    *
    * @param {string} name - The name of the scene.
    * @param {string} url - The url of the scene file.
    */
  def this(name: String, url: String) = this()
  
  var _loading: Boolean = js.native
  
  var _onLoadedCallbacks: js.Array[Any] = js.native
  
  var data: Any = js.native
  
  /**
    * Returns true if the scene data has loaded.
    *
    * @type {boolean}
    */
  def loaded: Boolean = js.native
  
  /**
    * Returns true if the scene data is still being loaded.
    *
    * @type {boolean}
    */
  def loading: Boolean = js.native
  
  /**
    * The name of the scene.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * The url of the scene file.
    *
    * @type {string}
    */
  var url: String = js.native
}
