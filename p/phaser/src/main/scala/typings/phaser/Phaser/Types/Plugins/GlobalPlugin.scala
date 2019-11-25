package typings.phaser.Phaser.Types.Plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPlugin extends js.Object {
  /**
    * Is the plugin active or not?
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * The unique name of this plugin within the plugin cache.
    */
  var key: String
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * An instance of the plugin.
    */
  var plugin: js.Function
}

object GlobalPlugin {
  @scala.inline
  def apply(
    key: String,
    plugin: js.Function,
    active: js.UndefOr[Boolean] = js.undefined,
    mapping: String = null
  ): GlobalPlugin = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPlugin]
  }
}

