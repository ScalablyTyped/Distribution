package typings.phaser.Phaser.Types.Scenes

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Core.LoaderConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileConfig
import typings.phaser.phaserNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsConfig extends js.Object {
  /**
    * Does the Scene start as active or not? An active Scene updates each step.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional Camera configuration object.
    */
  var cameras: js.UndefOr[JSONCamera | js.Array[JSONCamera]] = js.undefined
  /**
    * The unique key of this Scene. Must be unique within the entire Game instance.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The loader configuration object for the Scene.
    */
  var loader: js.UndefOr[LoaderConfig] = js.undefined
  /**
    * Overwrites the default injection map for a scene.
    */
  var map: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Extends the injection map for a scene.
    */
  var mapAdd: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * An optional Loader Packfile to be loaded before the Scene begins.
    */
  var pack: js.UndefOr[`false` | PackFileConfig] = js.undefined
  /**
    * The physics configuration object for the Scene.
    */
  var physics: js.UndefOr[PhysicsConfig] = js.undefined
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: js.UndefOr[`false` | js.Any] = js.undefined
  /**
    * Does the Scene start as visible or not? A visible Scene renders each step.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SettingsConfig {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    cameras: JSONCamera | js.Array[JSONCamera] = null,
    key: String = null,
    loader: LoaderConfig = null,
    map: StringDictionary[String] = null,
    mapAdd: StringDictionary[String] = null,
    pack: `false` | PackFileConfig = null,
    physics: PhysicsConfig = null,
    plugins: `false` | js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SettingsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (cameras != null) __obj.updateDynamic("cameras")(cameras.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapAdd != null) __obj.updateDynamic("mapAdd")(mapAdd)
    if (pack != null) __obj.updateDynamic("pack")(pack.asInstanceOf[js.Any])
    if (physics != null) __obj.updateDynamic("physics")(physics)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SettingsConfig]
  }
}

