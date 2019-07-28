package typings.phaser.PhaserNs.TypesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputPluginContainer extends js.Object {
  /**
    * The unique name of this plugin in the input plugin cache.
    */
  var key: String
  /**
    * If this plugin is to be injected into the Input Plugin, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function
}

object InputPluginContainer {
  @scala.inline
  def apply(key: String, plugin: js.Function, mapping: String = null): InputPluginContainer = {
    val __obj = js.Dynamic.literal(key = key, plugin = plugin)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[InputPluginContainer]
  }
}

