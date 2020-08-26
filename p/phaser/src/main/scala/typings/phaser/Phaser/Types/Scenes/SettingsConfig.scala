package typings.phaser.Phaser.Types.Scenes

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Core.LoaderConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileSection
import typings.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsConfig extends js.Object {
  /**
    * Does the Scene start as active or not? An active Scene updates each step.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * An optional Camera configuration object.
    */
  var cameras: js.UndefOr[JSONCamera | js.Array[JSONCamera]] = js.native
  /**
    * The unique key of this Scene. Must be unique within the entire Game instance.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The loader configuration object for the Scene.
    */
  var loader: js.UndefOr[LoaderConfig] = js.native
  /**
    * Overwrites the default injection map for a scene.
    */
  var map: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Extends the injection map for a scene.
    */
  var mapAdd: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Files to be loaded before the Scene begins.
    */
  var pack: js.UndefOr[`false` | PackFileSection] = js.native
  /**
    * The physics configuration object for the Scene.
    */
  var physics: js.UndefOr[PhysicsConfig] = js.native
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: js.UndefOr[`false` | js.Any] = js.native
  /**
    * Does the Scene start as visible or not? A visible Scene renders each step.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SettingsConfig {
  @scala.inline
  def apply(): SettingsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsConfig]
  }
  @scala.inline
  implicit class SettingsConfigOps[Self <: SettingsConfig] (val x: Self) extends AnyVal {
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
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCamerasVarargs(value: JSONCamera*): Self = this.set("cameras", js.Array(value :_*))
    @scala.inline
    def setCameras(value: JSONCamera | js.Array[JSONCamera]): Self = this.set("cameras", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameras: Self = this.set("cameras", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLoader(value: LoaderConfig): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setMap(value: StringDictionary[String]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapAdd(value: StringDictionary[String]): Self = this.set("mapAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapAdd: Self = this.set("mapAdd", js.undefined)
    @scala.inline
    def setPack(value: `false` | PackFileSection): Self = this.set("pack", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePack: Self = this.set("pack", js.undefined)
    @scala.inline
    def setPhysics(value: PhysicsConfig): Self = this.set("physics", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysics: Self = this.set("physics", js.undefined)
    @scala.inline
    def setPlugins(value: `false` | js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

