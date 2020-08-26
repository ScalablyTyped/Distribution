package typings.phaser.Phaser.Types.Scenes

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Core.LoaderConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileSection
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsObject extends js.Object {
  /**
    * The active state of this Scene. An active Scene updates each step.
    */
  var active: Boolean = js.native
  /**
    * The Camera configuration object.
    */
  var cameras: JSONCamera | js.Array[JSONCamera] = js.native
  /**
    * a data bundle passed to this Scene from the Scene Manager.
    */
  var data: js.Object = js.native
  /**
    * Has the Scene finished booting?
    */
  var isBooted: Boolean = js.native
  /**
    * Is the Scene in a state of transition?
    */
  var isTransition: Boolean = js.native
  /**
    * The unique key of this Scene. Unique within the entire Game instance.
    */
  var key: String = js.native
  /**
    * The loader configuration object for the Scene.
    */
  var loader: LoaderConfig = js.native
  /**
    * The Scene's Injection Map.
    */
  var map: StringDictionary[String] = js.native
  /**
    * Files to be loaded before the Scene begins.
    */
  var pack: `false` | PackFileSection = js.native
  /**
    * The physics configuration object for the Scene.
    */
  var physics: PhysicsConfig = js.native
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: `false` | js.Any = js.native
  /**
    * The current status of the Scene. Maps to the Scene constants.
    */
  var status: Double = js.native
  /**
    * Is this Scene allowed to receive input during transitions?
    */
  var transitionAllowInput: Boolean = js.native
  /**
    * The duration of the transition, if set.
    */
  var transitionDuration: integer = js.native
  /**
    * The Scene this Scene is transitioning from, if set.
    */
  var transitionFrom: Scene = js.native
  /**
    * The visible state of this Scene. A visible Scene renders each step.
    */
  var visible: Boolean = js.native
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
    pack: `false` | PackFileSection,
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
  @scala.inline
  implicit class SettingsObjectOps[Self <: SettingsObject] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setCamerasVarargs(value: JSONCamera*): Self = this.set("cameras", js.Array(value :_*))
    @scala.inline
    def setCameras(value: JSONCamera | js.Array[JSONCamera]): Self = this.set("cameras", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBooted(value: Boolean): Self = this.set("isBooted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTransition(value: Boolean): Self = this.set("isTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoader(value: LoaderConfig): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: StringDictionary[String]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setPack(value: `false` | PackFileSection): Self = this.set("pack", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysics(value: PhysicsConfig): Self = this.set("physics", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugins(value: `false` | js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionAllowInput(value: Boolean): Self = this.set("transitionAllowInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionDuration(value: integer): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionFrom(value: Scene): Self = this.set("transitionFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

