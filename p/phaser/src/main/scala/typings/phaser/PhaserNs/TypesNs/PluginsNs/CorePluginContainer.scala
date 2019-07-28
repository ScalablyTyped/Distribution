package typings.phaser.PhaserNs.TypesNs.PluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorePluginContainer extends js.Object {
  /**
    * Core Scene plugin or a Custom Scene plugin?
    */
  var custom: js.UndefOr[Boolean] = js.undefined
  /**
    * The unique name of this plugin in the core plugin cache.
    */
  var key: String
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function
}

object CorePluginContainer {
  @scala.inline
  def apply(
    key: String,
    plugin: js.Function,
    custom: js.UndefOr[Boolean] = js.undefined,
    mapping: String = null
  ): CorePluginContainer = {
    val __obj = js.Dynamic.literal(key = key, plugin = plugin)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[CorePluginContainer]
  }
}

