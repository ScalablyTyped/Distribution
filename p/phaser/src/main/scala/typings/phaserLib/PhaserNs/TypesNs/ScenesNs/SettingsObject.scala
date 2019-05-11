package typings
package phaserLib.PhaserNs.TypesNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsObject extends js.Object {
  /**
    * The active state of this Scene. An active Scene updates each step.
    */
  var active: scala.Boolean
  /**
    * The Camera configuration object.
    */
  var cameras: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera | js.Array[phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera]
  /**
    * a data bundle passed to this Scene from the Scene Manager.
    */
  var data: js.Object
  /**
    * Has the Scene finished booting?
    */
  var isBooted: scala.Boolean
  /**
    * Is the Scene in a state of transition?
    */
  var isTransition: scala.Boolean
  /**
    * The unique key of this Scene. Unique within the entire Game instance.
    */
  var key: java.lang.String
  /**
    * The loader configuration object for the Scene.
    */
  var loader: phaserLib.PhaserNs.TypesNs.CoreNs.LoaderConfig
  /**
    * The Scene's Injection Map.
    */
  var map: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The Loader Packfile to be loaded before the Scene begins.
    */
  var pack: phaserLib.phaserLibNumbers.`false` | phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.PackFileConfig
  /**
    * The physics configuration object for the Scene.
    */
  var physics: phaserLib.PhaserNs.TypesNs.CoreNs.PhysicsConfig
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: phaserLib.phaserLibNumbers.`false` | js.Any
  /**
    * The current status of the Scene. Maps to the Scene constants.
    */
  var status: scala.Double
  /**
    * Is this Scene allowed to receive input during transitions?
    */
  var transitionAllowInput: scala.Boolean
  /**
    * The duration of the transition, if set.
    */
  var transitionDuration: phaserLib.integer
  /**
    * The Scene this Scene is transitioning from, if set.
    */
  var transitionFrom: phaserLib.PhaserNs.Scene
  /**
    * The visible state of this Scene. A visible Scene renders each step.
    */
  var visible: scala.Boolean
}

object SettingsObject {
  @scala.inline
  def apply(
    active: scala.Boolean,
    cameras: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera | js.Array[phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera],
    data: js.Object,
    isBooted: scala.Boolean,
    isTransition: scala.Boolean,
    key: java.lang.String,
    loader: phaserLib.PhaserNs.TypesNs.CoreNs.LoaderConfig,
    map: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    pack: phaserLib.phaserLibNumbers.`false` | phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.PackFileConfig,
    physics: phaserLib.PhaserNs.TypesNs.CoreNs.PhysicsConfig,
    plugins: phaserLib.phaserLibNumbers.`false` | js.Any,
    status: scala.Double,
    transitionAllowInput: scala.Boolean,
    transitionDuration: phaserLib.integer,
    transitionFrom: phaserLib.PhaserNs.Scene,
    visible: scala.Boolean
  ): SettingsObject = {
    val __obj = js.Dynamic.literal(active = active, cameras = cameras.asInstanceOf[js.Any], data = data, isBooted = isBooted, isTransition = isTransition, key = key, loader = loader, map = map, pack = pack.asInstanceOf[js.Any], physics = physics, plugins = plugins.asInstanceOf[js.Any], status = status, transitionAllowInput = transitionAllowInput, transitionDuration = transitionDuration, transitionFrom = transitionFrom, visible = visible)
  
    __obj.asInstanceOf[SettingsObject]
  }
}

