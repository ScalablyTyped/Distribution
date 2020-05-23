package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginObjectItem extends js.Object {
  /**
    * Arbitrary data passed to the plugin's init() method.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * A key to identify the plugin in the Plugin Manager.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * The plugin itself. Usually a class/constructor.
    */
  var plugin: js.UndefOr[js.Any] = js.undefined
  /**
    * For a scene plugin, add the plugin to the scene object under this key (`this.KEY`, from the scene).
    */
  var sceneKey: js.UndefOr[String] = js.undefined
  /**
    * Whether the plugin should be started automatically.
    */
  var start: js.UndefOr[Boolean] = js.undefined
  /**
    * For a scene plugin, add the plugin to the scene's systems object under this key (`this.sys.KEY`, from the scene).
    */
  var systemKey: js.UndefOr[String] = js.undefined
}

object PluginObjectItem {
  @scala.inline
  def apply(
    data: js.Any = null,
    key: String = null,
    mapping: String = null,
    plugin: js.Any = null,
    sceneKey: String = null,
    start: js.UndefOr[Boolean] = js.undefined,
    systemKey: String = null
  ): PluginObjectItem = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (sceneKey != null) __obj.updateDynamic("sceneKey")(sceneKey.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (systemKey != null) __obj.updateDynamic("systemKey")(systemKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginObjectItem]
  }
}

