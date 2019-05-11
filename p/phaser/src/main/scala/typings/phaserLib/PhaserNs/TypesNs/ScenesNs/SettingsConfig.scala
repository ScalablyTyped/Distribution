package typings
package phaserLib.PhaserNs.TypesNs.ScenesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsConfig extends js.Object {
  /**
    * Does the Scene start as active or not? An active Scene updates each step.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional Camera configuration object.
    */
  var cameras: js.UndefOr[
    phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera | js.Array[phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera]
  ] = js.undefined
  /**
    * The unique key of this Scene. Must be unique within the entire Game instance.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The loader configuration object for the Scene.
    */
  var loader: js.UndefOr[phaserLib.PhaserNs.TypesNs.CoreNs.LoaderConfig] = js.undefined
  /**
    * Overwrites the default injection map for a scene.
    */
  var map: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Extends the injection map for a scene.
    */
  var mapAdd: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * An optional Loader Packfile to be loaded before the Scene begins.
    */
  var pack: js.UndefOr[
    phaserLib.phaserLibNumbers.`false` | phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.PackFileConfig
  ] = js.undefined
  /**
    * The physics configuration object for the Scene.
    */
  var physics: js.UndefOr[phaserLib.PhaserNs.TypesNs.CoreNs.PhysicsConfig] = js.undefined
  /**
    * The plugin configuration object for the Scene.
    */
  var plugins: js.UndefOr[phaserLib.phaserLibNumbers.`false` | js.Any] = js.undefined
  /**
    * Does the Scene start as visible or not? A visible Scene renders each step.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object SettingsConfig {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    cameras: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera | js.Array[phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.JSONCamera] = null,
    key: java.lang.String = null,
    loader: phaserLib.PhaserNs.TypesNs.CoreNs.LoaderConfig = null,
    map: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    mapAdd: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    pack: phaserLib.phaserLibNumbers.`false` | phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.PackFileConfig = null,
    physics: phaserLib.PhaserNs.TypesNs.CoreNs.PhysicsConfig = null,
    plugins: phaserLib.phaserLibNumbers.`false` | js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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

