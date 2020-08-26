package typings.phaser.Phaser.Types.Plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalPlugin extends js.Object {
  /**
    * Is the plugin active or not?
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * The unique name of this plugin within the plugin cache.
    */
  var key: String = js.native
  /**
    * If this plugin is to be injected into the Scene Systems, this is the property key map used.
    */
  var mapping: js.UndefOr[String] = js.native
  /**
    * An instance of the plugin.
    */
  var plugin: js.Function = js.native
}

object GlobalPlugin {
  @scala.inline
  def apply(key: String, plugin: js.Function): GlobalPlugin = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPlugin]
  }
  @scala.inline
  implicit class GlobalPluginOps[Self <: GlobalPlugin] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: js.Function): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setMapping(value: String): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
  }
  
}

