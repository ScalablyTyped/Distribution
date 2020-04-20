package typings.phaser.Phaser.Types.Scenes

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Core.LoaderConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileConfig
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsObject extends js.Object {
  /**
    * The active state of this Scene. An active Scene updates each step.
    */
  var active: Boolean
  /**
    * The Camera configuration object.
    */
  var cameras: JSONCamera | js.Array[JSONCamera]
  /**
    * a data bundle passed to this Scene from the Scene Manager.
    */
  var data: js.Object
  /**
    * Has the Scene finished booting?
    */
  var isBooted: Boolean
  /**
    * Is the Scene in a state of transition?
    */
  var isTransition: Boolean
  /**
    * The unique key of this Scene. Unique within the entire Game instance.
    */
  var key: String
  /**
    * The loader configuration object for the Scene.
    */
  var loader: LoaderConfig
  /**
    * The Scene's Injection Map.
    */
  var map: StringDictionary[String]
  /**
    * The Loader Packfile to be loaded before the Scene begins.
    */
  var pack: `false` | PackFileConfig
  /**
    * The physics configuration object for the Scene.
    */
  var physics: PhysicsConfig
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: `false` | js.Any
  /**
    * The current status of the Scene. Maps to the Scene constants.
    */
  var status: Double
  /**
    * Is this Scene allowed to receive input during transitions?
    */
  var transitionAllowInput: Boolean
  /**
    * The duration of the transition, if set.
    */
  var transitionDuration: integer
  /**
    * The Scene this Scene is transitioning from, if set.
    */
  var transitionFrom: Scene
  /**
    * The visible state of this Scene. A visible Scene renders each step.
    */
  var visible: Boolean
}

object SettingsObject {
  @scala.inline
  def apply(
    active: Boolean,
    cameras: JSONCamera | js.Array[JSONCamera],
    data: js.Object,
    isBooted: Boolean,
    isTransition: Boolean,
    key: String,
    loader: LoaderConfig,
    map: StringDictionary[String],
    pack: `false` | PackFileConfig,
    physics: PhysicsConfig,
    plugins: `false` | js.Any,
    status: Double,
    transitionAllowInput: Boolean,
    transitionDuration: integer,
    transitionFrom: Scene,
    visible: Boolean
  ): SettingsObject = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isBooted = isBooted.asInstanceOf[js.Any], isTransition = isTransition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transitionAllowInput = transitionAllowInput.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionFrom = transitionFrom.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsObject]
  }
}

