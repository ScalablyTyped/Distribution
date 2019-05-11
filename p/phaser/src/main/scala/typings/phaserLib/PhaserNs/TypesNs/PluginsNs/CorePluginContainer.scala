package typings
package phaserLib.PhaserNs.TypesNs.PluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorePluginContainer extends js.Object {
  /**
    * Core Scene plugin or a Custom Scene plugin?
    */
  var custom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The unique name of this plugin in the core plugin cache.
    */
  var key: java.lang.String
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function
}

object CorePluginContainer {
  @scala.inline
  def apply(
    key: java.lang.String,
    plugin: js.Function,
    custom: js.UndefOr[scala.Boolean] = js.undefined,
    mapping: java.lang.String = null
  ): CorePluginContainer = {
    val __obj = js.Dynamic.literal(key = key, plugin = plugin)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[CorePluginContainer]
  }
}

